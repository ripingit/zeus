package org.chaoxuan.zeus.dao;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.chaoxuan.zeus.model.FitTask;

public interface FitTaskMapper {

	/**
	 * 插入数据库记录 添加一条任务
	 * 
	 * @param record
	 */
	void insert(FitTask record);

	// 获取一个版本的最大阶段
	Integer selectOneVersionMaxPhase(String version);

	// 获取一个阶段下的最大任务
	Integer selectOnePhaseMaxSequence(Integer phase);

	// 获取所有大于等于的次序方法
	List<FitTask> selectOnePhaseBackTask(@Param("phase") Integer phase, @Param("sequence") Integer sequence);

	// 修改后边任务
	int updateByPrimaryKeySelective(FitTask record);


	// 修改任务
	int updateByPrimaryKey(FitTask record);

	// 根据版本、阶段查询对应的施工任务
	List<FitTask> selectTaskByVersionAndPhase(@Param("version") String version, @Param("phase") Integer phase);

	/**
	 * 根据主键删除数据库的记录
	 *
	 * @param id
	 */
	void deleteById(Integer id);

	/**
	 *
	 * @param record
	 */
	int insertSelective(FitTask record);

	/**
	 * 根据主键获取一条数据库记录
	 *
	 * @param id
	 */
	FitTask selectByPrimaryKey(Integer id);

	List<FitTask> selectBy(FitTask fitTask);

	List<FitTask> findByMap(Map<String, Object> param);

	List<Integer> queryPhaseListByVersion(String version);

	// 查找每个阶段的任务
	List<FitTask> searchByVersionAndPhase(FitTask fitTask);

	/**
	 * @author Yurnero
	 * @date 2017年5月5日
	 * @param version
	 * @return int
	 * @description 根据当前版本查询阶段个数
	 */
	int getCountPhaseByVersion(String version);

	/**
	 * @author Yurnero
	 * @date 2017年5月5日
	 * @param param
	 * @return int
	 * @description 查找当前版本当前阶段下的次序个数
	 */
	int getCountSequenceByVersionAndPhase(Map<String, Object> param);

	List<Integer> querySequenceListBy(FitTask fitTask);

	/**
	 * @author Yurnero
	 * @date 2017年5月8日
	 * @param param
	 * @return int
	 * @description 根据当前版本当前阶段获取实际阶段
	 */
	int getActualPhaseByVersionAndPhase(Map<String, Object> param);

	/**
	 * @author Yurnero
	 * @date 2017年5月8日
	 * @param param
	 * @return int
	 * @description 根据当前版本当前阶段当前次序获取实际次序
	 */
	int getActualSequenceByVersionAndPhaseAndSequence(Map<String, Object> param);
	
	/**
	 * @author Yurnero
	 * @date 2017年5月11日
	 * @param param
	 * @return int
	 * @description 根据当前版本当前阶段更新阶段
	 */
	int updatePhaseByVersionAndPhase(Map<String, Object> param);
	
	/**
	 * @author Yurnero
	 * @date 2017年5月11日
	 * @param param
	 * @return int
	 * @description 根据当前版本当前阶段当前次序更新次序
	 */
	int updateSequenceByVersionAndPhaseAndSequence(Map<String, Object> param);
	
	/**
	 * @author Yurnero
	 * @date 2017年5月16日
	 * @param param
	 * @return List<FitTask>
	 * @description 查询任务及其相关配置信息
	 */
	List<FitTask> findFitTaskAndConfigure(Map<String, Object> param);

	List<FitTask> searchByIds(int [] ids);
	List<FitTask> list();
	void insertBatch(List<FitTask> tasks);
}