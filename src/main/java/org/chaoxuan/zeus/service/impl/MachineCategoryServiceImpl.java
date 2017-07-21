package org.chaoxuan.zeus.service.impl;

import org.chaoxuan.zeus.dao.MachineCategoryMapper;
import org.chaoxuan.zeus.model.MachineCategory;
import org.chaoxuan.zeus.service.MachineCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Yurnero
 * @data 2017/7/14
 * @description TODO
 */
@Service(value = "machineCategoryService")
public class MachineCategoryServiceImpl implements MachineCategoryService {

    private MachineCategoryMapper machineCategoryMapper;

    @Override
    public List<MachineCategory> list() {
        Map<String, Object> param = new HashMap<String, Object>();
        return machineCategoryMapper.find(param);
    }

    @Autowired
    public void setMachineCategoryMapper(MachineCategoryMapper machineCategoryMapper) {
        this.machineCategoryMapper = machineCategoryMapper;
    }
}
