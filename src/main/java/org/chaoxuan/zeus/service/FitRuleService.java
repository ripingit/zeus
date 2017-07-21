package org.chaoxuan.zeus.service;

import org.chaoxuan.zeus.exception.MyException;
import org.chaoxuan.zeus.model.Address;
import org.chaoxuan.zeus.model.FitRule;
import org.chaoxuan.zeus.model.FitTask;

import java.util.List;
import java.util.Map;

public interface FitRuleService {
    //编辑装修模板
    int editFitRule(FitRule fitRule);

    //新增装修模板
    void addFitRule(FitRule fitRule) throws MyException;

    //条件查询装修模板
    List<FitRule> queryFitRule(FitRule fitRule);

    //列出所有模板
    List<FitRule> list();

    //获取对应版本号所有装修阶段
    Map<String, List<FitTask>> searchFitTaskByVersion(String version);

    //获取version列表
    String[] versionList();

    //获取city列表
    List<Address> cityList();

    //根据id删除Rule
    int deleteFitRuleBy(int id);

    //在新建任务时添加到该模板
    int newTaskAdd2Rule(String version, int taskId);

    boolean hasVersion(String version);
}
