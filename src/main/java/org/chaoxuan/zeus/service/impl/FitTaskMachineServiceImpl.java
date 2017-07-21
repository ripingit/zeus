package org.chaoxuan.zeus.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.chaoxuan.zeus.dao.FitTaskMachineMapper;
import org.chaoxuan.zeus.model.FitTaskMachine;
import org.chaoxuan.zeus.service.FitTaskMachineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "fitTaskMachineService")
public class FitTaskMachineServiceImpl implements FitTaskMachineService {

	private FitTaskMachineMapper fitTaskMachineMapper;

	@Autowired
	public void setFitTaskMachineMapper(FitTaskMachineMapper fitTaskMachineMapper) {
		this.fitTaskMachineMapper = fitTaskMachineMapper;
	}

	@Override
	public List<FitTaskMachine> findByFitTaskId(Integer fitTaskId) {
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("fitTaskId", fitTaskId);
		return fitTaskMachineMapper.findByMap(param);
	}

}
