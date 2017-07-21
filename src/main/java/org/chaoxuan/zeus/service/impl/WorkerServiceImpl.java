package org.chaoxuan.zeus.service.impl;

import org.chaoxuan.util.PropUtil;
import org.chaoxuan.zeus.dao.WorkerMapper;
import org.chaoxuan.zeus.dao.WorkerRestMapper;
import org.chaoxuan.zeus.dao.WorkerTaskMapper;
import org.chaoxuan.zeus.model.Worker;
import org.chaoxuan.zeus.model.WorkerRest;
import org.chaoxuan.zeus.model.WorkerTask;
import org.chaoxuan.zeus.page.WorkerCalendar;
import org.chaoxuan.zeus.service.WorkerService;
import org.chaoxuan.zeus.util.CalendarUtil;
import org.chaoxuan.zeus.util.Encrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author Yurnero
 * @data 2017/6/26
 * @description 工人 Service
 */
@Service(value = "workerService")
public class WorkerServiceImpl implements WorkerService {

    private WorkerMapper workerMapper;

    private WorkerTaskMapper workerTaskMapper;

    private WorkerRestMapper workerRestMapper;

    /**
     * @param [worker]
     * @author Yurnero
     * @date 2017/6/26
     * @description 保存
     */
    @Override
    public Worker save(Worker worker) {
        String mobile = worker.getMobile();
        String password = Encrypt.e(worker.getPassword());
        worker.setPassword(password);
        workerMapper.insertSelective(worker);
        Map<String, Object> param = new HashMap<String, Object>();
        param.put("mobile", mobile);
        param.put("password", worker.getPassword());
        List<Worker> list = workerMapper.find(param);
        if (list != null && list.size() != 0) {
            return list.get(0);
        }
        return null;
    }


    @Override
    public Worker login(String mobile, String password, Boolean isSafe) {
        Map<String, Object> param = new HashMap<String, Object>();
        param.put("mobile", mobile);
        if (!isSafe) {
            param.put("password", Encrypt.e(password));
        } else {
            param.put("password", password);
        }
        List<Worker> list = workerMapper.find(param);
        if (list != null && list.size() != 0) {
            return list.get(0);
        }
        return null;
    }

