package org.chaoxuan.zeus.dao;

import java.util.List;
import java.util.Map;

import org.chaoxuan.zeus.model.FitTaskMachine;

public interface FitTaskMachineMapper {
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
    int insert(FitTaskMachine record);

    /**
     *
     * @param record
     */
    int insertSelective(FitTaskMachine record);

    /**
     * 根据主键获取一条数据库记录
     *
     * @param id
     */
    FitTaskMachine selectByPrimaryKey(Integer id);

    /**
     *
     * @param record
     */
    int updateByPrimaryKeySelective(FitTaskMachine record);

    /**
     * 根据主键来更新数据库记录
     *
     * @param record
     */
    int updateByPrimaryKey(FitTaskMachine record);
    
    /**
     * @author Yurnero
     * @date 2017年5月11日
     * @param list
     * @return int
     * @description 批量插入
     */
    int insertBatch(List<FitTaskMachine> list);
    
    /**
     * @author Yurnero
     * @date 2017年5月12日
     * @param param
     * @return List<FitTaskMachine>
     * @description TODO
     */
    List<FitTaskMachine> findByMap(Map<String, Object> param);
    
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
     * @return List<FitTaskMachine>
     * @description TODO
     */
    List<FitTaskMachine> findByFitTaskId(String fitTaskId);
}