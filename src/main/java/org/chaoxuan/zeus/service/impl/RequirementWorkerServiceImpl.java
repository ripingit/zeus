package org.chaoxuan.zeus.service.impl;

import org.chaoxuan.zeus.dao.RequirementProductMapper;
import org.chaoxuan.zeus.dao.RequirementWorkerMapper;
import org.chaoxuan.zeus.model.RequirementProduct;
import org.chaoxuan.zeus.model.RequirementWorker;
import org.chaoxuan.zeus.model.RequirementWorkerWithTask;
import org.chaoxuan.zeus.service.RequirementProductService;
import org.chaoxuan.zeus.service.RequirementWorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/5/16 0016.
 */
@Service
public class RequirementWorkerServiceImpl implements RequirementWorkerService{
@Autowired
private RequirementWorkerMapper requirementWorkerMapper;
    @Override
    public List<RequirementWorker> searchByTaskInstanceId(int id) {
        List<RequirementWorker> workerList=requirementWorkerMapper.searchByTaskInstanceId(id);
            return workerList;
    }

    @Override
    public void update(RequirementWorker rw) {
        requirementWorkerMapper.updateByPrimaryKeySelective(rw);
    }

    @Override
    public RequirementWorker getById(int id) {
        return requirementWorkerMapper.selectByPrimaryKey(id);
    }

    @Override
    public void upadateWorkStatus(int id) {
        requirementWorkerMapper.upadateWorkStatus(id);
    }

    @Override
    public List<RequirementWorker> searchByOrderIds(Map map) {
        return requirementWorkerMapper.searchByOrderIds(map);
    }

    @Override
    public RequirementWorkerWithTask getWithTaskById(int id) {
        return requirementWorkerMapper.getWithTaskById(id);
    }

    @Override
    public Integer getRemainCountById(Integer id) {
        return requirementWorkerMapper.getRemainCountById(id);
    }
}
