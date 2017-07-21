package org.chaoxuan.zeus.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.chaoxuan.zeus.dao.FitTaskMaterialMapper;
import org.chaoxuan.zeus.model.FitTaskMaterial;
import org.chaoxuan.zeus.service.FitTaskMaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "fitTaskMaterialService")
public class FitTaskMaterialServiceImpl implements FitTaskMaterialService {

	private FitTaskMaterialMapper fitTaskMaterialMapper;

	@Autowired
	public void setFitTaskMaterialMapper(FitTaskMaterialMapper fitTaskMaterialMapper) {
		this.fitTaskMaterialMapper = fitTaskMaterialMapper;
	}

	@Override
	public List<FitTaskMaterial> findByFitTaskId(Integer fitTaskId) {
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("fitTaskId", fitTaskId);
		return fitTaskMaterialMapper.findByMap(param);
	}

}
