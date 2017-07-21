package org.chaoxuan.zeus.model;

import java.util.Date;

public class RequirementMachine {
    /**
     * <pre>
     * 
     * 表字段 : t_requirement_machine.id
     * </pre>
     */
    private Integer id;

    /**
     * <pre>
     * 名称
     * 表字段 : t_requirement_machine.title
     * </pre>
     */
    private String title;

    /**
     * <pre>
     * 型号
     * 表字段 : t_requirement_machine.model
     * </pre>
     */
    private String model;

    /**
     * <pre>
     * 建议下单时间
     * 表字段 : t_requirement_machine.suggest_order_time
     * </pre>
     */
    private Date suggestOrderTime;

    /**
     * <pre>
     * 最晚送到日期
     * 表字段 : t_requirement_machine.arrival_time
     * </pre>
     */
    private Date arrivalTime;

    /**
     * <pre>
     * 进展
     * 表字段 : t_requirement_machine.progress
     * </pre>
     */
    private Integer progress;

    /**
     * <pre>
     * 关联装修任务
     * 表字段 : t_requirement_machine.fit_task_id
     * </pre>
     */
    private Integer fitTaskId;
    /**
     * <pre>
     * 获取：
     * 表字段：t_requirement_machine.id
     * </pre>
     *
     * @return t_requirement_machine.id：
     */
    private Integer dayCount;
    private Integer status;

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getStatus() {
        return status;
    }

    public Integer getDayCount() {
        return dayCount;
    }

    public void setDayCount(Integer dayCount) {
        this.dayCount = dayCount;
    }

    public Integer getId() {
        return id;
    }

    /**
     * <pre>
     * 设置：
     * 表字段：t_requirement_machine.id
     * </pre>
     *
     * @param id
     *            t_requirement_machine.id：
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * <pre>
     * 获取：名称
     * 表字段：t_requirement_machine.title
     * </pre>
     *
     * @return t_requirement_machine.title：名称
     */
    public String getTitle() {
        return title;
    }

    /**
     * <pre>
     * 设置：名称
     * 表字段：t_requirement_machine.title
     * </pre>
     *
     * @param title
     *            t_requirement_machine.title：名称
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * <pre>
     * 获取：型号
     * 表字段：t_requirement_machine.model
     * </pre>
     *
     * @return t_requirement_machine.model：型号
     */
    public String getModel() {
        return model;
    }

    /**
     * <pre>
     * 设置：型号
     * 表字段：t_requirement_machine.model
     * </pre>
     *
     * @param model
     *            t_requirement_machine.model：型号
     */
    public void setModel(String model) {
        this.model = model == null ? null : model.trim();
    }

    /**
     * <pre>
     * 获取：建议下单时间
     * 表字段：t_requirement_machine.suggest_order_time
     * </pre>
     *
     * @return t_requirement_machine.suggest_order_time：建议下单时间
     */
    public Date getSuggestOrderTime() {
        return suggestOrderTime;
    }

    /**
     * <pre>
     * 设置：建议下单时间
     * 表字段：t_requirement_machine.suggest_order_time
     * </pre>
     *
     * @param suggestOrderTime
     *            t_requirement_machine.suggest_order_time：建议下单时间
     */
    public void setSuggestOrderTime(Date suggestOrderTime) {
        this.suggestOrderTime = suggestOrderTime;
    }

    /**
     * <pre>
     * 获取：最晚送到日期
     * 表字段：t_requirement_machine.arrival_time
     * </pre>
     *
     * @return t_requirement_machine.arrival_time：最晚送到日期
     */
    public Date getArrivalTime() {
        return arrivalTime;
    }

    /**
     * <pre>
     * 设置：最晚送到日期
     * 表字段：t_requirement_machine.arrival_time
     * </pre>
     *
     * @param arrivalTime
     *            t_requirement_machine.arrival_time：最晚送到日期
     */
    public void setArrivalTime(Date arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    /**
     * <pre>
     * 获取：进展
     * 表字段：t_requirement_machine.progress
     * </pre>
     *
     * @return t_requirement_machine.progress：进展
     */
    public Integer getProgress() {
        return progress;
    }

    /**
     * <pre>
     * 设置：进展
     * 表字段：t_requirement_machine.progress
     * </pre>
     *
     * @param progress
     *            t_requirement_machine.progress：进展
     */
    public void setProgress(Integer progress) {
        this.progress = progress;
    }

    /**
     * <pre>
     * 获取：关联装修任务
     * 表字段：t_requirement_machine.fit_task_id
     * </pre>
     *
     * @return t_requirement_machine.fit_task_id：关联装修任务
     */
    public Integer getFitTaskId() {
        return fitTaskId;
    }

    /**
     * <pre>
     * 设置：关联装修任务
     * 表字段：t_requirement_machine.fit_task_id
     * </pre>
     *
     * @param fitTaskId
     *            t_requirement_machine.fit_task_id：关联装修任务
     */
    public void setFitTaskId(Integer fitTaskId) {
        this.fitTaskId = fitTaskId;
    }
}