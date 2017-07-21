package org.chaoxuan.zeus.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.chaoxuan.zeus.dao.FitTaskMeasureMapper;
import org.chaoxuan.zeus.model.FitTaskMeasure;
import org.chaoxuan.zeus.service.FitTaskMeasureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service(value = "fitTaskMeasureService")
public class FitTaskMeasureServiceImpl implements FitTaskMeasureService {
	
	private FitTaskMeasureMapper fitTaskMeasureMapper;
	
	@Autowired
	public void setFitTaskMeasureMapper(FitTaskMeasureMapper fitTaskMeasureMapper) {
		this.fitTaskMeasureMapper = fitTaskMeasureMapper;
	}
	
	/**
	 * @author Yurnero
	 * @date 2017年5月15日
	 * @param fitTaskId
	 * @return List<FitTaskMeasure>
	 * @description TODO
	 */
	@Override
	public List<FitTaskMeasure> findByFitTaskId(Integer fitTaskId) {
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("fitTaskId", fitTaskId);
		return fitTaskMeasureMapper.findByMap(param);
	}

}
