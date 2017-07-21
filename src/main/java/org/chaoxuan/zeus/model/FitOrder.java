package org.chaoxuan.zeus.model;

import java.util.Date;
import java.util.List;

public class FitOrder {
    /**
     * <pre>
     *
     * 表字段 : t_fit_order.id
     * </pre>
     */
    private Integer id;

    /**
     * <pre>
     * 关联用户id
     * 表字段 : t_fit_order.user_id
     * </pre>
     */
    private Integer userId;

    /**
     * <pre>
     * 订单编号
     * 表字段 : t_fit_order.order_code
     * </pre>
     */
    private String orderCode;

    /**
     * <pre>
     * 签约时间
     * 表字段 : t_fit_order.contract_time
     * </pre>
     */
    private Date contractTime;

    /**
     * <pre>
     * 预计完成时间
     * 表字段 : t_fit_order.predict_time
     * </pre>
     */
    private Date predictTime;

    /**
     * <pre>
     * 合同金额
     * 表字段 : t_fit_order.contract_money
     * </pre>
     */
    private Float contractMoney;

    /**
     * <pre>
     * 订单状态
     * 表字段 : t_fit_order.status
     * </pre>
     */
    private Integer status;

    /**
     * <pre>
     * 关联管家id
     * 表字段 : t_fit_order.manager_id
     * </pre>
     */
    private Integer managerId;

    /**
     * <pre>
     * 关联材料清单
     * 表字段 : t_fit_order.requirement_product_id
     * </pre>
     */
    private Integer requirementProductId;

    /**
     * <pre>
     * 关联户型信息
     * 表字段 : t_fit_order.house_type_id
     * </pre>
     */
    private Integer houseTypeId;

    /**
     * <pre>
     * 关联装修模板信息
     * 表字段 : t_fit_order.fit_rule_id
     * </pre>
     */
    private Integer fitRuleId;

    /**
     * <pre>
     * 创建时间
     * 表字段 : t_fit_order.createTime
     * </pre>
     */
    private Date createtime;
    private String createTimeFront;
    /**
     * <pre>
     * 付款时间
     * 表字段 : t_fit_order.payTime
     * </pre>
     */
    private Date paytime;
    private String payTimeFront;
    private OwnerInfo ownerInfo;
    private List<FitTaskInstance> fitTaskInstance;
    private Double payMoney;//已付款 定金
    private Double hasReceivables;//已收款
    private String scale;
    private Double noReceivables;//未付款

   private Date checkTime;
   private Date finTime;

   public void setCheckTime(Date checkTime) {
      this.checkTime = checkTime;
    }

   public Date getCheckTime() {
      return checkTime;
    }

  public Date getFinTime() {
    return finTime;
  }

  public void setFinTime(Date finTime) {
    this.finTime = finTime;
  }

  public void setNoReceivables(Double noReceivables) {
        this.noReceivables = noReceivables;
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

    public void setHasReceivables(Double hasReceivables) {
        this.hasReceivables = hasReceivables;
    }

    public Double getHasReceivables() {
        return hasReceivables;
    }

    public void setPayMoney(Double payMoney) {
        this.payMoney = payMoney;
    }

    public Double getPayMoney() {
        return payMoney;
    }

    public void setFitTaskInstance(List<FitTaskInstance> fitTaskInstance) {
        this.fitTaskInstance = fitTaskInstance;
    }

    public List<FitTaskInstance> getFitTaskInstance() {
        return fitTaskInstance;
    }

    public void setOwnerInfo(OwnerInfo ownerInfo) {
        this.ownerInfo = ownerInfo;
    }

    public OwnerInfo getOwnerInfo() {
        return ownerInfo;
    }

    public String getPayTimeFront() {
        return payTimeFront;
    }

    public void setPayTimeFront(String payTimeFront) {
        this.payTimeFront = payTimeFront;
    }

    public String getCreateTimeFront() {
        return createTimeFront;
    }

    public void setCreateTimeFront(String createTimeFront) {
        this.createTimeFront = createTimeFront;
    }

    /**
     * <pre>
     * 获取：
     * 表字段：t_fit_order.id
     * </pre>
     *
     * @return t_fit_order.id：
     */
    public Integer getId() {
        return id;
    }

    /**
     * <pre>
     * 设置：
     * 表字段：t_fit_order.id
     * </pre>
     *
     * @param id t_fit_order.id：
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * <pre>
     * 获取：关联用户id
     * 表字段：t_fit_order.user_id
     * </pre>
     *
     * @return t_fit_order.user_id：关联用户id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * <pre>
     * 设置：关联用户id
     * 表字段：t_fit_order.user_id
     * </pre>
     *
     * @param userId t_fit_order.user_id：关联用户id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * <pre>
     * 获取：订单编号
     * 表字段：t_fit_order.order_code
     * </pre>
     *
     * @return t_fit_order.order_code：订单编号
     */
    public String getOrderCode() {
        return orderCode;
    }

    /**
     * <pre>
     * 设置：订单编号
     * 表字段：t_fit_order.order_code
     * </pre>
     *
     * @param orderCode t_fit_order.order_code：订单编号
     */
    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode == null ? null : orderCode.trim();
    }

