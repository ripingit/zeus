package org.chaoxuan.zeus.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.chaoxuan.commons.pojo.PGResults;
import org.chaoxuan.zeus.dao.FitMeassageMapper;
import org.chaoxuan.zeus.dao.MeasureOrderMapper;
import org.chaoxuan.zeus.model.*;
import org.chaoxuan.zeus.service.FitMeassageService;
import org.chaoxuan.zeus.service.MeasureOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FitMeassageServiceImpl implements FitMeassageService {

	@Autowired
	private FitMeassageMapper fitMapper;

	@Override
	public List<FitMeassage> getMeassage(Integer status) {
		return fitMapper.getMeassage(status);
	}

	@Override
	public List<FitMeassage> getMeassageList() {
		return fitMapper.getMeassageList();
	}
}
