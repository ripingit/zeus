package org.chaoxuan.zeus.controller;

import net.sf.json.JSONArray;
import org.chaoxuan.zeus.model.*;
import org.chaoxuan.zeus.service.FitRuleService;
import org.chaoxuan.zeus.service.FitTaskService;
import org.chaoxuan.zeus.util.MsgState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/fitRule")
public class FitRuleController extends BaseController {
    @Autowired
    private FitRuleService fitRuleService;
    @Autowired
    private FitTaskService fitTaskService;
    @RequestMapping(value="/fitRule",method = RequestMethod.POST)
    public void addFitRule(FitRule fitRule,HttpServletResponse response) {
        JsonMessage jm=new JsonMessage();
        try{
            fitRuleService.addFitRule(fitRule);
            jm.setSuccess(true);
        }catch (Exception e){
            e.printStackTrace();
            jm.setSuccess(false);
        }
        super.json(response,jm);
    }

    @RequestMapping(value = "/one", method = RequestMethod.PUT)
    public void editFitRule(@RequestBody FitRule fitRule, HttpServletResponse response) {
        JsonMessage jm = new JsonMessage();
        try {
            fitRuleService.editFitRule(fitRule);
            jm.setSuccess(true);
            jm.setMsg(MsgState.UPDATE_SUCCESS);
        } catch (Exception e) {
            jm.setMsg(MsgState.UPDATE_FAILURE);
            e.printStackTrace();
        }
        super.json(response, jm);
    }

    //根据version选择fitRule
    @RequestMapping(value = "/version/{version:.+}", method = RequestMethod.GET)
    public void queryFitRule(@PathVariable("version") String version, HttpServletResponse response) {
        Map<String, Object> map = new HashMap<String, Object>();
        FitRule fitRule = new FitRule();
        fitRule.setVersion(version);
        fitRule = fitRuleService.queryFitRule(fitRule).get(0);
        map.put("fitRule", fitRule);
        Map<String, List<FitTask>> fitTaskList = fitRuleService.searchFitTaskByVersion(version);
        map.put("fitTaskList", fitTaskList);
        super.json(response, map);
    }

    @RequestMapping(value = "versions", method = RequestMethod.GET)
    public void versionList(HttpServletResponse response) {
        List<FitRule> versions = fitRuleService.list();
        if (versions.size() == 0) {
            super.json(response, 0);
        } else
            super.json(response, versions);
    }

    @RequestMapping("cityList")
    public void cityList(HttpServletResponse response) {
       List<Address> addressList = fitRuleService.cityList();
       List<Option> result=new ArrayList<>();
       for(Address address:addressList){
           Option option=new Option();
           option.setValue(Integer.toString(address.getId()));
           option.setLabel(address.getName());
           result.add(option);
       }
       super.json(response,result);
    }

    @RequestMapping("deleteFitRuleBy")
    @ResponseBody
    public String deleteFitRuleBy(HttpServletRequest request) {
        int id = Integer.parseInt(request.getParameter("id"));
        int a = fitRuleService.deleteFitRuleBy(id);
        String result = JSONArray.fromObject(a).toString();
        return result;
    }

    @RequestMapping("version/{version:.+}/check")
    public void hasVersion(@PathVariable("version") String version,HttpServletResponse response){
     boolean flag=fitRuleService.hasVersion(version);
        super.json(response,flag);
    }

}
