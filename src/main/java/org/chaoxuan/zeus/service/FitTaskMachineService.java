package org.chaoxuan.zeus.service;

import java.util.List;

import org.chaoxuan.zeus.model.FitTaskMachine;

public interface FitTaskMachineService {
	
	/**
	 * @author Yurnero
	 * @date 2017年5月12日
	 * @param fitTaskId
	 * @return List<FitTaskMachine>
	 * @description 根据 施工任务 ID 获取机械配置
	 */
	List<FitTaskMachine> findByFitTaskId(Integer fitTaskId);
	
}
