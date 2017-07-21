package org.chaoxuan.zeus.service;

import org.chaoxuan.zeus.model.ProcessFlowWithBLOBs;

import java.util.List;

/**
 * @author Yurnero
 * @data 2017/6/29
 * @description TODO
 */
public interface ProcessFlowService {

    List<ProcessFlowWithBLOBs> list(Integer fitTaskId);

    List<ProcessFlowWithBLOBs> list(Integer fitTaskId, Integer workerTaskId);

    ProcessFlowWithBLOBs get(Integer id);
}
