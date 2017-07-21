package org.chaoxuan.zeus.service;

import java.util.List;

import org.chaoxuan.zeus.model.FitTaskArea;

public interface FitTaskAreaService {
	
	/**
	 * @author Yurnero
	 * @date 2017年5月15日
	 * @param fitTaskId
	 * @return List<FitTaskArea>
	 * @description TODO
	 */
	List<FitTaskArea> findByFitTaskId(Integer fitTaskId);
}
