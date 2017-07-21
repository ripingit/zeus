package org.chaoxuan.zeus.controller;

import org.chaoxuan.zeus.model.JsonMessage;
import org.chaoxuan.zeus.model.RequirementProduct;
import org.chaoxuan.zeus.service.RequirementProductService;
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
@RequestMapping("/fitOrder/requirementProduct")
public class RequirementProductController extends  BaseController{
    @Autowired
    private RequirementProductService rps;
    @RequestMapping(value = "/book",method = RequestMethod.PUT)
    public void bookProduct(@RequestBody RequirementProduct rp,HttpServletResponse response){
        JsonMessage jm=new JsonMessage();
        try{
            rps.update(rp);
            jm.setSuccess(true);
            jm.setMsg("预约成功");
        }
        catch (Exception e){
            e.printStackTrace();
            jm.setSuccess(false);
            jm.setMsg("预约失败");
        }
        super.json(response,jm);
    }
    @RequestMapping(value = "/id/{id}")
    public void getById(@PathVariable("id") int id, HttpServletResponse response){
        RequirementProduct requirementProduct=rps.getById(id);
        super.jsonWithOutDateFormat(response,requirementProduct);
    }

    @RequestMapping(value = "/updateProductStatus/{id}")
    public void updateProductStatus(@PathVariable("id") int id,HttpServletResponse response){
        rps.upadateProducrStatus(id);
        super.json(response, true);
    }
}
