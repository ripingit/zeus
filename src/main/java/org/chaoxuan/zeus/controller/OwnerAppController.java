package org.chaoxuan.zeus.controller;

import org.chaoxuan.service.SmsVerificationCodeService;
import org.chaoxuan.zeus.model.FitManager;
import org.chaoxuan.zeus.model.JsonMessage;
import org.chaoxuan.zeus.model.OwnerInfo;
import org.chaoxuan.zeus.service.OwnerInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 2017/7/11.
 */
@Controller
@RequestMapping("/owenrApp")
public class OwnerAppController extends BaseController{

    @Autowired
    private OwnerInfoService owenrInfoService;

    @Autowired
    private SmsVerificationCodeService smsVerificationCodeService;


    @RequestMapping("/getManager/{id}")
    public void getManager(@PathVariable Integer id, HttpServletResponse response){
        FitManager manager = owenrInfoService.getManager(id);
        super.json(response, manager);
    }


    @RequestMapping("mobile")
    public void mobile(HttpServletResponse response, OwnerInfo ownerInfo) {
        String url;
        String mobile = ownerInfo.getMobile();
        ownerInfo = owenrInfoService.getByMobile(mobile);
        if (ownerInfo != null) {
            url = "/login/" + mobile;
        } else {
            url = "/code/" + mobile;
        }
        super.json(response, url);
    }


    @RequestMapping(value = "msg")
    public void msg(HttpServletResponse response, String mobile) {
        System.out.println(mobile);
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


    @RequestMapping(value = "check")
    public void check(HttpServletResponse response, String mobile, String code) {
        boolean flag = smsVerificationCodeService.checkIsCorrectCode(mobile, code);
        super.json(response, flag);
    }


    @RequestMapping(value = "password")
    public void password(HttpServletResponse response, HttpServletRequest request, OwnerInfo ownerInfo) {
        JsonMessage jm = new JsonMessage();
        ownerInfo = owenrInfoService.save(ownerInfo);
        if (ownerInfo != null) {
            jm.setSuccess(true);
            jm.setMsg("操作成功");
            jm.setObj(ownerInfo.getMobile() + "," + ownerInfo.getPassword());
            request.getSession().setAttribute("ownerInfo", ownerInfo);
        } else {
            jm.setMsg("操作失败");
        }
        super.json(response, jm);
    }


    @RequestMapping(value = "login")
    public void login(HttpServletResponse response, HttpServletRequest request, String mobile, String password, Boolean isSafe) {
        JsonMessage jm = new JsonMessage();
        OwnerInfo ownerInfo = owenrInfoService.login(mobile, password, isSafe);
        if (ownerInfo != null) {
            jm.setSuccess(true);
            jm.setMsg("登录成功");
            jm.setObj(ownerInfo.getMobile() + "," + ownerInfo.getPassword());
            request.getSession().setAttribute("ownerInfo", ownerInfo);
        } else {
            jm.setMsg("用户名或密码错误");
        }
        super.json(response, jm);
    }
    @RequestMapping(value = "getid")
    public void getIdByMobiole(HttpServletResponse response,OwnerInfo ownerInfo){
         OwnerInfo owner = owenrInfoService.getIdByMobile(ownerInfo);
         super.json(response,owner);
    }

}
