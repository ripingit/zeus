package org.chaoxuan.zeus.service.impl;

import org.chaoxuan.zeus.dao.RequirementMachineMapper;
import org.chaoxuan.zeus.model.RequirementMachine;
import org.chaoxuan.zeus.service.RequirementMachineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/5/16 0016.
 */
@Service
public class RequirementMachineServiceImpl implements RequirementMachineService {
    @Autowired
    private RequirementMachineMapper requirementMachineMapper;
    @Override
    public List<RequirementMachine> searchByTaskInstanceId(int id) {
        return requirementMachineMapper.searchByTaskInstanceId(id);
    }

    @Override
    public void update(RequirementMachine rm) {
        requirementMachineMapper.updateByPrimaryKeySelective(rm);
    }

    @Override
    public RequirementMachine getById(int id) {
        return requirementMachineMapper.selectByPrimaryKey(id);
    }

    @Override
    public void upadateMachineStatus(int id) {
        requirementMachineMapper.upadateMachineStatus(id);
    }
}
