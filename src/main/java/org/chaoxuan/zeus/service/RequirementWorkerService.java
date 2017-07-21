package org.chaoxuan.zeus.service;

import org.chaoxuan.zeus.model.RequirementWorker;
import org.chaoxuan.zeus.model.RequirementWorkerWithTask;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/5/16 0016.
 */
public interface RequirementWorkerService {
List<RequirementWorker> searchByTaskInstanceId(int id);

    /**
     * 更新人工需求信息
     * @param rw
     */
    void update(RequirementWorker rw);

    /**
     * 根据id获取一条记录
     * @param id
     * @return
     */
    RequirementWorker getById(int id);

    void upadateWorkStatus(int id);

    List<RequirementWorker> searchByOrderIds(Map map);

    RequirementWorkerWithTask getWithTaskById(int id);

    Integer getRemainCountById(Integer id);
}
