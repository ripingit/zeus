package org.chaoxuan.zeus.service;

import org.chaoxuan.zeus.model.WorkerResult;

/**
 * @author Yurnero
 * @data 2017/6/28
 * @description TODO
 */
public interface WorkerResultService {

    void save(Integer workerTaskId, Integer processFlowId, String attachs);

    WorkerResult get(Integer id);

    void edit(WorkerResult workerResult);
}
