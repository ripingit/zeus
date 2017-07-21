package org.chaoxuan.zeus.page;

import org.chaoxuan.zeus.model.ProcessFlowWithBLOBs;
import org.chaoxuan.zeus.model.TotalRequirementProduct;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Yurnero
 * @data 2017/6/30
 * @description TODO
 */
public class TaskDetal {

    /**
     * 任务总天数
     */
    private Integer totalDays;

    /**
     * 任务时间范围
     */
    private String taskDate;

    /**
     * 工程量
     */
    private String quotaArea;

    /**
     * 材料清单
     */
    private List<TotalRequirementProduct> listTotalRequirementProduct = new ArrayList<TotalRequirementProduct>();

    /**
     * 工艺流程
     */
    private List<ProcessFlowWithBLOBs> listProcessFlow = new ArrayList<ProcessFlowWithBLOBs>();

    /**
     * 标题
     */
    private String title;

    /**
     * 地址
     */
    private String address;

    /**
     * 管家电话
     */
    private String managerMobile;

    private String nginx;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getTotalDays() {
        return totalDays;
    }

    public void setTotalDays(Integer totalDays) {
        this.totalDays = totalDays;
    }

    public String getTaskDate() {
        return taskDate;
    }

    public void setTaskDate(String taskDate) {
        this.taskDate = taskDate;
    }

    public String getQuotaArea() {
        return quotaArea;
    }

    public void setQuotaArea(String quotaArea) {
        this.quotaArea = quotaArea;
    }

    public List<TotalRequirementProduct> getListTotalRequirementProduct() {
        return listTotalRequirementProduct;
    }

    public void setListTotalRequirementProduct(List<TotalRequirementProduct> listTotalRequirementProduct) {
        this.listTotalRequirementProduct = listTotalRequirementProduct;
    }

    public List<ProcessFlowWithBLOBs> getListProcessFlow() {
        return listProcessFlow;
    }

    public void setListProcessFlow(List<ProcessFlowWithBLOBs> listProcessFlow) {
        this.listProcessFlow = listProcessFlow;
    }

    public String getManagerMobile() {
        return managerMobile;
    }

    public void setManagerMobile(String managerMobile) {
        this.managerMobile = managerMobile;
    }

    public String getNginx() {
        return nginx;
    }

    public void setNginx(String nginx) {
        this.nginx = nginx;
    }
}
