package org.chaoxuan.zeus.controller;

import org.chaoxuan.util.PropUtil;
import org.chaoxuan.zeus.model.*;
import org.chaoxuan.zeus.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/fit_task")
public class FitTaskController extends BaseController {

    /**
     * 施工任务 Service
     */
    private FitTaskService fitTaskService;

    /**
     * 施工规范 Service
     */
    private FitStandardService fitStandardService;

    /**
     * 机械定额 Service
     */
    private QuotaMachineService quotaMachineService;

    /**
     * 材料任务 Service
     */
    private QuotaMaterialService quotaMaterialService;

    /**
     * 工人定额 Service
     */
    private QuotaWorkerService quotaWorkerService;

    /**
     * 任务与机械 Service
     */
    private FitTaskMachineService fitTaskMachineService;

    /**
     * 任务与材料 Service
     */
    private FitTaskMaterialService fitTaskMaterialService;

    /**
     * 任务与工人 Service
     */
    private FitTaskWorkerService fitTaskWorkerService;

    /**
     * 面积与时间 Service
     */
    private QuotaAreaService quotaAreaService;

    /**
     * 测量维度 Service
     */
    private FitMeasureService fitMeasureService;

    /**
     * 任务与面积 Service
     */
    private FitTaskAreaService fitTaskAreaService;

    /**
     * 任务与测量维度 Service
     */
    private FitTaskMeasureService fitTaskMeasureService;

    /**
     * 装修模板 Service
     */
    private FitRuleService fitRuleService;
    @Autowired
    public void setFitTaskAreaService(FitTaskAreaService fitTaskAreaService) {
        this.fitTaskAreaService = fitTaskAreaService;
    }

    @Autowired
    public void setFitTaskMeasureService(FitTaskMeasureService fitTaskMeasureService) {
        this.fitTaskMeasureService = fitTaskMeasureService;
    }

    @Autowired
    public void setFitMeasureService(FitMeasureService fitMeasureService) {
        this.fitMeasureService = fitMeasureService;
    }

    @Autowired
    public void setQuotaAreaService(QuotaAreaService quotaAreaService) {
        this.quotaAreaService = quotaAreaService;
    }

    @Autowired
    public void setFitTaskMachineService(FitTaskMachineService fitTaskMachineService) {
        this.fitTaskMachineService = fitTaskMachineService;
    }

    @Autowired
    public void setFitTaskMaterialService(FitTaskMaterialService fitTaskMaterialService) {
        this.fitTaskMaterialService = fitTaskMaterialService;
    }

    @Autowired
    public void setFitTaskWorkerService(FitTaskWorkerService fitTaskWorkerService) {
        this.fitTaskWorkerService = fitTaskWorkerService;
    }

    @Autowired
    public void setQuotaMachineService(QuotaMachineService quotaMachineService) {
        this.quotaMachineService = quotaMachineService;
    }

    @Autowired
    public void setQuotaMaterialService(QuotaMaterialService quotaMaterialService) {
        this.quotaMaterialService = quotaMaterialService;
    }

    @Autowired
    public void setQuotaWorkerService(QuotaWorkerService quotaWorkerService) {
        this.quotaWorkerService = quotaWorkerService;
    }

    @Autowired
    public void setFitStandardService(FitStandardService fitStandardService) {
        this.fitStandardService = fitStandardService;
    }

    @Autowired
    public void setFitTaskService(FitTaskService fitTaskService) {
        this.fitTaskService = fitTaskService;
    }

    @Autowired
    public void setFitRuleService(FitRuleService fitRuleService) {
        this.fitRuleService = fitRuleService;
    }

    /**
     * @param request
     * @param response
     * @author Yurnero
     * @date 2017年5月12日
     * @description 文件上传
     */
    @RequestMapping(value = "file_upload")
    public void fileUpload(HttpServletRequest request, HttpServletResponse response) {
        String upload;
        try {
            upload = super.upload(request);
        } catch (Exception e) {
            upload = "上传失败 !";
        }
        super.json(response, upload);
    }

    /**
      * @author Yurnero
      * @date 2017/5/26
      * @param [response, id, fitStandardId]
      * @description 删除任务
      */
    @RequestMapping(value = "task/{id}/{fitStandardId}", method = RequestMethod.DELETE)
    public void remove(HttpServletResponse response, @PathVariable Integer id, @PathVariable Integer fitStandardId) {
        JsonMessage jm = new JsonMessage();
        try {
            fitTaskService.remove(id, fitStandardId);
            jm.setSuccess(true);
            jm.setMsg("删除成功 !");
        } catch (Exception e) {
            jm.setMsg("删除失败 !");
            e.printStackTrace();
        }
        super.json(response, jm);
    }

    /**
     * @param response
     * @author Yurnero
     * @date 2017年5月15日
     * @description 工程定额
     */
    @RequestMapping(value = "list")
    public void list(HttpServletResponse response, String version) {
        // 查找所有版本
        String[] versions = fitRuleService.versionList();

        // 任务集合
        List<FitTask> list;
        if (versions != null) {
            if (version == null || "".equals(version)) {
                version = versions[0];
            }
            list = fitTaskService.findFitTaskAndConfigure(version);
        } else {
            list = new ArrayList<FitTask>();
        }

        // 封装到 Map 里面
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("list", list);
        map.put("versions", versions);
        super.json(response, map);
    }

