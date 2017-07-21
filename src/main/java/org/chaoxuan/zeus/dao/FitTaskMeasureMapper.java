package org.chaoxuan.zeus.dao;

import java.util.List;
import java.util.Map;

import org.chaoxuan.zeus.model.FitTaskMeasure;

public interface FitTaskMeasureMapper {
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
    int insert(FitTaskMeasure record);

    /**
     *
     * @param record
     */
    int insertSelective(FitTaskMeasure record);

    /**
     * 根据主键获取一条数据库记录
     *
     * @param id
     */
    FitTaskMeasure selectByPrimaryKey(Integer id);

    /**
     *
     * @param record
     */
    int updateByPrimaryKeySelective(FitTaskMeasure record);

    /**
     * 根据主键来更新数据库记录
     *
     * @param record
     */
    int updateByPrimaryKey(FitTaskMeasure record);
    
    /**
     * @author Yurnero
     * @date 2017年5月15日
     * @param list
     * @return int
     * @description 批量插入
     */
    int insertBatch(List<FitTaskMeasure> list);
    
    /**
     * @author Yurnero
     * @date 2017年5月12日
     * @param param
     * @return List<FitTaskMeasure>
     * @description TODO
     */
    List<FitTaskMeasure> findByMap(Map<String, Object> param);
    
    /**
     * @author Yurnero
     * @date 2017年5月12日
     * @param param
     * @return int
     * @description TODO
     */
    int deleteByMap(Map<String, Object> param);
    
    /**
     * @author Yurnero
     * @date 2017年5月16日
     * @param fitTaskId
     * @return List<FitTaskMeasure>
     * @description TODO
     */
    List<FitTaskMeasure> findByFitTaskId(String fitTaskId);
}