    /**
     * <pre>
     * 获取：签约时间
     * 表字段：t_fit_order.contract_time
     * </pre>
     *
     * @return t_fit_order.contract_time：签约时间
     */
    public Date getContractTime() {
        return contractTime;
    }

    /**
     * <pre>
     * 设置：签约时间
     * 表字段：t_fit_order.contract_time
     * </pre>
     *
     * @param contractTime t_fit_order.contract_time：签约时间
     */
    public void setContractTime(Date contractTime) {
        this.contractTime = contractTime;
    }

    /**
     * <pre>
     * 获取：预计完成时间
     * 表字段：t_fit_order.predict_time
     * </pre>
     *
     * @return t_fit_order.predict_time：预计完成时间
     */
    public Date getPredictTime() {
        return predictTime;
    }

    /**
     * <pre>
     * 设置：预计完成时间
     * 表字段：t_fit_order.predict_time
     * </pre>
     *
     * @param predictTime t_fit_order.predict_time：预计完成时间
     */
    public void setPredictTime(Date predictTime) {
        this.predictTime = predictTime;
    }

    /**
     * <pre>
     * 获取：合同金额
     * 表字段：t_fit_order.contract_money
     * </pre>
     *
     * @return t_fit_order.contract_money：合同金额
     */
    public Float getContractMoney() {
        return contractMoney;
    }

    /**
     * <pre>
     * 设置：合同金额
     * 表字段：t_fit_order.contract_money
     * </pre>
     *
     * @param contractMoney t_fit_order.contract_money：合同金额
     */
    public void setContractMoney(Float contractMoney) {
        this.contractMoney = contractMoney;
    }

    /**
     * <pre>
     * 获取：订单状态
     * 表字段：t_fit_order.status
     * </pre>
     *
     * @return t_fit_order.status：订单状态
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * <pre>
     * 设置：订单状态
     * 表字段：t_fit_order.status
     * </pre>
     *
     * @param status t_fit_order.status：订单状态
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * <pre>
     * 获取：关联管家id
     * 表字段：t_fit_order.manager_id
     * </pre>
     *
     * @return t_fit_order.manager_id：关联管家id
     */
    public Integer getManagerId() {
        return managerId;
    }

    /**
     * <pre>
     * 设置：关联管家id
     * 表字段：t_fit_order.manager_id
     * </pre>
     *
     * @param managerId t_fit_order.manager_id：关联管家id
     */
    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    /**
     * <pre>
     * 获取：关联材料清单
     * 表字段：t_fit_order.requirement_product_id
     * </pre>
     *
     * @return t_fit_order.requirement_product_id：关联材料清单
     */
    public Integer getRequirementProductId() {
        return requirementProductId;
    }

    /**
     * <pre>
     * 设置：关联材料清单
     * 表字段：t_fit_order.requirement_product_id
     * </pre>
     *
     * @param requirementProductId t_fit_order.requirement_product_id：关联材料清单
     */
    public void setRequirementProductId(Integer requirementProductId) {
        this.requirementProductId = requirementProductId;
    }

    /**
     * <pre>
     * 获取：关联户型信息
     * 表字段：t_fit_order.house_type_id
     * </pre>
     *
     * @return t_fit_order.house_type_id：关联户型信息
     */
    public Integer getHouseTypeId() {
        return houseTypeId;
    }

    /**
     * <pre>
     * 设置：关联户型信息
     * 表字段：t_fit_order.house_type_id
     * </pre>
     *
     * @param houseTypeId t_fit_order.house_type_id：关联户型信息
     */
    public void setHouseTypeId(Integer houseTypeId) {
        this.houseTypeId = houseTypeId;
    }

    /**
     * <pre>
     * 获取：关联装修模板信息
     * 表字段：t_fit_order.fit_rule_id
     * </pre>
     *
     * @return t_fit_order.fit_rule_id：关联装修模板信息
     */
    public Integer getFitRuleId() {
        return fitRuleId;
    }

    /**
     * <pre>
     * 设置：关联装修模板信息
     * 表字段：t_fit_order.fit_rule_id
     * </pre>
     *
     * @param fitRuleId t_fit_order.fit_rule_id：关联装修模板信息
     */
    public void setFitRuleId(Integer fitRuleId) {
        this.fitRuleId = fitRuleId;
    }

    /**
     * <pre>
     * 获取：创建时间
     * 表字段：t_fit_order.createTime
     * </pre>
     *
     * @return t_fit_order.createTime：创建时间
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * <pre>
     * 设置：创建时间
     * 表字段：t_fit_order.createTime
     * </pre>
     *
     * @param createtime t_fit_order.createTime：创建时间
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * <pre>
     * 获取：付款时间
     * 表字段：t_fit_order.payTime
     * </pre>
     *
     * @return t_fit_order.payTime：付款时间
     */
    public Date getPaytime() {
        return paytime;
    }

    /**
     * <pre>
     * 设置：付款时间
     * 表字段：t_fit_order.payTime
     * </pre>
     *
     * @param paytime t_fit_order.payTime：付款时间
     */
    public void setPaytime(Date paytime) {
        this.paytime = paytime;
    }
}
