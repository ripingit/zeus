package org.chaoxuan.zeus.model;

public class FitTaskMeasure {
	/**
	 * <pre>
	 * 
	 * 表字段 : t_fit_task_measure.id
	 * </pre>
	 */
	private Integer id;

	/**
	 * <pre>
	 * 
	 * 表字段 : t_fit_task_measure.fit_measure_id
	 * </pre>
	 */
	private Integer fitMeasureId;

	/**
	 * <pre>
	 * 
	 * 表字段 : t_fit_task_measure.fit_task_id
	 * </pre>
	 */
	private Integer fitTaskId;

	/** 其它字段 start */

	private String name;

	/** 其它字段 end */

	/**
	 * <pre>
	 * 获取：
	 * 表字段：t_fit_task_measure.id
	 * </pre>
	 *
	 * @return t_fit_task_measure.id：
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * <pre>
	 * 设置：
	 * 表字段：t_fit_task_measure.id
	 * </pre>
	 *
	 * @param id
	 *            t_fit_task_measure.id：
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * <pre>
	 * 获取：
	 * 表字段：t_fit_task_measure.fit_measure_id
	 * </pre>
	 *
	 * @return t_fit_task_measure.fit_measure_id：
	 */
	public Integer getFitMeasureId() {
		return fitMeasureId;
	}

	/**
	 * <pre>
	 * 设置：
	 * 表字段：t_fit_task_measure.fit_measure_id
	 * </pre>
	 *
	 * @param fitMeasureId
	 *            t_fit_task_measure.fit_measure_id：
	 */
	public void setFitMeasureId(Integer fitMeasureId) {
		this.fitMeasureId = fitMeasureId;
	}

	/**
	 * <pre>
	 * 获取：
	 * 表字段：t_fit_task_measure.fit_task_id
	 * </pre>
	 *
	 * @return t_fit_task_measure.fit_task_id：
	 */
	public Integer getFitTaskId() {
		return fitTaskId;
	}

	/**
	 * <pre>
	 * 设置：
	 * 表字段：t_fit_task_measure.fit_task_id
	 * </pre>
	 *
	 * @param fitTaskId
	 *            t_fit_task_measure.fit_task_id：
	 */
	public void setFitTaskId(Integer fitTaskId) {
		this.fitTaskId = fitTaskId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}