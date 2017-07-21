package org.chaoxuan.zeus.service;

import org.chaoxuan.zeus.model.Worker;
import org.chaoxuan.zeus.page.WorkerCalendar;

import java.util.List;
import java.util.Map;

/**
 * @author Yurnero
 * @data 2017/6/26
 * @description 工人 Service
 */
public interface WorkerService {

    /**
     * @param [worker]
     * @author Yurnero
     * @date 2017/6/26
     * @description 保存
     */
    Worker save(Worker worker);


    /**
      * @author Yurnero
      * @date 2017/6/27
      * @param [mobile, year, month]
      * @description todo
      */
    WorkerCalendar myCalendar(Integer id, Integer year, Integer month) throws Exception;

    Worker login(String mobile, String password, Boolean isSafe);

    Worker getByMobile(String mobile);

    void update(Worker worker);

    List<Worker> searchByMap(Map map);

    List<Worker> searchSentListByRequirementId(Integer id);
}
