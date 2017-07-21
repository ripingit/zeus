package org.chaoxuan.zeus.service.impl;

import org.chaoxuan.zeus.dao.*;
import org.chaoxuan.zeus.model.*;
import org.chaoxuan.zeus.service.FitTaskService;
import org.chaoxuan.zeus.service.QuotaMachineService;
import org.chaoxuan.zeus.service.QuotaMaterialService;
import org.chaoxuan.zeus.service.QuotaWorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service(value = "fitTaskService")
public class FitTaskServiceImpl implements FitTaskService {

    /**
     * 施工任务 Mapper
     */
    private FitTaskMapper fitTaskMapper;

    /**
     * 机械定额 Mapper
     */
    private QuotaMachineService quotaMachineService;

    /**
     * 工人定额 Mapper
     */
    private QuotaWorkerService quotaWorkerService;

    /**
     * 材料定额 Mapper
     */
    private QuotaMaterialService quotaMaterialService;

    /**
     * 工人定额详细 Mapper
     */
    private QuotaWorkerVersionMapper quotaWorkerVersionMapper;

    /**
     * 材料定额详细 Mapper
     */
    private QuotaMaterialVersionMapper quotaMaterialVersionMapper;

    /**
     * 机械定额详细 Mapper
     */
    private QuotaMachineVersionMapper quotaMachineVersionMapper;

    /**
     * 施工规范 Mapper
     */
    private FitStandardMapper fitStandardMapper;

    private FitTaskWorkerMapper fitTaskWorkerMapper;

    private FitTaskMeasureMapper fitTaskMeasureMapper;

    private FitTaskMaterialMapper fitTaskMaterialMapper;

    private FitTaskMachineMapper fitTaskMachineMapper;

    private FitTaskAreaMapper fitTaskAreaMapper;

    private FitRuleMapper fitRuleMapper;

    @Autowired
    public void setFitTaskMapper(FitTaskMapper fitTaskMapper) {
        this.fitTaskMapper = fitTaskMapper;
    }

    @Autowired
    public void setQuotaMachineService(QuotaMachineService quotaMachineService) {
        this.quotaMachineService = quotaMachineService;
    }

    @Autowired
    public void setQuotaWorkerService(QuotaWorkerService quotaWorkerService) {
        this.quotaWorkerService = quotaWorkerService;
    }

    @Autowired
    public void setQuotaMaterialService(QuotaMaterialService quotaMaterialService) {
        this.quotaMaterialService = quotaMaterialService;
    }

    @Autowired
    public void setQuotaWorkerVersionMapper(QuotaWorkerVersionMapper quotaWorkerVersionMapper) {
        this.quotaWorkerVersionMapper = quotaWorkerVersionMapper;
    }

    @Autowired
    public void setQuotaMaterialVersionMapper(QuotaMaterialVersionMapper quotaMaterialVersionMapper) {
        this.quotaMaterialVersionMapper = quotaMaterialVersionMapper;
    }

    @Autowired
    public void setQuotaMachineVersionMapper(QuotaMachineVersionMapper quotaMachineVersionMapper) {
        this.quotaMachineVersionMapper = quotaMachineVersionMapper;
    }

    @Autowired
    public void setFitStandardMapper(FitStandardMapper fitStandardMapper) {
        this.fitStandardMapper = fitStandardMapper;
    }

    @Autowired
    public void setFitTaskWorkerMapper(FitTaskWorkerMapper fitTaskWorkerMapper) {
        this.fitTaskWorkerMapper = fitTaskWorkerMapper;
    }

    @Autowired
    public void setFitTaskMeasureMapper(FitTaskMeasureMapper fitTaskMeasureMapper) {
        this.fitTaskMeasureMapper = fitTaskMeasureMapper;
    }

    @Autowired
    public void setFitTaskMaterialMapper(FitTaskMaterialMapper fitTaskMaterialMapper) {
        this.fitTaskMaterialMapper = fitTaskMaterialMapper;
    }

    @Autowired
    public void setFitTaskMachineMapper(FitTaskMachineMapper fitTaskMachineMapper) {
        this.fitTaskMachineMapper = fitTaskMachineMapper;
    }

    @Autowired
    public void setFitTaskAreaMapper(FitTaskAreaMapper fitTaskAreaMapper) {
        this.fitTaskAreaMapper = fitTaskAreaMapper;
    }

    @Autowired
    public void setFitRuleMapper(FitRuleMapper fitRuleMapper) {
        this.fitRuleMapper = fitRuleMapper;
    }

    /**
     * @param verion
     * @return List<FitTask>
     * @author Yurnero
     * @date 2017年5月16日
     * @description 查询任务及其相关配置信息
     */
    @Override
    public List<FitTask> findFitTaskAndConfigure(String version) {
        Map<String, Object> param = new HashMap<String, Object>();
        param.put("version", version);
        return fitTaskMapper.findFitTaskAndConfigure(param);
    }

