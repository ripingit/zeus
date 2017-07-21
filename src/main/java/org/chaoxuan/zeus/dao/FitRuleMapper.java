package org.chaoxuan.zeus.dao;

import java.io.Serializable;
import java.util.List;

import org.chaoxuan.zeus.model.FitRule;
import org.springframework.stereotype.Repository;

public interface FitRuleMapper{
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
    int insert(FitRule record);

    /**
     *
     * @param record
     */
    int insertSelective(FitRule record);

    /**
     * 根据主键获取一条数据库记录
     *
     * @param id
     */
    FitRule selectByPrimaryKey(Integer id);

    /**
     *
     * @param record
     */
    int updateByPrimaryKeySelective(FitRule record);

    /**
     * 根据主键来更新数据库记录
     *
     * @param record
     */
    int updateByPrimaryKey(FitRule record);
    /**
     * 查找符合条件的记录
     */
    List<FitRule> queryBy(FitRule fitRule);

    List<FitRule> list();
}