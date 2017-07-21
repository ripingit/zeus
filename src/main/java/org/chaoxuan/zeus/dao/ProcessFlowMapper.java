package org.chaoxuan.zeus.dao;

import org.chaoxuan.zeus.model.ProcessFlow;
import org.chaoxuan.zeus.model.ProcessFlowWithBLOBs;

import java.util.List;
import java.util.Map;

public interface ProcessFlowMapper {
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
    int insert(ProcessFlowWithBLOBs record);

    /**
     * @param record
     */
    int insertSelective(ProcessFlowWithBLOBs record);

    /**
     * 根据主键获取一条数据库记录
     *
     * @param id
     */
    ProcessFlowWithBLOBs selectByPrimaryKey(Integer id);

    /**
     * @param record
     */
    int updateByPrimaryKeySelective(ProcessFlowWithBLOBs record);

    /**
     * @param record
     */
    int updateByPrimaryKeyWithBLOBs(ProcessFlowWithBLOBs record);

    /**
     * 根据主键来更新数据库记录
     *
     * @param record
     */
    int updateByPrimaryKey(ProcessFlow record);

    /**
     * @param [list]
     * @author Yurnero
     * @date 2017/6/27
     * @description 批量插入
     */
    int insertBatch(List<ProcessFlowWithBLOBs> list);

    List<ProcessFlowWithBLOBs> find(Map<String, Object> param);
}