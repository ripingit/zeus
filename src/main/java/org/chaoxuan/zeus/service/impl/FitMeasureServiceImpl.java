package org.chaoxuan.zeus.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.chaoxuan.zeus.dao.FitMeasureMapper;
import org.chaoxuan.zeus.model.FitMeasure;
import org.chaoxuan.zeus.service.FitMeasureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "fitMeasureService")
public class FitMeasureServiceImpl implements FitMeasureService {

	private FitMeasureMapper fitMeasureMapper;

	@Autowired
	public void setFitMeasureMapper(FitMeasureMapper fitMeasureMapper) {
		this.fitMeasureMapper = fitMeasureMapper;
	}

	@Override
	public List<FitMeasure> list() {
		Map<String, Object> param = new HashMap<String, Object>();
		return fitMeasureMapper.findByMap(param);
	}

}
