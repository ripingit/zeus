package org.chaoxuan.zeus.model;

import java.util.Date;

public class MeasureOrder {
	private Integer id;
	private Integer userId;
	private String measureOrderId;
	private Date sigDate;
	private Date finDate;
	private Double amMoney;
	private Integer statuOrder;
	private Date measureDate;
	private Integer fitManagerId;
	private Date payTime;
	private FitManager fitManager;
	private Date createTime;

	private OwnerInfo ownerInfo;

	public OwnerInfo getOwnerInfo() {
		return ownerInfo;
	}

	public void setOwnerInfo(OwnerInfo ownerInfo) {
		this.ownerInfo = ownerInfo;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public void setMeasureOrderId(String measureOrderId) {
		this.measureOrderId = measureOrderId;
	}

	public void setSigDate(Date sigDate) {
		this.sigDate = sigDate;
	}

	public void setFinDate(Date finDate) {
		this.finDate = finDate;
	}

	public void setAmMoney(Double amMoney) {
		this.amMoney = amMoney;
	}

	public void setStatuOrder(Integer statuOrder) {
		this.statuOrder = statuOrder;
	}

	public void setMeasureDate(Date measureDate) {
		this.measureDate = measureDate;
	}

	public void setFitManagerId(Integer fitManagerId) {
		this.fitManagerId = fitManagerId;
	}

	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}

	public void setFitManager(FitManager fitManager) {
		this.fitManager = fitManager;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Integer getId() {
		return id;
	}

	public Integer getUserId() {
		return userId;
	}

	public String getMeasureOrderId() {
		return measureOrderId;
	}

	public Date getSigDate() {
		return sigDate;
	}

	public Date getFinDate() {
		return finDate;
	}

	public Double getAmMoney() {
		return amMoney;
	}

	public Integer getStatuOrder() {
		return statuOrder;
	}

	public Date getMeasureDate() {
		return measureDate;
	}

	public Integer getFitManagerId() {
		return fitManagerId;
	}

	public Date getPayTime() {
		return payTime;
	}

	public FitManager getFitManager() {
		return fitManager;
	}

	public Date getCreateTime() {
		return createTime;
	}

	@Override
	public String toString() {
		return "MeasureOrder{" +
				"id=" + id +
				", userId=" + userId +
				", measureOrderId='" + measureOrderId + '\'' +
				", sigDate=" + sigDate +
				", finDate=" + finDate +
				", amMoney=" + amMoney +
				", statuOrder=" + statuOrder +
				", measureDate=" + measureDate +
				", fitManagerId=" + fitManagerId +
				", payTime=" + payTime +
				", fitManager=" + fitManager +
				", createTime=" + createTime +
				", ownerInfo=" + ownerInfo +
				'}';
	}
}
