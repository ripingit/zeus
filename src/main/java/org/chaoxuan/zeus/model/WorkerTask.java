package org.chaoxuan.zeus.model;

import java.util.Date;

public class WorkerTask {
    /**
     * <pre>
     * 主键 ID
     * 表字段 : t_worker_task.id
     * </pre>
     */
    private Integer id;

    /**
     * <pre>
     * 工人 ID
     * 表字段 : t_worker_task.worker_id
     * </pre>
     */
    private Integer workerId;

    /**
     * <pre>
     * 任务实例 ID
     * 表字段 : t_worker_task.fit_task_id
     * </pre>
     */
    private Integer fitTaskId;

    /**
     * <pre>
     * 任务开始时间
     * 表字段 : t_worker_task.start_at
     * </pre>
     */
    private Date startAt;

    /**
     * <pre>
     * 任务结束时间
     * 表字段 : t_worker_task.ent_at
     * </pre>
     */
    private Date endAt;

    /**
     * 其它字段
     */
    private Float contractMoney;
    private String address;
    private Integer totalDays;
    private Integer currDay;
    private String title;
    private Integer requirementId;

    public Integer getRequirementId() {
        return requirementId;
    }

    public void setRequirementId(Integer requirementId) {
        this.requirementId = requirementId;
    }

    public Integer getTotalDays() {
        return totalDays;
    }

    public void setTotalDays(Integer totalDays) {
        this.totalDays = totalDays;
    }

    public Integer getCurrDay() {
        return currDay;
    }

    public void setCurrDay(Integer currDay) {
        this.currDay = currDay;
    }

    public Float getContractMoney() {
        return contractMoney;
    }

    public void setContractMoney(Float contractMoney) {
        this.contractMoney = contractMoney;
    }

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

    /**
     * <pre>
     * 获取：主键 ID
     * 表字段：t_worker_task.id
     * </pre>
     *
     * @return t_worker_task.id：主键 ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * <pre>
     * 设置：主键 ID
     * 表字段：t_worker_task.id
     * </pre>
     *
     * @param id t_worker_task.id：主键 ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * <pre>
     * 获取：工人 ID
     * 表字段：t_worker_task.worker_id
     * </pre>
     *
     * @return t_worker_task.worker_id：工人 ID
     */
    public Integer getWorkerId() {
        return workerId;
    }

    /**
     * <pre>
     * 设置：工人 ID
     * 表字段：t_worker_task.worker_id
     * </pre>
     *
     * @param workerId t_worker_task.worker_id：工人 ID
     */
    public void setWorkerId(Integer workerId) {
        this.workerId = workerId;
    }

    /**
     * <pre>
     * 获取：任务实例 ID
     * 表字段：t_worker_task.fit_task_id
     * </pre>
     *
     * @return t_worker_task.fit_task_id：任务实例 ID
     */
    public Integer getFitTaskId() {
        return fitTaskId;
    }

    /**
     * <pre>
     * 设置：任务实例 ID
     * 表字段：t_worker_task.fit_task_id
     * </pre>
     *
     * @param fitTaskId t_worker_task.fit_task_id：任务实例 ID
     */
    public void setFitTaskId(Integer fitTaskId) {
        this.fitTaskId = fitTaskId;
    }

    /**
     * <pre>
     * 获取：任务开始时间
     * 表字段：t_worker_task.start_at
     * </pre>
     *
     * @return t_worker_task.start_at：任务开始时间
     */
    public Date getStartAt() {
        return startAt;
    }

    /**
     * <pre>
     * 设置：任务开始时间
     * 表字段：t_worker_task.start_at
     * </pre>
     *
     * @param startAt t_worker_task.start_at：任务开始时间
     */
    public void setStartAt(Date startAt) {
        this.startAt = startAt;
    }

    /**
     * <pre>
     * 获取：任务结束时间
     * 表字段：t_worker_task.ent_at
     * </pre>
     *
     * @return t_worker_task.ent_at：任务结束时间
     */
    public Date getEndAt() {
        return endAt;
    }

    /**
     * <pre>
     * 设置：任务结束时间
     * 表字段：t_worker_task.ent_at
     * </pre>
     *
     * @param entAt t_worker_task.ent_at：任务结束时间
     */
    public void setEndAt(Date entAt) {
        this.endAt = entAt;
    }
}