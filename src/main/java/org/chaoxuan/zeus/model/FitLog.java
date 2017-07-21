package org.chaoxuan.zeus.model;

public class FitLog {
	private Integer id;
	private Integer machId;
	private String machineDesc;
	private String machineResult;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getMachId() {
		return machId;
	}
	public void setMachId(Integer machId) {
		this.machId = machId;
	}
	public String getMachineDesc() {
		return machineDesc;
	}
	public void setMachineDesc(String machineDesc) {
		this.machineDesc = machineDesc;
	}
	public String getMachineResult() {
		return machineResult;
	}
	public void setMachineResult(String machineResult) {
		this.machineResult = machineResult;
	}
	@Override
	public String toString() {
		return "FitLog [id=" + id + ", machId=" + machId + ", machineDesc=" + machineDesc + ", machineResult="
				+ machineResult + "]";
	}
	
}
