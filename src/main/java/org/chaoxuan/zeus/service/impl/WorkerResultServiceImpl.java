package org.chaoxuan.zeus.service.impl;

import org.chaoxuan.zeus.dao.WorkerResultMapper;
import org.chaoxuan.zeus.model.WorkerResult;
import org.chaoxuan.zeus.service.WorkerResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Yurnero
 * @data 2017/6/28
 * @description TODO
 */
@Service(value = "workerResultService")
public class WorkerResultServiceImpl implements WorkerResultService {

    private WorkerResultMapper workerResultMapper;

    @Override
    public void save(Integer workerTaskId, Integer processFlowId, String attachs) {
        WorkerResult workerResult = new WorkerResult();
        workerResult.setWorkerTaskId(workerTaskId);
        workerResult.setProcessFlowId(processFlowId);
        workerResult.setAttachs(attachs);
        workerResult.setStatus(1);
        workerResult.setCreateTime(new Date());
        workerResultMapper.insertSelective(workerResult);
    }

    @Override
    public WorkerResult get(Integer id) {
        Map<String, Object> param = new HashMap<String, Object>();
        param.put("id", id);
        List<WorkerResult> list = workerResultMapper.find(param);
        if (list != null && list.size() != 0) {
            return list.get(0);
        }
        return null;
    }

    @Override
    public void edit(WorkerResult workerResult) {
        workerResultMapper.updateByPrimaryKeySelective(workerResult);
    }

    @Autowired
    public void setWorkerResultMapper(WorkerResultMapper workerResultMapper) {
        this.workerResultMapper = workerResultMapper;
    }
}
