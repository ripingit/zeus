package org.chaoxuan.zeus.model;

public class ProcessFlow {
    /**
     * <pre>
     * 
     * 表字段 : t_process_flow.id
     * </pre>
     */
    private Integer id;

    /**
     * <pre>
     * 施工规范 ID
     * 表字段 : t_process_flow.fit_standard_id
     * </pre>
     */
    private Integer fitStandardId;

    /**
     * <pre>
     * 标题
     * 表字段 : t_process_flow.title
     * </pre>
     */
    private String title;

    /**
     * <pre>
     * 获取：
     * 表字段：t_process_flow.id
     * </pre>
     *
     * @return t_process_flow.id：
     */
    public Integer getId() {
        return id;
    }

    /**
     * <pre>
     * 设置：
     * 表字段：t_process_flow.id
     * </pre>
     *
     * @param id
     *            t_process_flow.id：
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * <pre>
     * 获取：施工规范 ID
     * 表字段：t_process_flow.fit_standard_id
     * </pre>
     *
     * @return t_process_flow.fit_standard_id：施工规范 ID
     */
    public Integer getFitStandardId() {
        return fitStandardId;
    }

    /**
     * <pre>
     * 设置：施工规范 ID
     * 表字段：t_process_flow.fit_standard_id
     * </pre>
     *
     * @param fitStandardId
     *            t_process_flow.fit_standard_id：施工规范 ID
     */
    public void setFitStandardId(Integer fitStandardId) {
        this.fitStandardId = fitStandardId;
    }

    /**
     * <pre>
     * 获取：标题
     * 表字段：t_process_flow.title
     * </pre>
     *
     * @return t_process_flow.title：标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * <pre>
     * 设置：标题
     * 表字段：t_process_flow.title
     * </pre>
     *
     * @param title
     *            t_process_flow.title：标题
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }
}