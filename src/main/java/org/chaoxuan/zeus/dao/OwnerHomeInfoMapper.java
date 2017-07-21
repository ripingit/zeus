package org.chaoxuan.zeus.dao;

import org.chaoxuan.zeus.model.OwnerHomeInfo;

import java.util.List;

public interface OwnerHomeInfoMapper {
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
    int insert(OwnerHomeInfo record);

    /**
     *
     * @param record
     */
    int insertSelective(OwnerHomeInfo record);

    /**
     * 根据主键获取一条数据库记录
     *
     * @param id
     */
    OwnerHomeInfo selectByPrimaryKey(Integer id);

    /**
     *
     * @param record
     */
    int updateByPrimaryKeySelective(OwnerHomeInfo record);

    /**
     * 根据主键来更新数据库记录
     *
     * @param record
     */
    int updateByPrimaryKey(OwnerHomeInfo record);

    List<OwnerHomeInfo> list();

    List<OwnerHomeInfo> searchByUserId(int id);
}