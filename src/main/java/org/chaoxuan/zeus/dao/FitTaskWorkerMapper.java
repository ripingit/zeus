package org.chaoxuan.zeus.dao;

import java.util.List;
import java.util.Map;

import org.chaoxuan.zeus.model.FitTaskWorker;

public interface FitTaskWorkerMapper {
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
    int insert(FitTaskWorker record);

    /**
     *
     * @param record
     */
    int insertSelective(FitTaskWorker record);

    /**
     * 根据主键获取一条数据库记录
     *
     * @param id
     */
    FitTaskWorker selectByPrimaryKey(Integer id);

    /**
     *
     * @param record
     */
    int updateByPrimaryKeySelective(FitTaskWorker record);

    /**
     * 根据主键来更新数据库记录
     *
     * @param record
     */
    int updateByPrimaryKey(FitTaskWorker record);
    
    /**
     * @author Yurnero
     * @date 2017年5月11日
     * @param list
     * @return int
     * @description 批量插入
     */
    int insertBatch(List<FitTaskWorker> list);
    
    /**
     * @author Yurnero
     * @date 2017年5月12日
     * @param param
     * @return List<FitTaskWorker>
     * @description TODO
     */
    List<FitTaskWorker> findByMap(Map<String, Object> param);
    
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
     * @return List<FitTaskWorker>
     * @description TODO
     */
    List<FitTaskWorker> findByFitTaskId(String fitTaskId);
}