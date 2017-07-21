package org.chaoxuan.zeus.service;

import org.chaoxuan.commons.pojo.PGResults;
import org.chaoxuan.zeus.model.*;

import java.util.List;

/**
 * Created by Administrator on 2017/5/16 0016.
 */
public interface FitOrderService {
    /*
    查询订单基本信息
     */
    FitOrder getFitOrder(int orderId);

    /*
    查询订单管家信息
     */
    FitManager getFitManagerByOrderId(int orderId);

    /*
    查询订单最新执行信息
     */
    FitOrderLog getLastFitOrderLogByOrderCode(String orderCode);

    /*
    查询订单执行信息列表
     */
    List<FitOrderLog> listFitOrderLogByOrderCode(String orderCode);

    /*
    按照订单查找户型
     */
    HouseType getHouseTypeByOrderId(int orderId);

    /*
    查询某个订单的总任务天数
     */
    int getTotalDaysByOrderId(int orderId);

    /*
    查询某个订单已完成任务天数
     */
    int getCompletedDaysByOrderId(int orderId);
   /*
   按照阶段划分所有的任务实例
    */
    List<Phase> getPhaseListByOrderId(int orderId);
    
    /*
    按照条件查询装修订单
     */
    PGResults getFitOrderInfo(Integer page, Integer rows, FitOrderExtend fitOrderExtend);
    FitOrder getOrderInfo(Integer id);

    FitOrder getBaseInfo(Integer id);

    List<SendOrder> sendOrderSearch(SendOrder sendOrder);

    int sendOrderSearchCount(SendOrder sendOrder);

    List<Option> getStateList();

    SendOrder getSendOrderDetailById(int id);

    void update(FitOrder fitOrder);

}
