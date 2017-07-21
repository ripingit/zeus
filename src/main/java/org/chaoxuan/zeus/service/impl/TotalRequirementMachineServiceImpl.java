package org.chaoxuan.zeus.service.impl;

import org.chaoxuan.zeus.dao.TotalRequirementMachineMapper;
import org.chaoxuan.zeus.model.TotalRequirementMachine;
import org.chaoxuan.zeus.service.TotalRequirementMachineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/5/19 0019.
 */
@Service
public class TotalRequirementMachineServiceImpl implements TotalRequirementMachineService {
    @Autowired
    private TotalRequirementMachineMapper totalRequirementMachineMapper;
    @Override
    public List<TotalRequirementMachine> getByOrderId(int orderId) {
        return totalRequirementMachineMapper.getByOrderId(orderId);
    }
}
