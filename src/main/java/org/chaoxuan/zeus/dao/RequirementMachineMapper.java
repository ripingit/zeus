package org.chaoxuan.zeus.dao;

import org.chaoxuan.zeus.model.RequirementMachine;

import java.util.List;

public interface RequirementMachineMapper {
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
    int insert(RequirementMachine record);

    /**
     *
     * @param record
     */
    int insertSelective(RequirementMachine record);

    /**
     * 根据主键获取一条数据库记录
     *
     * @param id
     */
    RequirementMachine selectByPrimaryKey(Integer id);

    /**
     *
     * @param record
     */
    int updateByPrimaryKeySelective(RequirementMachine record);

    /**
     * 根据主键来更新数据库记录
     *
     * @param record
     */
    int updateByPrimaryKey(RequirementMachine record);

    List<RequirementMachine> searchByTaskInstanceId(int id);
    void upadateMachineStatus(int id);
}