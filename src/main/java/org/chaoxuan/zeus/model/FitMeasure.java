package org.chaoxuan.zeus.model;

public class FitMeasure {
    /**
     * <pre>
     * 
     * 表字段 : t_fit_measure.id
     * </pre>
     */
    private Integer id;

    /**
     * <pre>
     * 
     * 表字段 : t_fit_measure.name
     * </pre>
     */
    private String name;

    /**
     * <pre>
     * 获取：
     * 表字段：t_fit_measure.id
     * </pre>
     *
     * @return t_fit_measure.id：
     */
    public Integer getId() {
        return id;
    }

    /**
     * <pre>
     * 设置：
     * 表字段：t_fit_measure.id
     * </pre>
     *
     * @param id
     *            t_fit_measure.id：
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * <pre>
     * 获取：
     * 表字段：t_fit_measure.name
     * </pre>
     *
     * @return t_fit_measure.name：
     */
    public String getName() {
        return name;
    }

    /**
     * <pre>
     * 设置：
     * 表字段：t_fit_measure.name
     * </pre>
     *
     * @param name
     *            t_fit_measure.name：
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}