package org.chaoxuan.zeus.dao;

import java.util.List;
import java.util.Map;

import org.chaoxuan.zeus.model.FitStandard;

public interface FitStandardMapper {
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
    int insert(FitStandard record);

    /**
     *
     * @param record
     */
    int insertSelective(FitStandard record);

    /**
     * 根据主键获取一条数据库记录
     *
     * @param id
     */
    FitStandard selectByPrimaryKey(Integer id);

    /**
     *
     * @param record
     */
    int updateByPrimaryKeySelective(FitStandard record);

    /**
     *
     * @param record
     */
    int updateByPrimaryKeyWithBLOBs(FitStandard record);
    
    List<FitStandard> findByMap(Map<String, Object> param);
}