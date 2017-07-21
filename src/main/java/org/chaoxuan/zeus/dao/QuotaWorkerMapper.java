package org.chaoxuan.zeus.dao;

import java.util.List;
import java.util.Map;

import org.chaoxuan.zeus.model.QuotaWorker;

public interface QuotaWorkerMapper {

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
	int insert(QuotaWorker record);

	/**
	 *
	 * @param record
	 */
	int insertSelective(QuotaWorker record);

	/**
	 * 根据主键获取一条数据库记录
	 *
	 * @param id
	 */
	QuotaWorker selectByPrimaryKey(Integer id);

	/**
	 *
	 * @param record
	 */
	int updateByPrimaryKeySelective(QuotaWorker record);

	/**
	 *
	 * @param record
	 */
	int updateByPrimaryKeyWithBLOBs(QuotaWorker record);

	/**
	 * 根据主键来更新数据库记录
	 *
	 * @param record
	 */
	int updateByPrimaryKey(QuotaWorker record);

	// 根据分类id查询对应的工种（Json）
	List<QuotaWorker> selectByCategoryId(Integer categoryId);
	
	// 查询所有的工种 根据categoryId排序
	List<QuotaWorker> selectAll();
	
	//根据数组查询
	List<QuotaWorker> selectByArrayId(Integer[] arrayIds);
	
	/**
	 * @author Yurnero
	 * @date 2017年4月27日
	 * @param param
	 * @return List<QuotaWorker>
	 * @description TODO
	 */
	List<QuotaWorker> findByMap(Map<String, Object> param);
}