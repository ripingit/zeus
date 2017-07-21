package org.chaoxuan.zeus.model;

import java.math.BigDecimal;

public class FitTaskWorker {
	/**
	 * <pre>
	 * 
	 * 表字段 : t_fit_task_worker.id
	 * </pre>
	 */
	private Integer id;

	/**
	 * <pre>
	 * 
	 * 表字段 : t_fit_task_worker.quota_worker_version_id
	 * </pre>
	 */
	private Integer quotaWorkerVersionId;

	/**
	 * <pre>
	 * 
	 * 表字段 : t_fit_task_worker.fit_task_id
	 * </pre>
	 */
	private Integer fitTaskId;

	/**
	 * <pre>
	 * 
	 * 表字段 : t_fit_task_worker.unit_task_time
	 * </pre>
	 */
	private BigDecimal unitTaskTime;

	/**
	 * <pre>
	 * 
	 * 表字段 : t_fit_task_worker.cost
	 * </pre>
	 */
	private BigDecimal cost;

	/** 其它字段 start */
	private String version;
	private BigDecimal unitPrice;
	private String area;
	private Integer categoryId;
	private String categoryName;
	private String unit;
	private String title;

	/** 其它字段 end */

	/**
	 * <pre>
	 * 获取：
	 * 表字段：t_fit_task_worker.id
	 * </pre>
	 *
	 * @return t_fit_task_worker.id：
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * <pre>
	 * 设置：
	 * 表字段：t_fit_task_worker.id
	 * </pre>
	 *
	 * @param id
	 *            t_fit_task_worker.id：
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * <pre>
	 * 获取：
	 * 表字段：t_fit_task_worker.quota_worker_version_id
	 * </pre>
	 *
	 * @return t_fit_task_worker.quota_worker_version_id：
	 */
	public Integer getQuotaWorkerVersionId() {
		return quotaWorkerVersionId;
	}

	/**
	 * <pre>
	 * 设置：
	 * 表字段：t_fit_task_worker.quota_worker_version_id
	 * </pre>
	 *
	 * @param quotaWorkerVersionId
	 *            t_fit_task_worker.quota_worker_version_id：
	 */
	public void setQuotaWorkerVersionId(Integer quotaWorkerVersionId) {
		this.quotaWorkerVersionId = quotaWorkerVersionId;
	}

	/**
	 * <pre>
	 * 获取：
	 * 表字段：t_fit_task_worker.fit_task_id
	 * </pre>
	 *
	 * @return t_fit_task_worker.fit_task_id：
	 */
	public Integer getFitTaskId() {
		return fitTaskId;
	}

	/**
	 * <pre>
	 * 设置：
	 * 表字段：t_fit_task_worker.fit_task_id
	 * </pre>
	 *
	 * @param fitTaskId
	 *            t_fit_task_worker.fit_task_id：
	 */
	public void setFitTaskId(Integer fitTaskId) {
		this.fitTaskId = fitTaskId;
	}

	/**
	 * <pre>
	 * 获取：
	 * 表字段：t_fit_task_worker.unit_task_time
	 * </pre>
	 *
	 * @return t_fit_task_worker.unit_task_time：
	 */
	public BigDecimal getUnitTaskTime() {
		return unitTaskTime;
	}

	/**
	 * <pre>
	 * 设置：
	 * 表字段：t_fit_task_worker.unit_task_time
	 * </pre>
	 *
	 * @param unitTaskTime
	 *            t_fit_task_worker.unit_task_time：
	 */
	public void setUnitTaskTime(BigDecimal unitTaskTime) {
		this.unitTaskTime = unitTaskTime;
	}

	/**
	 * <pre>
	 * 获取：
	 * 表字段：t_fit_task_worker.cost
	 * </pre>
	 *
	 * @return t_fit_task_worker.cost：
	 */
	public BigDecimal getCost() {
		return cost;
	}

	/**
	 * <pre>
	 * 设置：
	 * 表字段：t_fit_task_worker.cost
	 * </pre>
	 *
	 * @param cost
	 *            t_fit_task_worker.cost：
	 */
	public void setCost(BigDecimal cost) {
		this.cost = cost;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public BigDecimal getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}