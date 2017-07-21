package org.chaoxuan.zeus.dao;

import org.chaoxuan.zeus.model.*;

import java.util.List;

public interface FitOrderMapper {
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
    int insert(FitOrder record);

    /**
     *
     * @param record
     */
    int insertSelective(FitOrder record);

    /**
     * 根据主键获取一条数据库记录
     *
     * @param id
     */
    FitOrder selectByPrimaryKey(Integer id);

    /**
     *
     * @param record
     */
    int updateByPrimaryKeySelective(FitOrder record);

    /**
     * 根据主键来更新数据库记录
     *
     * @param record
     */
    int updateByPrimaryKey(FitOrder record);
    //根据条件获取装修订单信息
    List<FitOrderExtend> getFitOrderInfo(FitOrderExtend fitOrderExtend);

    FitOrder getOrderInfo(Integer id);

    FitOrder getBaseInfo(Integer id);

    List<SendOrder> sendOrderSearch(SendOrder sendOrder);
    int sendOrderSearchCount(SendOrder sendOrder);

    SendOrder getSendOrderDetailById(int id);
}