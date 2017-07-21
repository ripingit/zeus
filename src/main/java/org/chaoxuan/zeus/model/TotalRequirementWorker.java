package org.chaoxuan.zeus.model;

import java.math.BigDecimal;

public class TotalRequirementWorker {
    /**
     * <pre>
     * 主键 ID
     * 表字段 : t_total_requirement_worker.id
     * </pre>
     */
    private Integer id;

    /**
     * <pre>
     * 工人种类 ID
     * 表字段 : t_total_requirement_worker.category_id
     * </pre>
     */
    private Integer categoryId;

    /**
     * <pre>
     * 工人种类名称
     * 表字段 : t_total_requirement_worker.category_name
     * </pre>
     */
    private String categoryName;

    /**
     * <pre>
     * 等级
     * 表字段 : t_total_requirement_worker.version
     * </pre>
     */
    private String version;

    /**
     * <pre>
     * 数量
     * 表字段 : t_total_requirement_worker.amount
     * </pre>
     */
    private Integer amount;

    /**
     * <pre>
     * 消耗工时
     * 表字段 : t_total_requirement_worker.task_time
     * </pre>
     */
    private BigDecimal taskTime;

    /**
     * <pre>
     * 订单 ID
     * 表字段 : t_total_requirement_worker.fit_order_id
     * </pre>
     */
    private Integer fitOrderId;

    /**
     * <pre>
     * 获取：主键 ID
     * 表字段：t_total_requirement_worker.id
     * </pre>
     *
     * @return t_total_requirement_worker.id：主键 ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * <pre>
     * 设置：主键 ID
     * 表字段：t_total_requirement_worker.id
     * </pre>
     *
     * @param id
     *            t_total_requirement_worker.id：主键 ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * <pre>
     * 获取：工人种类 ID
     * 表字段：t_total_requirement_worker.category_id
     * </pre>
     *
     * @return t_total_requirement_worker.category_id：工人种类 ID
     */
    public Integer getCategoryId() {
        return categoryId;
    }

    /**
     * <pre>
     * 设置：工人种类 ID
     * 表字段：t_total_requirement_worker.category_id
     * </pre>
     *
     * @param categoryId
     *            t_total_requirement_worker.category_id：工人种类 ID
     */
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * <pre>
     * 获取：工人种类名称
     * 表字段：t_total_requirement_worker.category_name
     * </pre>
     *
     * @return t_total_requirement_worker.category_name：工人种类名称
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * <pre>
     * 设置：工人种类名称
     * 表字段：t_total_requirement_worker.category_name
     * </pre>
     *
     * @param categoryName
     *            t_total_requirement_worker.category_name：工人种类名称
     */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName == null ? null : categoryName.trim();
    }

    /**
     * <pre>
     * 获取：等级
     * 表字段：t_total_requirement_worker.version
     * </pre>
     *
     * @return t_total_requirement_worker.version：等级
     */
    public String getVersion() {
        return version;
    }

    /**
     * <pre>
     * 设置：等级
     * 表字段：t_total_requirement_worker.version
     * </pre>
     *
     * @param version
     *            t_total_requirement_worker.version：等级
     */
    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    /**
     * <pre>
     * 获取：数量
     * 表字段：t_total_requirement_worker.amount
     * </pre>
     *
     * @return t_total_requirement_worker.amount：数量
     */
    public Integer getAmount() {
        return amount;
    }

    /**
     * <pre>
     * 设置：数量
     * 表字段：t_total_requirement_worker.amount
     * </pre>
     *
     * @param amount
     *            t_total_requirement_worker.amount：数量
     */
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    /**
     * <pre>
     * 获取：消耗工时
     * 表字段：t_total_requirement_worker.task_time
     * </pre>
     *
     * @return t_total_requirement_worker.task_time：消耗工时
     */
    public BigDecimal getTaskTime() {
        return taskTime;
    }

    /**
     * <pre>
     * 设置：消耗工时
     * 表字段：t_total_requirement_worker.task_time
     * </pre>
     *
     * @param taskTime
     *            t_total_requirement_worker.task_time：消耗工时
     */
    public void setTaskTime(BigDecimal taskTime) {
        this.taskTime = taskTime;
    }

    /**
     * <pre>
     * 获取：订单 ID
     * 表字段：t_total_requirement_worker.fit_order_id
     * </pre>
     *
     * @return t_total_requirement_worker.fit_order_id：订单 ID
     */
    public Integer getFitOrderId() {
        return fitOrderId;
    }

    /**
     * <pre>
     * 设置：订单 ID
     * 表字段：t_total_requirement_worker.fit_order_id
     * </pre>
     *
     * @param fitOrderId
     *            t_total_requirement_worker.fit_order_id：订单 ID
     */
    public void setFitOrderId(Integer fitOrderId) {
        this.fitOrderId = fitOrderId;
    }
}