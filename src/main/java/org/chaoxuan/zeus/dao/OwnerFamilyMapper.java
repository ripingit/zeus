package org.chaoxuan.zeus.dao;

import org.chaoxuan.zeus.model.OwnerFamily;

import java.util.List;

public interface OwnerFamilyMapper {
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
    int insert(OwnerFamily record);

    /**
     *
     * @param record
     */
    int insertSelective(OwnerFamily record);

    /**
     * 根据主键获取一条数据库记录
     *
     * @param id
     */
    OwnerFamily selectByPrimaryKey(Integer id);

    /**
     *
     * @param record
     */
    int updateByPrimaryKeySelective(OwnerFamily record);

    /**
     * 根据主键来更新数据库记录
     *
     * @param record
     */
    int updateByPrimaryKey(OwnerFamily record);

    List<OwnerFamily> list();
}