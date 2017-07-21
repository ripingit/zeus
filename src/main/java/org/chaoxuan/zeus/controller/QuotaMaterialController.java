package org.chaoxuan.zeus.controller;

import org.chaoxuan.zeus.model.QuotaMaterial;
import org.chaoxuan.zeus.service.QuotaMaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping("/quota_material")
public class QuotaMaterialController extends BaseController {

    private QuotaMaterialService quotaMaterialService;

    @Autowired
    public void setQuotaMaterialService(QuotaMaterialService quotaMaterialService) {
        this.quotaMaterialService = quotaMaterialService;
    }


    @RequestMapping(value = "list")
    public void list(HttpServletResponse response) {
        List<QuotaMaterial> list = quotaMaterialService.list();
        super.json(response, list);
    }
}
