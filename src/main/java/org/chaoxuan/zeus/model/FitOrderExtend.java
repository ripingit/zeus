package org.chaoxuan.zeus.model;

import java.sql.Date;

public class FitOrderExtend extends FitOrder{
	private String userName;
	private Integer userId;
	private Date startContractTime;
	private Date endContractTime;
	private Date startPredictTime;
	private Date epTime;
	private String stateName;
	private OwnerInfo ownerInfo;
	//一个订单对应一个用户
	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Date getStartContractTime() {
		return startContractTime;
	}
	public void setStartContractTime(Date startContractTime) {
		this.startContractTime = startContractTime;
	}
	public Date getEndContractTime() {
		return endContractTime;
	}
	public void setEndContractTime(Date endContractTime) {
		this.endContractTime = endContractTime;
	}
	public Date getStartPredictTime() {
		return startPredictTime;
	}
	public void setStartPredictTime(Date startPredictTime) {
		this.startPredictTime = startPredictTime;
	}
	public Date getEpTime() {
		return epTime;
	}
	public void setEpTime(Date epTime) {
		this.epTime = epTime;
	}
	
	public OwnerInfo getOwnerInfo() {
		return ownerInfo;
	}
	public void setOwnerInfo(OwnerInfo ownerInfo) {
		this.ownerInfo = ownerInfo;
	}
	
	@Override
	public String toString() {
		return "FitOrderExtend [userName=" + userName + ", userId=" + userId + ", startContractTime="
				+ startContractTime + ", endContractTime=" + endContractTime + ", startPredictTime=" + startPredictTime
				+ ", epTime=" + epTime + "]";
	}

	
	
	
		
}
