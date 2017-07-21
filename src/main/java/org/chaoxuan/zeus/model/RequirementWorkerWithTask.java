package org.chaoxuan.zeus.model;

import java.util.Date;

/**
 * Created by Administrator on 2017/7/12 0012.
 */
public class RequirementWorkerWithTask extends RequirementWorker{
 private String  quotaArea;
 private int workAmount;
 private  Date taskStartTime;
 private  Date taskCheckTime;
private Integer fitTaskId;

    @Override
    public Integer getFitTaskId() {
        return fitTaskId;
    }

    @Override
    public void setFitTaskId(Integer fitTaskId) {
        this.fitTaskId = fitTaskId;
    }

    public String getQuotaArea() {
        return quotaArea;
    }

    public void setQuotaArea(String quotaArea) {
        this.quotaArea = quotaArea;
    }

    public int getWorkAmount() {
        return workAmount;
    }

    public void setWorkAmount(int workAmount) {
        this.workAmount = workAmount;
    }

    public Date getTaskStartTime() {
        return taskStartTime;
    }

    public void setTaskStartTime(Date taskStartTime) {
        this.taskStartTime = taskStartTime;
    }

    public Date getTaskCheckTime() {
        return taskCheckTime;
    }

    public void setTaskCheckTime(Date taskCheckTime) {
        this.taskCheckTime = taskCheckTime;
    }
}
