package org.chaoxuan.zeus.service;

import org.chaoxuan.zeus.model.TotalRequirementMachine;

import java.util.List;

/**
 * Created by Administrator on 2017/5/19 0019.
 */
public interface TotalRequirementMachineService {
    List<TotalRequirementMachine> getByOrderId(int orderId);
}
