package org.chaoxuan.zeus.controller;

import org.chaoxuan.zeus.model.JsonMessage;
import org.chaoxuan.zeus.model.RequirementMachine;
import org.chaoxuan.zeus.service.RequirementMachineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 2017/6/9 0009.
 */
@Controller
@RequestMapping("/fitOrder/requirementMachine")
public class RequirementMachineController extends  BaseController {
    @Autowired
    private RequirementMachineService rms;
    @RequestMapping(value = "/book",method = RequestMethod.PUT)
    public void bookMachine(@RequestBody RequirementMachine rm,HttpServletResponse response){
        JsonMessage jm=new JsonMessage();
        try{
            rms.update(rm);
            jm.setSuccess(true);
            jm.setMsg("预约成功");
        }
        catch (Exception e){
            e.printStackTrace();
            jm.setMsg("预约失败");
            jm.setSuccess(false);
        }
        super.json(response,jm);
    }
    @RequestMapping(value = "/id/{id}")
    public void getById(@PathVariable("id") int id, HttpServletResponse response){
        RequirementMachine requirementMachine=rms.getById(id);
        super.jsonWithOutDateFormat(response,requirementMachine);
    }

    @RequestMapping(value = "/updateMachineStatus/{id}")
    public void updateMachineStatus(@PathVariable("id") int id,HttpServletResponse response){
            rms.upadateMachineStatus(id);
            super.json(response, true);
    }
}
