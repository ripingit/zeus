package org.chaoxuan.zeus.dao;

import java.util.List;
import java.util.Map;

import org.chaoxuan.zeus.model.FitTaskMaterial;

public interface FitTaskMaterialMapper {
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
    int insert(FitTaskMaterial record);

    /**
     *
     * @param record
     */
    int insertSelective(FitTaskMaterial record);

    /**
     * 根据主键获取一条数据库记录
     *
     * @param id
     */
    FitTaskMaterial selectByPrimaryKey(Integer id);

    /**
     *
     * @param record
     */
    int updateByPrimaryKeySelective(FitTaskMaterial record);

    /**
     * 根据主键来更新数据库记录
     *
     * @param record
     */
    int updateByPrimaryKey(FitTaskMaterial record);
    
    /**
     * @author Yurnero
     * @date 2017年5月11日
     * @param list
     * @return int
     * @description 批量插入
     */
    int insertBatch(List<FitTaskMaterial> list);
    
    /**
     * @author Yurnero
     * @date 2017年5月12日
     * @param param
     * @return List<FitTaskMaterial>
     * @description TODO
     */
    List<FitTaskMaterial> findByMap(Map<String, Object> param);
    
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
     * @return List<FitTaskMaterial>
     * @description TODO
     */
    List<FitTaskMaterial> findByFitTaskId(String fitTaskId);
}
