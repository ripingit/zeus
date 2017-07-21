package org.chaoxuan.zeus.model;

public class WorkerCategory {
    /**
     * <pre>
     * 
     * 表字段 : t_worker_category.id
     * </pre>
     */
    private Integer id;

    /**
     * <pre>
     * 
     * 表字段 : t_worker_category.name
     * </pre>
     */
    private String name;

    /**
     * <pre>
     * 获取：
     * 表字段：t_worker_category.id
     * </pre>
     *
     * @return t_worker_category.id：
     */
    public Integer getId() {
        return id;
    }

    /**
     * <pre>
     * 设置：
     * 表字段：t_worker_category.id
     * </pre>
     *
     * @param id
     *            t_worker_category.id：
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * <pre>
     * 获取：
     * 表字段：t_worker_category.name
     * </pre>
     *
     * @return t_worker_category.name：
     */
    public String getName() {
        return name;
    }

    /**
     * <pre>
     * 设置：
     * 表字段：t_worker_category.name
     * </pre>
     *
     * @param name
     *            t_worker_category.name：
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}