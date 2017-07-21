package org.chaoxuan.zeus.model;

import java.util.Date;

public class WorkerResult {
    /**
     * <pre>
     *
     * 表字段 : t_worker_result.id
     * </pre>
     */
    private Integer id;

    /**
     * <pre>
     * 工人任务 ID
     * 表字段 : t_worker_result.worker_task_id
     * </pre>
     */
    private Integer workerTaskId;

    /**
     * <pre>
     * 工艺 ID
     * 表字段 : t_worker_result.process_flow_id
     * </pre>
     */
    private Integer processFlowId;

    /**
     * <pre>
     * 备注
     * 表字段 : t_worker_result.remark
     * </pre>
     */
    private String remark;

    /**
     * <pre>
     * 附件 JSON 串
     * 表字段 : t_worker_result.attachs
     * </pre>
     */
    private String attachs;

    /**
     * <pre>
     * 1未读 2已读
     * 表字段 : t_worker_result.status
     * </pre>
     */
    private Integer status;

    /**
     * <pre>
     * 创建时间
     * 表字段 : t_worker_result.create_time
     * </pre>
     */
    private Date createTime;

    /**
     * 其它字段
     */
    private String title;

    /**
     * <pre>
     * 获取：
     * 表字段：t_worker_result.id
     * </pre>
     *
     * @return t_worker_result.id：
     */
    public Integer getId() {
        return id;
    }

    /**
     * <pre>
     * 设置：
     * 表字段：t_worker_result.id
     * </pre>
     *
     * @param id t_worker_result.id：
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * <pre>
     * 获取：工人任务 ID
     * 表字段：t_worker_result.worker_task_id
     * </pre>
     *
     * @return t_worker_result.worker_task_id：工人任务 ID
     */
    public Integer getWorkerTaskId() {
        return workerTaskId;
    }

    /**
     * <pre>
     * 设置：工人任务 ID
     * 表字段：t_worker_result.worker_task_id
     * </pre>
     *
     * @param workerTaskId t_worker_result.worker_task_id：工人任务 ID
     */
    public void setWorkerTaskId(Integer workerTaskId) {
        this.workerTaskId = workerTaskId;
    }

    /**
     * <pre>
     * 获取：工艺 ID
     * 表字段：t_worker_result.process_flow_id
     * </pre>
     *
     * @return t_worker_result.process_flow_id：工艺 ID
     */
    public Integer getProcessFlowId() {
        return processFlowId;
    }

    /**
     * <pre>
     * 设置：工艺 ID
     * 表字段：t_worker_result.process_flow_id
     * </pre>
     *
     * @param processFlowId t_worker_result.process_flow_id：工艺 ID
     */
    public void setProcessFlowId(Integer processFlowId) {
        this.processFlowId = processFlowId;
    }

    /**
     * <pre>
     * 获取：备注
     * 表字段：t_worker_result.remark
     * </pre>
     *
     * @return t_worker_result.remark：备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * <pre>
     * 设置：备注
     * 表字段：t_worker_result.remark
     * </pre>
     *
     * @param remark t_worker_result.remark：备注
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * <pre>
     * 获取：附件 JSON 串
     * 表字段：t_worker_result.attachs
     * </pre>
     *
     * @return t_worker_result.attachs：附件 JSON 串
     */
    public String getAttachs() {
        return attachs;
    }

    /**
     * <pre>
     * 设置：附件 JSON 串
     * 表字段：t_worker_result.attachs
     * </pre>
     *
     * @param attachs t_worker_result.attachs：附件 JSON 串
     */
    public void setAttachs(String attachs) {
        this.attachs = attachs == null ? null : attachs.trim();
    }

    /**
     * <pre>
     * 获取：1未读 2已读
     * 表字段：t_worker_result.status
     * </pre>
     *
     * @return t_worker_result.status：1未读 2已读
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * <pre>
     * 设置：1未读 2已读
     * 表字段：t_worker_result.status
     * </pre>
     *
     * @param status t_worker_result.status：1未读 2已读
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * <pre>
     * 获取：创建时间
     * 表字段：t_worker_result.create_time
     * </pre>
     *
     * @return t_worker_result.create_time：创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * <pre>
     * 设置：创建时间
     * 表字段：t_worker_result.create_time
     * </pre>
     *
     * @param createTime t_worker_result.create_time：创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}