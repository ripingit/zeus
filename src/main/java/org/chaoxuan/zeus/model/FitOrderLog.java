package org.chaoxuan.zeus.model;

import java.util.Date;

public class FitOrderLog {
    /**
     * <pre>
     * 
     * 表字段 : t_fit_order_log.id
     * </pre>
     */
    private Integer id;

    /**
     * <pre>
     * 关联装修订单编号
     * 表字段 : t_fit_order_log.fit_order_code
     * </pre>
     */
    private Integer fitOrderCode;

    /**
     * <pre>
     * 操作者id
     * 表字段 : t_fit_order_log.operator_id
     * </pre>
     */
    private Integer operatorId;

    /**
     * <pre>
     * 操作详情
     * 表字段 : t_fit_order_log.operation_detail
     * </pre>
     */
    private String operationDetail;

    /**
     * <pre>
     * 操作时间
     * 表字段 : t_fit_order_log.operation_time
     * </pre>
     */
    private Date operationTime;

    /**
     * <pre>
     * 是否关键步骤
     * 表字段 : t_fit_order_log.key_operation_flag
     * </pre>
     */
    private Boolean keyOperationFlag;

    /**
     * <pre>
     * 
     * 表字段 : t_fit_order_log.operator_name
     * </pre>
     */
    private String operatorName;

    /**
     * <pre>
     * 
     * 表字段 : t_fit_order_log.operator_phone
     * </pre>
     */
    private String operatorPhone;

    /**
     * <pre>
     * 
     * 表字段 : t_fit_order_log.operator_role
     * </pre>
     */
    private String operatorRole;

    /**
     * <pre>
     * 获取：
     * 表字段：t_fit_order_log.id
     * </pre>
     *
     * @return t_fit_order_log.id：
     */
    public Integer getId() {
        return id;
    }

    /**
     * <pre>
     * 设置：
     * 表字段：t_fit_order_log.id
     * </pre>
     *
     * @param id
     *            t_fit_order_log.id：
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * <pre>
     * 获取：关联装修订单编号
     * 表字段：t_fit_order_log.fit_order_code
     * </pre>
     *
     * @return t_fit_order_log.fit_order_code：关联装修订单编号
     */
    public Integer getFitOrderCode() {
        return fitOrderCode;
    }

    /**
     * <pre>
     * 设置：关联装修订单编号
     * 表字段：t_fit_order_log.fit_order_code
     * </pre>
     *
     * @param fitOrderCode
     *            t_fit_order_log.fit_order_code：关联装修订单编号
     */
    public void setFitOrderCode(Integer fitOrderCode) {
        this.fitOrderCode = fitOrderCode;
    }

    /**
     * <pre>
     * 获取：操作者id
     * 表字段：t_fit_order_log.operator_id
     * </pre>
     *
     * @return t_fit_order_log.operator_id：操作者id
     */
    public Integer getOperatorId() {
        return operatorId;
    }

    /**
     * <pre>
     * 设置：操作者id
     * 表字段：t_fit_order_log.operator_id
     * </pre>
     *
     * @param operatorId
     *            t_fit_order_log.operator_id：操作者id
     */
    public void setOperatorId(Integer operatorId) {
        this.operatorId = operatorId;
    }

    /**
     * <pre>
     * 获取：操作详情
     * 表字段：t_fit_order_log.operation_detail
     * </pre>
     *
     * @return t_fit_order_log.operation_detail：操作详情
     */
    public String getOperationDetail() {
        return operationDetail;
    }

    /**
     * <pre>
     * 设置：操作详情
     * 表字段：t_fit_order_log.operation_detail
     * </pre>
     *
     * @param operationDetail
     *            t_fit_order_log.operation_detail：操作详情
     */
    public void setOperationDetail(String operationDetail) {
        this.operationDetail = operationDetail == null ? null : operationDetail.trim();
    }

    /**
     * <pre>
     * 获取：操作时间
     * 表字段：t_fit_order_log.operation_time
     * </pre>
     *
     * @return t_fit_order_log.operation_time：操作时间
     */
    public Date getOperationTime() {
        return operationTime;
    }

    /**
     * <pre>
     * 设置：操作时间
     * 表字段：t_fit_order_log.operation_time
     * </pre>
     *
     * @param operationTime
     *            t_fit_order_log.operation_time：操作时间
     */
    public void setOperationTime(Date operationTime) {
        this.operationTime = operationTime;
    }

    /**
     * <pre>
     * 获取：是否关键步骤
     * 表字段：t_fit_order_log.key_operation_flag
     * </pre>
     *
     * @return t_fit_order_log.key_operation_flag：是否关键步骤
     */
    public Boolean getKeyOperationFlag() {
        return keyOperationFlag;
    }

    /**
     * <pre>
     * 设置：是否关键步骤
     * 表字段：t_fit_order_log.key_operation_flag
     * </pre>
     *
     * @param keyOperationFlag
     *            t_fit_order_log.key_operation_flag：是否关键步骤
     */
    public void setKeyOperationFlag(Boolean keyOperationFlag) {
        this.keyOperationFlag = keyOperationFlag;
    }

    /**
     * <pre>
     * 获取：
     * 表字段：t_fit_order_log.operator_name
     * </pre>
     *
     * @return t_fit_order_log.operator_name：
     */
    public String getOperatorName() {
        return operatorName;
    }

    /**
     * <pre>
     * 设置：
     * 表字段：t_fit_order_log.operator_name
     * </pre>
     *
     * @param operatorName
     *            t_fit_order_log.operator_name：
     */
    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName == null ? null : operatorName.trim();
    }

    /**
     * <pre>
     * 获取：
     * 表字段：t_fit_order_log.operator_phone
     * </pre>
     *
     * @return t_fit_order_log.operator_phone：
     */
    public String getOperatorPhone() {
        return operatorPhone;
    }

    /**
     * <pre>
     * 设置：
     * 表字段：t_fit_order_log.operator_phone
     * </pre>
     *
     * @param operatorPhone
     *            t_fit_order_log.operator_phone：
     */
    public void setOperatorPhone(String operatorPhone) {
        this.operatorPhone = operatorPhone == null ? null : operatorPhone.trim();
    }

    /**
     * <pre>
     * 获取：
     * 表字段：t_fit_order_log.operator_role
     * </pre>
     *
     * @return t_fit_order_log.operator_role：
     */
    public String getOperatorRole() {
        return operatorRole;
    }

    /**
     * <pre>
     * 设置：
     * 表字段：t_fit_order_log.operator_role
     * </pre>
     *
     * @param operatorRole
     *            t_fit_order_log.operator_role：
     */
    public void setOperatorRole(String operatorRole) {
        this.operatorRole = operatorRole == null ? null : operatorRole.trim();
    }
}