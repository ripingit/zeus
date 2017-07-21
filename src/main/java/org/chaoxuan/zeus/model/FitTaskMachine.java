package org.chaoxuan.zeus.model;

import java.math.BigDecimal;

public class FitTaskMachine {
	/**
	 * <pre>
	 * 
	 * 表字段 : t_fit_task_machine.id
	 * </pre>
	 */
	private Integer id;

	/**
	 * <pre>
	 * 
	 * 表字段 : t_fit_task_machine.quota_machine_version_id
	 * </pre>
	 */
	private Integer quotaMachineVersionId;

	/**
	 * <pre>
	 * 
	 * 表字段 : t_fit_task_machine.fit_task_id
	 * </pre>
	 */
	private Integer fitTaskId;

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
	 * 表字段：t_fit_task_machine.id
	 * </pre>
	 *
	 * @return t_fit_task_machine.id：
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * <pre>
	 * 设置：
	 * 表字段：t_fit_task_machine.id
	 * </pre>
	 *
	 * @param id
	 *            t_fit_task_machine.id：
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * <pre>
	 * 获取：
	 * 表字段：t_fit_task_machine.quota_machine_version_id
	 * </pre>
	 *
	 * @return t_fit_task_machine.quota_machine_version_id：
	 */
	public Integer getQuotaMachineVersionId() {
		return quotaMachineVersionId;
	}

	/**
	 * <pre>
	 * 设置：
	 * 表字段：t_fit_task_machine.quota_machine_version_id
	 * </pre>
	 *
	 * @param quotaMachineVersionId
	 *            t_fit_task_machine.quota_machine_version_id：
	 */
	public void setQuotaMachineVersionId(Integer quotaMachineVersionId) {
		this.quotaMachineVersionId = quotaMachineVersionId;
	}

	/**
	 * <pre>
	 * 获取：
	 * 表字段：t_fit_task_machine.fit_task_id
	 * </pre>
	 *
	 * @return t_fit_task_machine.fit_task_id：
	 */
	public Integer getFitTaskId() {
		return fitTaskId;
	}

	/**
	 * <pre>
	 * 设置：
	 * 表字段：t_fit_task_machine.fit_task_id
	 * </pre>
	 *
	 * @param fitTaskId
	 *            t_fit_task_machine.fit_task_id：
	 */
	public void setFitTaskId(Integer fitTaskId) {
		this.fitTaskId = fitTaskId;
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