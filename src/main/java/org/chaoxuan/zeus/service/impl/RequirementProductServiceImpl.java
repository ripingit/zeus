package org.chaoxuan.zeus.service.impl;

import org.chaoxuan.zeus.dao.RequirementProductMapper;
import org.chaoxuan.zeus.model.RequirementProduct;
import org.chaoxuan.zeus.service.RequirementProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/5/16 0016.
 */
@Service
public class RequirementProductServiceImpl implements RequirementProductService {
    @Autowired
    private RequirementProductMapper requirementProductMapper;
    @Override
    public List<RequirementProduct> searchByTaskInstanceId(int id) {
        return requirementProductMapper.searchByTaskInstanceId(id);
    }

    @Override
    public void update(RequirementProduct rp) {
        requirementProductMapper.updateByPrimaryKeySelective(rp);
    }

    @Override
    public RequirementProduct getById(int id) {
        return requirementProductMapper.selectByPrimaryKey(id);
    }

    @Override
    public void upadateProducrStatus(int id) {
        requirementProductMapper.upadateProducrStatus(id);
    }
}
