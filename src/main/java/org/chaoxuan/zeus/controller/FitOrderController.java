package org.chaoxuan.zeus.controller;

import org.chaoxuan.commons.pojo.PGResults;
import org.chaoxuan.zeus.model.*;
import org.chaoxuan.zeus.service.*;
import org.chaoxuan.zeus.util.FitOrderState;
import org.chaoxuan.zeus.util.MsgState;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/5/11 0011.
 */
@Controller()
@RequestMapping("/fitOrder")
public class FitOrderController extends BaseController {
    @Autowired
    private FitOrderService fitOrderService;
    @Autowired
    private FitTaskInstanceService fitTaskInstanceService;
    @Autowired
    private TotalRequirementWorkerService totalRequirementWorkerService;
    @Autowired
    private TotalRequirementProductService totalRequirementProductService;
    @Autowired
    private TotalRequirementMachineService totalRequirementMachineService;
    @Autowired
    private RequirementProductService requirementProductService;
    @Autowired
    private RequirementWorkerService requirementWorkerService;
    @Autowired
    private RequirementMachineService requirementMachineService;
    @Autowired
    private FitRuleService fitRuleService;
    @Autowired
    private FitStandardService fitStandardService;
    @Autowired
    private OwnerInfoService ownerInfoService;

    @RequestMapping(value = "/fitOrder/{orderId}", method = RequestMethod.GET)
    public void getFitOrderInfo(@PathVariable("orderId") int orderId, HttpServletResponse response) {
        Map<String, Object> resultMap = new HashMap<String, Object>();

        FitManager fitManager = fitOrderService.getFitManagerByOrderId(orderId);
    /*
    放入管家信息
     */
        resultMap.put("fitManager", fitManager);
        FitOrder fitOrder = fitOrderService.getFitOrder(orderId);
        FitOrderExtend fitOrderExtend=new FitOrderExtend();
        BeanUtils.copyProperties(fitOrder,fitOrderExtend);
        fitOrderExtend.setStateName(FitOrderState.getName(fitOrder.getStatus()));

    /*
    放入订单信息
     */
        resultMap.put("fitOrder", fitOrderExtend);
        FitOrderLog fitOrderLog = fitOrderService.getLastFitOrderLogByOrderCode(fitOrder.getOrderCode());
      /*
      放入客户信息
       */
        OwnerInfo ownerInfo = ownerInfoService.getById(fitOrder.getUserId());
        resultMap.put("ownerInfo", ownerInfo);
        /*
    放入最新记录
     */
        resultMap.put("fitOrderLog", fitOrderLog);
        super.json(response, resultMap);
    }

    @RequestMapping(value = "/notEditWorkAmount/order/{order}/phase/{phase}", method = RequestMethod.GET)
    @ResponseBody
    public void notEditWorkAmount(@PathVariable("phase") int phase, @PathVariable("order") int order, HttpServletResponse response) {
        //map做参数
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("phase", phase);
        map.put("order", order);
        List<FitTaskInstance> fitTaskInstancesList = fitTaskInstanceService.searchByOrderAndPhase(map);
       /*
       装入3个列表
        */
        for (FitTaskInstance fitTaskInstance : fitTaskInstancesList
                ) {
            List<RequirementMachine> requirementMachineList = requirementMachineService.searchByTaskInstanceId(fitTaskInstance.getId());
            List<RequirementProduct> requirementProductList = requirementProductService.searchByTaskInstanceId(fitTaskInstance.getId());
            List<RequirementWorker> requirementWorkerList = requirementWorkerService.searchByTaskInstanceId(fitTaskInstance.getId());
            fitTaskInstance.setRequirementMachineList(requirementMachineList);
            fitTaskInstance.setRequirementProductList(requirementProductList);
            fitTaskInstance.setRequirementWorkerList(requirementWorkerList);
        }
        super.json(response, fitTaskInstancesList);
    }

    @RequestMapping(value = "/notEditWorkAmount/order/{orderId}", method = RequestMethod.GET)
    public void fitTotalView(@PathVariable("orderId") int orderId, HttpServletResponse response) {
        Map<String, Object> resultMap = new HashMap<>();
        //获取phase对象
        List<Phase> phaseList = fitOrderService.getPhaseListByOrderId(orderId);
        //获取总任务天数
        int totalDays = fitOrderService.getTotalDaysByOrderId(orderId);
        //获取已完成任务天数
        int completedDays = fitOrderService.getCompletedDaysByOrderId(orderId);
        //获取材料清单
        List<TotalRequirementProduct> totalRequirementProductList = totalRequirementProductService.getByOrderId(orderId);
        List<TotalRequirementMachine> totalRequirementMachineList = totalRequirementMachineService.getByOrderId(orderId);
        List<TotalRequirementWorker> totalRequirementWorkerList = totalRequirementWorkerService.getByOrderId(orderId);
        resultMap.put("phaseList", phaseList);
        resultMap.put("totalDays", totalDays);
        resultMap.put("completeDays", completedDays);
        resultMap.put("totalRequirementProductList", totalRequirementProductList);
        resultMap.put("totalRequirementMachineList", totalRequirementMachineList);
        resultMap.put("totalRequirementWorkerList", totalRequirementWorkerList);
        super.json(response, resultMap);
    }

    @RequestMapping(value = "/notEditWorkAmount/order/{orderId}/phaseCount", method = RequestMethod.GET)
    @ResponseBody
    public String getPhaseCountByOrderId(@PathVariable("orderId") int orderId) {
        String result = "";
        result = Integer.toString(fitTaskInstanceService.getPhaseCountByOrderId(orderId));
        return result;
    }

