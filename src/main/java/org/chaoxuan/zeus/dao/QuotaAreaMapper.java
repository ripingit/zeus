package org.chaoxuan.zeus.dao;

import java.util.List;
import java.util.Map;

import org.chaoxuan.zeus.model.QuotaArea;

public interface QuotaAreaMapper {
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
    int insert(QuotaArea record);

    /**
     *
     * @param record
     */
    int insertSelective(QuotaArea record);

    /**
     * 根据主键获取一条数据库记录
     *
     * @param id
     */
    QuotaArea selectByPrimaryKey(Integer id);

    /**
     *
     * @param record
     */
    int updateByPrimaryKeySelective(QuotaArea record);

    /**
     * 根据主键来更新数据库记录
     *
     * @param record
     */
    int updateByPrimaryKey(QuotaArea record);
    
    /**
     * @author Yurnero
     * @date 2017年5月15日
     * @param param
     * @return List<QuotaArea>
     * @description TODO
     */
    List<QuotaArea> findByMap(Map<String, Object> param);
}