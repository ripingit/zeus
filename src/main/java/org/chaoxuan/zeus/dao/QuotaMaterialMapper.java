package org.chaoxuan.zeus.dao;

import java.util.List;
import java.util.Map;

import org.chaoxuan.zeus.model.QuotaMaterial;

public interface QuotaMaterialMapper {
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
	int insert(QuotaMaterial record);

	/**
	 *
	 * @param record
	 */
	int insertSelective(QuotaMaterial record);

	/**
	 * 根据主键获取一条数据库记录
	 *
	 * @param id
	 */
	QuotaMaterial selectByPrimaryKey(Integer id);

	/**
	 *
	 * @param record
	 */
	int updateByPrimaryKeySelective(QuotaMaterial record);

	/**
	 *
	 * @param record
	 */
	int updateByPrimaryKeyWithBLOBs(QuotaMaterial record);

	/**
	 * 根据主键来更新数据库记录
	 *
	 * @param record
	 */
	int updateByPrimaryKey(QuotaMaterial record);

	List<QuotaMaterial> findByMap(Map<String, Object> param);
	
	List<QuotaMaterial> selectByCategoryId(Integer categoryId);

	List<QuotaMaterial> selectAll();
	
	List<QuotaMaterial> selectByArrayId(Integer[] arrayIds);
	
	QuotaMaterial selectById();
	
}