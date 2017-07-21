package org.chaoxuan.zeus.dao;

import java.util.List;
import java.util.Map;

import org.chaoxuan.zeus.model.FitTaskArea;

public interface FitTaskAreaMapper {
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
    int insert(FitTaskArea record);

    /**
     *
     * @param record
     */
    int insertSelective(FitTaskArea record);

    /**
     * 根据主键获取一条数据库记录
     *
     * @param id
     */
    FitTaskArea selectByPrimaryKey(Integer id);

    /**
     *
     * @param record
     */
    int updateByPrimaryKeySelective(FitTaskArea record);

    /**
     * 根据主键来更新数据库记录
     *
     * @param record
     */
    int updateByPrimaryKey(FitTaskArea record);
    
    /**
     * @author Yurnero
     * @date 2017年5月15日
     * @param list
     * @return int
     * @description 批量插入
     */
    int insertBatch(List<FitTaskArea> list);
    
    /**
     * @author Yurnero
     * @date 2017年5月12日
     * @param param
     * @return List<FitTaskArea>
     * @description TODO
     */
    List<FitTaskArea> findByMap(Map<String, Object> param);
    
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
     * @return List<FitTaskArea>
     * @description TODO
     */
    List<FitTaskArea> findByFitTaskId(String fitTaskId);
}