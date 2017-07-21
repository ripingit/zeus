package org.chaoxuan.zeus.controller;

import org.chaoxuan.zeus.model.FitProcessFlow;
import org.chaoxuan.zeus.model.FitTaskInstance;
import org.chaoxuan.zeus.service.FitTaskInstanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/6/12 0012.
 */
@Controller
@RequestMapping("fitOrder/fitTaskInstance")
public class FitTaskInstanceController extends BaseController{
    @Autowired
    private FitTaskInstanceService fitTaskInstanceService;
    @RequestMapping(value="taskId/{taskId}/requirementList",method = RequestMethod.GET)
    public void getRequirementList(@PathVariable("taskId") int id, HttpServletResponse response){
        Map map=fitTaskInstanceService.getRequirementList(id);
        super.json(response,map);
    }

    /**
     * 根据order的id该订单所有的任务信息及需求列表信息
     * @param id
     * @param response
     */
    @RequestMapping("orderId/{id}/detail")
    public void notStartedTask(@PathVariable("id") int id,HttpServletResponse response){
        List<FitTaskInstance>  taskInstanceList=fitTaskInstanceService.searchByOrderId(id);
        for (FitTaskInstance fti:taskInstanceList
                ) {
            Map requirementList=fitTaskInstanceService.getRequirementList(fti.getId());
            fti.setRequirementList(requirementList);
        }
        super.json(response,taskInstanceList);
    }

    @RequestMapping("fitProgress/{id}")
    public void getFitProgress(@PathVariable("id") int id,HttpServletResponse response){
        FitTaskInstance fitTaskInstance = fitTaskInstanceService.getFitProgress(id);
        super.json(response,fitTaskInstance);
    }

    @RequestMapping("fitSpeces/{id}")
    public void getFitSpeces(@PathVariable("id") int id,HttpServletResponse response){
        FitProcessFlow fitProcessFlow = fitTaskInstanceService.getFitSpeces(id);
        super.json(response,fitProcessFlow);
    }

    @RequestMapping("fitCheck/{id}")
    public void getCheck(@PathVariable("id") int id,HttpServletResponse response){
        FitProcessFlow fit = fitTaskInstanceService.getFitCheck(id);
        super.json(response,fit);
    }

    @RequestMapping("checkReder/{id}")
    public void checkReader(@PathVariable("id") Integer id, HttpServletResponse response){
        System.out.println(id);
        fitTaskInstanceService.checkReder(id);
        super.json(response,true);
    }

    @RequestMapping("checkPass/{id}")
    public void checkPass(@PathVariable("id") Integer id, HttpServletResponse response){
        fitTaskInstanceService.checkPass(id);
        super.json(response,true);
    }

}
