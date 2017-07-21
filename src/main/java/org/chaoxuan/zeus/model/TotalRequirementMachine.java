package org.chaoxuan.zeus.model;

import java.math.BigDecimal;

public class TotalRequirementMachine {
    /**
     * <pre>
     * 主键 ID
     * 表字段 : t_total_requirement_machine.id
     * </pre>
     */
    private Integer id;

    /**
     * <pre>
     * 机械种类 ID
     * 表字段 : t_total_requirement_machine.category_id
     * </pre>
     */
    private Integer categoryId;

    /**
     * <pre>
     * 机械种类名称
     * 表字段 : t_total_requirement_machine.category_name
     * </pre>
     */
    private String categoryName;

    /**
     * <pre>
     * 型号 ID
     * 表字段 : t_total_requirement_machine.version_id
     * </pre>
     */
    private Integer versionId;

    /**
     * <pre>
     * 型号名称
     * 表字段 : t_total_requirement_machine.version_name
     * </pre>
     */
    private String versionName;

    /**
     * <pre>
     * 品牌
     * 表字段 : t_total_requirement_machine.brand
     * </pre>
     */
    private String brand;

    /**
     * <pre>
     * 需求总量
     * 表字段 : t_total_requirement_machine.amount
     * </pre>
     */
    private Integer amount;

    /**
     * <pre>
     * 作业时长
     * 表字段 : t_total_requirement_machine.task_time
     * </pre>
     */
    private BigDecimal taskTime;

    /**
     * <pre>
     * 订单 ID
     * 表字段 : t_total_requirement_machine.fit_order_id
     * </pre>
     */
    private Integer fitOrderId;

    /**
     * <pre>
     * 获取：主键 ID
     * 表字段：t_total_requirement_machine.id
     * </pre>
     *
     * @return t_total_requirement_machine.id：主键 ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * <pre>
     * 设置：主键 ID
     * 表字段：t_total_requirement_machine.id
     * </pre>
     *
     * @param id
     *            t_total_requirement_machine.id：主键 ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * <pre>
     * 获取：机械种类 ID
     * 表字段：t_total_requirement_machine.category_id
     * </pre>
     *
     * @return t_total_requirement_machine.category_id：机械种类 ID
     */
    public Integer getCategoryId() {
        return categoryId;
    }

    /**
     * <pre>
     * 设置：机械种类 ID
     * 表字段：t_total_requirement_machine.category_id
     * </pre>
     *
     * @param categoryId
     *            t_total_requirement_machine.category_id：机械种类 ID
     */
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * <pre>
     * 获取：机械种类名称
     * 表字段：t_total_requirement_machine.category_name
     * </pre>
     *
     * @return t_total_requirement_machine.category_name：机械种类名称
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * <pre>
     * 设置：机械种类名称
     * 表字段：t_total_requirement_machine.category_name
     * </pre>
     *
     * @param categoryName
     *            t_total_requirement_machine.category_name：机械种类名称
     */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName == null ? null : categoryName.trim();
    }

    /**
     * <pre>
     * 获取：型号 ID
     * 表字段：t_total_requirement_machine.version_id
     * </pre>
     *
     * @return t_total_requirement_machine.version_id：型号 ID
     */
    public Integer getVersionId() {
        return versionId;
    }

    /**
     * <pre>
     * 设置：型号 ID
     * 表字段：t_total_requirement_machine.version_id
     * </pre>
     *
     * @param versionId
     *            t_total_requirement_machine.version_id：型号 ID
     */
    public void setVersionId(Integer versionId) {
        this.versionId = versionId;
    }

    /**
     * <pre>
     * 获取：型号名称
     * 表字段：t_total_requirement_machine.version_name
     * </pre>
     *
     * @return t_total_requirement_machine.version_name：型号名称
     */
    public String getVersionName() {
        return versionName;
    }

    /**
     * <pre>
     * 设置：型号名称
     * 表字段：t_total_requirement_machine.version_name
     * </pre>
     *
     * @param versionName
     *            t_total_requirement_machine.version_name：型号名称
     */
    public void setVersionName(String versionName) {
        this.versionName = versionName == null ? null : versionName.trim();
    }

    /**
     * <pre>
     * 获取：品牌
     * 表字段：t_total_requirement_machine.brand
     * </pre>
     *
     * @return t_total_requirement_machine.brand：品牌
     */
    public String getBrand() {
        return brand;
    }

    /**
     * <pre>
     * 设置：品牌
     * 表字段：t_total_requirement_machine.brand
     * </pre>
     *
     * @param brand
     *            t_total_requirement_machine.brand：品牌
     */
    public void setBrand(String brand) {
        this.brand = brand == null ? null : brand.trim();
    }

    /**
     * <pre>
     * 获取：需求总量
     * 表字段：t_total_requirement_machine.amount
     * </pre>
     *
     * @return t_total_requirement_machine.amount：需求总量
     */
    public Integer getAmount() {
        return amount;
    }

    /**
     * <pre>
     * 设置：需求总量
     * 表字段：t_total_requirement_machine.amount
     * </pre>
     *
     * @param amount
     *            t_total_requirement_machine.amount：需求总量
     */
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    /**
     * <pre>
     * 获取：作业时长
     * 表字段：t_total_requirement_machine.task_time
     * </pre>
     *
     * @return t_total_requirement_machine.task_time：作业时长
     */
    public BigDecimal getTaskTime() {
        return taskTime;
    }

    /**
     * <pre>
     * 设置：作业时长
     * 表字段：t_total_requirement_machine.task_time
     * </pre>
     *
     * @param taskTime
     *            t_total_requirement_machine.task_time：作业时长
     */
    public void setTaskTime(BigDecimal taskTime) {
        this.taskTime = taskTime;
    }

    /**
     * <pre>
     * 获取：订单 ID
     * 表字段：t_total_requirement_machine.fit_order_id
     * </pre>
     *
     * @return t_total_requirement_machine.fit_order_id：订单 ID
     */
    public Integer getFitOrderId() {
        return fitOrderId;
    }

    /**
     * <pre>
     * 设置：订单 ID
     * 表字段：t_total_requirement_machine.fit_order_id
     * </pre>
     *
     * @param fitOrderId
     *            t_total_requirement_machine.fit_order_id：订单 ID
     */
    public void setFitOrderId(Integer fitOrderId) {
        this.fitOrderId = fitOrderId;
    }
}