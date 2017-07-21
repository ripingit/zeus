package org.chaoxuan.zeus.model;

import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2017/6/27.
 */
public class FitMoney {
    private Integer id;
    private Integer ownerInfoId;
    private Integer fitTaskId;
    private Date getmoneyTime;
    private Double taskAmount;
    private Double totalAmount;
    private Integer status;
    private String remarks;
    private Double hasReceivables;//已收款
    private Double noReceivables;//未收款
    private String scale;//百分比
    private Double payTime;//已付款 定金

    public void setPayTime(Double payTime) {
        this.payTime = payTime;
    }

    public Double getPayTime() {
        return payTime;
    }

    private FitTaskInstance fitTaskInstance;

    public void setFitTaskInstance(FitTaskInstance fitTaskInstance) {
        this.fitTaskInstance = fitTaskInstance;
    }

    public FitTaskInstance getFitTaskInstance() {
        return fitTaskInstance;
    }


    public void setHasReceivables(Double hasReceivables) {
        this.hasReceivables = hasReceivables;
    }

    public void setNoReceivables(Double noReceivables) {
        this.noReceivables = noReceivables;
    }



    public Double getHasReceivables() {
        return hasReceivables;
    }

    public Double getNoReceivables() {
        return noReceivables;
    }

    public void setScale(String scale) {
        this.scale = scale;
    }

    public String getScale() {
        return scale;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setOwnerInfoId(Integer ownerInfoId) {
        this.ownerInfoId = ownerInfoId;
    }

    public void setFitTaskId(Integer fitTaskId) {
        this.fitTaskId = fitTaskId;
    }

    public void setGetmoneyTime(Date getmoneyTime) {
        this.getmoneyTime = getmoneyTime;
    }

    public void setTaskAmount(Double taskAmount) {
        this.taskAmount = taskAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Integer getId() {
        return id;
    }

    public Integer getOwnerInfoId() {
        return ownerInfoId;
    }

    public Integer getFitTaskId() {
        return fitTaskId;
    }

    public Date getGetmoneyTime() {
        return getmoneyTime;
    }

    public Double getTaskAmount() {
        return taskAmount;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public Integer getStatus() {
        return status;
    }

    public String getRemarks() {
        return remarks;
    }
}
