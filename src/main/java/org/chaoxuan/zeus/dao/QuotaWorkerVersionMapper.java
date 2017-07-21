package org.chaoxuan.zeus.dao;

import java.util.List;
import java.util.Map;

import org.chaoxuan.zeus.model.QuotaWorkerVersion;


public interface QuotaWorkerVersionMapper {
	/**
	 * 根据主键删除数据库的记录
	 *
	 * @param id
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * 插入数据库记录
	 *
	 * @param record
	 */
	int insert(QuotaWorkerVersion record);

	/**
	 *
	 * @param record
	 */
	int insertSelective(QuotaWorkerVersion record);

	/**
	 * 根据主键获取一条数据库记录
	 *
	 * @param id
	 */
	QuotaWorkerVersion selectByPrimaryKey(Integer id);

	/**
	 *
	 * @param record
	 */
	int updateByPrimaryKeySelective(QuotaWorkerVersion record);

	/**
	 * 根据主键来更新数据库记录
	 *
	 * @param record
	 */
	int updateByPrimaryKey(QuotaWorkerVersion record);
	
	/**
	 * @author Yurnero
	 * @date 2017年5月17日
	 * @param param
	 * @return List<QuotaWorkerVersion>
	 * @description TODO
	 */
	List<QuotaWorkerVersion> findByMap(Map<String, Object> param);
	
	/**
	 * @author Yurnero
	 * @date 2017年5月17日
	 * @param list
	 * @return int
	 * @description 批量插入
	 */
	int insertBatch(List<QuotaWorkerVersion> list);
	
	/**
	 * @author Yurnero
	 * @date 2017年5月17日
	 * @param param
	 * @return int
	 * @description TODO
	 */
	int deleteByMap(Map<String, Object> param);
	
	/**
	 * @author Yurnero
	 * @date 2017年5月17日
	 * @param quotaWorkerId
	 * @return List<Integer>
	 * @description TODO
	 */
	List<Integer> findIdsByQuotaWorkerId(Integer quotaWorkerId);
}