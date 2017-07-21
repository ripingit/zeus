package org.chaoxuan.zeus.dao;

import org.chaoxuan.zeus.model.RequirementProduct;
import org.chaoxuan.zeus.model.RequirementWorker;
import org.chaoxuan.zeus.model.RequirementWorkerWithTask;
import org.chaoxuan.zeus.model.Worker;

import java.util.List;
import java.util.Map;

public interface RequirementWorkerMapper {
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
    int insert(RequirementWorker record);

    /**
     *
     * @param record
     */
    int insertSelective(RequirementWorker record);

    /**
     * 根据主键获取一条数据库记录
     *
     * @param id
     */
    RequirementWorker selectByPrimaryKey(Integer id);

    /**
     *
     * @param record
     */
    int updateByPrimaryKeySelective(RequirementWorker record);

    /**
     * 根据主键来更新数据库记录
     *
     * @param record
     */
    int updateByPrimaryKey(RequirementWorker record);

    List<RequirementWorker> searchByTaskInstanceId(int id);
    void upadateWorkStatus(int id);

    List<RequirementWorker> searchByOrderIds(Map map);

    RequirementWorkerWithTask getWithTaskById(int id);

   Integer getRemainCountById(Integer id);
}