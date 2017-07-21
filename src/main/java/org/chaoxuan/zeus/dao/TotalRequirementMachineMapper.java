package org.chaoxuan.zeus.dao;

import org.chaoxuan.zeus.model.TotalRequirementMachine;

import java.util.List;

public interface TotalRequirementMachineMapper {
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
    int insert(TotalRequirementMachine record);

    /**
     *
     * @param record
     */
    int insertSelective(TotalRequirementMachine record);

    /**
     * 根据主键获取一条数据库记录
     *
     * @param id
     */
    TotalRequirementMachine selectByPrimaryKey(Integer id);

    /**
     *
     * @param record
     */
    int updateByPrimaryKeySelective(TotalRequirementMachine record);

    /**
     * 根据主键来更新数据库记录
     *
     * @param record
     */
    int updateByPrimaryKey(TotalRequirementMachine record);

    List<TotalRequirementMachine> getByOrderId(int orderId);
}