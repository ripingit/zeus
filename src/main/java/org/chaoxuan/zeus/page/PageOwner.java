package org.chaoxuan.zeus.page;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author Yurnero
 * @data 2017/6/12
 * @description 管控列表实体类
 */
public class PageOwner {

    /** 用户 ID */
    private Integer id;

    /** 装修模板 ID */
    private Integer fitRuleId;

    /** 装修订单 ID */
    private Integer fitOrderId;

    /** 完成百分比 */
    private String scale;

    /** 剩余百分比 */
    private String surplusScale;

    /** 最小时间 */
    private Date minDate;

    /** 完成比是否过半 */
    private Boolean flag;

    /** 待办任务个数 */
    private Integer todo;

    /** 姓名 */
    private String username;

    /** 地址 */
    private String address;

    /** 状态 */
    private Integer status;

    /** 签约时间 */
    private Date signAt;

    /** 总金额 */
    private BigDecimal totalMoney;

    /** 已付金额 */
    private BigDecimal paidMoney;

    /** 起始时间 */
    private Date startAt;

    /** 结束时间 */
    private Date endAt;

    /** 总天数 */
    private Integer totalDays;

    /** 完成的天数 */
    private Integer completedDays;

    /** 测量订单 ID */
    private Integer measureId;
    private Integer sex;
    private String street;
    private String role;
    private String community;
    private Date checkTime;
    private Date finTime;
    private Date measureDate;

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Integer getSex() {
        return sex;
    }

    public String getRole() {
        return role;
    }

    public void setMeasureDate(Date measureDate) {
        this.measureDate = measureDate;
    }

    public Date getMeasureDate() {
        return measureDate;
    }

    public Date getCheckTime() {
        return checkTime;
    }

    public Date getFinTime() {
        return finTime;
    }

    public void setCheckTime(Date checkTime) {
        this.checkTime = checkTime;
    }

    public void setFinTime(Date finTime) {
        this.finTime = finTime;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCommunity(String community) {
        this.community = community;
    }

    public String getStreet() {
        return street;
    }

    public String getCommunity() {
        return community;
    }

    public void setMeasureId(Integer measureId) {
        this.measureId = measureId;
    }

    public Integer getMeasureId() {
        return measureId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getSignAt() {
        return signAt;
    }

    public void setSignAt(Date signAt) {
        this.signAt = signAt;
    }

    public BigDecimal getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(BigDecimal totalMoney) {
        this.totalMoney = totalMoney;
    }

    public BigDecimal getPaidMoney() {
        return paidMoney;
    }

    public void setPaidMoney(BigDecimal paidMoney) {
        this.paidMoney = paidMoney;
    }

    public Date getStartAt() {
        return startAt;
    }

    public void setStartAt(Date startAt) {
        this.startAt = startAt;
    }

    public Date getEndAt() {
        return endAt;
    }

    public void setEndAt(Date endAt) {
        this.endAt = endAt;
    }

    public Integer getFitRuleId() {
        return fitRuleId;
    }

    public void setFitRuleId(Integer fitRuleId) {
        this.fitRuleId = fitRuleId;
    }

    public Integer getFitOrderId() {
        return fitOrderId;
    }

    public void setFitOrderId(Integer fitOrderId) {
        this.fitOrderId = fitOrderId;
    }

    public Integer getTotalDays() {
        return totalDays;
    }

    public void setTotalDays(Integer totalDays) {
        this.totalDays = totalDays;
    }

    public Integer getCompletedDays() {
        return completedDays;
    }

    public void setCompletedDays(Integer completedDays) {
        this.completedDays = completedDays;
    }

    public String getScale() {
        return scale;
    }

    public void setScale(String scale) {
        this.scale = scale;
    }

    public Integer getTodo() {
        return todo;
    }

    public void setTodo(Integer todo) {
        this.todo = todo;
    }

    public String getSurplusScale() {
        return surplusScale;
    }

    public void setSurplusScale(String surplusScale) {
        this.surplusScale = surplusScale;
    }

    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }

    public Date getMinDate() {
        return minDate;
    }

    public void setMinDate(Date minDate) {
        this.minDate = minDate;
    }
}
