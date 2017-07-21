package org.chaoxuan.zeus.dao;

import org.chaoxuan.zeus.model.HouseType;

public interface HouseTypeMapper {
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
    int insert(HouseType record);

    /**
     *
     * @param record
     */
    int insertSelective(HouseType record);

    /**
     * 根据主键获取一条数据库记录
     *
     * @param id
     */
    HouseType selectByPrimaryKey(Integer id);

    /**
     *
     * @param record
     */
    int updateByPrimaryKeySelective(HouseType record);

    /**
     * 根据主键来更新数据库记录
     *
     * @param record
     */
    int updateByPrimaryKey(HouseType record);

    HouseType getHouseTypeByOrderId(int orderId);
}