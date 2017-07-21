package org.chaoxuan.zeus.service;

import java.util.List;

import org.chaoxuan.commons.pojo.PGResults;
import org.chaoxuan.zeus.model.FitManager;
import org.chaoxuan.zeus.model.MeasureOrder;
import org.chaoxuan.zeus.model.MeasureOrderExtend;
import org.chaoxuan.zeus.model.OwnerInfo;
import org.chaoxuan.zeus.model.OwnerInfoExtend;

public interface MeasureOrderService {
	PGResults getMeasureOrder(Integer page, Integer rows, MeasureOrderExtend extend);
	
	
	//根据id查询测量订单详情及业主信息和其家庭信息
	MeasureOrder getMeasureOrderDesc(Integer id);
	
	OwnerInfo getMeasureOrderLog(Integer id);
	
	public void updateMeasure(MeasureOrder measureOrder);

	
	void updateManager(MeasureOrder measureOrder);


	List<FitManager> getManager(FitManager fitManager);

	void create(MeasureOrder measureOrder);
}
