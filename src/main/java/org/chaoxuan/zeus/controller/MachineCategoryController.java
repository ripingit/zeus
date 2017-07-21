package org.chaoxuan.zeus.controller;

import org.chaoxuan.zeus.service.MachineCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletResponse;

/**
 * @author Yurnero
 * @data 2017/7/14
 * @description TODO
 */
@Controller
@RequestMapping(value = "machine_category")
public class MachineCategoryController extends BaseController {

    private MachineCategoryService machineCategoryService;

    @RequestMapping(value = "fun", method = RequestMethod.GET)
    public void list(HttpServletResponse response) {
        super.json(response, machineCategoryService.list());
    }

    @Autowired
    public void setMachineCategoryService(MachineCategoryService machineCategoryService) {
        this.machineCategoryService = machineCategoryService;
    }
}
