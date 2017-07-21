package org.chaoxuan.zeus.model;

import java.util.Date;

public class MeasureOrderExtend extends MeasureOrder{

	private String userPhone;
	private String userName;
	private Date sigStartDate;
	private Date sigEndDate;
	private Date finStartDate;
	private Date finEndDate;


	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setSigStartDate(Date sigStartDate) {
		this.sigStartDate = sigStartDate;
	}

	public void setSigEndDate(Date sigEndDate) {
		this.sigEndDate = sigEndDate;
	}

	public void setFinStartDate(Date finStartDate) {
		this.finStartDate = finStartDate;
	}

	public void setFinEndDate(Date finEndDate) {
		this.finEndDate = finEndDate;
	}

	public String getUserName() {
		return userName;
	}

	public Date getSigStartDate() {
		return sigStartDate;
	}

	public Date getSigEndDate() {
		return sigEndDate;
	}

	public Date getFinStartDate() {
		return finStartDate;
	}

	public Date getFinEndDate() {
		return finEndDate;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
}
