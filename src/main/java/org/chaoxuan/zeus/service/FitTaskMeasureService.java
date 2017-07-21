package org.chaoxuan.zeus.service;

import java.util.List;

import org.chaoxuan.zeus.model.FitTaskMeasure;

public interface FitTaskMeasureService {
	
	/**
	 * @author Yurnero
	 * @date 2017年5月15日
	 * @param fitTaskId
	 * @return List<FitTaskMeasure>
	 * @description TODO
	 */
	List<FitTaskMeasure> findByFitTaskId(Integer fitTaskId);
}
