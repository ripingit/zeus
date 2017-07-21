package org.chaoxuan.zeus.model;

import java.math.BigDecimal;

public class QuotaArea {
    /**
     * <pre>
     * 
     * 表字段 : t_quota_area.id
     * </pre>
     */
    private Integer id;

    /**
     * <pre>
     * 面积
     * 表字段 : t_quota_area.area
     * </pre>
     */
    private String area;

    /**
     * <pre>
     * 时间上限
     * 表字段 : t_quota_area.upper_limit
     * </pre>
     */
    private BigDecimal upperLimit;

    /**
     * <pre>
     * 时间下限
     * 表字段 : t_quota_area.lower_limit
     * </pre>
     */
    private BigDecimal lowerLimit;

    /**
     * <pre>
     * 获取：
     * 表字段：t_quota_area.id
     * </pre>
     *
     * @return t_quota_area.id：
     */
    public Integer getId() {
        return id;
    }

    /**
     * <pre>
     * 设置：
     * 表字段：t_quota_area.id
     * </pre>
     *
     * @param id
     *            t_quota_area.id：
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * <pre>
     * 获取：面积
     * 表字段：t_quota_area.area
     * </pre>
     *
     * @return t_quota_area.area：面积
     */
    public String getArea() {
        return area;
    }

    /**
     * <pre>
     * 设置：面积
     * 表字段：t_quota_area.area
     * </pre>
     *
     * @param area
     *            t_quota_area.area：面积
     */
    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    /**
     * <pre>
     * 获取：时间上限
     * 表字段：t_quota_area.upper_limit
     * </pre>
     *
     * @return t_quota_area.upper_limit：时间上限
     */
    public BigDecimal getUpperLimit() {
        return upperLimit;
    }

    /**
     * <pre>
     * 设置：时间上限
     * 表字段：t_quota_area.upper_limit
     * </pre>
     *
     * @param upperLimit
     *            t_quota_area.upper_limit：时间上限
     */
    public void setUpperLimit(BigDecimal upperLimit) {
        this.upperLimit = upperLimit;
    }

    /**
     * <pre>
     * 获取：时间下限
     * 表字段：t_quota_area.lower_limit
     * </pre>
     *
     * @return t_quota_area.lower_limit：时间下限
     */
    public BigDecimal getLowerLimit() {
        return lowerLimit;
    }

    /**
     * <pre>
     * 设置：时间下限
     * 表字段：t_quota_area.lower_limit
     * </pre>
     *
     * @param lowerLimit
     *            t_quota_area.lower_limit：时间下限
     */
    public void setLowerLimit(BigDecimal lowerLimit) {
        this.lowerLimit = lowerLimit;
    }
}