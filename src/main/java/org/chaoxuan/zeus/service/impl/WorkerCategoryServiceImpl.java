package org.chaoxuan.zeus.service.impl;

import org.chaoxuan.zeus.dao.WorkerCategoryMapper;
import org.chaoxuan.zeus.model.WorkerCategory;
import org.chaoxuan.zeus.service.WorkerCategoryService;
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
@Service(value = "workerCategoryService")
public class WorkerCategoryServiceImpl implements WorkerCategoryService {

    private WorkerCategoryMapper workerCategoryMapper;

    @Override
    public List<WorkerCategory> list() {
        Map<String, Object> param = new HashMap<String, Object>();
        return workerCategoryMapper.find(param);
    }

    @Autowired
    public void setWorkerCategoryMapper(WorkerCategoryMapper workerCategoryMapper) {
        this.workerCategoryMapper = workerCategoryMapper;
    }
}
