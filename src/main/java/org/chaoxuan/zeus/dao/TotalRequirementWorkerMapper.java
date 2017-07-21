package org.chaoxuan.zeus.dao;

import org.chaoxuan.zeus.model.TotalRequirementMachine;
import org.chaoxuan.zeus.model.TotalRequirementWorker;

import java.util.List;

public interface TotalRequirementWorkerMapper {
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
    int insert(TotalRequirementWorker record);

    /**
     *
     * @param record
     */
    int insertSelective(TotalRequirementWorker record);

    /**
     * 根据主键获取一条数据库记录
     *
     * @param id
     */
    TotalRequirementWorker selectByPrimaryKey(Integer id);

    /**
     *
     * @param record
     */
    int updateByPrimaryKeySelective(TotalRequirementWorker record);

    /**
     * 根据主键来更新数据库记录
     *
     * @param record
     */
    int updateByPrimaryKey(TotalRequirementWorker record);
    List<TotalRequirementWorker> getByOrderId(int orderId);
}