package org.chaoxuan.zeus.service;

import java.util.List;

import org.chaoxuan.zeus.model.FitTaskWorker;

public interface FitTaskWorkerService {
	
	/**
	 * @author Yurnero
	 * @date 2017年5月12日
	 * @param fitTaskId
	 * @return List<FitTaskWorker>
	 * @description TODO
	 */
	List<FitTaskWorker> findByFitTaskId(Integer fitTaskId);
}
