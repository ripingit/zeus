package org.chaoxuan.zeus.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import org.chaoxuan.service.SmsVerificationCodeService;
import org.chaoxuan.zeus.model.*;
import org.chaoxuan.zeus.service.WorkerRestService;
import org.chaoxuan.zeus.service.WorkerService;
import org.chaoxuan.zeus.service.WorkerTaskService;
import org.chaoxuan.zeus.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Yurnero
 * @data 2017/6/26
 * @description Worker Controller
 */
@Controller
@RequestMapping(value = "worker")
public class WorkerController extends BaseController {

    private WorkerService workerService;

    private SmsVerificationCodeService smsVerificationCodeService;

    private WorkerRestService workerRestService;

    @Autowired
    private WorkerTaskService workerTaskService;

    /**
     * @param [response, worker]
     * @author Yurnero
     * @date 2017/7/5
     * @description 输入手机号
     */
    @RequestMapping("mobile")
    public void mobile(HttpServletResponse response, Worker worker) {
        String url;
        String mobile = worker.getMobile();
        worker = workerService.getByMobile(mobile);
        if (worker != null) {
            url = "/login/" + mobile;
        } else {
            url = "/code/" + mobile;
        }
        super.json(response, url);
    }

    /**
     * @param [response, mobile]
     * @author Yurnero
     * @date 2017/7/5
     * @description 发送验证码
     */
    @RequestMapping(value = "msg")
    public void msg(HttpServletResponse response, String mobile) {
        JsonMessage jm = new JsonMessage();
        try {
            String msg = smsVerificationCodeService.sendMessage(mobile, 4);
            jm.setSuccess(true);
            jm.setMsg("发送成功");
            jm.setObj(msg);
        } catch (Exception e) {
            jm.setMsg("发送失败");
            e.printStackTrace();
        }
        super.json(response, jm);
    }

    /**
     * @param [response, mobile, code]
     * @author Yurnero
     * @date 2017/7/5
     * @description 验证
     */
    @RequestMapping(value = "check")
    public void check(HttpServletResponse response, String mobile, String code) {
        boolean flag = smsVerificationCodeService.checkIsCorrectCode(mobile, code);
        super.json(response, flag);
    }

    /**
     * @param [response, request, worker]
     * @author Yurnero
     * @date 2017/7/5
     * @description 输入密码
     */
    @RequestMapping(value = "password")
    public void password(HttpServletResponse response, HttpServletRequest request, Worker worker) {
        JsonMessage jm = new JsonMessage();
        worker = workerService.save(worker);
        if (worker != null) {
            jm.setSuccess(true);
            jm.setMsg("操作成功");
            jm.setObj(worker.getMobile() + "," + worker.getPassword());
            request.getSession().setAttribute("worker", worker);
        } else {
            jm.setMsg("操作失败");
        }
        super.json(response, jm);
    }

    /**
     * @param [response, request, mobile, password]
     * @author Yurnero
     * @date 2017/7/5
     * @description 登录
     */
    @RequestMapping(value = "login")
    public void login(HttpServletResponse response, HttpServletRequest request, String mobile, String password, Boolean isSafe) {
        JsonMessage jm = new JsonMessage();
        Worker worker = workerService.login(mobile, password, isSafe);
        if (worker != null) {
            jm.setSuccess(true);
            jm.setMsg("登录成功");
            jm.setObj(worker.getMobile() + "," + worker.getPassword());
            request.getSession().setAttribute("worker", worker);
        } else {
            jm.setMsg("用户名或密码错误");
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
    public void setSmsVerificationCodeService(SmsVerificationCodeService smsVerificationCodeService) {
        this.smsVerificationCodeService = smsVerificationCodeService;
    }

    @Autowired
    public void setWorkerRestService(WorkerRestService workerRestService) {
        this.workerRestService = workerRestService;
    }

    @RequestMapping(value = "type/time", method = RequestMethod.POST)
    public void searchByTimeAndType(@RequestBody SearchWorker searchWorker, HttpServletResponse response) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss ");
        String startStr = JSON.parseObject(searchWorker.getStart(), new TypeReference<String>() {
        });
        String endStr = JSON.parseObject(searchWorker.getEnd(), new TypeReference<String>() {
        });
        String type= JSON.parseObject(searchWorker.getType(), new TypeReference<String>() {
        });
        SimpleDateFormat sdf =   new SimpleDateFormat( "yyyy-MM-dd HH:mm:ss" );
        System.out.println(startStr);
        Date start = null;
        Date end=null;
        try {
            start = sdf.parse(startStr);
            end=sdf.parse(endStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Map map = new HashMap();
        map.put("type", type);
        map.put("start", start);
        map.put("end", end);
        List<Worker> workers = workerService.searchByMap(map);
        super.json(response, workers);

    }
    @RequestMapping(value="sendOrder",method = RequestMethod.POST)
    public void sendOrder(@RequestBody SearchWorker searchWorker,HttpServletResponse response){
        JsonMessage jm=new JsonMessage();
        String startStr = JSON.parseObject(searchWorker.getStart(), new TypeReference<String>() {
        });
        String endStr = JSON.parseObject(searchWorker.getEnd(), new TypeReference<String>() {
        });
        String ids= JSON.parseObject(searchWorker.getIds(), new TypeReference<String>() {
        });
        String fitTaskId=JSON.parseObject(searchWorker.getFitTaskId(), new TypeReference<String>() {
        });
        String requirementId=JSON.parseObject(searchWorker.getRequirementId(), new TypeReference<String>() {
        });
        SimpleDateFormat sdf =   new SimpleDateFormat( "yyyy-MM-dd HH:mm:ss" );
        Date start = null;
        Date end=null;
        try {
            start = sdf.parse(startStr);
            end=sdf.parse(endStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        String []idsList=ids.split(",");
        try{
        for(int i=0;i<idsList.length;i++)
        {
            WorkerTask workerTask=new WorkerTask();
            workerTask.setWorkerId(Integer.parseInt(idsList[i]));
            workerTask.setRequirementId(Integer.parseInt(requirementId));
            workerTask.setFitTaskId(Integer.parseInt(fitTaskId));
            workerTask.setStartAt(start);
            workerTask.setEndAt(end);
            workerTaskService.create(workerTask);
        }
        jm.setMsg("成功");
        jm.setSuccess(true);
        }
        catch (Exception e){
                e.printStackTrace();
                jm.setSuccess(false);
                jm.setSuccess(false);
        }
        super.json(response,jm);
    }
    //查询已派单列表
    @RequestMapping(value = "sentOrderList/reqId/{reqId}",method = RequestMethod.POST)
    public void sentOrderList(@PathVariable("reqId") int reqId,HttpServletResponse response){
         List<Worker> workers= workerService.searchSentListByRequirementId(reqId);
         super.json(response,workers);
    }
    //更换工人，从派单列表删除该记录
    @RequestMapping(value = "sentList/id/{recordId}",method = RequestMethod.DELETE)
    public void sentList(@PathVariable("recordId") int recordId){
        workerTaskService.deleteById(recordId);
    }
}