    /**
     * @param [id, fitStandardId]
     * @author Yurnero
     * @date 2017/5/26
     * @description todo
     */
    @Override
    public void remove(Integer id, Integer fitStandardId) {
        // 删除施工任务
        fitTaskMapper.deleteById(id);

        // 删除施工规范
        fitStandardMapper.deleteByPrimaryKey(fitStandardId);

        // 删除参数
        Map<String, Object> param = new HashMap<String, Object>();
        param.put("fitTaskId", id);

        // 删除工人配置
        fitTaskWorkerMapper.deleteByMap(param);

        // 删除材料配置
        fitTaskMaterialMapper.deleteByMap(param);

        // 删除机械配置
        fitTaskMachineMapper.deleteByMap(param);

        // 删除测量维度
        fitTaskMeasureMapper.deleteByMap(param);

        // 删除面积和时间配置
        fitTaskAreaMapper.deleteByMap(param);
    }

    /**
     * @param id
     * @return FitTask
     * @author Yurnero
     * @date 2017年5月8日
     * @description 根据 ID 获取 FitTask 并获取实际的阶段和次序
     */
    @Override
    public FitTask getByIdWithActualPhaseAndSequence(int id) {
        FitTask fitTask = fitTaskMapper.selectByPrimaryKey(id);
        Map<String, Object> param = new HashMap<String, Object>();
        param.put("version", fitTask.getVersion());
        param.put("phase", fitTask.getPhase());
        int phase = fitTaskMapper.getActualPhaseByVersionAndPhase(param);
        param.put("sequence", fitTask.getSequence());
        int sequence = fitTaskMapper.getActualSequenceByVersionAndPhaseAndSequence(param);
        fitTask.setPhase(phase);
        fitTask.setSequence(sequence);
        return fitTask;
    }

    @Override
    public FitTask getById(int id) {
        FitTask fitTask = fitTaskMapper.selectByPrimaryKey(id);
        fitTask.setOldPhase(fitTask.getPhase());
        fitTask.setOldSequence(fitTask.getSequence());
        return fitTask;
    }

    @Override
    public List<FitTask> queryFitTaskBy(FitTask fitTask) {
        // TODO Auto-generated method stub
        return fitTaskMapper.selectBy(fitTask);
    }

    @Override
    public List<FitTask> getFitTaskInfoBy(FitTask fitTask) {
        // TODO Auto-generated method stub
        List<FitTask> list = queryFitTaskBy(fitTask);
        for (FitTask fitTask2 : list) {
            StringBuilder sbMachine = new StringBuilder();
            StringBuilder sbMaterial = new StringBuilder();
            StringBuilder sbWorker = new StringBuilder();
            // 获取工人定额列表
            String ids = fitTask2.getWorker();
            String[] id = ids.split(",");
            for (int i = 0; i < id.length; i++) {
                // 根据id查询
                QuotaMachine machine = quotaMachineService.getById(Integer.parseInt(id[i]));
                sbMachine.append(machine.getCategoryName());
                sbMachine.append(",");
            }
            fitTask2.setMachine(sbMachine.toString());
            for (int i = 0; i < id.length; i++) {
                QuotaMaterial material = quotaMaterialService.getById(Integer.parseInt(id[i]));
                sbMaterial.append(material.getCategoryName());
                sbMaterial.append(",");
            }
            fitTask2.setMaterial(sbMaterial.toString());
            for (int i = 0; i < id.length; i++) {
                QuotaWorker worker = quotaWorkerService.getById(Integer.parseInt(id[i]));
                sbWorker.append(worker.getCategoryName());
                sbWorker.append(",");
            }
            fitTask2.setWorker(sbWorker.toString());

        }
        return list;
    }


