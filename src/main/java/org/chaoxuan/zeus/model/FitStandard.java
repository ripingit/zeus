package org.chaoxuan.zeus.model;

public class FitStandard {
	/**
	 * <pre>
	 * 
	 * 表字段 : t_fit_standard.id
	 * </pre>
	 */
	private Integer id;

	/**
	 * <pre>
	 * 工艺流程
	 * 表字段 : t_fit_standard.process flow
	 * </pre>
	 */
	private String processFlow;

	/**
	 * <pre>
	 * 依据规范--详细描述
	 * 表字段 : t_fit_standard.rely_standard_detail
	 * </pre>
	 */
	private String relyStandardDetail;

	/**
	 * <pre>
	 * 依据规范——附件（json形式）
	 * 表字段 : t_fit_standard.rely_standard_affix_
	 * </pre>
	 */
	private String relyStandardAffix;

	/**
	 * <pre>
	 * 适用范围——详细描述
	 * 表字段 : t_fit_standard.application_range_detail
	 * </pre>
	 */
	private String applicationRangeDetail;

	/**
	 * <pre>
	 * 适用范围——附件（json形式）
	 * 表字段 : t_fit_standard.application_range_affix
	 * </pre>
	 */
	private String applicationRangeAffix;

	/**
	 * <pre>
	 * 施工准备——详细描述
	 * 表字段 : t_fit_standard.construction_prepare_detail
	 * </pre>
	 */
	private String constructionPrepareDetail;

	/**
	 * <pre>
	 * 施工准备——附件（json形式）
	 * 表字段 : t_fit_standard.construction_prepare_affix
	 * </pre>
	 */
	private String constructionPrepareAffix;

	/**
	 * <pre>
	 * 作业条件——详细描述
	 * 表字段 : t_fit_standard.task_condition_detail
	 * </pre>
	 */
	private String taskConditionDetail;

	/**
	 * <pre>
	 * 作业条件——附件（json形式）
	 * 表字段 : t_fit_standard.task_condition_affix
	 * </pre>
	 */
	private String taskConditionAffix;

	/**
	 * <pre>
	 * 质量标准与验收——附件（json形式）
	 * 表字段 : t_fit_standard.quality_check_detail
	 * </pre>
	 */
	private String qualityCheckDetail;

	/**
	 * <pre>
	 * 质量标准与验收——附件（json形式）
	 * 表字段 : t_fit_standard.quality_check_affix
	 * </pre>
	 */
	private String qualityCheckAffix;

	/**
	 * <pre>
	 * 施工注意事项——详细描述
	 * 表字段 : t_fit_standard.attention_detail
	 * </pre>
	 */
	private String attentionDetail;

	/**
	 * <pre>
	 * 施工注意事项——附件（json形式）
	 * 表字段 : t_fit_standard.attention_affix
	 * </pre>
	 */
	private String attentionAffix;

	/**
	 * <pre>
	 * 成品保护——详细描述
	 * 表字段 : t_fit_standard.product_protection_detail
	 * </pre>
	 */
	private String productProtectionDetail;

	/**
	 * <pre>
	 * 成品保护——附件（json形式）
	 * 表字段 : t_fit_standard.product_protection_affix
	 * </pre>
	 */
	private String productProtectionAffix;

	/**
	 * <pre>
	 * 安全环保措施——详细描述
	 * 表字段 : t_fit_standard.safety_green_detail
	 * </pre>
	 */
	private String safetyGreenDetail;

	/**
	 * <pre>
	 * 安全环保措施——附件（json形式）
	 * 表字段 : t_fit_standard.safety_green_affix
	 * </pre>
	 */
	private String safetyGreenAffix;

	/**
	 * <pre>
	 * 质量自检记录表——详细描述
	 * 表字段 : t_fit_standard.selfcheck_detail
	 * </pre>
	 */
	private String selfcheckDetail;

	/**
	 * <pre>
	 * 质量自检记录表——附件（json形式）
	 * 表字段 : t_fit_standard.selfcheck_affix
	 * </pre>
	 */
	private String selfcheckAffix;

