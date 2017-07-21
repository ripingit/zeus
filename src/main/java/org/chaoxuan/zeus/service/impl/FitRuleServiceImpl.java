package org.chaoxuan.zeus.service.impl;

import org.chaoxuan.zeus.dao.FitRuleMapper;
import org.chaoxuan.zeus.exception.MyException;
import org.chaoxuan.zeus.model.Address;
import org.chaoxuan.zeus.model.FitRule;
import org.chaoxuan.zeus.model.FitStandard;
import org.chaoxuan.zeus.model.FitTask;
import org.chaoxuan.zeus.service.AddressService;
import org.chaoxuan.zeus.service.FitRuleService;
import org.chaoxuan.zeus.service.FitStandardService;
import org.chaoxuan.zeus.service.FitTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

@Service
public class FitRuleServiceImpl implements FitRuleService {
    @Autowired
    private FitRuleMapper fitRuleMapper;
    @Autowired
    private FitTaskService fitTaskService;
    @Autowired
    private AddressService addressService;
@Autowired
private FitStandardService fitStandardService;
    @Override
    public int editFitRule(FitRule fitRule) {
        // TODO Auto-generated method stub
        String reg = "^\\d+\\.\\d+";
        boolean b = fitRule.getVersion().matches(reg);
        if (b) {
            if (!"".equals(fitRule.getTask()))
                addFitTaskFromOtherVersion(fitRule.getTask(), fitRule.getVersion());
            return fitRuleMapper.updateByPrimaryKeySelective(fitRule);
        } else
            return 0;
    }

    @Override
    public void addFitRule(FitRule fitRule) throws MyException {
        // TODO Auto-generated method stub
        //判断版本号格式
        String reg = "^\\d+\\.\\d+";
        boolean correctReg = fitRule.getVersion().matches(reg);
        //保证多个线程只能创建一个模板
        synchronized (this) {
            if (correctReg && !hasVersion(fitRule.getVersion())) {
                if (!"".equals(fitRule.getTask()))
                    addFitTaskFromOtherVersion(fitRule.getTask(), fitRule.getVersion());
                fitRuleMapper.insertSelective(fitRule);
            } else {
                throw new MyException("操作失败_fitrule_service");
            }
        }
    }

    @Override
    public List<FitRule> queryFitRule(FitRule fitRule) {
        // TODO Auto-generated method stub
        return fitRuleMapper.queryBy(fitRule);
    }

    @Override
    public List<FitRule> list() {
        return fitRuleMapper.list();
    }

    @Override
    public Map<String, List<FitTask>> searchFitTaskByVersion(String version) {
        // TODO Auto-generated method stub
        FitRule fitRule = new FitRule();
        fitRule.setVersion(version);
        List<FitTask> taskList = fitTaskService.searchByVersion(version);
        Map<String, List<FitTask>> map = new TreeMap<>();

        for (FitTask task : taskList) {
            //任务阶段 前台只能用String作为key
            String phase = Integer.toString(task.getPhase());
            if (map.get(phase) == null) {
                List<FitTask> list = new ArrayList<>();
                list.add(task);
                map.put(phase, list);
            } else {
                map.get(phase).add(task);
            }
        }
        return map;
    }

    @Override
    public String[] versionList() {
        // TODO Auto-generated method stub

        List<FitRule> list = queryFitRule(null);
        String[] array = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i).getVersion();
        }
        return array;
    }

    @Override
    public List<Address> cityList() {
        // TODO Auto-generated method stub
        List<Address> addressList = addressService.searchByPid(1);
        List<Address> result = new ArrayList<>();
        for (Address address : addressList) {
            List<Address> cityList = addressService.searchByPid(address.getId());
            for (Address subAddress : cityList) {
                result.add(subAddress);
            }
        }
        return result;
    }

    @Override
    public int deleteFitRuleBy(int id) {
        // TODO Auto-generated method stub
        return fitRuleMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int newTaskAdd2Rule(String version, int taskId) {
        String taskList;
        FitRule fitRule = new FitRule();
        fitRule.setVersion(version);
        fitRule = queryFitRule(fitRule).get(0);
        taskList = fitRule.getTask();
        taskList += Integer.toString(taskId) + ",";
        fitRule.setTask(taskList);
        return fitRuleMapper.updateByPrimaryKeySelective(fitRule);
    }

    /*
    增加其他版本的任务
    原理是复制一份任务，然后修改版本号
     */
    synchronized void  addFitTaskFromOtherVersion(String ids, String version) {
        List<FitTask> list = fitTaskService.searchByIds(ids);
        for (int i = 0; i < list.size(); i++) {
            FitStandard fitStandard=fitStandardService.getById(list.get(i).getFitStandardId());
            fitStandardService.add(fitStandard);
        }
    }

    @Override
    public boolean hasVersion(String version) {
        FitRule testRule = new FitRule();
        testRule.setVersion(version);
        List<FitRule> rules = queryFitRule(testRule);
        if (rules.size() > 0)
            return true;
        return false;
    }


}