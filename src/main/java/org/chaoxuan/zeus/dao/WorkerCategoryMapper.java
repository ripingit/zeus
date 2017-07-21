package org.chaoxuan.zeus.dao;

import org.chaoxuan.zeus.model.WorkerCategory;

import java.util.List;
import java.util.Map;

public interface WorkerCategoryMapper {
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
    int insert(WorkerCategory record);

    /**
     *
     * @param record
     */
    int insertSelective(WorkerCategory record);

    /**
     * 根据主键获取一条数据库记录
     *
     * @param id
     */
    WorkerCategory selectByPrimaryKey(Integer id);

    /**
     *
     * @param record
     */
    int updateByPrimaryKeySelective(WorkerCategory record);

    /**
     * 根据主键来更新数据库记录
     *
     * @param record
     */
    int updateByPrimaryKey(WorkerCategory record);

    List<WorkerCategory> find(Map<String, Object> param);
}