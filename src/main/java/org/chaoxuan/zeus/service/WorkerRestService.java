package org.chaoxuan.zeus.service;

import java.util.Date;
import java.util.Map;

/**
 * @author Yurnero
 * @data 2017/6/28
 * @description TODO
 */
public interface WorkerRestService {

    /**
      * @author Yurnero
      * @date 2017/6/28
      * @param [workerId, date]
      * @description todo
      */
    Map<String, Object> rest(Integer workerId, Date date);

    void save(Integer workerId, Date startAt, Date endAt);

    void cancelRest(Integer id);
}