    @RequestMapping(value = "/createFitTaskInstance", method = RequestMethod.PUT)
    public void createFitTaskInstance(FitStandard fitStandard, HttpServletResponse response) {

        /*
        创建一个fitstandard实例
         */
        fitStandardService.add(fitStandard);
        /*
        把fitStandard中的信息复制到fitTaskInstance
         */
        FitTaskInstance fitTaskInstance = fitTask2Instance(fitStandard.getFitTask());
        fitTaskInstance.setFitStandardId(fitStandard.getId());
        fitTaskInstance.setFitTaskId(fitStandard.getFitTask().getId());
        fitTaskInstance.setFitOrderId(fitStandard.getFitOrderId());
        JsonMessage jm = new JsonMessage();
        try {
            fitTaskInstanceService.create(fitTaskInstance);
            jm.setSuccess(true);
            jm.setMsg("添加成功 !");
        } catch (Exception e) {
            jm.setMsg("添加失败 !");
            e.printStackTrace();
        }
        super.json(response, jm);
    }

    @RequestMapping(value = "saveAsFitRule", method = RequestMethod.PUT)
    public void saveAsFitRule(@RequestBody FitRule fitRule, HttpServletResponse response) {
        /*
        借用id存储orderId
         */
        int orderId = fitRule.getId();
        StringBuilder sb = new StringBuilder();
        List<FitTaskInstance> fitTaskInstanceList = fitTaskInstanceService.searchByOrderId(orderId);
        for (int i = 0; i < fitTaskInstanceList.size(); i++) {
            sb.append(fitTaskInstanceList.get(i).getFitTaskId());
            sb.append(",");
        }
        fitRule.setTask(sb.toString());

        JsonMessage jm = new JsonMessage();
        try {
            fitRuleService.addFitRule(fitRule);
            jm.setSuccess(true);
            jm.setMsg("添加成功 !");
        } catch (Exception e) {
            jm.setMsg("添加失败 !");
            e.printStackTrace();
        }
        super.json(response, jm);
    }

    FitTaskInstance fitTask2Instance(FitTask fitTask) {
        FitTaskInstance fitTaskInstance = new FitTaskInstance();
        fitTaskInstance.setCategory(fitTask.getCategory());
        fitTaskInstance.setPhase(fitTask.getPhase());
        fitTaskInstance.setSequence(fitTask.getSequence());
        fitTaskInstance.setVersion(fitTask.getVersion());
        fitTaskInstance.setFitStandardId(fitTask.getFitStandardId());
        return fitTaskInstance;
    }

    @RequestMapping(value = "/log/orderId/{orderId}", method = RequestMethod.GET)
    public void getFitOrderLogByOrderId(@PathVariable("orderId") int orderId, HttpServletResponse response) {
        FitOrder fitOrder = fitOrderService.getFitOrder(orderId);
        String orderCode = fitOrder.getOrderCode();
        List<FitOrderLog> fitOrderLogList = fitOrderService.listFitOrderLogByOrderCode(orderCode);
        super.json(response, fitOrderLogList);
    }

    @RequestMapping(value = "/deleteFitTaskInstance/{fitTaskInstanceId}", method = RequestMethod.DELETE)
    public void deleteFitTaskInstance(@PathVariable("fitTaskInstanceId") int fitTaskInstanceId, HttpServletResponse response) {
        JsonMessage jm = new JsonMessage();
        try {
            fitTaskInstanceService.deleteById(fitTaskInstanceId);
            jm.setSuccess(true);
            jm.setMsg("删除成功 !");
        } catch (Exception e) {
            jm.setMsg("删除失败 !");
            e.printStackTrace();
        }
        super.json(response, jm);
    }

    //查看所有装修订单信息
    @RequestMapping("/list")
    public void getOwnerInfo(HttpServletResponse response, @RequestParam(defaultValue = "1") Integer page,
                             @RequestParam(defaultValue = "5") Integer rows, FitOrderExtend extend) {
        PGResults measure = fitOrderService.getFitOrderInfo(page, rows, extend);
        System.out.println(extend.getStartPredictTime()+"------------");
        super.json(response, measure);


    }

    //管家app
    @RequestMapping(value = "/getOrderInfo/{id}", method = RequestMethod.GET)
    public void getOrderInfo(@PathVariable("id") int id, HttpServletResponse response) {
        FitOrder orderInfo = fitOrderService.getOrderInfo(id);
        super.json(response, orderInfo);
    }

    //管家app
    @RequestMapping(value = "/getBaseInfo/{id}", method = RequestMethod.GET)
    public void getBaseInfo(@PathVariable("id") int id, HttpServletResponse response) {
        FitOrder baseInfo = fitOrderService.getBaseInfo(id);
        super.json(response, baseInfo);
    }

    @RequestMapping(value = "state/list", method = RequestMethod.GET)
    public void stateList(HttpServletResponse response) {
        super.json(response, fitOrderService.getStateList());
    }

    @RequestMapping(value = "fitOrder", method = RequestMethod.PUT)
    public void update(FitOrder fitOrder, HttpServletResponse response) {
        JsonMessage jm = new JsonMessage();
        try {
            fitOrderService.update(fitOrder);
            jm.setMsg(MsgState.UPDATE_SUCCESS);
            jm.setSuccess(true);
        } catch (Exception e) {
            jm.setMsg(MsgState.UPDATE_FAILURE);
            jm.setSuccess(false);
            e.printStackTrace();
        }
        super.json(response, jm);
    }
}
