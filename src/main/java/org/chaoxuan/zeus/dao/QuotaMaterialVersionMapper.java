package org.chaoxuan.zeus.dao;

import java.util.List;
import java.util.Map;

import org.chaoxuan.zeus.model.QuotaMaterialVersion;
import org.springframework.stereotype.Repository;


public interface QuotaMaterialVersionMapper {
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
	int insert(QuotaMaterialVersion record);

	/**
	 *
	 * @param record
	 */
	int insertSelective(QuotaMaterialVersion record);

	/**
	 * 根据主键获取一条数据库记录
	 *
	 * @param id
	 */
	QuotaMaterialVersion selectByPrimaryKey(Integer id);

	/**
	 *
	 * @param record
	 */
	int updateByPrimaryKeySelective(QuotaMaterialVersion record);

	/**
	 * 根据主键来更新数据库记录
	 *
	 * @param record
	 */
	int updateByPrimaryKey(QuotaMaterialVersion record);

	List<QuotaMaterialVersion> findByMap(Map<String, Object> param);
}