package org.chaoxuan.zeus.service;

import org.chaoxuan.zeus.model.FitProcessFlow;
import org.chaoxuan.zeus.model.FitTask;
import org.chaoxuan.zeus.model.FitTaskInstance;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/5/16 0016.
 */
public interface FitTaskInstanceService {
    /**
      * @author Yurnero
      * @date 2017/6/16
      * @param [orderId]
      * @description 查询任务实例, 并找到当前且是第一个为施工中的任务实例
      */
    List<FitTaskInstance> list(int orderId);
    /**
    按照订单id查询任务列表
     */
    List<FitTaskInstance> searchByOrderId(int orderId);
    /**
    按照订单id和阶段号查询任务列表
     */
    List<FitTaskInstance> searchByOrderAndPhase(Map<String,Object> map);
   int getPhaseCountByOrderId(int orderId);
   /**
   创建一个新的fitTaskInstance
    */
   int create(FitTaskInstance fitTaskInstance);
   /**
   根据id删除任务
    */
   int deleteById(int id);

    /**
     * 根据fitTaskInstanceId获取人材械列表信息
     * @param id
     * @return 人材械为key的map
     */
   Map getRequirementList(int id);

   FitTaskInstance getFitProgress(Integer id);

   FitProcessFlow getFitSpeces(Integer id);

    FitProcessFlow getFitCheck(Integer id);

    FitTaskInstance getById(int id);
    void checkReder(Integer id);
    void checkPass(Integer id);
}
