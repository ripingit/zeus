package org.chaoxuan.zeus.model;

import java.math.BigDecimal;

public class FitTaskArea {
	/**
	 * <pre>
	 * 
	 * 表字段 : t_fit_task_area.id
	 * </pre>
	 */
	private Integer id;

	/**
	 * <pre>
	 * 
	 * 表字段 : t_fit_task_area.quota_area_id
	 * </pre>
	 */
	private Integer quotaAreaId;

	/**
	 * <pre>
	 * 
	 * 表字段 : t_fit_task_area.fit_task_id
	 * </pre>
	 */
	private Integer fitTaskId;

	/**
	 * <pre>
	 * 
	 * 表字段 : t_fit_task_area.upper_limit
	 * </pre>
	 */
	private BigDecimal upperLimit;

	/**
	 * <pre>
	 * 
	 * 表字段 : t_fit_task_area.lower_limit
	 * </pre>
	 */
	private BigDecimal lowerLimit;

	/** 其它字段 start */
	private String area;
	/** 其它字段 end */

	/**
	 * <pre>
	 * 获取：
	 * 表字段：t_fit_task_area.id
	 * </pre>
	 *
	 * @return t_fit_task_area.id：
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * <pre>
	 * 设置：
	 * 表字段：t_fit_task_area.id
	 * </pre>
	 *
	 * @param id
	 *            t_fit_task_area.id：
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * <pre>
	 * 获取：
	 * 表字段：t_fit_task_area.quota_area_id
	 * </pre>
	 *
	 * @return t_fit_task_area.quota_area_id：
	 */
	public Integer getQuotaAreaId() {
		return quotaAreaId;
	}

	/**
	 * <pre>
	 * 设置：
	 * 表字段：t_fit_task_area.quota_area_id
	 * </pre>
	 *
	 * @param quotaAreaId
	 *            t_fit_task_area.quota_area_id：
	 */
	public void setQuotaAreaId(Integer quotaAreaId) {
		this.quotaAreaId = quotaAreaId;
	}

	/**
	 * <pre>
	 * 获取：
	 * 表字段：t_fit_task_area.fit_task_id
	 * </pre>
	 *
	 * @return t_fit_task_area.fit_task_id：
	 */
	public Integer getFitTaskId() {
		return fitTaskId;
	}

	/**
	 * <pre>
	 * 设置：
	 * 表字段：t_fit_task_area.fit_task_id
	 * </pre>
	 *
	 * @param fitTaskId
	 *            t_fit_task_area.fit_task_id：
	 */
	public void setFitTaskId(Integer fitTaskId) {
		this.fitTaskId = fitTaskId;
	}

	/**
	 * <pre>
	 * 获取：
	 * 表字段：t_fit_task_area.upper_limit
	 * </pre>
	 *
	 * @return t_fit_task_area.upper_limit：
	 */
	public BigDecimal getUpperLimit() {
		return upperLimit;
	}

	/**
	 * <pre>
	 * 设置：
	 * 表字段：t_fit_task_area.upper_limit
	 * </pre>
	 *
	 * @param upperLimit
	 *            t_fit_task_area.upper_limit：
	 */
	public void setUpperLimit(BigDecimal upperLimit) {
		this.upperLimit = upperLimit;
	}

	/**
	 * <pre>
	 * 获取：
	 * 表字段：t_fit_task_area.lower_limit
	 * </pre>
	 *
	 * @return t_fit_task_area.lower_limit：
	 */
	public BigDecimal getLowerLimit() {
		return lowerLimit;
	}

	/**
	 * <pre>
	 * 设置：
	 * 表字段：t_fit_task_area.lower_limit
	 * </pre>
	 *
	 * @param lowerLimit
	 *            t_fit_task_area.lower_limit：
	 */
	public void setLowerLimit(BigDecimal lowerLimit) {
		this.lowerLimit = lowerLimit;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

}