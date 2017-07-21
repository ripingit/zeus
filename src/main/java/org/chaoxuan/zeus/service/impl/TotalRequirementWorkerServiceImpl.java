package org.chaoxuan.zeus.service.impl;

import org.chaoxuan.zeus.dao.TotalRequirementWorkerMapper;
import org.chaoxuan.zeus.model.TotalRequirementWorker;
import org.chaoxuan.zeus.service.TotalRequirementWorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/5/19 0019.
 */
@Service
public class TotalRequirementWorkerServiceImpl implements TotalRequirementWorkerService {
    @Autowired
    TotalRequirementWorkerMapper totalRequirementWorkerMapper;
    @Override
    public List<TotalRequirementWorker> getByOrderId(int orderId) {
        return totalRequirementWorkerMapper.getByOrderId(orderId);
    }
}
