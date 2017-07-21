package org.chaoxuan.zeus.dao;

import java.util.List;
import java.util.Map;

import org.chaoxuan.zeus.model.QuotaMachine;

public interface QuotaMachineMapper {
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
	int insert(QuotaMachine record);

	/**
	 *
	 * @param record
	 */
	int insertSelective(QuotaMachine record);

	/**
	 * 根据主键获取一条数据库记录
	 *
	 * @param id
	 */
	QuotaMachine selectByPrimaryKey(Integer id);

	/**
	 *
	 * @param record
	 */
	int updateByPrimaryKeySelective(QuotaMachine record);


	/**
	 * 根据主键来更新数据库记录
	 *
	 * @param record
	 */
	int updateByPrimaryKey(QuotaMachine record);

	/**
	 * @author Yurnero
	 * @date 2017年4月26日
	 * @param param
	 * @return List<QuotaMachine>
	 * @description TODO
	 */
	List<QuotaMachine> findByMap(Map<String, Object> param);
	//通过种类id查询
	List<QuotaMachine> selectByCategoryId(Integer categoryId);
	//查询所有
	List<QuotaMachine> selectAll();
	//通过每个任务对应的机械id查询
	List<QuotaMachine> selectByArrayId(Integer[] arrayIds);
	//通过id查询
	QuotaMachine selectById(Integer id);
}