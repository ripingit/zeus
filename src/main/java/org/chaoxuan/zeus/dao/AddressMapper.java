package org.chaoxuan.zeus.dao;

import org.chaoxuan.zeus.model.Address;

import java.util.List;

public interface AddressMapper {
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
    int insert(Address record);

    /**
     *
     * @param record
     */
    int insertSelective(Address record);

    /**
     * 根据主键获取一条数据库记录
     *
     * @param id
     */
    Address selectByPrimaryKey(Integer id);

    /**
     *
     * @param record
     */
    int updateByPrimaryKeySelective(Address record);

    /**
     * 根据主键来更新数据库记录
     *
     * @param record
     */
    int updateByPrimaryKey(Address record);

    List <Address> searchByPid(int id);

    List<Address> list();
}