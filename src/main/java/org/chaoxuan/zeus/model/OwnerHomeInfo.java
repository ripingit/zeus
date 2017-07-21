package org.chaoxuan.zeus.model;

public class OwnerHomeInfo {
	private Integer id;
	private Integer userId;
	private String address;// '业主家庭地址',
	private Double budget;// '预算',
	private Double baseFit;// '基础装修预算',
	private Double furAndApp;//'家具和家电',
	private Double softFit;//LL COMMENT '软装配置'
	private String loves;// '喜好'
	private String person;// '人口',
	private String remarks;// '备注'
	private Integer area;
	private String housedesc;
	private String city;
	private String district;
	private String street;
	private String community;
	private String houseNumber;

	public void setCity(String city) {
		this.city = city;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public void setCommunity(String community) {
		this.community = community;
	}

	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getCity() {
		return city;
	}

	public String getDistrict() {
		return district;
	}

	public String getStreet() {
		return street;
	}

	public String getCommunity() {
		return community;
	}

	public String getHouseNumber() {
		return houseNumber;
	}

	public Integer getArea() {
		return area;
	}
	public void setArea(Integer area) {
		this.area = area;
	}
	public String getHousedesc() {
		return housedesc;
	}
	public void setHousedesc(String housedesc) {
		this.housedesc = housedesc;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Double getBudget() {
		return budget;
	}
	public void setBudget(Double budget) {
		this.budget = budget;
	}
	public Double getBaseFit() {
		return baseFit;
	}
	public void setBaseFit(Double baseFit) {
		this.baseFit = baseFit;
	}
	public Double getFurAndApp() {
		return furAndApp;
	}
	public void setFurAndApp(Double furAndApp) {
		this.furAndApp = furAndApp;
	}
	public Double getSoftFit() {
		return softFit;
	}
	public void setSoftFit(Double softFit) {
		this.softFit = softFit;
	}
	public String getLoves() {
		return loves;
	}
	public void setLoves(String loves) {
		this.loves = loves;
	}
	public String getPerson() {
		return person;
	}
	public void setPerson(String person) {
		this.person = person;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	@Override
	public String toString() {
		return "OwnerHomeInfo [id=" + id + ", userId=" + userId + ", address=" + address + ", budget=" + budget
				+ ", baseFit=" + baseFit + ", furAndApp=" + furAndApp + ", softFit=" + softFit + ", loves=" + loves
				+ ", person=" + person + ", remarks=" + remarks + "]";
	}

}
