package org.chaoxuan.zeus.service.impl;

import org.chaoxuan.util.PropUtil;
import org.chaoxuan.zeus.dao.*;
import org.chaoxuan.zeus.model.*;
import org.chaoxuan.zeus.page.TaskDetal;
import org.chaoxuan.zeus.service.ProcessFlowService;
import org.chaoxuan.zeus.service.RequirementWorkerService;
import org.chaoxuan.zeus.service.WorkerTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Yurnero
 * @data 2017/6/28
 * @description TODO
 */
@Service(value = "workerTaskService")
public class WorkerTaskServiceImpl implements WorkerTaskService {
    private WorkerTaskMapper workerTaskMapper;

    private FitTaskInstanceMapper fitTaskInstanceMapper;

    private TotalRequirementProductMapper totalRequirementProductMapper;

    private ProcessFlowService processFlowService;

    private FitOrderMapper fitOrderMapper;

    private OwnerInfoMapper ownerInfoMapper;

    private FitManagerMapper fitManagerMapper;

    @Autowired
    private RequirementWorkerService requirementWorkerService;

    /**
     * @param [workerId, date]
     * @author Yurnero
     * @date 2017/6/28
     * @description 根据工人 ID 查询任务集合
     */
    @Override
    public List<WorkerTask> list(Integer workerId, Date date) throws Exception {
        Map<String, Object> param = new HashMap<String, Object>();
        param.put("workerId", workerId);
        param.put("toDays", date);
        List<WorkerTask> list = workerTaskMapper.find(param);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        for (WorkerTask workerTask : list) {
            Long start = sdf.parse(sdf.format(workerTask.getStartAt())).getTime();
            Long end = sdf.parse(sdf.format(workerTask.getEndAt())).getTime();
            Long thisDay = date.getTime();
            Double totalDays = Math.ceil((end - start) * 1.0 / (1000 * 3600 * 24));
            Double currDay = Math.ceil((thisDay - start) * 1.0 / (1000 * 3600 * 24));
            workerTask.setTotalDays(totalDays.intValue() + 1);
            workerTask.setCurrDay(currDay.intValue() + 1);
        }
        return list;
    }

    /**
     * @param [id]
     * @author Yurnero
     * @date 2017/6/30
     * @description 根据工人任务 ID 获取任务详情
     */
    @Override
    public TaskDetal get(Integer id) throws Exception {
        TaskDetal taskDetal = new TaskDetal();
        WorkerTask workerTask = workerTaskMapper.selectByPrimaryKey(id);
        Integer fitTaskId = workerTask.getFitTaskId();
        Date startAt = workerTask.getStartAt();
        Date endAt = workerTask.getEndAt();

        // 设置总天数
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Long start = sdf.parse(sdf.format(startAt)).getTime();
        Long end = sdf.parse(sdf.format(endAt)).getTime();
        Double totalDays = Math.ceil((end - start) * 1.0 / (1000 * 3600 * 24));
        taskDetal.setTotalDays(totalDays.intValue() + 1);

        //设置施工时间范围
        SimpleDateFormat mdFormat = new SimpleDateFormat("MM.dd");
        taskDetal.setTaskDate(mdFormat.format(startAt) + "-" + mdFormat.format(endAt));

        // 材料清单
        FitTaskInstance fitTaskInstance = fitTaskInstanceMapper.selectByPrimaryKey(fitTaskId);
        Integer fitOrderId = fitTaskInstance.getFitOrderId();
        List<TotalRequirementProduct> listTotalRequirementProduct = totalRequirementProductMapper.getByOrderId(fitOrderId);
        taskDetal.setListTotalRequirementProduct(listTotalRequirementProduct);
        taskDetal.setQuotaArea(fitTaskInstance.getQuotaArea());
        taskDetal.setTitle(fitTaskInstance.getTitle());

        // 设置地址
        FitOrder fitOrder = fitOrderMapper.selectByPrimaryKey(fitOrderId);
        Integer userId = fitOrder.getUserId();
        Map<String, Object> param = new HashMap<String, Object>();
        param.put("userid", userId);
        List<OwnerHomeInfo> listOwnerHomeInfo = ownerInfoMapper.find(param);
        if (listOwnerHomeInfo != null && listOwnerHomeInfo.size() != 0) {
            taskDetal.setAddress(listOwnerHomeInfo.get(0).getAddress());
        }

        // 设置管家电话
        Integer managerId = fitOrder.getManagerId();
        FitManager fitManager = fitManagerMapper.selectByPrimaryKey(managerId);
        taskDetal.setManagerMobile(fitManager.getPhone());

        // 工艺流程
        List<ProcessFlowWithBLOBs> listProcessFlowWithBLOBs = processFlowService.list(fitTaskId, id);
        taskDetal.setListProcessFlow(listProcessFlowWithBLOBs);

        taskDetal.setNginx(PropUtil.getProperty("config/common.properties", "nginx"));
        return taskDetal;
    }

    @Autowired
    public void setWorkerTaskMapper(WorkerTaskMapper workerTaskMapper) {
        this.workerTaskMapper = workerTaskMapper;
    }

    @Autowired
    public void setFitTaskInstanceMapper(FitTaskInstanceMapper fitTaskInstanceMapper) {
        this.fitTaskInstanceMapper = fitTaskInstanceMapper;
    }

    @Autowired
    public void setTotalRequirementProductMapper(TotalRequirementProductMapper totalRequirementProductMapper) {
        this.totalRequirementProductMapper = totalRequirementProductMapper;
    }

    @Autowired
    public void setProcessFlowService(ProcessFlowService processFlowService) {
        this.processFlowService = processFlowService;
    }

    @Autowired
    public void setFitOrderMapper(FitOrderMapper fitOrderMapper) {
        this.fitOrderMapper = fitOrderMapper;
    }

    @Autowired
    public void setOwnerInfoMapper(OwnerInfoMapper ownerInfoMapper) {
        this.ownerInfoMapper = ownerInfoMapper;
    }

    @Autowired
    public void setFitManagerMapper(FitManagerMapper fitManagerMapper) {
        this.fitManagerMapper = fitManagerMapper;
    }

    @Override
    public void create(WorkerTask workerTask) {
        workerTaskMapper.insertSelective(workerTask);
        //所需工人与需求相同，则表明已经派单完成
        //查找taskid的数量
        int count1 = workerTaskMapper.searchCountByRequirementId(workerTask.getRequirementId());
        int count2 = requirementWorkerService.getById(workerTask.getRequirementId()).getWorkerQuantity();
        if (count1 == count2) {
            RequirementWorker rw = new RequirementWorker();
            //标识为派单完成
            rw.setState(1);
            requirementWorkerService.update(rw);
        }
    }

    @Override
    public void deleteById(Integer id) {
        workerTaskMapper.deleteByPrimaryKey(id);
    }
}
