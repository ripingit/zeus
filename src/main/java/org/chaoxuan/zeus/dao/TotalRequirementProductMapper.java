package org.chaoxuan.zeus.dao;

import org.chaoxuan.zeus.model.TotalRequirementMachine;
import org.chaoxuan.zeus.model.TotalRequirementProduct;

import java.util.List;

public interface TotalRequirementProductMapper {
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
    int insert(TotalRequirementProduct record);

    /**
     *
     * @param record
     */
    int insertSelective(TotalRequirementProduct record);

    /**
     * 根据主键获取一条数据库记录
     *
     * @param id
     */
    TotalRequirementProduct selectByPrimaryKey(Integer id);

    /**
     *
     * @param record
     */
    int updateByPrimaryKeySelective(TotalRequirementProduct record);

    /**
     * 根据主键来更新数据库记录
     *
     * @param record
     */
    int updateByPrimaryKey(TotalRequirementProduct record);

    List<TotalRequirementProduct> getByOrderId(int orderId);
}