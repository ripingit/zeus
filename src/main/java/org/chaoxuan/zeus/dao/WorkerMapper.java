package org.chaoxuan.zeus.dao;

import org.chaoxuan.zeus.model.Worker;

import java.util.List;
import java.util.Map;

public interface WorkerMapper {
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
    int insert(Worker record);

    /**
     * @param record
     */
    int insertSelective(Worker record);

    /**
     * 根据主键获取一条数据库记录
     *
     * @param id
     */
    Worker selectByPrimaryKey(Integer id);

    /**
     * @param record
     */
    int updateByPrimaryKeySelective(Worker record);

    /**
     * 根据主键来更新数据库记录
     *
     * @param record
     */
    int updateByPrimaryKey(Worker record);

    int update(Map<String, Object> param);

    List<Worker> find(Map<String, Object> param);

   List<Worker> searchByTime(Map map);

    List<Worker> searchSentListByRequirementId(Integer id);
}