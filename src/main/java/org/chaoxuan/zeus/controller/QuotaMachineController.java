package org.chaoxuan.zeus.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.chaoxuan.zeus.model.JsonMessage;
import org.chaoxuan.zeus.model.QuotaMachine;
import org.chaoxuan.zeus.service.QuotaMachineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/quota_machine")
public class QuotaMachineController extends BaseController {

    private QuotaMachineService quotaMachineService;

    @Autowired
    public void setQuotaMachineService(QuotaMachineService quotaMachineService) {
        this.quotaMachineService = quotaMachineService;
    }

    /**
     * @param response
     * @author Yurnero
     * @date 2017年5月16日
     * @description 列表
     */
    @RequestMapping(value = "machine", method = RequestMethod.GET)
    public void list(HttpServletResponse response) {
        List<QuotaMachine> list = quotaMachineService.list();
        super.json(response, list);
    }

    /**
     * @param response
     * @param id
     * @author Yurnero
     * @date 2017年5月17日
     * @description 根据 ID 获取
     */
    @RequestMapping(value = "machine/{id}", method = RequestMethod.GET)
    public void get(HttpServletResponse response, @PathVariable Integer id) {
        QuotaMachine quotaMachine = quotaMachineService.get(id);
        super.json(response, quotaMachine);
    }

    /**
      * @author Yurnero
      * @date 2017/5/25
      * @param [response, categoryId, area]
      * @description 条件查询
      */
    @RequestMapping(value = "machine/{categoryId}/{area}", method = RequestMethod.GET)
    public void find(HttpServletResponse response, @PathVariable Integer categoryId, @PathVariable String area) {
        List<QuotaMachine> list = quotaMachineService.listByCon(categoryId, area);
        super.json(response, list);
    }

    /**
     * @param response
     * @param quotaMachine
     * @author Yurnero
     * @date 2017年5月16日
     * @description 添加
     */
    @RequestMapping(value = "machine", method = RequestMethod.POST)
    public void add(HttpServletResponse response, QuotaMachine quotaMachine) {
        JsonMessage jm = new JsonMessage();
        try {
            quotaMachineService.add(quotaMachine);
            jm.setSuccess(true);
            jm.setMsg("添加成功 !");
        } catch (Exception e) {
            jm.setMsg("添加失败 !");
            e.printStackTrace();
        }
        super.json(response, jm);
    }

    /**
     * @param response
     * @param quotaMachine
     * @author Yurnero
     * @date 2017年5月17日
     * @description 更新
     */
    @RequestMapping(value = "machine", method = RequestMethod.PUT)
    public void edit(HttpServletResponse response, QuotaMachine quotaMachine) {
        JsonMessage jm = new JsonMessage();
        try {
            quotaMachineService.edit(quotaMachine);
            jm.setSuccess(true);
            jm.setMsg("修改成功 !");
        } catch (Exception e) {
            jm.setMsg("修改失败 !");
            e.printStackTrace();
        }
        super.json(response, jm);
    }

    /**
     * @param response
     * @param id
     * @author Yurnero
     * @date 2017年5月17日
     * @description 删除
     */
    @RequestMapping(value = "machine/{id}", method = RequestMethod.DELETE)
    public void delete(HttpServletResponse response, @PathVariable Integer id) {
        JsonMessage jm = new JsonMessage();
        try {
            quotaMachineService.delete(id);
            jm.setSuccess(true);
            jm.setMsg("删除成功 !");
        } catch (Exception e) {
            jm.setMsg("删除失败 !");
            e.printStackTrace();
        }
        super.json(response, jm);
    }



}