	private FitTask fitTask;

	private int fitOrderId;

	public int getFitOrderId() {
		return fitOrderId;
	}

	public void setFitOrderId(int fitOrderId) {
		this.fitOrderId = fitOrderId;
	}

	public FitTask getFitTask() {
		return fitTask;
	}

	public void setFitTask(FitTask fitTask) {
		this.fitTask = fitTask;
	}

	/**
	 * <pre>
	 * 获取：
	 * 表字段：t_fit_standard.id
	 * </pre>
	 *
	 * @return t_fit_standard.id：
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * <pre>
	 * 设置：
	 * 表字段：t_fit_standard.id
	 * </pre>
	 *
	 * @param id
	 *            t_fit_standard.id：
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * <pre>
	 * 获取：工艺流程
	 * 表字段：t_fit_standard.process flow
	 * </pre>
	 *
	 * @return t_fit_standard.process flow：工艺流程
	 */
	public String getProcessFlow() {
		return processFlow;
	}

	/**
	 * <pre>
	 * 设置：工艺流程
	 * 表字段：t_fit_standard.process flow
	 * </pre>
	 *
	 * @param processFlow
	 *            t_fit_standard.process flow：工艺流程
	 */
	public void setProcessFlow(String processFlow) {
		this.processFlow = processFlow == null ? null : processFlow.trim();
	}

	/**
	 * <pre>
	 * 获取：依据规范--详细描述
	 * 表字段：t_fit_standard.rely_standard_detail
	 * </pre>
	 *
	 * @return t_fit_standard.rely_standard_detail：依据规范--详细描述
	 */
	public String getRelyStandardDetail() {
		return relyStandardDetail;
	}

	/**
	 * <pre>
	 * 设置：依据规范--详细描述
	 * 表字段：t_fit_standard.rely_standard_detail
	 * </pre>
	 *
	 * @param relyStandardDetail
	 *            t_fit_standard.rely_standard_detail：依据规范--详细描述
	 */
	public void setRelyStandardDetail(String relyStandardDetail) {
		this.relyStandardDetail = relyStandardDetail == null ? null : relyStandardDetail.trim();
	}

	/**
	 * <pre>
	 * 获取：依据规范——附件（json形式）
	 * 表字段：t_fit_standard.rely_standard_affix_
	 * </pre>
	 *
	 * @return t_fit_standard.rely_standard_affix_：依据规范——附件（json形式）
	 */
	public String getRelyStandardAffix() {
		return relyStandardAffix;
	}

	/**
	 * <pre>
	 * 设置：依据规范——附件（json形式）
	 * 表字段：t_fit_standard.rely_standard_affix_
	 * </pre>
	 *
	 * @param relyStandardAffix
	 *            t_fit_standard.rely_standard_affix_：依据规范——附件（json形式）
	 */
	public void setRelyStandardAffix(String relyStandardAffix) {
		this.relyStandardAffix = relyStandardAffix == null ? null : relyStandardAffix.trim();
	}

	/**
	 * <pre>
	 * 获取：适用范围——详细描述
	 * 表字段：t_fit_standard.application_range_detail
	 * </pre>
	 *
	 * @return t_fit_standard.application_range_detail：适用范围——详细描述
	 */
	public String getApplicationRangeDetail() {
		return applicationRangeDetail;
	}

	/**
	 * <pre>
	 * 设置：适用范围——详细描述
	 * 表字段：t_fit_standard.application_range_detail
	 * </pre>
	 *
	 * @param applicationRangeDetail
	 *            t_fit_standard.application_range_detail：适用范围——详细描述
	 */
	public void setApplicationRangeDetail(String applicationRangeDetail) {
		this.applicationRangeDetail = applicationRangeDetail == null ? null : applicationRangeDetail.trim();
	}

	/**
	 * <pre>
	 * 获取：适用范围——附件（json形式）
	 * 表字段：t_fit_standard.application_range_affix
	 * </pre>
	 *
	 * @return t_fit_standard.application_range_affix：适用范围——附件（json形式）
	 */
	public String getApplicationRangeAffix() {
		return applicationRangeAffix;
	}

