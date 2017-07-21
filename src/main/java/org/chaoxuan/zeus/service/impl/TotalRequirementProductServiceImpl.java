package org.chaoxuan.zeus.service.impl;

import org.chaoxuan.zeus.dao.TotalRequirementProductMapper;
import org.chaoxuan.zeus.model.TotalRequirementProduct;
import org.chaoxuan.zeus.service.TotalRequirementProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/5/19 0019.
 */
@Service
public class TotalRequirementProductServiceImpl implements TotalRequirementProductService {
    @Autowired
    private TotalRequirementProductMapper totalRequirementProductMapper;
    @Override
    public List<TotalRequirementProduct> getByOrderId(int orderId) {
        return totalRequirementProductMapper.getByOrderId(orderId);
    }
}
