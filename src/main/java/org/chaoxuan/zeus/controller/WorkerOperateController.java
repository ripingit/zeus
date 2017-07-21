package org.chaoxuan.zeus.controller;

import org.chaoxuan.util.PropUtil;
import org.chaoxuan.zeus.model.*;
import org.chaoxuan.zeus.page.TaskDetal;
import org.chaoxuan.zeus.page.WorkerCalendar;
import org.chaoxuan.zeus.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.management.JMException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Yurnero
 * @data 2017/7/5
 * @description TODO
 */
@Controller
@RequestMapping(value = "worker_operate")
public class WorkerOperateController extends BaseController {

    private WorkerService workerService;

    private WorkerTaskService workerTaskService;

    private WorkerRestService workerRestService;

    private ProcessFlowService processFlowService;

    private WorkerResultService workerResultService;

    @RequestMapping(value = "my_calendar")
    public void myCalendar(HttpServletResponse response, HttpServletRequest request, Integer year, Integer month) {
        JsonMessage jm = new JsonMessage();
        try {
            Worker worker = (Worker) request.getSession().getAttribute("worker");
            WorkerCalendar workerCalendar = workerService.myCalendar(worker.getId(), year, month);
            jm.setSuccess(true);
            jm.setMsg("查询成功");
            jm.setObj(workerCalendar);
        } catch (Exception e) {
            jm.setMsg("系统异常");
            e.printStackTrace();
        }
        super.json(response, "yyyy-MM-dd", jm);
    }

    @RequestMapping(value = "task")
    public void task(HttpServletResponse response, Integer workerId, Date date) {
        JsonMessage jm = new JsonMessage();
        try {
            List<WorkerTask> listTask = workerTaskService.list(workerId, date);
            Map<String, Object> rest = workerRestService.rest(workerId, date);
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("listTask", listTask);
            map.put("rest", rest);
            jm.setSuccess(true);
            jm.setObj(map);
        } catch (Exception e) {
            jm.setMsg("系统异常");
            e.printStackTrace();
        }
        super.json(response, jm);
    }

    @RequestMapping(value = "rest")
    public void rest(HttpServletResponse response, Integer workerId, Date date) {
        JsonMessage jm = new JsonMessage();
        try {
            Map<String, Object> rest = workerRestService.rest(workerId, date);
            jm.setSuccess(true);
            jm.setObj(rest);
        } catch (Exception e) {
            jm.setMsg("系统异常");
            e.printStackTrace();
        }
        super.json(response, jm);
    }

    @RequestMapping(value = "task_detal")
    public void taskDetal(HttpServletResponse response, Integer id) {
        JsonMessage jm = new JsonMessage();
        try {
            TaskDetal taskDetal = workerTaskService.get(id);
            jm.setSuccess(true);
            jm.setObj(taskDetal);
        } catch (Exception e) {
            jm.setMsg("系统异常");
            e.printStackTrace();
        }
        super.json(response, jm);
    }

    @RequestMapping(value = "process")
    public void process(HttpServletResponse response, Integer id) {
        ProcessFlowWithBLOBs processFlowWithBLOBs = processFlowService.get(id);
        super.json(response, processFlowWithBLOBs);
    }

    @RequestMapping(value = "get_by_mobile")
    public void getByMobile(HttpServletResponse response, HttpServletRequest request) {
        Worker worker = (Worker) request.getSession().getAttribute("worker");
        worker = workerService.getByMobile(worker.getMobile());
        worker.setNginx(PropUtil.getProperty("config/common.properties", "nginx"));
        super.json(response, worker);
    }

    @RequestMapping(value = "save_rest")
    public void saveRest(HttpServletResponse response, Integer workerId, Date startAt, Date endAt) {
        JsonMessage jm = new JsonMessage();
        try {
            if (endAt.before(new Date())) {
                jm.setMsg("休息时间小于当前时间");
                throw new RuntimeException();
            }
            workerRestService.save(workerId, startAt, endAt);
            jm.setSuccess(true);
            jm.setMsg("设置成功");
        } catch (Exception e) {
            if (jm.getMsg() == null) {
                jm.setMsg("设置失败");
            }
            e.printStackTrace();
        }
        super.json(response, jm);
    }