	/**
	 * <pre>
	 * 设置：适用范围——附件（json形式）
	 * 表字段：t_fit_standard.application_range_affix
	 * </pre>
	 *
	 * @param applicationRangeAffix
	 *            t_fit_standard.application_range_affix：适用范围——附件（json形式）
	 */
	public void setApplicationRangeAffix(String applicationRangeAffix) {
		this.applicationRangeAffix = applicationRangeAffix == null ? null : applicationRangeAffix.trim();
	}

	/**
	 * <pre>
	 * 获取：施工准备——详细描述
	 * 表字段：t_fit_standard.construction_prepare_detail
	 * </pre>
	 *
	 * @return t_fit_standard.construction_prepare_detail：施工准备——详细描述
	 */
	public String getConstructionPrepareDetail() {
		return constructionPrepareDetail;
	}

	/**
	 * <pre>
	 * 设置：施工准备——详细描述
	 * 表字段：t_fit_standard.construction_prepare_detail
	 * </pre>
	 *
	 * @param constructionPrepareDetail
	 *            t_fit_standard.construction_prepare_detail：施工准备——详细描述
	 */
	public void setConstructionPrepareDetail(String constructionPrepareDetail) {
		this.constructionPrepareDetail = constructionPrepareDetail == null ? null : constructionPrepareDetail.trim();
	}

	/**
	 * <pre>
	 * 获取：施工准备——附件（json形式）
	 * 表字段：t_fit_standard.construction_prepare_affix
	 * </pre>
	 *
	 * @return t_fit_standard.construction_prepare_affix：施工准备——附件（json形式）
	 */
	public String getConstructionPrepareAffix() {
		return constructionPrepareAffix;
	}

	/**
	 * <pre>
	 * 设置：施工准备——附件（json形式）
	 * 表字段：t_fit_standard.construction_prepare_affix
	 * </pre>
	 *
	 * @param constructionPrepareAffix
	 *            t_fit_standard.construction_prepare_affix：施工准备——附件（json形式）
	 */
	public void setConstructionPrepareAffix(String constructionPrepareAffix) {
		this.constructionPrepareAffix = constructionPrepareAffix == null ? null : constructionPrepareAffix.trim();
	}

	/**
	 * <pre>
	 * 获取：作业条件——详细描述
	 * 表字段：t_fit_standard.task_condition_detail
	 * </pre>
	 *
	 * @return t_fit_standard.task_condition_detail：作业条件——详细描述
	 */
	public String getTaskConditionDetail() {
		return taskConditionDetail;
	}

	/**
	 * <pre>
	 * 设置：作业条件——详细描述
	 * 表字段：t_fit_standard.task_condition_detail
	 * </pre>
	 *
	 * @param taskConditionDetail
	 *            t_fit_standard.task_condition_detail：作业条件——详细描述
	 */
	public void setTaskConditionDetail(String taskConditionDetail) {
		this.taskConditionDetail = taskConditionDetail == null ? null : taskConditionDetail.trim();
	}

	/**
	 * <pre>
	 * 获取：作业条件——附件（json形式）
	 * 表字段：t_fit_standard.task_condition_affix
	 * </pre>
	 *
	 * @return t_fit_standard.task_condition_affix：作业条件——附件（json形式）
	 */
	public String getTaskConditionAffix() {
		return taskConditionAffix;
	}

	/**
	 * <pre>
	 * 设置：作业条件——附件（json形式）
	 * 表字段：t_fit_standard.task_condition_affix
	 * </pre>
	 *
	 * @param taskConditionAffix
	 *            t_fit_standard.task_condition_affix：作业条件——附件（json形式）
	 */
	public void setTaskConditionAffix(String taskConditionAffix) {
		this.taskConditionAffix = taskConditionAffix == null ? null : taskConditionAffix.trim();
	}

