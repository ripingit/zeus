package org.chaoxuan.zeus.dao;

import org.chaoxuan.zeus.model.Worker;
import org.chaoxuan.zeus.model.WorkerTask;

import java.util.List;
import java.util.Map;

public interface WorkerTaskMapper {
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
    int insert(WorkerTask record);

    /**
     * @param record
     */
    int insertSelective(WorkerTask record);

    /**
     * 根据主键获取一条数据库记录
     *
     * @param id
     */
    WorkerTask selectByPrimaryKey(Integer id);

    /**
     * @param record
     */
    int updateByPrimaryKeySelective(WorkerTask record);

    /**
     * 根据主键来更新数据库记录
     *
     * @param record
     */
    int updateByPrimaryKey(WorkerTask record);

    List<WorkerTask> find(Map<String, Object> param);

    Integer searchCountByRequirementId(Integer id);


}