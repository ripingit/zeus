package org.chaoxuan.zeus.dao;

import java.util.List;

import org.chaoxuan.zeus.model.FitManager;
import org.chaoxuan.zeus.model.MeasureOrder;
import org.chaoxuan.zeus.model.MeasureOrderExtend;
import org.chaoxuan.zeus.model.OwnerInfo;

public interface MeasureOrderMapper {
  // 根据条件查询测量订单
	List<MeasureOrderExtend> getMeasureOrder(MeasureOrderExtend measureOrder);
	
	//根据id查询待测量订单详情及业主信息和其家庭信息
	MeasureOrder getMeasureOrderDesc(Integer id);
	   
	//跟据id查询其任务信息
	OwnerInfo getMeasureOrderLog(Integer id);
	
	//修改上门测量时间
	public void updateMeasure(MeasureOrder measureOrder);
	
	//获取所有管家信息
	List<FitManager> getManager(FitManager fitManager);
	 
	//更换管家
	void updateManager(MeasureOrder measureOrder);

	int insertSelective(MeasureOrder record);
}
