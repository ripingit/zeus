package org.chaoxuan.zeus.dao;

import org.chaoxuan.zeus.model.WorkerResult;

import java.util.List;
import java.util.Map;

public interface WorkerResultMapper {
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
    int insert(WorkerResult record);

    /**
     * @param record
     */
    int insertSelective(WorkerResult record);

    /**
     * 根据主键获取一条数据库记录
     *
     * @param id
     */
    WorkerResult selectByPrimaryKey(Integer id);

    /**
     * @param record
     */
    int updateByPrimaryKeySelective(WorkerResult record);

    /**
     * @param record
     */
    int updateByPrimaryKeyWithBLOBs(WorkerResult record);

    /**
     * 根据主键来更新数据库记录
     *
     * @param record
     */
    int updateByPrimaryKey(WorkerResult record);

    List<WorkerResult> find(Map<String, Object> param);
}