package org.chaoxuan.zeus.service;

import org.chaoxuan.zeus.model.Worker;
import org.chaoxuan.zeus.model.WorkerTask;
import org.chaoxuan.zeus.page.TaskDetal;

import java.util.Date;
import java.util.List;

/**
 * @author Yurnero
 * @data 2017/6/28
 * @description TODO
 */
public interface WorkerTaskService {

    /**
     * @param [workerId, date]
     * @author Yurnero
     * @date 2017/6/28
     * @description 根据工人 ID 查询任务集合
     */
    List<WorkerTask> list(Integer workerId, Date date) throws Exception;

    /**
     * @param [id]
     * @author Yurnero
     * @date 2017/6/30
     * @description 根据工人任务 ID 获取任务详情
     */
    TaskDetal get(Integer id) throws Exception;

   void create(WorkerTask workerTask);

    void deleteById(Integer id);

}
