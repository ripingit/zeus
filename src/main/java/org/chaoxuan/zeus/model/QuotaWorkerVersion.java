package org.chaoxuan.zeus.model;

import java.math.BigDecimal;

public class QuotaWorkerVersion {
	/**
	 * <pre>
	 * 
	 * 表字段 : t_quota_worker_version.id
	 * </pre>
	 */
	private Integer id;

	/**
	 * <pre>
	 * 
	 * 表字段 : t_quota_worker_version.version
	 * </pre>
	 */
	private String version;

	/**
	 * <pre>
	 * 
	 * 表字段 : t_quota_worker_version.unit_price
	 * </pre>
	 */
	private BigDecimal unitPrice;

	/**
	 * <pre>
	 * 
	 * 表字段 : t_quota_worker_version.area
	 * </pre>
	 */
	private String area;

	/**
	 * <pre>
	 * 
	 * 表字段 : t_quota_worker_version.quota_worker_id
	 * </pre>
	 */
	private Integer quotaWorkerId;

	private QuotaWorker quotaWorker;

	/**
	 * <pre>
	 * 获取：
	 * 表字段：t_quota_worker_version.id
	 * </pre>
	 *
	 * @return t_quota_worker_version.id：
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * <pre>
	 * 设置：
	 * 表字段：t_quota_worker_version.id
	 * </pre>
	 *
	 * @param id
	 *            t_quota_worker_version.id：
	 */
	public void setId(Integer id) {
		this.id = id;
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
	 * 表字段：t_quota_worker_version.area
	 * </pre>
	 *
	 * @return t_quota_worker_version.area：
	 */
	public String getArea() {
		return area;
	}

	/**
	 * <pre>
	 * 设置：
	 * 表字段：t_quota_worker_version.area
	 * </pre>
	 *
	 * @param area
	 *            t_quota_worker_version.area：
	 */
	public void setArea(String area) {
		this.area = area == null ? null : area.trim();
	}

	/**
	 * <pre>
	 * 获取：
	 * 表字段：t_quota_worker_version.quota_worker_id
	 * </pre>
	 *
	 * @return t_quota_worker_version.quota_worker_id：
	 */
	public Integer getQuotaWorkerId() {
		return quotaWorkerId;
	}

	/**
	 * <pre>
	 * 设置：
	 * 表字段：t_quota_worker_version.quota_worker_id
	 * </pre>
	 *
	 * @param quotaWorkerId
	 *            t_quota_worker_version.quota_worker_id：
	 */
	public void setQuotaWorkerId(Integer quotaWorkerId) {
		this.quotaWorkerId = quotaWorkerId;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public QuotaWorker getQuotaWorker() {
		return quotaWorker;
	}

	public void setQuotaWorker(QuotaWorker quotaWorker) {
		this.quotaWorker = quotaWorker;
	}

}