    /**
     * @param response
     * @param fitStandard
     * @author Yurnero
     * @date 2017年5月12日
     * @description 添加施工任务
     */
    @RequestMapping(value = "add")
    public void add(HttpServletResponse response, FitStandard fitStandard) {
        JsonMessage jm = new JsonMessage();
        try {
            fitStandardService.add(fitStandard);
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
     * @param fitStandardId
     * @author Yurnero
     * @date 2017年5月12日
     * @description 获取施工规范
     */
    @RequestMapping(value = "get_standard_by_id")
    public void getStandardById(HttpServletResponse response, Integer fitStandardId) {
        FitStandard fitStandard = fitStandardService.getById(fitStandardId);// 施工规范
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("data", fitStandard);
        map.put("nginx", PropUtil.getProperty("config/common.properties", "nginx"));
        super.json(response, map);
    }

    /**
     * @param response
     * @param fitTaskId
     * @author Yurnero
     * @date 2017年5月12日
     * @description 获取施工任务
     */
    @RequestMapping(value = "get_task_by_id")
    public void getTaskById(HttpServletResponse response, Integer fitTaskId) {
        FitTask fitTask = fitTaskService.getById(fitTaskId);// 施工任务
        List<QuotaMachine> listMachine = quotaMachineService.list();// 机械
        List<QuotaMaterial> listMaterial = quotaMaterialService.list();// 材料
        List<QuotaWorker> listWorker = quotaWorkerService.list();// 工人
        List<FitTaskMachine> listFitTaskMachine = fitTaskMachineService.findByFitTaskId(fitTaskId);
        List<FitTaskMaterial> listFitTaskMaterial = fitTaskMaterialService.findByFitTaskId(fitTaskId);
        List<FitTaskWorker> listFitTaskWorker = fitTaskWorkerService.findByFitTaskId(fitTaskId);
        List<FitTaskArea> listFitTaskArea = fitTaskAreaService.findByFitTaskId(fitTaskId);
        List<QuotaArea> listArea = quotaAreaService.list();
        List<FitMeasure> listMeasure = fitMeasureService.list();
        List<FitTaskMeasure> listFitTaskMeasure = fitTaskMeasureService.findByFitTaskId(fitTaskId);
        List<Integer> listPhase = fitTaskService.getCountPhaseByVersion(fitTask.getVersion());
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("fitTask", fitTask);
        map.put("listMachine", listMachine);
        map.put("listMaterial", listMaterial);
        map.put("listWorker", listWorker);
        map.put("listFitTaskMachine", listFitTaskMachine);
        map.put("listFitTaskMaterial", listFitTaskMaterial);
        map.put("listFitTaskWorker", listFitTaskWorker);
        map.put("listArea", listArea);
        map.put("listMeasure", listMeasure);
        map.put("listFitTaskArea", listFitTaskArea);
        map.put("listFitTaskMeasure", listFitTaskMeasure);
        map.put("listPhase", listPhase);
        super.json(response, map);
    }

    /**
     * @param response
     * @param fitStandard
     * @author Yurnero
     * @date 2017年5月12日
     * @description 编辑
     */
    @RequestMapping(value = "edit")
    public void edit(HttpServletResponse response, FitStandard fitStandard) {
        JsonMessage jm = new JsonMessage();
        try {
            fitStandardService.edit(fitStandard);
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
     * @author Yurnero
     * @date 2017年5月12日
     * @description 获取 nginx 地址
     */
    @RequestMapping(value = "get_nginx")
    public void getNginx(HttpServletResponse response) {
        super.json(response, PropUtil.getProperty("config/common.properties", "nginx"));
    }

    /**
     * @param response
     * @author Yurnero
     * @date 2017年5月12日
     * @description 文件下载
     */
    @RequestMapping(value = "download")
    public void download(HttpServletRequest request, HttpServletResponse response, String fileUrl, String oldFileName) {
        super.download(request, response, fileUrl, oldFileName);
    }

    /**
     * @param response
     * @param version
     * @author Yurnero
     * @date 2017年5月12日
     * @description 工程定额
     */
    @RequestMapping(value = "get_eng")
    public void getEng(HttpServletResponse response, String version) {
        List<QuotaMachine> listMachine = quotaMachineService.list();
        List<QuotaMaterial> listMaterial = quotaMaterialService.list();
        List<QuotaWorker> listWorker = quotaWorkerService.list();
        List<QuotaArea> listArea = quotaAreaService.list();
        List<FitMeasure> listMeasure = fitMeasureService.list();
        List<Integer> listPhase = fitTaskService.getCountPhaseByVersion(version);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("listMachine", listMachine);
        map.put("listMaterial", listMaterial);
        map.put("listWorker", listWorker);
        map.put("listArea", listArea);
        map.put("listMeasure", listMeasure);
        map.put("listPhase", listPhase);
        super.json(response, map);
    }

    /**
     * @param response
     * @param version
     * @param phase
     * @author Yurnero
     * @date 2017年5月12日
     * @description 动态获取次序
     */
    @RequestMapping(value = "get_sequence")
    public void getSequence(HttpServletResponse response, String version, Integer phase) {
        List<Integer> listSequence = fitTaskService.getCountSequenceByVersionAndPhase(version, phase);
        super.json(response, listSequence);
    }

    @RequestMapping("/all")
    public void list(HttpServletResponse response) {
        List<FitTask> tasks = fitTaskService.list();
        super.json(response, tasks);
    }

    @RequestMapping(value = "/version/{version:.+}/phase/{phase}",method = RequestMethod.GET)
    public void searchByVersionAndPhase(@PathVariable("version")String version,@PathVariable("phase")int phase,HttpServletResponse response) {
        FitTask fitTask = new FitTask();
        fitTask.setVersion(version);
        fitTask.setPhase(phase);
        List<Map<String, Object>> map = fitTaskService.getSequenceList(fitTask);
        super.json(response,map);
    }

}
