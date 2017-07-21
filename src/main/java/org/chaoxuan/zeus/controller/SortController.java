package org.chaoxuan.zeus.controller;

import net.sf.json.JSONObject;
import org.chaoxuan.domain.model.Sort;
import org.chaoxuan.service.SortService;
import org.chaoxuan.util.FormatUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/showroom/sort")
public class SortController extends BaseController{
    @Autowired
    private SortService sortService;

    @RequestMapping("/index")
    public String index(HttpServletRequest request) {
        Map<String, Object> map = new HashMap<String, Object>();
        //map.put("sort", sort);
        String curr = request.getParameter("curr");
        if (curr == null)
            curr = "1";
        map.put("start", Integer.parseInt(curr));
        map.put("size", 10);
        List<Sort> list = sortService.findBy(map);
        request.setAttribute("list", list);
        request.setAttribute("curr", curr);
        return "showroom/sort/index";
    }

    @RequestMapping("addPage")
    public String addPage() {
        return "showroom/sort/addPage";
    }

    @RequestMapping("/addSort")
    @ResponseBody
    public String addSort(@RequestBody(required = true) Sort sort) {
        int a = sortService.add(sort);
        return Integer.toString(a);
    }

    @RequestMapping("/findByParentId")
    public void findByParentId(@RequestParam(value = "parentId", required = true) int parentId, HttpServletResponse response) {
        List<Sort> sorts = sortService.findByParentId(parentId);
        super.json(response,sorts);
    }

    @RequestMapping("/findByParentId2")
    public void findByParentId2(@RequestParam(value = "parentId", required = true) int parentId,HttpServletResponse response) {
        List<Sort> sorts = sortService.findByParentId(parentId);
        String result = "";
        for (Sort sort : sorts) {
            //如果子类中有属性，则遍历属性
            if (sort.getCode() != null && sort.getCode().length() > 2) {
                result = getBread(parentId);
            }
        }
        super.json(response,result);
    }

    public String getBread(int parentId) {
        List<Map<String, Object>> bread = new ArrayList<Map<String, Object>>();
        List<Sort> sorts = sortService.findByParentId(parentId);

        for (Sort sort : sorts) {
            List<Sort> result = sortService.findByParentId(sort.getSortId());
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("value", result);
            map.put("key", sort.getTitle());
            bread.add(map);
        }
        return JSONObject.fromObject(bread).toString();
    }

    @RequestMapping("/delSort")
    @ResponseBody
    public String delSort(@RequestParam(value = "ids", required = true) String ids) {
        System.out.println(ids);
        int result = sortService.batchDeleteBy(ids);
        return Integer.toString(result);
    }

    @RequestMapping("editPage")
    public String editPage(HttpServletRequest request, @RequestParam(value = "id", required = true) int id, @RequestParam(value = "curr", required = true) int curr) {
        request.setAttribute("curr", curr);
        request.setAttribute("id", id);
        return "showroom/sort/editPage";
    }

    @RequestMapping("/getById")
    public void getById(@RequestParam(value = "id", required = true) int id,HttpServletResponse response) {
        Sort sort = sortService.findById(id);
        super.json(response,sort);
    }

    @RequestMapping("/getParents")
    @ResponseBody
    public String getParents(@RequestParam(value = "id", required = true) int id) {
        String parents = sortService.getParentsById(id);
        return parents;
    }

    @RequestMapping("/editSort")
    @ResponseBody
    public String editSort(@RequestBody(required = true) Sort sort) {
        int a = sortService.update(sort);
        return Integer.toString(a);
    }

    @RequestMapping("/getCount")
    public void getCount(HttpServletRequest request,HttpServletResponse response) {
        String start = request.getParameter("start");
        Map<String, Object> map = new HashMap<String, Object>();
        Map<String, Object> result = new HashMap<String, Object>();
        int count = sortService.getCountBy(map);
        int start1 = Integer.parseInt(start);
        start1 = (start1 - 1) * 10;
        map.put("start", start1);
        map.put("size", 10);
        List<Sort> list = sortService.findBy(map);
        for (Sort sort : list) {
            sort = FormatUtil.compString(sort);
        }
        result.put("list", list);
        result.put("count", count);
        super.json(response,result);
    }
}
