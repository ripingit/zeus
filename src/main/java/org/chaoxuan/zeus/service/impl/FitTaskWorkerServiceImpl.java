package org.chaoxuan.zeus.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.chaoxuan.zeus.dao.FitTaskWorkerMapper;
import org.chaoxuan.zeus.model.FitTaskWorker;
import org.chaoxuan.zeus.service.FitTaskWorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "fitTaskWorkerService")
public class FitTaskWorkerServiceImpl implements FitTaskWorkerService {

	private FitTaskWorkerMapper FitTaskWorkerMapper;

	@Autowired
	public void setFitTaskWorkerMapper(FitTaskWorkerMapper fitTaskWorkerMapper) {
		FitTaskWorkerMapper = fitTaskWorkerMapper;
	}

	@Override
	public List<FitTaskWorker> findByFitTaskId(Integer fitTaskId) {
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("fitTaskId", fitTaskId);
		return FitTaskWorkerMapper.findByMap(param);
	}

}
