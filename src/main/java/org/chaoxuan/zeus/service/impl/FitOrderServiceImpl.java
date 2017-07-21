package org.chaoxuan.zeus.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.chaoxuan.commons.pojo.PGResults;
import org.chaoxuan.zeus.dao.*;
import org.chaoxuan.zeus.model.*;
import org.chaoxuan.zeus.service.FitOrderService;
import org.chaoxuan.zeus.service.FitStandardService;
import org.chaoxuan.zeus.service.FitTaskInstanceService;
import org.chaoxuan.zeus.service.OwnerHomeInfoService;
import org.chaoxuan.zeus.util.FitOrderState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Administrator on 2017/5/16 0016.
 */
@Service
public class FitOrderServiceImpl implements FitOrderService {
    @Autowired
    private FitOrderMapper fitOrderMapper;
    @Autowired
    private FitManagerMapper fitManagerMapper;
    @Autowired
    private FitOrderLogMapper fitOrderLogMapper;
    @Autowired
    private HouseTypeMapper houseTypeMapper;
    @Autowired
    private FitTaskInstanceMapper fitTaskInstanceMapper;
    @Autowired
    private FitTaskInstanceService fitTaskInstanceService;
    @Autowired
    private FitStandardService fitStandardService;
    @Autowired
    private OwnerHomeInfoService ownerHomeInfoService;

    @Override
    public FitOrder getFitOrder(int orderId) {
        FitOrder fitOrder = fitOrderMapper.selectByPrimaryKey(orderId);
        return fitOrder;

    }

    @Override
    public FitManager getFitManagerByOrderId(int orderId) {
        return fitManagerMapper.getFitManagerByOrderId(orderId);
    }

    @Override
    public FitOrderLog getLastFitOrderLogByOrderCode(String orderCode) {
        return fitOrderLogMapper.getLastFitOrderLogByOrderCode(orderCode);
    }

    @Override
    public List<FitOrderLog> listFitOrderLogByOrderCode(String orderCode) {
        return fitOrderLogMapper.listFitOrderLogByOrderCode(orderCode);
    }

    @Override
    public HouseType getHouseTypeByOrderId(int orderId) {
        return houseTypeMapper.getHouseTypeByOrderId(orderId);
    }

    @Override
    public int getTotalDaysByOrderId(int orderId) {
        return fitTaskInstanceMapper.getTotalDaysByOrderId(orderId);
    }

    @Override
    public int getCompletedDaysByOrderId(int orderId) {
        int count = 0;
        if (fitTaskInstanceMapper.getCompletedDaysByOrderId(orderId) != null)
            count = fitTaskInstanceMapper.getCompletedDaysByOrderId(orderId);
        return count;
    }

    @Override
    public List<Phase> getPhaseListByOrderId(int orderId) {
        List<FitTaskInstance> fitTaskInstanceList = fitTaskInstanceService.searchByOrderId(orderId);
        Map<String, List<FitTaskInstance>> map = new TreeMap<String, List<FitTaskInstance>>();
        for (FitTaskInstance fitTaskInstance : fitTaskInstanceList
                ) {
            String key = Integer.toString(fitTaskInstance.getPhase());
            if (map.get(key) == null) {
                List<FitTaskInstance> list = new ArrayList<FitTaskInstance>();
                list.add(fitTaskInstance);
                map.put(key, list);
            } else {
                map.get(key).add(fitTaskInstance);
            }
        }
        List<Phase> phaseList = new ArrayList<Phase>();
        for (String key : map.keySet()) {
            List<FitTaskInstance> list = map.get(key);
            //统计阶段天数
            int totalActualDay = 0;
            //阶段号
            int number = Integer.parseInt(key);
            for (FitTaskInstance task : list) {
                totalActualDay += task.getTaskActualDay();

            }
            Phase phase = new Phase(totalActualDay, number);
            phaseList.add(phase);
        }
        return phaseList;
    }

    /*
    按照条件查询装修订单
 */
    @Override
    public PGResults getFitOrderInfo(Integer page, Integer rows, FitOrderExtend extend) {
        // TODO Auto-generated method stub
        PageHelper.startPage(page, rows);
        List<FitOrderExtend> fitOrders = fitOrderMapper.getFitOrderInfo(extend);

        PGResults result = new PGResults();
        result.setRows(fitOrders);
        PageInfo<FitOrderExtend> info = new PageInfo(fitOrders);
        //查询总页数
        long pages = info.getPages();
        result.setPages(pages);
        return result;
    }

    @Override
    public FitOrder getOrderInfo(Integer id) {
        return fitOrderMapper.getOrderInfo(id);
    }

    @Override
    public FitOrder getBaseInfo(Integer id) {
        return fitOrderMapper.getBaseInfo(id);
    }

    @Override
    public List<SendOrder> sendOrderSearch(SendOrder sendOrder) {
        return fitOrderMapper.sendOrderSearch(sendOrder);
    }

    @Override
    public int sendOrderSearchCount(SendOrder sendOrder) {
        return fitOrderMapper.sendOrderSearchCount(sendOrder);
    }

    @Override
    public List<Option> getStateList() {
        List<Option> options = new ArrayList<>();
        for (int i = 0; i < FitOrderState.values().length; i++) {
            Option option = new Option();
            option.setLabel(FitOrderState.values()[i].getName());
            option.setValue(Integer.toString(FitOrderState.values()[i].getValue()));
            options.add(option);
        }
        return options;
    }

    @Override
    public SendOrder getSendOrderDetailById(int id) {
        SendOrder sendOrder = fitOrderMapper.getSendOrderDetailById(id);
        //假定一个用户只有一套房
        OwnerHomeInfo ownerHomeInfo = ownerHomeInfoService.searchByUserId(sendOrder.getOrderId()).get(0);
        sendOrder.setAddress(ownerHomeInfo.getAddress());
        return sendOrder;
    }

    @Override
    public void update(FitOrder fitOrder) {
        fitOrderMapper.updateByPrimaryKeySelective(fitOrder);
    }
}
