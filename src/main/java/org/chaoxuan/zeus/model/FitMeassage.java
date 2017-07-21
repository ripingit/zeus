package org.chaoxuan.zeus.model;

import java.util.Date;

/**
 * Created by Administrator on 2017/7/3.
 */
public class FitMeassage {
    private Long id;
    private Integer fromuserid;
    private Integer triggerTableId;
    private String name;
    private String title;
    private String content;
    private String remark;
    private String action;
    private String actionTask;
    private String actionContent;
    private Date updateTime;
    private Date triggerTime;
    private Integer rederStatus;
    private Integer status;
    private OwnerInfo ownerInfo;

    public void setId(Long id) {
        this.id = id;
    }

    public void setFromuserid(Integer fromuserid) {
        this.fromuserid = fromuserid;
    }

    public void setTriggerTableId(Integer triggerTableId) {
        this.triggerTableId = triggerTableId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public void setActionTask(String actionTask) {
        this.actionTask = actionTask;
    }

    public void setActionContent(String actionContent) {
        this.actionContent = actionContent;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public void setTriggerTime(Date triggerTime) {
        this.triggerTime = triggerTime;
    }

    public void setRederStatus(Integer rederStatus) {
        this.rederStatus = rederStatus;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public void setOwnerInfo(OwnerInfo ownerInfo) {
        this.ownerInfo = ownerInfo;
    }

    public Long getId() {
        return id;
    }

    public Integer getFromuserid() {
        return fromuserid;
    }

    public Integer getTriggerTableId() {
        return triggerTableId;
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getRemark() {
        return remark;
    }

    public String getAction() {
        return action;
    }

    public String getActionTask() {
        return actionTask;
    }

    public String getActionContent() {
        return actionContent;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public Date getTriggerTime() {
        return triggerTime;
    }

    public Integer getRederStatus() {
        return rederStatus;
    }

    public Integer getStatus() {
        return status;
    }

    public OwnerInfo getOwnerInfo() {
        return ownerInfo;
    }
}
