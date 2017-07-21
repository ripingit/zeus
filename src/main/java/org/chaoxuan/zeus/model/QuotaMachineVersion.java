package org.chaoxuan.zeus.model;

import java.math.BigDecimal;

public class QuotaMachineVersion {
	/**
	 * <pre>
	 * 
	 * 表字段 : t_quota_machine_version.id
	 * </pre>
	 */
	private Integer id;

	/**
	 * <pre>
	 * 
	 * 表字段 : t_quota_machine_version.version
	 * </pre>
	 */
	private String version;

	/**
	 * <pre>
	 * 
	 * 表字段 : t_quota_machine_version.unit_price
	 * </pre>
	 */
	private BigDecimal unitPrice;

	/**
	 * <pre>
	 * 
	 * 表字段 : t_quota_machine_version.area
	 * </pre>
	 */
	private String area;

	/**
	 * <pre>
	 * 
	 * 表字段 : t_quota_machine_version.quota_machine_id
	 * </pre>
	 */
	private Integer quotaMachineId;

	private QuotaMachine quotaMachine;

	/**
	 * <pre>
	 * 获取：
	 * 表字段：t_quota_machine_version.id
	 * </pre>
	 *
	 * @return t_quota_machine_version.id：
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * <pre>
	 * 设置：
	 * 表字段：t_quota_machine_version.id
	 * </pre>
	 *
	 * @param id
	 *            t_quota_machine_version.id：
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * <pre>
	 * 获取：
	 * 表字段：t_quota_machine_version.version
	 * </pre>
	 *
	 * @return t_quota_machine_version.version：
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <pre>
	 * 设置：
	 * 表字段：t_quota_machine_version.version
	 * </pre>
	 *
	 * @param version
	 *            t_quota_machine_version.version：
	 */
	public void setVersion(String version) {
		this.version = version == null ? null : version.trim();
	}

	public BigDecimal getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}

	/**
	 * <pre>
	 * 获取：
	 * 表字段：t_quota_machine_version.area
	 * </pre>
	 *
	 * @return t_quota_machine_version.area：
	 */
	public String getArea() {
		return area;
	}

	/**
	 * <pre>
	 * 设置：
	 * 表字段：t_quota_machine_version.area
	 * </pre>
	 *
	 * @param area
	 *            t_quota_machine_version.area：
	 */
	public void setArea(String area) {
		this.area = area == null ? null : area.trim();
	}

	/**
	 * <pre>
	 * 获取：
	 * 表字段：t_quota_machine_version.quota_machine_id
	 * </pre>
	 *
	 * @return t_quota_machine_version.quota_machine_id：
	 */
	public Integer getQuotaMachineId() {
		return quotaMachineId;
	}

	/**
	 * <pre>
	 * 设置：
	 * 表字段：t_quota_machine_version.quota_machine_id
	 * </pre>
	 *
	 * @param quotaMachineId
	 *            t_quota_machine_version.quota_machine_id：
	 */
	public void setQuotaMachineId(Integer quotaMachineId) {
		this.quotaMachineId = quotaMachineId;
	}

	public QuotaMachine getQuotaMachine() {
		return quotaMachine;
	}

	public void setQuotaMachine(QuotaMachine quotaMachine) {
		this.quotaMachine = quotaMachine;
	}

}