package org.chaoxuan.zeus.model;

import java.io.Serializable;
import java.util.*;

/**
 * 业主信息表，
 * 对应数据库表cx_ownerinfo
 */
public class 	OwnerInfo implements Serializable{
	private Integer id;

	private String userId;

	private String userName;

	private Date registerDate;

	private String remarks;

	private String userGrade;

	private Integer cxUserId;

	private String password;

	private String mobile;

	private Integer sex;

	private String personalLabel;

	private OwnerHomeInfo ownerHomeInfo;

	private MeasureOrder msOrder;

	private FitOrder fitOrder;

	private FitMoney fitMoney;

	private List<FitMoney> fitMoneys;
	private Date newDate;

	public Date getNewDate() {
		return newDate;
	}

	public void setNewDate(Date newDate) {
		this.newDate = newDate;
	}

	private Date fitCreateTime;
	private List Data;

	public List getData() {
		return Data;
	}

	public void setData(List data) {
		Data = data;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Date getRegisterDate() {
		return registerDate;
	}

	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getUserGrade() {
		return userGrade;
	}

	public void setUserGrade(String userGrade) {
		this.userGrade = userGrade;
	}

	public Integer getCxUserId() {
		return cxUserId;
	}

	public void setCxUserId(Integer cxUserId) {
		this.cxUserId = cxUserId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public String getPersonalLabel() {
		return personalLabel;
	}

	public void setPersonalLabel(String personalLabel) {
		this.personalLabel = personalLabel;
	}

	public OwnerHomeInfo getOwnerHomeInfo() {
		return ownerHomeInfo;
	}

	public void setOwnerHomeInfo(OwnerHomeInfo ownerHomeInfo) {
		this.ownerHomeInfo = ownerHomeInfo;
	}

	public MeasureOrder getMsOrder() {
		return msOrder;
	}

	public void setMsOrder(MeasureOrder msOrder) {
		this.msOrder = msOrder;
	}

	public FitOrder getFitOrder() {
		return fitOrder;
	}

	public void setFitOrder(FitOrder fitOrder) {
		this.fitOrder = fitOrder;
	}

	public FitMoney getFitMoney() {
		return fitMoney;
	}

	public void setFitMoney(FitMoney fitMoney) {
		this.fitMoney = fitMoney;
	}

	public List<FitMoney> getFitMoneys() {
		return fitMoneys;
	}

	public void setFitMoneys(List<FitMoney> fitMoneys) {
		this.fitMoneys = fitMoneys;
	}

	public Date getFitCreateTime() {
		return fitCreateTime;
	}

	public void setFitCreateTime(Date fitCreateTime) {
		this.fitCreateTime = fitCreateTime;
	}
}
