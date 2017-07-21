package org.chaoxuan.zeus.service.impl;

import org.chaoxuan.zeus.dao.WorkerRestMapper;
import org.chaoxuan.zeus.model.WorkerRest;
import org.chaoxuan.zeus.service.WorkerRestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Yurnero
 * @data 2017/6/28
 * @description TODO
 */
@Service(value = "workerRestService")
public class WorkerRestServiceImpl implements WorkerRestService {

    private WorkerRestMapper workerRestMapper;

    /**
     * @param [workerId, date]
     * @author Yurnero
     * @date 2017/6/28
     * @description todo
     */
    @Override
    public Map<String, Object> rest(Integer workerId, Date date) {
        Map<String, Object> param = new HashMap<String, Object>();
        param.put("workerId", workerId);
        param.put("toDays", date);
        List<WorkerRest> list = workerRestMapper.find(param);
        if (list != null && list.size() != 0) {
            SimpleDateFormat hourFormat = new SimpleDateFormat("HH");
            WorkerRest workerRest = list.get(0);
            Integer id = workerRest.getId();
            Date startAt = workerRest.getStartAt();
            Date endAt = workerRest.getEndAt();
            param.clear();
            param.put("id", id);
            if ("08".equals(hourFormat.format(startAt)) && "12".equals(hourFormat.format(endAt))) {
                param.put("time", "am");
            }
            if ("12".equals(hourFormat.format(startAt)) && "18".equals(hourFormat.format(endAt))) {
                param.put("time", "pm");
            }
            if ("08".equals(hourFormat.format(startAt)) && "18".equals(hourFormat.format(endAt))) {
                param.put("time", "ap");
            }
            return param;
        }
        return null;
    }

    @Override
    public void save(Integer workerId, Date startAt, Date endAt) {
        Map<String, Object> param = new HashMap<String, Object>();
        WorkerRest workerRest = new WorkerRest();
        workerRest.setStartAt(startAt);
        workerRest.setEndAt(endAt);

        // 查找今天是否设置过休息
        param.clear();
        param.put("workerId", workerId);
        param.put("toDays", startAt);
        List<WorkerRest> listWorkerRest = workerRestMapper.find(param);
        if (listWorkerRest != null && listWorkerRest.size() > 0) {
            // 更新
            workerRest.setId(listWorkerRest.get(0).getId());
            workerRestMapper.updateByPrimaryKeySelective(workerRest);
        } else {
            // 插入
            workerRest.setWorkerId(workerId);
            workerRestMapper.insertSelective(workerRest);
        }
    }

    @Override
    public void cancelRest(Integer id) {
        workerRestMapper.deleteByPrimaryKey(id);
    }

    @Autowired
    public void setWorkerRestMapper(WorkerRestMapper workerRestMapper) {
        this.workerRestMapper = workerRestMapper;
    }

}
