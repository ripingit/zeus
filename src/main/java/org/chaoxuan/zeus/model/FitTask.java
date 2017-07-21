package org.chaoxuan.zeus.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class FitTask {
	/**
	 * <pre>
	 * 
	 * 表字段 : t_fit_task.id
	 * </pre>
	 */
	private Integer id;

	/**
	 * <pre>
	 * 任务名称
	 * 表字段 : t_fit_task.title
	 * </pre>
	 */
	private String title;

	/**
	 * <pre>
	 * 任务分类
	 * 表字段 : t_fit_task.category
	 * </pre>
	 */
	private Integer category;

	/**
	 * <pre>
	 * 工人定额---外键t_quote_worker
	 * 表字段 : t_fit_task.worker
	 * </pre>
	 */
	private String worker;

	/**
	 * <pre>
	 * 材料定额---外键t_quote_material
	 * 表字段 : t_fit_task.material
	 * </pre>
	 */
	private String material;

	/**
	 * <pre>
	 * 机械定额---外键t_quote_machine
	 * 表字段 : t_fit_task.machine
	 * </pre>
	 */
	private String machine;

	/**
	 * <pre>
	 * 装修规范
	 * 表字段 : t_fit_task.standard
	 * </pre>
	 */
	private Integer fitStandardId;

	/**
	 * <pre>
	 * 装修阶段
	 * 表字段 : t_fit_task.phase
	 * </pre>
	 */
	private int phase;

	/**
	 * <pre>
	 * 版本
	 * 表字段 : t_fit_task.version
	 * </pre>
	 */
	private String version;

	/**
	 * <pre>
	 * 次序
	 * 表字段 : t_fit_task.sequence
	 * </pre>
	 */
	private int sequence;

	private String unit;

	private List<QuotaWorkerVersion> listQuotaWorkerVersion = new ArrayList<QuotaWorkerVersion>();
	private List<QuotaMaterialVersion> listQuotaMaterialVersion = new ArrayList<QuotaMaterialVersion>();
	private List<QuotaMachineVersion> listQuotaMachineVersion = new ArrayList<QuotaMachineVersion>();

	private List<FitTaskMachine> listFitTaskMachine = new ArrayList<FitTaskMachine>();
	private List<FitTaskMaterial> listFitTaskMaterial = new ArrayList<FitTaskMaterial>();
	private List<FitTaskWorker> listFitTaskWorker = new ArrayList<FitTaskWorker>();
	private List<FitTaskArea> listFitTaskArea = new ArrayList<FitTaskArea>();
	private List<FitTaskMeasure> listFitTaskMeasure = new ArrayList<FitTaskMeasure>();

	private FitStandard fitStandard;

	boolean newPhaseFlag;

	private int oldPhase;
	private int oldSequence;

	private String area;

	private String measure;

	public FitStandard getFitStandard() {
		return fitStandard;
	}

	public void setFitStandard(FitStandard fitStandard) {
		this.fitStandard = fitStandard;
	}

	public boolean isNewPhaseFlag() {
		return newPhaseFlag;
	}

	public void setNewPhaseFlag(boolean newPhaseFlag) {
		this.newPhaseFlag = newPhaseFlag;
	}

	public int getSequence() {
		return sequence;
	}

	public void setSequence(int sequence) {
		this.sequence = sequence;
	}

	/**
	 * <pre>
	 * 获取：
	 * 表字段：t_fit_task.id
	 * </pre>
	 *
	 * @return t_fit_task.id：
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * <pre>
	 * 设置：
	 * 表字段：t_fit_task.id
	 * </pre>
	 *
	 * @param id
	 *            t_fit_task.id：
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * <pre>
	 * 获取：任务名称
	 * 表字段：t_fit_task.title
	 * </pre>
	 *
	 * @return t_fit_task.title：任务名称
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <pre>
	 * 设置：任务名称
	 * 表字段：t_fit_task.title
	 * </pre>
	 *
	 * @param title
	 *            t_fit_task.title：任务名称
	 */
	public void setTitle(String title) {
		this.title = title == null ? null : title.trim();
	}

	/**
	 * <pre>
	 * 获取：任务分类
	 * 表字段：t_fit_task.category
	 * </pre>
	 *
	 * @return t_fit_task.category：任务分类
	 */
	public Integer getCategory() {
		return category;
	}

	/**
	 * <pre>
	 * 设置：任务分类
	 * 表字段：t_fit_task.category
	 * </pre>
	 *
	 * @param category
	 *            t_fit_task.category：任务分类
	 */
	public void setCategory(Integer category) {
		this.category = category;
	}

	/**
	 * <pre>
	 * 获取：工人定额---外键t_quote_worker
	 * 表字段：t_fit_task.worker
	 * </pre>
	 *
	 * @return t_fit_task.worker：工人定额---外键t_quote_worker
	 */
	public String getWorker() {
		return worker;
	}

	/**
	 * <pre>
	 * 设置：工人定额---外键t_quote_worker
	 * 表字段：t_fit_task.worker
	 * </pre>
	 *
	 * @param worker
	 *            t_fit_task.worker：工人定额---外键t_quote_worker
	 */
	public void setWorker(String worker) {
		this.worker = worker == null ? null : worker.trim();
	}

	/**
	 * <pre>
	 * 获取：材料定额---外键t_quote_material
	 * 表字段：t_fit_task.material
	 * </pre>
	 *
	 * @return t_fit_task.material：材料定额---外键t_quote_material
	 */
	public String getMaterial() {
		return material;
	}

	/**
	 * <pre>
	 * 设置：材料定额---外键t_quote_material
	 * 表字段：t_fit_task.material
	 * </pre>
	 *
	 * @param material
	 *            t_fit_task.material：材料定额---外键t_quote_material
	 */
	public void setMaterial(String material) {
		this.material = material == null ? null : material.trim();
	}

	/**
	 * <pre>
	 * 获取：机械定额---外键t_quote_machine
	 * 表字段：t_fit_task.machine
	 * </pre>
	 *
	 * @return t_fit_task.machine：机械定额---外键t_quote_machine
	 */
	public String getMachine() {
		return machine;
	}

	/**
	 * <pre>
	 * 设置：机械定额---外键t_quote_machine
	 * 表字段：t_fit_task.machine
	 * </pre>
	 *
	 * @param machine
	 *            t_fit_task.machine：机械定额---外键t_quote_machine
	 */
	public void setMachine(String machine) {
		this.machine = machine == null ? null : machine.trim();
	}

	public int getPhase() {
		return phase;
	}

	public void setPhase(int phase) {
		this.phase = phase;
	}

	/**
	 * <pre>
	 * 获取：版本
	 * 表字段：t_fit_task.version
	 * </pre>
	 *
	 * @return t_fit_task.version：版本
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <pre>
	 * 设置：版本
	 * 表字段：t_fit_task.version
	 * </pre>
	 *
	 * @param version
	 *            t_fit_task.version：版本
	 */
	public void setVersion(String version) {
		this.version = version == null ? null : version.trim();
	}

	public Integer getFitStandardId() {
		return fitStandardId;
	}

	public void setFitStandardId(Integer fitStandardId) {
		this.fitStandardId = fitStandardId;
	}

	public List<QuotaWorkerVersion> getListQuotaWorkerVersion() {
		return listQuotaWorkerVersion;
	}

	public void setListQuotaWorkerVersion(List<QuotaWorkerVersion> listQuotaWorkerVersion) {
		this.listQuotaWorkerVersion = listQuotaWorkerVersion;
	}

	public List<QuotaMaterialVersion> getListQuotaMaterialVersion() {
		return listQuotaMaterialVersion;
	}

	public void setListQuotaMaterialVersion(List<QuotaMaterialVersion> listQuotaMaterialVersion) {
		this.listQuotaMaterialVersion = listQuotaMaterialVersion;
	}

	public List<QuotaMachineVersion> getListQuotaMachineVersion() {
		return listQuotaMachineVersion;
	}

	public void setListQuotaMachineVersion(List<QuotaMachineVersion> listQuotaMachineVersion) {
		this.listQuotaMachineVersion = listQuotaMachineVersion;
	}

	public int getOldPhase() {
		return oldPhase;
	}

	public void setOldPhase(int oldPhase) {
		this.oldPhase = oldPhase;
	}

	public int getOldSequence() {
		return oldSequence;
	}

	public void setOldSequence(int oldSequence) {
		this.oldSequence = oldSequence;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getMeasure() {
		return measure;
	}

	public void setMeasure(String measure) {
		this.measure = measure;
	}

	public List<FitTaskMachine> getListFitTaskMachine() {
		return listFitTaskMachine;
	}

	public void setListFitTaskMachine(List<FitTaskMachine> listFitTaskMachine) {
		this.listFitTaskMachine = listFitTaskMachine;
	}

	public List<FitTaskMaterial> getListFitTaskMaterial() {
		return listFitTaskMaterial;
	}

	public void setListFitTaskMaterial(List<FitTaskMaterial> listFitTaskMaterial) {
		this.listFitTaskMaterial = listFitTaskMaterial;
	}

	public List<FitTaskWorker> getListFitTaskWorker() {
		return listFitTaskWorker;
	}

	public void setListFitTaskWorker(List<FitTaskWorker> listFitTaskWorker) {
		this.listFitTaskWorker = listFitTaskWorker;
	}

	public List<FitTaskArea> getListFitTaskArea() {
		return listFitTaskArea;
	}

	public void setListFitTaskArea(List<FitTaskArea> listFitTaskArea) {
		this.listFitTaskArea = listFitTaskArea;
	}

	public List<FitTaskMeasure> getListFitTaskMeasure() {
		return listFitTaskMeasure;
	}

	public void setListFitTaskMeasure(List<FitTaskMeasure> listFitTaskMeasure) {
		this.listFitTaskMeasure = listFitTaskMeasure;
	}

}