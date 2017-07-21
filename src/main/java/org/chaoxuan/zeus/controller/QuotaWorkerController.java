package org.chaoxuan.zeus.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import org.chaoxuan.zeus.model.JsonMessage;
import org.chaoxuan.zeus.model.QuotaWorker;
import org.chaoxuan.zeus.service.QuotaWorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/quota_worker")

public class QuotaWorkerController extends BaseController {

    private QuotaWorkerService quotaWorkerService;

    /**
     * @param response
     * @author Yurnero
     * @date 2017年5月17日
     * @description 列表
     */
    @RequestMapping(value = "worker", method = RequestMethod.GET)
    public void list(HttpServletResponse response) {
        List<QuotaWorker> list = quotaWorkerService.list();
        super.json(response, list);
    }

    /**
     * @param [response, categoryId, version, area]
     * @author Yurnero
     * @date 2017/5/25
     * @description todo
     */
    @RequestMapping(value = "worker/{categoryId}/{version}/{area}", method = RequestMethod.GET)
    public void find(HttpServletResponse response, @PathVariable Integer categoryId, @PathVariable String version, @PathVariable String area) {
        List<QuotaWorker> list = quotaWorkerService.listByCon(categoryId, version, area);
        super.json(response, list);
    }

    /**
     * @param response
     * @param quotaWorker
     * @author Yurnero
     * @date 2017年5月17日
     * @description 添加
     */
    @RequestMapping(value = "worker", method = RequestMethod.POST)
    public void add(HttpServletResponse response, QuotaWorker quotaWorker) {
        JsonMessage jm = new JsonMessage();
        try {
            quotaWorkerService.add(quotaWorker);
            jm.setSuccess(true);
            jm.setMsg("添加成功 !");
        } catch (Exception e) {
            jm.setMsg("添加失败 !");
            e.printStackTrace();
        }
        super.json(response, jm);
    }

    /**
     * @param response
     * @param id
     * @author Yurnero
     * @date 2017年5月17日
     * @description 根据 ID 获取
     */
    @RequestMapping(value = "worker/{id}", method = RequestMethod.GET)
    public void get(HttpServletResponse response, @PathVariable Integer id) {
        QuotaWorker quotaWorker = quotaWorkerService.get(id);
        super.json(response, quotaWorker);
    }


    /**
     * @param response
     * @param quotaWorker
     * @author Yurnero
     * @date 2017年5月17日
     * @description 修改
     */
    @RequestMapping(value = "worker", method = RequestMethod.PUT)
    public void edit(HttpServletResponse response, QuotaWorker quotaWorker) {
        JsonMessage jm = new JsonMessage();
        try {
            quotaWorkerService.edit(quotaWorker);
            jm.setSuccess(true);
            jm.setMsg("修改成功 !");
        } catch (Exception e) {
            jm.setMsg("修改失败 !");
            e.printStackTrace();
        }
        super.json(response, jm);
    }

    /**
     * @param response
     * @param id
     * @author Yurnero
     * @date 2017年5月17日
     * @description 删除
     */
    @RequestMapping(value = "worker/{id}", method = RequestMethod.DELETE)
    public void delete(HttpServletResponse response, @PathVariable Integer id) {
        JsonMessage jm = new JsonMessage();
        try {
            quotaWorkerService.delete(id);
            jm.setSuccess(true);
            jm.setMsg("删除成功 !");
        } catch (Exception e) {
            jm.setMsg("删除失败 !");
            e.printStackTrace();
        }
        super.json(response, jm);
    }

    @Autowired
    public void setQuotaWorkerService(QuotaWorkerService quotaWorkerService) {
        this.quotaWorkerService = quotaWorkerService;
    }

}
