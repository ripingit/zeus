package org.chaoxuan.zeus.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.chaoxuan.zeus.dao.FitTaskAreaMapper;
import org.chaoxuan.zeus.model.FitTaskArea;
import org.chaoxuan.zeus.service.FitTaskAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "fitTaskAreaService")
public class FitTaskAreaServiceImpl implements FitTaskAreaService {

	private FitTaskAreaMapper fitTaskAreaMapper;

	@Autowired
	public void setFitTaskAreaMapper(FitTaskAreaMapper fitTaskAreaMapper) {
		this.fitTaskAreaMapper = fitTaskAreaMapper;
	}

	/**
	 * @author Yurnero
	 * @date 2017年5月15日
	 * @param fitTaskId
	 * @return List<FitTaskArea>
	 * @description TODO
	 */
	@Override
	public List<FitTaskArea> findByFitTaskId(Integer fitTaskId) {
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("fitTaskId", fitTaskId);
		return fitTaskAreaMapper.findByMap(param);
	}

}
