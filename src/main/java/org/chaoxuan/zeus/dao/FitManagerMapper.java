package org.chaoxuan.zeus.dao;

import org.chaoxuan.zeus.model.FitManager;
import org.chaoxuan.zeus.model.OwnerInfo;

import java.util.List;
import java.util.Map;

public interface FitManagerMapper {
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
    int insert(FitManager record);


    /**
     * 根据主键获取一条数据库记录
     *
     * @param id
     */
    FitManager selectByPrimaryKey(Integer id);

    /**
     *
     * @param record
     */
    int updateByPrimaryKeySelective(FitManager record);

    /**
     * 根据主键来更新数据库记录
     *
     * @param record
     */
    int updateByPrimaryKey(FitManager record);

    FitManager getFitManagerByOrderId(int orderId);

    List<FitManager> login(Map<String, Object> param);

    int insertSelective(FitManager fitManager);

    FitManager getIdByMobile(FitManager fitManager);

    List<FitManager> searchByArea(String area);

}