    @RequestMapping(value = "cancel_rest")
    public void cancelRest(HttpServletResponse response, Integer id) {
        JsonMessage jm = new JsonMessage();
        try {
            workerRestService.cancelRest(id);
            jm.setSuccess(true);
            jm.setMsg("设置成功");
        } catch (Exception e) {
            jm.setMsg("设置失败");
            e.printStackTrace();
        }
        super.json(response, jm);
    }

    @RequestMapping(value = "update")
    public void update(HttpServletResponse response, Worker worker) {
        JsonMessage jm = new JsonMessage();
        try {
            workerService.update(worker);
            jm.setSuccess(true);
        } catch (Exception e) {
            jm.setMsg("更新失败");
            e.printStackTrace();
        }
        super.json(response, jm);
    }

    @RequestMapping(value = "logout")
    public void logout(HttpServletResponse response, HttpServletRequest request) {
        request.getSession().removeAttribute("worker");
        super.json(response, true);
    }

    @RequestMapping(value = "upload/{workerTaskId}/{processFlowId}")
    public void upload(HttpServletResponse response, HttpServletRequest request, @PathVariable Integer workerTaskId, @PathVariable Integer processFlowId) {
        JsonMessage jm = new JsonMessage();
        try {
            String attachs = super.upload(request);
            workerResultService.save(workerTaskId, processFlowId, attachs);
            jm.setSuccess(true);
            jm.setMsg("上传成功");
        } catch (Exception e) {
            jm.setMsg("上传失败");
            e.printStackTrace();
        }
        super.json(response, jm);
    }

    @RequestMapping(value = "image")
    public void image(HttpServletResponse response, Integer id) {
        String nginx = PropUtil.getProperty("config/common.properties", "nginx");
        WorkerResult image = workerResultService.get(id);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("nginx", nginx);
        map.put("image", image);
        super.json(response, map);
    }

    @RequestMapping(value = "upload_new_image")
    public void uploadNewImage(HttpServletResponse response, HttpServletRequest request) {
        JsonMessage jm = new JsonMessage();
        try {
            String attach = super.upload(request);
            jm.setSuccess(true);
            jm.setMsg("上传成功");
            jm.setObj(attach);
        } catch (Exception e) {
            jm.setMsg("上传失败");
            e.printStackTrace();
        }
        super.json(response, jm);
    }

    @RequestMapping(value = "edit_worker_result")
    public void editWorkerResult(HttpServletResponse response, WorkerResult workerResult) {
        JsonMessage jm = new JsonMessage();
        try {
            workerResultService.edit(workerResult);
            jm.setSuccess(true);
            jm.setMsg("操作成功");
        } catch (Exception e) {
            jm.setMsg("操作失败");
            e.printStackTrace();
        }
        super.json(response, jm);
    }

    @RequestMapping(value = "upload_head")
    public void uploadHead(HttpServletResponse response, HttpServletRequest request) {
        JsonMessage jm = new JsonMessage();
        try {
            String head = super.upload(request);
            Worker worker = (Worker) request.getSession().getAttribute("worker");
            Worker w = new Worker();
            w.setId(worker.getId());
            w.setHead(head);
            workerService.update(w);
            jm.setSuccess(true);
            jm.setMsg("上传成功");
        } catch (Exception e) {
            jm.setMsg("上传失败");
            e.printStackTrace();
        }
        super.json(response, jm);
    }

    @InitBinder
    public void initBinder(ServletRequestDataBinder binder) {
        binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"), true));
    }

    @Autowired
    public void setWorkerService(WorkerService workerService) {
        this.workerService = workerService;
    }

    @Autowired
    public void setWorkerTaskService(WorkerTaskService workerTaskService) {
        this.workerTaskService = workerTaskService;
    }

    @Autowired
    public void setWorkerRestService(WorkerRestService workerRestService) {
        this.workerRestService = workerRestService;
    }

    @Autowired
    public void setProcessFlowService(ProcessFlowService processFlowService) {
        this.processFlowService = processFlowService;
    }

    @Autowired
    public void setWorkerResultService(WorkerResultService workerResultService) {
        this.workerResultService = workerResultService;
    }
}
