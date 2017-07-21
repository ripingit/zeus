package org.chaoxuan.zeus.dao;

import java.util.List;
import java.util.Map;

import org.chaoxuan.zeus.model.QuotaMachineVersion;

public interface QuotaMachineVersionMapper {
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
	int insert(QuotaMachineVersion record);

	/**
	 *
	 * @param record
	 */
	int insertSelective(QuotaMachineVersion record);

	/**
	 * 根据主键获取一条数据库记录
	 *
	 * @param id
	 */
	QuotaMachineVersion selectByPrimaryKey(Integer id);

	/**
	 *
	 * @param record
	 */
	int updateByPrimaryKeySelective(QuotaMachineVersion record);

	/**
	 * 根据主键来更新数据库记录
	 *
	 * @param record
	 */
	int updateByPrimaryKey(QuotaMachineVersion record);

	/**
	 * @author Yurnero
	 * @date 2017年5月17日
	 * @param param
	 * @return List<QuotaMachineVersion>
	 * @description TODO
	 */
	List<QuotaMachineVersion> findByMap(Map<String, Object> param);

	/**
	 * @author Yurnero
	 * @date 2017年5月17日
	 * @param list
	 * @return int
	 * @description 批量插入
	 */
	int insertBatch(List<QuotaMachineVersion> list);
	
	/**
	 * @author Yurnero
	 * @date 2017年5月17日
	 * @param param
	 * @return int
	 * @description 删除
	 */
	int deleteByMap(Map<String, Object> param);
	
	/**
	 * @author Yurnero
	 * @date 2017年5月17日
	 * @param quotaMachineId
	 * @return List<Integer>
	 * @description 根据机械定额 ID 获取 详细定额的 ID 集合
	 */
	List<Integer> findIdsByQuotaMachineId(Integer quotaMachineId);
}