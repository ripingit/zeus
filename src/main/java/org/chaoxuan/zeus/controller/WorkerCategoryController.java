package org.chaoxuan.zeus.controller;

import org.chaoxuan.zeus.service.WorkerCategoryService;
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
@RequestMapping(value = "worker_category")
public class WorkerCategoryController extends BaseController {

    private WorkerCategoryService workerCategoryService;

    @RequestMapping(value = "fun", method = RequestMethod.GET)
    public void list(HttpServletResponse response) {
        super.json(response, workerCategoryService.list());
    }

    @Autowired
    public void setWorkerCategoryService(WorkerCategoryService workerCategoryService) {
        this.workerCategoryService = workerCategoryService;
    }
}
