package org.chaoxuan.zeus.service;

import org.chaoxuan.zeus.model.FitTask;

import java.util.List;
import java.util.Map;

public interface FitTaskService {

	/**
	 * @author Yurnero
	 * @date 2017年5月15日
	 * @param id
	 * @return FitTask
	 * @description TODO
	 */
	FitTask getById(int id);

	/**
	 * @author Yurnero
	 * @date 2017年5月5日
	 * @param version
	 * @return List<BigDecimal>
	 * @description 根据当前版本查询阶段个数
	 */
	List<Integer> getCountPhaseByVersion(String version);

	/**
	  * @author Yurnero
	  * @date 2017/5/26
	  * @param [id, fitStandardId]
	  * @description todo
	  */
	void remove(Integer id, Integer fitStandardId);

	/**
	 * @author Yurnero
	 * @date 2017年5月5日
	 * @param version
	 * @param phase
	 * @return List<BigDecimal>
	 * @description 根据当前版本当前阶段查询次序数
	 */
	List<Integer> getCountSequenceByVersionAndPhase(String version, Integer phase);

	/**
	 * @author Yurnero
	 * @date 2017年5月8日
	 * @param id
	 * @return FitTask
	 * @description 根据 ID 获取 FitTask 并获取实际的阶段和次序
	 */
	FitTask getByIdWithActualPhaseAndSequence(int id);
	
	/**
	 * @author Yurnero
	 * @date 2017年5月16日
	 * @param verion
	 * @return List<FitTask>
	 * @description 查询任务及其相关配置信息
	 */
	List<FitTask> findFitTaskAndConfigure(String verion);

	/**
	  * @author Yurnero
	  * @date 2017/6/12
	  * @param [fitRuleId]
	  * @description 根据装修规则 ID 查询装修任务
	  */
	List<FitTask> findByFitRuleId(Integer fitRuleId);

	// 条件查询任务
	List<FitTask> queryFitTaskBy(FitTask fitTask);

	// 显示任务中的工人定额，机械定额，材料定额信息
	List<FitTask> getFitTaskInfoBy(FitTask fitTask);

	// 编辑任务
	int editFitTask(FitTask fitTask);
	//查找每个版本任务
	List<FitTask> searchByVersion(String version);
	// 查找每个阶段的任务
	List<FitTask> searchByVersionAndPhase(FitTask fitTask);
	/*
	增加任务
	 */
	void createFitTask(FitTask fitTask);
	// 返回按照施工顺序分类的map
	Map<String, List<FitTask>> getSequenceMap(FitTask fitTask);

	// 返回按照施工顺序分类的list
	public List<Map<String, Object>> getSequenceList(FitTask fitTask);

	List<FitTask> searchByIds(String ids);

	void batchInsert(List<FitTask> tasks);

	List<FitTask> list();

}