    @Override
    public Map<String, List<FitTask>> getSequenceMap(FitTask fitTask) {
        // TODO Auto-generated method stub
        Map<String, List<FitTask>> map = new HashMap<String, List<FitTask>>();
        List<FitTask> taskList = searchByVersionAndPhase(fitTask);
        for (FitTask fitTask2 : taskList) {
            if (map.get(fitTask2.getSequence()) == null) {
                List<FitTask> list = new ArrayList<FitTask>();
                list.add(fitTask2);
                map.put(Integer.toString(fitTask2.getSequence()), list);
            } else {
                map.get(fitTask2.getSequence()).add(fitTask2);
            }
            /*
            Map<String, Object> param = new HashMap<String, Object>();
            List<Integer> idsList = new ArrayList<Integer>();
            String worker = fitTask2.getWorker();
            if (worker != null) {
                String[] workers = worker.split(",");
                for (String str : workers) {
                    idsList.add(Integer.parseInt(str));
                }
                param.clear();
                param.put("ids", idsList);
                List<QuotaWorkerVersion> listQuotaWorkerVersion = quotaWorkerVersionMapper.findByMap(param);
                fitTask2.setListQuotaWorkerVersion(listQuotaWorkerVersion);
            }
            String material = fitTask2.getMaterial();
            if (material != null) {
                String[] materials = material.split(",");
                idsList.clear();
                for (String str : materials) {
                    idsList.add(Integer.parseInt(str));
                }
                param.clear();
                param.put("ids", idsList);
                List<QuotaMaterialVersion> listQuotaMaterialVersion = quotaMaterialVersionMapper.findByMap(param);
                fitTask2.setListQuotaMaterialVersion(listQuotaMaterialVersion);
            }

            String machine = fitTask2.getMachine();
            if (machine != null) {
                String[] machines = machine.split(",");
                idsList.clear();
                for (String str : machines) {
                    idsList.add(Integer.parseInt(str));
                }
                param.clear();
                param.put("ids", idsList);
                List<QuotaMachineVersion> listQuotaMachineVersion = quotaMachineVersionMapper.findByMap(param);
                fitTask2.setListQuotaMachineVersion(listQuotaMachineVersion);
            }
                */
        }
        return map;
    }

    /**
     * @param version
     * @return List<BigDecimal>
     * @author Yurnero
     * @date 2017年5月5日
     * @description 根据当前版本查询阶段个数
     */
    @Override
    public List<Integer> getCountPhaseByVersion(String version) {
        List<Integer> listPhase = fitTaskMapper.queryPhaseListByVersion(version);
        return listPhase;
    }

    /**
     * @param version
     * @param phase
     * @return List<Integer>
     * @author Yurnero
     * @date 2017年5月5日
     * @description TODO
     */
    @Override
    public List<Integer> getCountSequenceByVersionAndPhase(String version, Integer phase) {
        FitTask fitTask = new FitTask();
        fitTask.setVersion(version);
        fitTask.setPhase(phase);
        List<Integer> listSequence = fitTaskMapper.querySequenceListBy(fitTask);
        return listSequence;
    }

    public List<Map<String, Object>> getSequenceList(FitTask fitTask) {
        List<Map<String, Object>> pageList = new ArrayList<Map<String, Object>>();
        Map<String, List<FitTask>> seqMap = getSequenceMap(fitTask);
        for (String key : seqMap.keySet()) {
            List<FitTask> taskList = seqMap.get(key);
            int categoryId = taskList.get(0).getCategory();
            String sequence = Integer.toString(taskList.get(0).getSequence());
            Map<String, Object> pageMap = new HashMap<String, Object>();
            pageMap.put("category", categoryId);
            pageMap.put("sequence", sequence);
            pageMap.put("taskList", taskList);
            pageList.add(pageMap);
        }
        return pageList;
    }

    /**
     * @param [fitRuleId]
     * @author Yurnero
     * @date 2017/6/12
     * @description 根据装修规则 ID 查询装修任务
     */
    public List<FitTask> findByFitRuleId(Integer fitRuleId) {
        FitRule fitRule = fitRuleMapper.selectByPrimaryKey(fitRuleId);
        String taskIds = fitRule.getTask();
        String[] split = taskIds.split(",");
        int[] array = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            array[i] = Integer.parseInt(split[i]);
        }
        return fitTaskMapper.searchByIds(array);
    }

    @Override
    public List<FitTask> searchByIds(String ids) {
        String id[] = ids.split(",");
        int idInt[] = new int[id.length];
        for (int i = 0; i < id.length; i++) {
            idInt[i] = Integer.parseInt(id[i]);
        }
        return fitTaskMapper.searchByIds(idInt);
    }

    @Override
    public void batchInsert(List<FitTask> tasks) {
        fitTaskMapper.insertBatch(tasks);
    }

    @Override
    public List<FitTask> list() {
        return fitTaskMapper.list();
    }

    @Override
    public int editFitTask(FitTask fitTask) {
        // TODO Auto-generated method stub

        return fitTaskMapper.updateByPrimaryKeySelective(fitTask);
    }

    @Override
    public List<FitTask> searchByVersion(String version) {
        FitTask fitTask = new FitTask();
        fitTask.setVersion(version);
        return fitTaskMapper.searchByVersionAndPhase(fitTask);
    }

    @Override
    public List<FitTask> searchByVersionAndPhase(FitTask fitTask) {
        return fitTaskMapper.searchByVersionAndPhase(fitTask);
    }

    @Override
    public void createFitTask(FitTask fitTask) {
        fitTaskMapper.insertSelective(fitTask);
    }

}
