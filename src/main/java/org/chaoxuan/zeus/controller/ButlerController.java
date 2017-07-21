package org.chaoxuan.zeus.controller;

import org.chaoxuan.zeus.model.MeasureOrder;
import org.chaoxuan.zeus.page.PageOwner;
import org.chaoxuan.zeus.service.MeasureOrderService;
import org.chaoxuan.zeus.service.PageOwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

/**
 * @author Yurnero
 * @data 2017/6/12
 * @description TODO
 */
@Controller
@RequestMapping(value = "butler")
public class ButlerController extends BaseController {
    private PageOwnerService pageOwnerService;

    @Autowired
    private MeasureOrderService service;

    @RequestMapping(value = "list/{managerId}/{status}")
    public void list(HttpServletResponse response, @PathVariable("managerId") Integer managerId,@PathVariable("status") Integer status) {
        Map<String, List<PageOwner>> map = pageOwnerService.list(managerId,status);
        super.json(response, "yyyy-MM-dd", map);
    }

    @RequestMapping(value = "findAllOrder/{managerId}/{status}")
    public void findAllOrder(HttpServletResponse response, @PathVariable("managerId") Integer managerId,@PathVariable("status") Integer status){
        List<PageOwner> page = pageOwnerService.findAllOrder(managerId,status);
        super.json(response, "yyyy-MM-dd", page);
    }

    @Autowired
    public void setPageOwnerService(PageOwnerService pageOwnerService) {
        this.pageOwnerService = pageOwnerService;
    }
}
