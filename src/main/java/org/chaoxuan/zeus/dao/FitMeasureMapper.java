package org.chaoxuan.zeus.dao;

import java.util.List;
import java.util.Map;

import org.chaoxuan.zeus.model.FitMeasure;

public interface FitMeasureMapper {
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
    int insert(FitMeasure record);

    /**
     *
     * @param record
     */
    int insertSelective(FitMeasure record);

    /**
     * 根据主键获取一条数据库记录
     *
     * @param id
     */
    FitMeasure selectByPrimaryKey(Integer id);

    /**
     *
     * @param record
     */
    int updateByPrimaryKeySelective(FitMeasure record);

    /**
     * 根据主键来更新数据库记录
     *
     * @param record
     */
    int updateByPrimaryKey(FitMeasure record);
    
    /**
     * @author Yurnero
     * @date 2017年5月15日
     * @param param
     * @return List<FitMeasure>
     * @description TODO
     */
    List<FitMeasure> findByMap(Map<String, Object> param);
}