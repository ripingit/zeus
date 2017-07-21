package org.chaoxuan.zeus.controller;

import java.text.SimpleDateFormat;
import java.util.*;

import javax.servlet.http.HttpServletResponse;

import org.apache.http.HttpResponse;
import org.chaoxuan.commons.pojo.PGResults;
import org.chaoxuan.zeus.model.*;
import org.chaoxuan.zeus.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/measure")
public class MeasureOrderController extends BaseController {

    @Autowired
    private MeasureOrderService service;
    @Autowired
    private AddressService addressService;
    @Autowired
    private OwnerFamilyService ownerFamilyService;
    @Autowired
    private OwnerHomeInfoService ownerHomeInfoService;
    @Autowired
    private OwnerInfoService ownerInfoService;

    //获取所有测量订单信息
    @RequestMapping("/list")
    public void getOwnerInfo(HttpServletResponse response, @RequestParam(defaultValue = "1") Integer page,
                             @RequestParam(defaultValue = "5") Integer rows, MeasureOrderExtend extend) {
        PGResults measure = service.getMeasureOrder(page, rows, extend);
        super.json(response, measure);
    }

    //查看未支付订单详情
    @RequestMapping("/getMeasureOrderDesc")
    public void getOwnerOrderDesc(HttpServletResponse response, Integer id) {
        MeasureOrder desc = service.getMeasureOrderDesc(id);
        super.json(response, desc);
    }

    //查看待测量,已测量,已签约订单详情
    @RequestMapping("/getMeasureOrderLog")
    public void getOwnerOrderLog(HttpServletResponse response, Integer id) {
        OwnerInfo ow = service.getMeasureOrderLog(id);
        super.json(response, ow);
    }

    //修改上门测量时间
    @RequestMapping("/updateMeasure")
    public void updateMeasure(MeasureOrder measureOrder, HttpServletResponse response) {
        service.updateMeasure(measureOrder);
        super.json(response, true);
    }

    //获取所有管家信息
    @RequestMapping("/getManager")
    public void getManger(HttpServletResponse response, FitManager fitManager) {
        List<FitManager> list = service.getManager(fitManager);
        super.json(response, list);
    }

    //修改管家
    @RequestMapping("/updateManager")
    public void updateManager(HttpServletResponse response, MeasureOrder measureOrder) {
        //System.out.println(measureOrder.getFitManagerId()+":管家id");
        service.updateManager(measureOrder);
        super.json(response, true);

    }

    //管家app
    @RequestMapping(value = "/getOrder/{id}", method = RequestMethod.GET)
    public void getOrder(@PathVariable("id") int id, HttpServletResponse response) {
        MeasureOrder desc = service.getMeasureOrderDesc(id);
        super.json(response, desc);
    }

    //管家修改测量时间
    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public void update(@RequestBody MeasureOrder measureOrder, HttpServletResponse response) {

        service.updateMeasure(measureOrder);
        if (true) {
            MeasureOrder extend = service.getMeasureOrderDesc(measureOrder.getId());
            super.json(response, extend);
        }
        super.json(response, true);


    }


    @RequestMapping(value = "/measureOrder", method = RequestMethod.POST)
    public void createMeasureOrder(@RequestBody CreateMeasureOrder createMeasureOrder,HttpServletResponse response) {
        JsonMessage jm=new JsonMessage();
        try{
            //查询是否存在用户
            String userId = createMeasureOrder.getOwnerInfo().getUserId();
            OwnerInfo ownerInfo = ownerInfoService.getByUserId(userId);
            if (ownerInfo == null) {
                //创建一个新用户
                ownerInfo = createMeasureOrder.getOwnerInfo();
                ownerInfoService.create(ownerInfo);
            }
            //创建家庭信息
            OwnerHomeInfo ownerHomeInfo = createMeasureOrder.getOwnerHomeInfo();
            ownerHomeInfo.setUserId(ownerInfo.getId());
            //转化地址信息
            addressService.transAddress(ownerHomeInfo);
            ownerHomeInfoService.create(ownerHomeInfo);
            //创建订单信息
            MeasureOrder measureOrder = createMeasureOrder.getMeasureOrder();
            measureOrder.setUserId(ownerInfo.getId());
            service.create(createMeasureOrder.getMeasureOrder());
            //创建家庭成员信息
            List<OwnerFamily> ownerFamilyList = createMeasureOrder.getOwnerFamilyList();
            Iterator<OwnerFamily> iterator = ownerFamilyList.iterator();
            while (iterator.hasNext()) {
                OwnerFamily ownerFamily = iterator.next();
                ownerFamily.setOwnerId(ownerInfo.getId());
                ownerFamilyService.create(ownerFamily);
            }
            jm.setSuccess(true);
        }
        catch (Exception e){
            e.printStackTrace();
            jm.setSuccess(false);
        }
        super.json(response,jm);
    }

    @RequestMapping(value = "love/list", method = RequestMethod.GET)
    public void getLoveList(HttpServletResponse response) {
        List<Option> list = ownerHomeInfoService.getLoveList();
        super.json(response, list);
    }

    @RequestMapping(value = "person/list", method = RequestMethod.GET)
    public void getPersonList(HttpServletResponse response) {
        List<Option> list = ownerHomeInfoService.getPersonList(10);
        super.json(response, list);
    }

    @RequestMapping(value = "relative/list", method = RequestMethod.GET)
    public void getRelativeList(HttpServletResponse response) {
        List<Option> list = ownerHomeInfoService.getRelativeList();
        super.json(response, list);
    }

    @RequestMapping(value = "age/list", method = RequestMethod.GET)
    public void getAgeList(HttpServletResponse response) {
        List<Option> list = ownerHomeInfoService.getAgeList(100);
        super.json(response, list);
    }

    @InitBinder
    public void initBinder(ServletRequestDataBinder binder) {
        binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true));
    }
}
