package org.chaoxuan.zeus.controller;

import org.chaoxuan.service.SmsVerificationCodeService;
import org.chaoxuan.zeus.model.FitManager;
import org.chaoxuan.zeus.model.JsonMessage;
import org.chaoxuan.zeus.model.OwnerInfo;
import org.chaoxuan.zeus.service.FitManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 2017/7/12.
 */
@Controller
@RequestMapping("/manager")
public class FitManagerController extends BaseController{

    @Autowired
    private FitManagerService service;

    @Autowired
    private SmsVerificationCodeService smsVerificationCodeService;


    @RequestMapping("phone")
    public void Phone(HttpServletResponse response, FitManager fitManager) {
        String url;
        String phone = fitManager.getPhone();
        fitManager = service.getByMobile(phone);
        if (fitManager != null) {
            url = "/login/" + phone;
        } else {
            url = "/code/" + phone;
        }
        super.json(response, url);
    }


    @RequestMapping(value = "msg")
    public void msg(HttpServletResponse response, String phone) {

        JsonMessage jm = new JsonMessage();
        try {
            String msg = smsVerificationCodeService.sendMessage(phone, 4);
            jm.setSuccess(true);
            jm.setMsg("发送成功");
            jm.setObj(msg);
        } catch (Exception e) {
            jm.setMsg("发送失败");
            e.printStackTrace();
        }
        super.json(response, jm);
    }


    @RequestMapping(value = "check")
    public void check(HttpServletResponse response, String phone, String code) {
        boolean flag = smsVerificationCodeService.checkIsCorrectCode(phone, code);
        super.json(response, flag);
    }


    @RequestMapping(value = "password")
    public void password(HttpServletResponse response, HttpServletRequest request, FitManager fitManager) {
        JsonMessage jm = new JsonMessage();
        System.out.println(fitManager.getPhone());
        System.out.println(fitManager.getPassword());
        fitManager = service.save(fitManager);

        if (fitManager != null) {
            jm.setSuccess(true);
            jm.setMsg("操作成功");
            jm.setObj(fitManager.getPhone() + "," + fitManager.getPassword());
            request.getSession().setAttribute("ownerInfo", fitManager);
        } else {
            jm.setMsg("操作失败");
        }
        super.json(response, jm);
    }


    @RequestMapping(value = "login")
    public void login(HttpServletResponse response, HttpServletRequest request, String phone, String password, Boolean isSafe) {
        JsonMessage jm = new JsonMessage();
        FitManager fitManager = service.login(phone, password, isSafe);
        if (fitManager != null) {
            jm.setSuccess(true);
            jm.setMsg("登录成功");
            jm.setObj(fitManager.getPhone() + "," + fitManager.getPassword());
            request.getSession().setAttribute("fitManager", fitManager);
        } else {
            jm.setMsg("用户名或密码错误");
        }
        super.json(response, jm);
    }
    @RequestMapping(value = "getid")
    public void getIdByMobiole(HttpServletResponse response,FitManager fitManager){
        FitManager ff = service.getIdByMobile(fitManager);
        super.json(response,ff);
    }
    @RequestMapping(value = "searchByArea/area/{area}",method = RequestMethod.GET)
    public void list(HttpServletResponse response,@PathVariable("area")String area){
        super.json(response,service.searchByArea(area));
    }

}
