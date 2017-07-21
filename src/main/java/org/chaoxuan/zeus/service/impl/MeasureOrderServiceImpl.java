package org.chaoxuan.zeus.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.chaoxuan.commons.pojo.PGResults;
import org.chaoxuan.zeus.dao.MeasureOrderMapper;
import org.chaoxuan.zeus.model.FitManager;
import org.chaoxuan.zeus.model.MeasureOrder;
import org.chaoxuan.zeus.model.MeasureOrderExtend;
import org.chaoxuan.zeus.model.OwnerInfo;
import org.chaoxuan.zeus.service.MeasureOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class MeasureOrderServiceImpl implements MeasureOrderService{

	@Autowired
	private MeasureOrderMapper mapper;

	@Override
	public PGResults getMeasureOrder(Integer page, Integer rows, MeasureOrderExtend extend) {
		// TODO Auto-generated method stub
		PageHelper.startPage(page, rows);

		if (extend.getSigStartDate()!=null){
			String d = new SimpleDateFormat("yyyy-MM-dd").format(extend.getSigStartDate());
			extend.setSigStartDate(java.sql.Date.valueOf(d));
		}
		if (extend.getSigEndDate()!=null){
			String d = new SimpleDateFormat("yyyy-MM-dd").format(extend.getSigEndDate());
			extend.setSigEndDate(java.sql.Date.valueOf(d));
		}
		if (extend.getFinStartDate()!=null){
			String d = new SimpleDateFormat("yyyy-MM-dd").format(extend.getFinStartDate());
			extend.setFinStartDate(java.sql.Date.valueOf(d));
		}
		if (extend.getFinEndDate()!=null){
			String d = new SimpleDateFormat("yyyy-MM-dd").format(extend.getFinEndDate());
			extend.setFinEndDate(java.sql.Date.valueOf(d));
		}

		List<MeasureOrderExtend> measure = mapper.getMeasureOrder(extend);
		PGResults result = new PGResults();
		result.setRows(measure);
		PageInfo<MeasureOrderExtend> info = new PageInfo(measure);
		//查询总页数
		long pages = info.getPages();
		result.setPages(pages);
		return result;
	}

	@Override
	public MeasureOrder getMeasureOrderDesc(Integer id) {
		// TODO Auto-generated method stub
		return mapper.getMeasureOrderDesc(id);
	}

	@Override
	public OwnerInfo getMeasureOrderLog(Integer id) {
		// TODO Auto-generated method stub
		return mapper.getMeasureOrderLog(id);
	}

	@Override
	public void updateMeasure(MeasureOrder measureOrder) {
		// TODO Auto-generated method stub
		mapper.updateMeasure(measureOrder);
	}

	@Override
	public List<FitManager> getManager(FitManager fitManager) {
		// TODO Auto-generated method stub
		return mapper.getManager(fitManager);
	}

	@Override
	public void create(MeasureOrder measureOrder) {
		measureOrder.setCreateTime(new Date());
		mapper.insertSelective(measureOrder);
	}

	@Override
	public void updateManager(MeasureOrder measureOrder) {
		// TODO Auto-generated method stub
		mapper.updateManager(measureOrder);
	}


}
