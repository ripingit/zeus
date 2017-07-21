package org.chaoxuan.zeus.model;

import java.util.ArrayList;
import java.util.List;

public class ProcessFlowWithBLOBs extends ProcessFlow {
    /**
     * <pre>
     * 描述
     * 表字段 : t_process_flow.describe
     * </pre>
     */
    private String describe;

    /**
     * <pre>
     * 附件 JSON 串
     * 表字段 : t_process_flow.attachs
     * </pre>
     */
    private String attachs;

    /**
     * 其它字段
     */
    private List<WorkerResult> results = new ArrayList<WorkerResult>();

    /**
     * <pre>
     * 获取：描述
     * 表字段：t_process_flow.describe
     * </pre>
     *
     * @return t_process_flow.describe：描述
     */
    public String getDescribe() {
        return describe;
    }

    /**
     * <pre>
     * 设置：描述
     * 表字段：t_process_flow.describe
     * </pre>
     *
     * @param describe t_process_flow.describe：描述
     */
    public void setDescribe(String describe) {
        this.describe = describe == null ? null : describe.trim();
    }

    /**
     * <pre>
     * 获取：附件 JSON 串
     * 表字段：t_process_flow.attachs
     * </pre>
     *
     * @return t_process_flow.attachs：附件 JSON 串
     */
    public String getAttachs() {
        return attachs;
    }

    /**
     * <pre>
     * 设置：附件 JSON 串
     * 表字段：t_process_flow.attachs
     * </pre>
     *
     * @param attachs t_process_flow.attachs：附件 JSON 串
     */
    public void setAttachs(String attachs) {
        this.attachs = attachs == null ? null : attachs.trim();
    }

    public List<WorkerResult> getResults() {
        return results;
    }

    public void setResults(List<WorkerResult> results) {
        this.results = results;
    }
}