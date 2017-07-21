package org.chaoxuan.zeus.dao;

import org.chaoxuan.zeus.model.WorkerRest;

import java.util.List;
import java.util.Map;

public interface WorkerRestMapper {
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
    int insert(WorkerRest record);

    /**
     * @param record
     */
    int insertSelective(WorkerRest record);

    /**
     * 根据主键获取一条数据库记录
     *
     * @param id
     */
    WorkerRest selectByPrimaryKey(Integer id);

    /**
     * @param record
     */
    int updateByPrimaryKeySelective(WorkerRest record);

    /**
     * 根据主键来更新数据库记录
     *
     * @param record
     */
    int updateByPrimaryKey(WorkerRest record);

    List<WorkerRest> find(Map<String, Object> param);
}