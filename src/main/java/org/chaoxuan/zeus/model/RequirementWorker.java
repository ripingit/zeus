package org.chaoxuan.zeus.model;

import java.util.Date;

public class RequirementWorker {
    /**
     * <pre>
     *
     * 表字段 : t_requirement_worker.id
     * </pre>
     */
    private Integer id;

    /**
     * <pre>
     * 工种
     * 表字段 : t_requirement_worker.title
     * </pre>
     */
    private String title;

    /**
     * <pre>
     * 工人数量
     * 表字段 : t_requirement_worker.worker_quantity
     * </pre>
     */
    private Integer workerQuantity;

    /**
     * <pre>
     * 工作天数
     * 表字段 : t_requirement_worker.working_days
     * </pre>
     */
    private Integer workingDays;

    /**
     * <pre>
     * 下单时间
     * 表字段 : t_requirement_worker.place_order_time
     * </pre>
     */
    private Date placeOrderTime;

    /**
     * <pre>
     * 工人到岗时间
     * 表字段 : t_requirement_worker.worker_arrival_time
     * </pre>
     */
    private Date workerArrivalTime;
    private Date workerArrivalTimeEnd;
    /**
     * <pre>
     * 工作进度
     * 表字段 : t_requirement_worker.work_progress
     * </pre>
     */
    private Integer workProgress;

    /**
     * <pre>
     * 关联任务表
     * 表字段 : t_requirement_worker.fit_task_id
     * </pre>
     */
    private Integer fitTaskId;

    private int fitOrderId;
    private String requirement;
    private int state;
    private int type;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getRequirement() {
        return requirement;
    }

    public void setRequirement(String requirement) {
        this.requirement = requirement;
    }

    public Date getWorkerArrivalTimeEnd() {
        return workerArrivalTimeEnd;
    }

    public void setWorkerArrivalTimeEnd(Date workerArrivalTimeEnd) {
        this.workerArrivalTimeEnd = workerArrivalTimeEnd;
    }

    public int getFitOrderId() {
        return fitOrderId;
    }

    public void setFitOrderId(int fitOrderId) {
        this.fitOrderId = fitOrderId;
    }



    /**
     * <pre>
     * 获取：
     * 表字段：t_requirement_worker.id
     * </pre>
     *
     * @return t_requirement_worker.id：
     */
    public Integer getId() {
        return id;
    }

    /**
     * <pre>
     * 设置：
     * 表字段：t_requirement_worker.id
     * </pre>
     *
     * @param id t_requirement_worker.id：
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * <pre>
     * 获取：工种
     * 表字段：t_requirement_worker.title
     * </pre>
     *
     * @return t_requirement_worker.title：工种
     */
    public String getTitle() {
        return title;
    }

    /**
     * <pre>
     * 设置：工种
     * 表字段：t_requirement_worker.title
     * </pre>
     *
     * @param title t_requirement_worker.title：工种
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * <pre>
     * 获取：工人数量
     * 表字段：t_requirement_worker.worker_quantity
     * </pre>
     *
     * @return t_requirement_worker.worker_quantity：工人数量
     */
    public Integer getWorkerQuantity() {
        return workerQuantity;
    }

    /**
     * <pre>
     * 设置：工人数量
     * 表字段：t_requirement_worker.worker_quantity
     * </pre>
     *
     * @param workerQuantity t_requirement_worker.worker_quantity：工人数量
     */
    public void setWorkerQuantity(Integer workerQuantity) {
        this.workerQuantity = workerQuantity;
    }

    /**
     * <pre>
     * 获取：工作天数
     * 表字段：t_requirement_worker.working_days
     * </pre>
     *
     * @return t_requirement_worker.working_days：工作天数
     */
    public Integer getWorkingDays() {
        return workingDays;
    }

    /**
     * <pre>
     * 设置：工作天数
     * 表字段：t_requirement_worker.working_days
     * </pre>
     *
     * @param workingDays t_requirement_worker.working_days：工作天数
     */
    public void setWorkingDays(Integer workingDays) {
        this.workingDays = workingDays;
    }

    /**
     * <pre>
     * 获取：下单时间
     * 表字段：t_requirement_worker.place_order_time
     * </pre>
     *
     * @return t_requirement_worker.place_order_time：下单时间
     */
    public Date getPlaceOrderTime() {
        return placeOrderTime;
    }

    /**
     * <pre>
     * 设置：下单时间
     * 表字段：t_requirement_worker.place_order_time
     * </pre>
     *
     * @param placeOrderTime t_requirement_worker.place_order_time：下单时间
     */
    public void setPlaceOrderTime(Date placeOrderTime) {
        this.placeOrderTime = placeOrderTime;
    }

    /**
     * <pre>
     * 获取：工人到岗时间
     * 表字段：t_requirement_worker.worker_arrival_time
     * </pre>
     *
     * @return t_requirement_worker.worker_arrival_time：工人到岗时间
     */
    public Date getWorkerArrivalTime() {
        return workerArrivalTime;
    }

    /**
     * <pre>
     * 设置：工人到岗时间
     * 表字段：t_requirement_worker.worker_arrival_time
     * </pre>
     *
     * @param workerArrivalTime t_requirement_worker.worker_arrival_time：工人到岗时间
     */
    public void setWorkerArrivalTime(Date workerArrivalTime) {
        this.workerArrivalTime = workerArrivalTime;
    }

    /**
     * <pre>
     * 获取：工作进度
     * 表字段：t_requirement_worker.work_progress
     * </pre>
     *
     * @return t_requirement_worker.work_progress：工作进度
     */
    public Integer getWorkProgress() {
        return workProgress;
    }

    /**
     * <pre>
     * 设置：工作进度
     * 表字段：t_requirement_worker.work_progress
     * </pre>
     *
     * @param workProgress t_requirement_worker.work_progress：工作进度
     */
    public void setWorkProgress(Integer workProgress) {
        this.workProgress = workProgress;
    }

    /**
     * <pre>
     * 获取：关联任务表
     * 表字段：t_requirement_worker.fit_task_id
     * </pre>
     *
     * @return t_requirement_worker.fit_task_id：关联任务表
     */
    public Integer getFitTaskId() {
        return fitTaskId;
    }

    /**
     * <pre>
     * 设置：关联任务表
     * 表字段：t_requirement_worker.fit_task_id
     * </pre>
     *
     * @param fitTaskId t_requirement_worker.fit_task_id：关联任务表
     */
    public void setFitTaskId(Integer fitTaskId) {
        this.fitTaskId = fitTaskId;
    }
}