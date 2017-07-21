package org.chaoxuan.zeus.dao;

import org.chaoxuan.zeus.model.RequirementProduct;

import java.util.List;

public interface RequirementProductMapper {
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
    int insert(RequirementProduct record);

    /**
     *
     * @param record
     */
    int insertSelective(RequirementProduct record);

    /**
     * 根据主键获取一条数据库记录
     *
     * @param id
     */
    RequirementProduct selectByPrimaryKey(Integer id);

    /**
     *
     * @param record
     */
    int updateByPrimaryKeySelective(RequirementProduct record);

    /**
     * 根据主键来更新数据库记录
     *
     * @param record
     */
    int updateByPrimaryKey(RequirementProduct record);

    /**
     * 根据任务实例id获取需求列表
     * @param id
     * @return
     */
    List<RequirementProduct> searchByTaskInstanceId(int id);

    void upadateProducrStatus(int id);
}