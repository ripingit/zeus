package org.chaoxuan.zeus.service.impl;

import org.chaoxuan.zeus.dao.*;
import org.chaoxuan.zeus.model.*;
import org.chaoxuan.zeus.service.FitTaskInstanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/5/16 0016.
 */
@Service
public class FitTaskInstanceServiceImpl implements FitTaskInstanceService {
  @Autowired
  private FitTaskInstanceMapper fitTaskInstanceMapper;
  @Autowired
  private FitTaskMapper fitTaskMapper;
  @Autowired
  private RequirementMachineMapper requirementMachineMapper;
  @Autowired
  private RequirementWorkerMapper requirementWorkerMapper;
  @Autowired
  private RequirementProductMapper requirementProductMapper;

  /**
   * @author Yurnero
   * @date 2017/6/16
   * @param [orderId]
   * @description 查询任务实例, 并找到当前且是第一个为施工中的任务实例
   */
  @Override
  public List<FitTaskInstance> list(int orderId) {
    List<FitTaskInstance> list = fitTaskInstanceMapper.searchByOrderId(orderId);
    for (FitTaskInstance fitTaskInstance : list) {
      Integer completeFlag = fitTaskInstance.getCompleteFlag();
      if (completeFlag == 2) {
        fitTaskInstance.setCurrTask(true);
        break;
      }
    }
    for (int i = 0, j = 1; i < list.size(); i++) {
      Integer completeFlag = list.get(i).getCompleteFlag();
      if (completeFlag == 2) {
        list.get(i).setCurrTaskIndex(j);
        j++;
      }
    }
    return list;
  }

  @Override
  public List<FitTaskInstance> searchByOrderId(int orderId) {
    List<FitTaskInstance> fitTaskInstanceList = fitTaskInstanceMapper.searchByOrderId(orderId);
    return fitTaskInstanceList;
  }

  @Override
  public List<FitTaskInstance> searchByOrderAndPhase(Map<String, Object> map) {
    List<FitTaskInstance> fitTaskInstanceList = fitTaskInstanceMapper.searchByOrderAndPhase(map);
    return fitTaskInstanceList;
  }

  @Override
  public int getPhaseCountByOrderId(int orderId) {
    return fitTaskInstanceMapper.getPhaseCountByOrderId(orderId);
  }

  @Override
  public int create(FitTaskInstance fitTaskInstance) {
    return fitTaskInstanceMapper.insertSelective(fitTaskInstance);
  }

  @Override
  public int deleteById(int id) {
    return fitTaskInstanceMapper.deleteByPrimaryKey(id);
  }

  @Override
  public Map getRequirementList(int id) {
    Map map=new HashMap();
    List<RequirementWorker> rwList=requirementWorkerMapper.searchByTaskInstanceId(id);
    List<RequirementMachine> rmList=requirementMachineMapper.searchByTaskInstanceId(id);
    List<RequirementProduct> rpList=requirementProductMapper.searchByTaskInstanceId(id);
    FitTaskInstance prList =  fitTaskInstanceMapper.getFitStatus(id);
    map.put("rwList",rwList);
    map.put("rmList",rmList);
    map.put("rpList",rpList);
    map.put("prList",prList);
    return map;
  }

  /*
  另存为模板时才调用
   */
  FitTask fillByInstance(FitTaskInstance fitTaskInstance){
    FitTask fitTask = new FitTask();
    fitTask.setCategory(fitTaskInstance.getCategory());
    fitTask.setFitStandardId(fitTaskInstance.getFitStandardId());
    fitTask.setArea(fitTaskInstance.getQuotaArea());
    fitTask.setPhase(fitTaskInstance.getPhase());
    fitTask.setSequence(fitTaskInstance.getSequence());
    fitTask.setVersion(fitTaskInstance.getVersion());
    return fitTask;
  }

  @Override
  public FitProcessFlow getFitCheck(Integer id) {
    return fitTaskInstanceMapper.getFitCheck(id);
  }

  @Override
  public FitTaskInstance getById(int id) {
    return fitTaskInstanceMapper.selectByPrimaryKey(id);
  }

  @Override
  public FitProcessFlow getFitSpeces(Integer id) {
    return fitTaskInstanceMapper.getFitSpeces(id);
  }
  @Override
  public FitTaskInstance getFitProgress(Integer id) {
    return fitTaskInstanceMapper.getFitProgress(id);
  }
  @Override
  public void checkReder(Integer id) {
    fitTaskInstanceMapper.checkReder(id);
  }

  @Override
  public void checkPass(Integer id) {
    fitTaskInstanceMapper.checkPass(id);
  }

}
