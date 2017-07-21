package org.chaoxuan.zeus.controller;

import org.chaoxuan.zeus.model.FitMeassage;

import org.chaoxuan.zeus.service.FitMeassageService;
import org.chaoxuan.zeus.service.MeasureOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by Administrator on 2017/7/3.
 */
@Controller
@RequestMapping("getMeassage")
public class MeassageController extends BaseController{

    @Autowired
    private FitMeassageService service;

    @RequestMapping("/meassage/{status}")
    public void getMeassage(@PathVariable("status") int status, HttpServletResponse response){
        List<FitMeassage> list = service.getMeassage(status);
        super.json(response,list);
    }

    @RequestMapping("/list")
    public void getMeassageList(HttpServletResponse response){
        List<FitMeassage> list = service.getMeassageList();
        super.json(response,list);
    }
}
