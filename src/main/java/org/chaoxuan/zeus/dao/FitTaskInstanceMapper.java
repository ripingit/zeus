package org.chaoxuan.zeus.dao;

import org.chaoxuan.zeus.model.FitProcessFlow;
import org.chaoxuan.zeus.model.FitTaskInstance;

import java.util.Date;
import java.util.List;
import java.util.Map;

public interface FitTaskInstanceMapper {
    /**
     * 根据主键删除数据库的记录
     *
     * @param id
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 插入数据库记录
     *
     * @param record
     */
    int insert(FitTaskInstance record);

    /**
     *
     * @param record
     */
    int insertSelective(FitTaskInstance record);

    /**
     * 根据主键获取一条数据库记录
     *
     * @param id
     */
    FitTaskInstance selectByPrimaryKey(Integer id);

    /**
     *
     * @param record
     */
    int updateByPrimaryKeySelective(FitTaskInstance record);

    /**
     * 根据主键来更新数据库记录
     *
     * @param record
     */
    int updateByPrimaryKey(FitTaskInstance record);

    List<FitTaskInstance> searchByOrderId(int orderId);

    List<FitTaskInstance>  searchByOrderAndPhase(Map<String,Object> map);

    Integer getTotalDaysByOrderId(int orderId);

    Integer getCompletedDaysByOrderId(int orderId);

    int getPhaseCountByOrderId(int orderId);

    /**
      * @author Yurnero
      * @date 2017/6/13
      * @param [param]
      * @description 统计
      */
    Integer count(Map<String, Object> param);

    /**
      * @author Yurnero
      * @date 2017/6/13
      * @param [param]
      * @description 获取最小时间
      */
    Date getMinDate(Map<String, Object> param);

    FitTaskInstance getFitProgress(Integer id);
    FitProcessFlow getFitSpeces(Integer id);
    FitProcessFlow getFitCheck(Integer id);
    FitTaskInstance getFitStatus(Integer id);
    void checkReder(Integer id);
    void checkPass(Integer id);
}