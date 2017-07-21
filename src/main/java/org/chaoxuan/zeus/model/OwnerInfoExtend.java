package org.chaoxuan.zeus.model;

import java.util.Date;
import java.util.List;

/**
 * OwnerInfo拓展类
 */
public class OwnerInfoExtend extends OwnerInfo{
    private OwnerInfo ownerInfo;
    private Date startTime;
    private Date endTime;
    private String name;
    private String address;
    private String measureOrder;
    private String orderCode;

	public String getOrderCode() {
		return orderCode;
	}

	public void setMeasureOrder(String measureOrder) {
		this.measureOrder = measureOrder;
	}

	public String getMeasureOrder() {
		return measureOrder;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public OwnerInfo getOwnerInfo() {
		return ownerInfo;
	}
	public void setOwnerInfo(OwnerInfo ownerInfo) {
		this.ownerInfo = ownerInfo;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "OwnerInfoExtend [ownerInfo=" + ownerInfo + ", startTime=" + startTime + ", endTime=" + endTime
				+ ", name=" + name + "]";
	}
	

	
   



}
