package org.chaoxuan.zeus.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import org.chaoxuan.zeus.model.*;
import org.chaoxuan.zeus.service.FitOrderService;
import org.chaoxuan.zeus.service.FitTaskInstanceService;
import org.chaoxuan.zeus.service.MeasureOrderService;
import org.chaoxuan.zeus.service.RequirementWorkerService;
import org.chaoxuan.zeus.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by Administrator on 2017/6/9 0009.
 */
@Service
@RequestMapping("/fitOrder/requirementWorker")
public class RequirementWorkerController extends BaseController {

    @Autowired
    private MeasureOrderService service;
    @Autowired
    private FitOrderService fitOrderService;
    @Autowired
    private RequirementWorkerService rws;
    @Autowired
    private FitTaskInstanceService fitTaskInstanceService;

    @RequestMapping(value = "/book", method = RequestMethod.PUT)
    public void bookWorker(@RequestBody RequirementWorker rw, HttpServletResponse response) {
        JsonMessage jm = new JsonMessage();
        try {
            rws.update(rw);
            jm.setMsg("预约成功");
            jm.setSuccess(true);
        } catch (Exception e) {
            e.printStackTrace();
            jm.setSuccess(false);
            jm.setMsg("预约失败");
        }
        super.json(response, jm);
    }

    @RequestMapping(value = "/id/{id}")
    public void getById(@PathVariable("id") int id, HttpServletResponse response) {
        RequirementWorker requirementWorker = rws.getById(id);
        super.jsonWithOutDateFormat(response, requirementWorker);
    }


    //管家修改测量时间
    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public void update(@RequestBody MeasureOrder measureOrder, HttpServletResponse response) {
        service.updateMeasure(measureOrder);
        System.out.println(measureOrder.getMeasureDate());
        super.json(response, true);
    }

    @RequestMapping(value = "/updateWorkerStatus/{id}")
    public void updateWorkerStatus(@PathVariable("id") int id, HttpServletResponse response) {
        rws.upadateWorkStatus(id);
        super.json(response, true);

    }

    @RequestMapping(value = "/sendOrder/list", method = RequestMethod.POST)
    public void sendOrder(SendOrder sendOrder, HttpServletResponse response) {
        if (null != sendOrder.getArrivalTimeStr() && !"\"\"".equals(sendOrder.getArrivalTimeStr())) {
            List<String> arrivalTimeList = JSON.parseObject(sendOrder.getArrivalTimeStr(), new TypeReference<List<String>>() {
            });
            if (arrivalTimeList.get(0) != null)
                sendOrder.setArrivalTime(DateUtil.transStr2Date(arrivalTimeList.get(0)));
            if (arrivalTimeList.get(1) != null)
                sendOrder.setArrivalTimeEnd(DateUtil.transStr2Date(arrivalTimeList.get(1)));
        }

        if (null != sendOrder.getCreateTimeStr() && !"\"\"".equals(sendOrder.getCreateTimeStr())) {
            List<String> createTimeList = JSON.parseObject(sendOrder.getCreateTimeStr(), new TypeReference<List<String>>() {
            });
            if (createTimeList.get(0) != null)
                sendOrder.setCreateTime(DateUtil.transStr2Date(createTimeList.get(0)));
            if (createTimeList.get(1) != null)
                sendOrder.setCreateTimeEnd(DateUtil.transStr2Date(createTimeList.get(1)));
        }
        List<SendOrder> sendOrderList = fitOrderService.sendOrderSearch(sendOrder);
        super.json(response, sendOrderList);
    }

    @RequestMapping(value = "/sendOrderDetail/reqId/{reqId}", method = RequestMethod.GET)
    public void sendOrderDetail(@PathVariable("reqId") int reqId, HttpServletResponse response) {
        Map result = new HashMap();
        RequirementWorkerWithTask workerWithTask = rws.getWithTaskById(reqId);
        FitTaskInstance fitTaskInstance = fitTaskInstanceService.getById(rws.getById(reqId).getFitTaskId());
        SendOrder sendOrder = fitOrderService.getSendOrderDetailById(fitTaskInstance.getFitOrderId());
        result.put("workerWithTask", workerWithTask);
        result.put("sendOrder", sendOrder);
        super.json(response, result);
    }

    @RequestMapping(value = "reqId/{reqId}/remainCount/")
    public void getRemainCountById(@PathVariable("reqId") Integer id, HttpServletResponse response) {
        int count = rws.getRemainCountById(id);
        super.json(response, count);
    }
}
