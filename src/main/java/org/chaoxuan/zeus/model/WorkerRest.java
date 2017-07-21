package org.chaoxuan.zeus.model;

import java.util.Date;

public class WorkerRest {
    /**
     * <pre>
     * 主键 ID
     * 表字段 : t_worker_rest.id
     * </pre>
     */
    private Integer id;

    /**
     * <pre>
     * 工人 ID
     * 表字段 : t_worker_rest.worker_id
     * </pre>
     */
    private Integer workerId;

    /**
     * <pre>
     * 休息开始时间
     * 表字段 : t_worker_rest.start_at
     * </pre>
     */
    private Date startAt;

    /**
     * <pre>
     * 休息结束时间
     * 表字段 : t_worker_rest.end_at
     * </pre>
     */
    private Date endAt;

    /**
     * <pre>
     * 获取：主键 ID
     * 表字段：t_worker_rest.id
     * </pre>
     *
     * @return t_worker_rest.id：主键 ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * <pre>
     * 设置：主键 ID
     * 表字段：t_worker_rest.id
     * </pre>
     *
     * @param id
     *            t_worker_rest.id：主键 ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * <pre>
     * 获取：工人 ID
     * 表字段：t_worker_rest.worker_id
     * </pre>
     *
     * @return t_worker_rest.worker_id：工人 ID
     */
    public Integer getWorkerId() {
        return workerId;
    }

    /**
     * <pre>
     * 设置：工人 ID
     * 表字段：t_worker_rest.worker_id
     * </pre>
     *
     * @param workerId
     *            t_worker_rest.worker_id：工人 ID
     */
    public void setWorkerId(Integer workerId) {
        this.workerId = workerId;
    }

    /**
     * <pre>
     * 获取：休息开始时间
     * 表字段：t_worker_rest.start_at
     * </pre>
     *
     * @return t_worker_rest.start_at：休息开始时间
     */
    public Date getStartAt() {
        return startAt;
    }

    /**
     * <pre>
     * 设置：休息开始时间
     * 表字段：t_worker_rest.start_at
     * </pre>
     *
     * @param startAt
     *            t_worker_rest.start_at：休息开始时间
     */
    public void setStartAt(Date startAt) {
        this.startAt = startAt;
    }

    /**
     * <pre>
     * 获取：休息结束时间
     * 表字段：t_worker_rest.end_at
     * </pre>
     *
     * @return t_worker_rest.end_at：休息结束时间
     */
    public Date getEndAt() {
        return endAt;
    }

    /**
     * <pre>
     * 设置：休息结束时间
     * 表字段：t_worker_rest.end_at
     * </pre>
     *
     * @param endAt
     *            t_worker_rest.end_at：休息结束时间
     */
    public void setEndAt(Date endAt) {
        this.endAt = endAt;
    }
}