	/**
	 * <pre>
	 * 获取：质量标准与验收——附件（json形式）
	 * 表字段：t_fit_standard.quality_check_detail
	 * </pre>
	 *
	 * @return t_fit_standard.quality_check_detail：质量标准与验收——附件（json形式）
	 */
	public String getQualityCheckDetail() {
		return qualityCheckDetail;
	}

	/**
	 * <pre>
	 * 设置：质量标准与验收——附件（json形式）
	 * 表字段：t_fit_standard.quality_check_detail
	 * </pre>
	 *
	 * @param qualityCheckDetail
	 *            t_fit_standard.quality_check_detail：质量标准与验收——附件（json形式）
	 */
	public void setQualityCheckDetail(String qualityCheckDetail) {
		this.qualityCheckDetail = qualityCheckDetail == null ? null : qualityCheckDetail.trim();
	}

	/**
	 * <pre>
	 * 获取：质量标准与验收——附件（json形式）
	 * 表字段：t_fit_standard.quality_check_affix
	 * </pre>
	 *
	 * @return t_fit_standard.quality_check_affix：质量标准与验收——附件（json形式）
	 */
	public String getQualityCheckAffix() {
		return qualityCheckAffix;
	}

	/**
	 * <pre>
	 * 设置：质量标准与验收——附件（json形式）
	 * 表字段：t_fit_standard.quality_check_affix
	 * </pre>
	 *
	 * @param qualityCheckAffix
	 *            t_fit_standard.quality_check_affix：质量标准与验收——附件（json形式）
	 */
	public void setQualityCheckAffix(String qualityCheckAffix) {
		this.qualityCheckAffix = qualityCheckAffix == null ? null : qualityCheckAffix.trim();
	}

	/**
	 * <pre>
	 * 获取：施工注意事项——详细描述
	 * 表字段：t_fit_standard.attention_detail
	 * </pre>
	 *
	 * @return t_fit_standard.attention_detail：施工注意事项——详细描述
	 */
	public String getAttentionDetail() {
		return attentionDetail;
	}

	/**
	 * <pre>
	 * 设置：施工注意事项——详细描述
	 * 表字段：t_fit_standard.attention_detail
	 * </pre>
	 *
	 * @param attentionDetail
	 *            t_fit_standard.attention_detail：施工注意事项——详细描述
	 */
	public void setAttentionDetail(String attentionDetail) {
		this.attentionDetail = attentionDetail == null ? null : attentionDetail.trim();
	}

	/**
	 * <pre>
	 * 获取：施工注意事项——附件（json形式）
	 * 表字段：t_fit_standard.attention_affix
	 * </pre>
	 *
	 * @return t_fit_standard.attention_affix：施工注意事项——附件（json形式）
	 */
	public String getAttentionAffix() {
		return attentionAffix;
	}

	/**
	 * <pre>
	 * 设置：施工注意事项——附件（json形式）
	 * 表字段：t_fit_standard.attention_affix
	 * </pre>
	 *
	 * @param attentionAffix
	 *            t_fit_standard.attention_affix：施工注意事项——附件（json形式）
	 */
	public void setAttentionAffix(String attentionAffix) {
		this.attentionAffix = attentionAffix == null ? null : attentionAffix.trim();
	}

	/**
	 * <pre>
	 * 获取：成品保护——详细描述
	 * 表字段：t_fit_standard.product_protection_detail
	 * </pre>
	 *
	 * @return t_fit_standard.product_protection_detail：成品保护——详细描述
	 */
	public String getProductProtectionDetail() {
		return productProtectionDetail;
	}

	/**
	 * <pre>
	 * 设置：成品保护——详细描述
	 * 表字段：t_fit_standard.product_protection_detail
	 * </pre>
	 *
	 * @param productProtectionDetail
	 *            t_fit_standard.product_protection_detail：成品保护——详细描述
	 */
	public void setProductProtectionDetail(String productProtectionDetail) {
		this.productProtectionDetail = productProtectionDetail == null ? null : productProtectionDetail.trim();
	}