    /**
     * @param [mobile, year, month]
     * @author Yurnero
     * @date 2017/6/27
     * @description 工人日历
     */
    public WorkerCalendar myCalendar(Integer id, Integer year, Integer month) throws Exception {
        Map<String, Object> param = new HashMap<String, Object>();

        // 设置年月日
        Date date = new Date();
        Integer currYear = Integer.parseInt(CalendarUtil.format("yyyy", date));
        Integer currMonth = Integer.parseInt(CalendarUtil.format("MM", date));
        Integer currDay = Integer.parseInt(CalendarUtil.format("dd", date));
        if (year == null) year = currYear;
        if (month == null) month = currMonth;

        // 一个月有多少天周几开始
        int monthDays = CalendarUtil.getDaysByMonth(year, month);
        Integer padding = CalendarUtil.getDay(year, month);

        // 根据 id 查询工人某年某月的任务
        param.clear();
        param.put("workerId", id);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        String startTime = year.toString() + (month > 9 ? month.toString() : "0" + month) + "01";
        String endTime = year.toString() + (month > 9 ? month.toString() : "0" + month) + monthDays;
        param.put("startAt", sdf.parse(startTime));
        param.put("endAt", sdf.parse(endTime));
        List<WorkerTask> listWorkerTask = workerTaskMapper.find(param);

        // 查询工人休息时间
        List<WorkerRest> listWorkerRest = workerRestMapper.find(param);

        // 封装所有天到 list 中
        List<Map<String, Object>> lac = new ArrayList<Map<String, Object>>();
        for (int i = 1; i < monthDays + 1; i++) {
            Map<String, Object> map = new HashMap<String, Object>();

            // 日历数字
            map.put("num", i);
            // 选择天, 默认 false
            map.put("selectedDay", false);

            // 当前天
            if (year.intValue() == currYear.intValue() && month.intValue() == currMonth.intValue() && i == currDay) {
                map.put("defaultDay", true);
            } else {
                map.put("defaultDay", false);
            }

            // 遍历工人任务
            for (WorkerTask workerTask : listWorkerTask) {
                int startAt = Integer.parseInt(CalendarUtil.format("dd", workerTask.getStartAt()));
                int endAt = Integer.parseInt(CalendarUtil.format("dd", workerTask.getEndAt()));

                // 是否有任务
                if (i >= startAt && i <= endAt) {
                    map.put("task", true);
                    break;
                } else {
                    map.put("task", false);
                }
            }

            // 遍历工人休息时间
            for (WorkerRest workerRest : listWorkerRest) {
                int startAt = Integer.parseInt(CalendarUtil.format("dd", workerRest.getStartAt()));
                int endAt = Integer.parseInt(CalendarUtil.format("dd", workerRest.getEndAt()));

                if (i >= startAt && i <= endAt) {
                    map.put("rest", true);
                    break;
                } else {
                    map.put("rest", false);
                }
            }
            lac.add(map);
        }

        // 分解
        int rwos = (int) Math.ceil((padding + monthDays) * 1.0 / 7);
        List<List<Map<String, Object>>> l = new ArrayList<List<Map<String, Object>>>();
        int size = lac.size();
        for (int i = 0; i < rwos; i++) {
            List<Map<String, Object>> lc = new ArrayList<Map<String, Object>>();
            if (i == 0) {
                for (int j = 0; j < padding; j++) {
                    Map<String, Object> map = new HashMap<String, Object>();
                    map.put("num", 0);
                    lc.add(map);
                }
            }

            int end = (i + 1) * 7 - padding;
            end = end > size ? size : end;
            for (int start = i == 0 ? 0 : i * 7 - padding; start < end; start++) {
                lc.add(lac.get(start));
            }
            l.add(lc);
        }

        // 封装到 WorkerCalendar 里面
        WorkerCalendar workerCalendar = new WorkerCalendar();
        workerCalendar.setWorkerId(id);
        workerCalendar.setHead(workerMapper.selectByPrimaryKey(id).getHead());
        workerCalendar.setNginx(PropUtil.getProperty("config/common.properties", "nginx"));
        workerCalendar.setCurrYear(year);
        workerCalendar.setCurrMonth(month);
        workerCalendar.setCurrDay(currDay);
        workerCalendar.setCurrDate(date);
        workerCalendar.setList(l);
        return workerCalendar;
    }

    @Override
    public Worker getByMobile(String mobile) {
        Map<String, Object> param = new HashMap<String, Object>();
        param.put("mobile", mobile);
        List<Worker> list = workerMapper.find(param);
        if (list != null && list.size() != 0) {
            return list.get(0);
        }
        return null;
    }

    @Override
    public void update(Worker worker) {
        workerMapper.updateByPrimaryKeySelective(worker);
    }

    @Override
    public List<Worker> searchByMap(Map map) {
        String type = (String) map.get("type");
        List<Worker> workers = workerMapper.searchByTime(map);
        for (int i = 0; i < workers.size(); i++) {
            String types = workers.get(i).getTypeIds();
            String[] typeIds = types.split(",");
            //遍历工种列表，判断是否符合工种
            for (int j = 0; j < typeIds.length; j++) {
                if (typeIds[j].equals(type))
                    break;
                if (j == typeIds.length - 1)
                    workers.remove(i);
            }
        }
        return workers;
    }

    @Autowired
    public void setWorkerMapper(WorkerMapper workerMapper) {
        this.workerMapper = workerMapper;
    }

    @Autowired
    public void setWorkerTaskMapper(WorkerTaskMapper workerTaskMapper) {
        this.workerTaskMapper = workerTaskMapper;
    }

    @Autowired
    public void setWorkerRestMapper(WorkerRestMapper workerRestMapper) {
        this.workerRestMapper = workerRestMapper;
    }

    @Override
    public List<Worker> searchSentListByRequirementId(Integer id) {
        return workerMapper.searchSentListByRequirementId(id);
    }
}
