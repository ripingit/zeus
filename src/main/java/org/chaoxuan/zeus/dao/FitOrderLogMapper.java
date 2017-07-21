package org.chaoxuan.zeus.dao;

import org.chaoxuan.zeus.model.FitOrderLog;

import java.util.List;

public interface FitOrderLogMapper {
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
    int insert(FitOrderLog record);

    /**
     *
     * @param record
     */
    int insertSelective(FitOrderLog record);

    /**
     * 根据主键获取一条数据库记录
     *
     * @param id
     */
    FitOrderLog selectByPrimaryKey(Integer id);

    /**
     *
     * @param record
     */
    int updateByPrimaryKeySelective(FitOrderLog record);

    /**
     * 根据主键来更新数据库记录
     *
     * @param record
     */
    int updateByPrimaryKey(FitOrderLog record);

    FitOrderLog getLastFitOrderLogByOrderCode(String orderCode);
    List<FitOrderLog> listFitOrderLogByOrderCode(String orderCode);
}