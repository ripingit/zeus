package org.chaoxuan.zeus.controller;

import org.chaoxuan.zeus.model.FitTask;
import org.chaoxuan.zeus.model.FitTaskInstance;
import org.chaoxuan.zeus.service.FitTaskInstanceService;
import org.chaoxuan.zeus.service.FitTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @author Yurnero
 * @data 2017/6/12
 * @description 管家 App 左侧边栏
 */
@Controller
@RequestMapping(value = "side_bar")
public class SideBarController extends BaseController {

  private FitTaskInstanceService fitTaskInstanceService;

  /**
   * @author Yurnero
   * @date 2017/6/12
   * @param [response, fitRuleId]
   * @description 查询左侧边栏
   */
  @RequestMapping(value = "bar/{fitOrderId}")
  public void bar(HttpServletResponse response, @PathVariable Integer fitOrderId) {
    List<FitTaskInstance> list = fitTaskInstanceService.list(fitOrderId);
    super.json(response, list);
  }

  @Autowired
  public void setFitTaskInstanceService(FitTaskInstanceService fitTaskInstanceService) {
    this.fitTaskInstanceService = fitTaskInstanceService;
  }
}
