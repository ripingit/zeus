package org.chaoxuan.zeus.model;

import java.util.Date;

/**
 * Created by Administrator on 2017/7/11 0011.
 */
public class SendOrder extends Page{
    private Integer orderId;
    private Integer orderCode;
    private String ownerName;
    private Integer managerId;
    private String managerName;
    private Integer status;
    private Date createTime;
    private Date createTimeEnd;
    private Date arrivalTime;
    private Date arrivalTimeEnd;
    private String createTimeStr;
    private String arrivalTimeStr;
    private String address;
    private String managerPhoto;
    private String ids;
   private String workerTitle;
   private Integer workerCount;
   private Integer fitTaskId;
   private Integer requirementId;

    public Integer getRequirementId() {
        return requirementId;
    }

    public void setRequirementId(Integer requirementId) {
        this.requirementId = requirementId;
    }

    public Integer getFitTaskId() {
        return fitTaskId;
    }

    public void setFitTaskId(Integer fitTaskId) {
        this.fitTaskId = fitTaskId;
    }

    public String getWorkerTitle() {
        return workerTitle;
    }

    public void setWorkerTitle(String workerTitle) {
        this.workerTitle = workerTitle;
    }

    public Integer getWorkerCount() {
        return workerCount;
    }

    public void setWorkerCount(Integer workerCount) {
        this.workerCount = workerCount;
    }

    public Integer getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(Integer orderCode) {
        this.orderCode = orderCode;
    }

    public String getIds() {
        return ids;
    }

    public void setIds(String ids) {
        this.ids = ids;
    }

    public String getManagerPhoto() {
        return managerPhoto;
    }

    public void setManagerPhoto(String managerPhoto) {
        this.managerPhoto = managerPhoto;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public String getCreateTimeStr() {
        return createTimeStr;
    }

    public void setCreateTimeStr(String createTimeStr) {
        this.createTimeStr = createTimeStr;
    }

    public String getArrivalTimeStr() {
        return arrivalTimeStr;
    }

    public void setArrivalTimeStr(String arrivalTimeStr) {
        this.arrivalTimeStr = arrivalTimeStr;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(Date arrivalTime) {
        this.arrivalTime = arrivalTime;
    }
    public Date getCreateTimeEnd() {
        return createTimeEnd;
    }

    public void setCreateTimeEnd(Date createTimeEnd) {
        this.createTimeEnd = createTimeEnd;
    }

    public Date getArrivalTimeEnd() {
        return arrivalTimeEnd;
    }

    public void setArrivalTimeEnd(Date arrivalTimeEnd) {
        this.arrivalTimeEnd = arrivalTimeEnd;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "SendOrder{" +
                "orderId=" + orderId +
                ", ownerName='" + ownerName + '\'' +
                ", managerId=" + managerId +
                ", managerName='" + managerName + '\'' +
                ", createTime=" + createTime +
                ", createTimeEnd=" + createTimeEnd +
                ", arrivalTime=" + arrivalTime +
                ", arrivalTimeEnd=" + arrivalTimeEnd +
                '}';
    }
}