	/**
	 * <pre>
	 * 获取：成品保护——附件（json形式）
	 * 表字段：t_fit_standard.product_protection_affix
	 * </pre>
	 *
	 * @return t_fit_standard.product_protection_affix：成品保护——附件（json形式）
	 */
	public String getProductProtectionAffix() {
		return productProtectionAffix;
	}

	/**
	 * <pre>
	 * 设置：成品保护——附件（json形式）
	 * 表字段：t_fit_standard.product_protection_affix
	 * </pre>
	 *
	 * @param productProtectionAffix
	 *            t_fit_standard.product_protection_affix：成品保护——附件（json形式）
	 */
	public void setProductProtectionAffix(String productProtectionAffix) {
		this.productProtectionAffix = productProtectionAffix == null ? null : productProtectionAffix.trim();
	}

	/**
	 * <pre>
	 * 获取：安全环保措施——详细描述
	 * 表字段：t_fit_standard.safety_green_detail
	 * </pre>
	 *
	 * @return t_fit_standard.safety_green_detail：安全环保措施——详细描述
	 */
	public String getSafetyGreenDetail() {
		return safetyGreenDetail;
	}

	/**
	 * <pre>
	 * 设置：安全环保措施——详细描述
	 * 表字段：t_fit_standard.safety_green_detail
	 * </pre>
	 *
	 * @param safetyGreenDetail
	 *            t_fit_standard.safety_green_detail：安全环保措施——详细描述
	 */
	public void setSafetyGreenDetail(String safetyGreenDetail) {
		this.safetyGreenDetail = safetyGreenDetail == null ? null : safetyGreenDetail.trim();
	}

	/**
	 * <pre>
	 * 获取：安全环保措施——附件（json形式）
	 * 表字段：t_fit_standard.safety_green_affix
	 * </pre>
	 *
	 * @return t_fit_standard.safety_green_affix：安全环保措施——附件（json形式）
	 */
	public String getSafetyGreenAffix() {
		return safetyGreenAffix;
	}

	/**
	 * <pre>
	 * 设置：安全环保措施——附件（json形式）
	 * 表字段：t_fit_standard.safety_green_affix
	 * </pre>
	 *
	 * @param safetyGreenAffix
	 *            t_fit_standard.safety_green_affix：安全环保措施——附件（json形式）
	 */
	public void setSafetyGreenAffix(String safetyGreenAffix) {
		this.safetyGreenAffix = safetyGreenAffix == null ? null : safetyGreenAffix.trim();
	}

	/**
	 * <pre>
	 * 获取：质量自检记录表——详细描述
	 * 表字段：t_fit_standard.selfcheck_detail
	 * </pre>
	 *
	 * @return t_fit_standard.selfcheck_detail：质量自检记录表——详细描述
	 */
	public String getSelfcheckDetail() {
		return selfcheckDetail;
	}

	/**
	 * <pre>
	 * 设置：质量自检记录表——详细描述
	 * 表字段：t_fit_standard.selfcheck_detail
	 * </pre>
	 *
	 * @param selfcheckDetail
	 *            t_fit_standard.selfcheck_detail：质量自检记录表——详细描述
	 */
	public void setSelfcheckDetail(String selfcheckDetail) {
		this.selfcheckDetail = selfcheckDetail == null ? null : selfcheckDetail.trim();
	}

	/**
	 * <pre>
	 * 获取：质量自检记录表——附件（json形式）
	 * 表字段：t_fit_standard.selfcheck_affix
	 * </pre>
	 *
	 * @return t_fit_standard.selfcheck_affix：质量自检记录表——附件（json形式）
	 */
	public String getSelfcheckAffix() {
		return selfcheckAffix;
	}

	/**
	 * <pre>
	 * 设置：质量自检记录表——附件（json形式）
	 * 表字段：t_fit_standard.selfcheck_affix
	 * </pre>
	 *
	 * @param selfcheckAffix
	 *            t_fit_standard.selfcheck_affix：质量自检记录表——附件（json形式）
	 */
	public void setSelfcheckAffix(String selfcheckAffix) {
		this.selfcheckAffix = selfcheckAffix == null ? null : selfcheckAffix.trim();
	}
}