package org.chaoxuan.zeus.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import org.chaoxuan.zeus.dao.FitStandardMapper;
import org.chaoxuan.zeus.dao.FitTaskInstanceMapper;
import org.chaoxuan.zeus.dao.ProcessFlowMapper;
import org.chaoxuan.zeus.model.FitTaskInstance;
import org.chaoxuan.zeus.model.ProcessFlowWithBLOBs;
import org.chaoxuan.zeus.service.ProcessFlowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Yurnero
 * @data 2017/6/29
 * @description TODO
 */
@Service(value = "processFlowService")
public class ProcessFlowServiceImpl implements ProcessFlowService {

    private ProcessFlowMapper processFlowMapper;

    private FitTaskInstanceMapper fitTaskInstanceMapper;

    private FitStandardMapper fitStandardMapper;

    @Override
    public List<ProcessFlowWithBLOBs> list(Integer fitTaskId) {
        Map<String, Object> param = new HashMap<String, Object>();
        Integer fitStandardId = this.init(fitTaskId);
        param.put("fitStandardId", fitStandardId);
        return processFlowMapper.find(param);
    }

    @Override
    public List<ProcessFlowWithBLOBs> list(Integer fitTaskId, Integer workerTaskId) {
        Map<String, Object> param = new HashMap<String, Object>();
        Integer fitStandardId = this.init(fitTaskId);
        param.put("fitStandardId", fitStandardId);
        param.put("workerTaskId", workerTaskId);
        return processFlowMapper.find(param);
    }

    private Integer init(Integer fitTaskId) {
        Map<String, Object> param = new HashMap<String, Object>();

        // 验证是否有工艺流程, 没有则插入
        FitTaskInstance fitTaskInstance = fitTaskInstanceMapper.selectByPrimaryKey(fitTaskId);
        Integer fitStandardId = fitTaskInstance.getFitStandardId();
        param.put("fitStandardId", fitStandardId);
        List<ProcessFlowWithBLOBs> list = processFlowMapper.find(param);
        if (list == null || list.size() == 0) {
            String processFlow = fitStandardMapper.selectByPrimaryKey(fitStandardId).getProcessFlow();
            List<ProcessFlowWithBLOBs> listProcessFlow = JSON.parseObject(processFlow, new TypeReference<List<ProcessFlowWithBLOBs>>() {
            });
            for (ProcessFlowWithBLOBs processFlowWithBLOBs : listProcessFlow) {
                processFlowWithBLOBs.setFitStandardId(fitStandardId);
            }
            processFlowMapper.insertBatch(listProcessFlow);
        }
        return fitStandardId;
    }

    @Override
    public ProcessFlowWithBLOBs get(Integer id) {
        return processFlowMapper.selectByPrimaryKey(id);
    }

    @Autowired
    public void setProcessFlowMapper(ProcessFlowMapper processFlowMapper) {
        this.processFlowMapper = processFlowMapper;
    }

    @Autowired
    public void setFitTaskInstanceMapper(FitTaskInstanceMapper fitTaskInstanceMapper) {
        this.fitTaskInstanceMapper = fitTaskInstanceMapper;
    }

    @Autowired
    public void setFitStandardMapper(FitStandardMapper fitStandardMapper) {
        this.fitStandardMapper = fitStandardMapper;
    }
}
