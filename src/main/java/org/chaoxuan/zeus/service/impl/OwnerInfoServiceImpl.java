package org.chaoxuan.zeus.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.chaoxuan.commons.pojo.PGResults;
import org.chaoxuan.zeus.dao.OwnerInfoMapper;
import org.chaoxuan.zeus.model.*;
import org.chaoxuan.zeus.service.OwnerInfoService;
import org.chaoxuan.zeus.util.Encrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class OwnerInfoServiceImpl implements OwnerInfoService{

	@Autowired
	private OwnerInfoMapper mapper;


	@Override
	public PGResults getOwnerInfo(Integer page, Integer rows, OwnerInfoExtend extend) {
		// TODO Auto-generated method stub

		//执行查询，并分页
		//分页处理
		PageHelper.startPage(page, rows);

		if (extend.getStartTime()!=null){
			String d = new SimpleDateFormat("yyyy-MM-dd").format(extend.getStartTime());
			extend.setStartTime(java.sql.Date.valueOf(d));
		}
		if (extend.getEndTime()!=null){
			String d = new SimpleDateFormat("yyyy-MM-dd").format(extend.getEndTime());
			extend.setEndTime(java.sql.Date.valueOf(d));
		}
		List<OwnerInfo> ownerInfos = mapper.getOwnerInfo(extend);
		PGResults result = new PGResults();
		result.setRows(ownerInfos);
		PageInfo<OwnerInfo> info = new PageInfo(ownerInfos);
		//查询总页数

		long pages = info.getPages();

		result.setPages(pages);
		return result;
	}


	@Override
	public void updateRemarks(OwnerInfo ownerInfo) {
		// TODO Auto-generated method stub
		mapper.updateRemarks(ownerInfo);
	}

	@Override
	public OwnerInfo getById(int id) {
		return mapper.getWithHomeInfoById(id);
	}

	@Override
	public OwnerInfo getMoneyDesc(Integer id) {
		OwnerInfo list = mapper.getMoneyDesc(id);
		double totalMoney = list.getFitOrder().getContractMoney();//总金额
		double pMoney = list.getFitOrder().getPayMoney();//定金
		double payMoney = 0 ;
		if(list.getFitOrder().getHasReceivables()!= null){
			payMoney = list.getFitOrder().getHasReceivables();//阶段付款总额
		}
		double allMoney = pMoney + payMoney;//总的已付金额是工程已收款加上定金
		double noMoney = totalMoney-allMoney;//未付款金额
		list.getFitOrder().setNoReceivables(noMoney);
		list.getFitOrder().setHasReceivables(allMoney);
		NumberFormat formatte = new DecimalFormat("0.00");
		Double s = new Double(pMoney / totalMoney * 100);//当前工程金额占总金额的百分比
		String sca = formatte.format(s) + "%";
		list.getFitOrder().setScale(sca);
		try {
			List<FitTaskInstance> instances = list.getFitOrder().getFitTaskInstance();
			for (FitTaskInstance in:instances){
				double nowMoney = in.getFitMoney().getTaskAmount();//当前工程金额
				if (Double.valueOf(totalMoney) != null && Double.valueOf(nowMoney) != null) {
					NumberFormat formatter = new DecimalFormat("0.00");
					Double sc = new Double(nowMoney / totalMoney * 100);//当前工程金额占总金额的百分比
					String scal = formatter.format(sc) + "%";
					in.getFitMoney().setScale(scal);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public void updateMoney(Integer id) {
		mapper.updateMoney(id);
	}

	@Override
	public List<OwnerInfo> getMoneySrc() {
		List<OwnerInfo> list = mapper.getMoneySrc();
		for (OwnerInfo ls:list){
			try {
				if(ls.getFitMoney()==null){
					FitMoney fitMoney = new FitMoney();
					fitMoney.setHasReceivables(Double.valueOf(0));
					fitMoney.setTaskAmount(Double.valueOf(0));
					ls.setFitMoney(fitMoney);
				}
				double totalMoney = ls.getFitOrder().getContractMoney();//合同总金额
				double haspay = ls.getFitOrder().getPayMoney() + ls.getFitMoney().getHasReceivables();//已付款金额
				if (Double.valueOf(totalMoney) != null && Double.valueOf(haspay) != null) {
					double nopay = totalMoney - haspay;
					NumberFormat formatter = new DecimalFormat("0.00");
					Double sc = new Double(haspay / totalMoney * 100);
					String scal = formatter.format(sc) + "%";
					ls.getFitMoney().setHasReceivables(haspay);
					ls.getFitMoney().setScale(scal);
					ls.getFitMoney().setNoReceivables(nopay);
					Map<String,Object> map1 = new HashMap<String,Object>();
					Map<String,Object> map2 = new HashMap<String,Object>();
					map1.put("name", "已付款");
					map1.put("value", haspay);
					map2.put("name", "待付款");
					map2.put("value", nopay);
					ls.getData().add(map1);
					ls.getData().add(map2);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return list;
	}

	@Override
	public List<OwnerInfo> getPullPayment() {
		List<OwnerInfo> list = mapper.getPullPayment();
		for (OwnerInfo ls:list){
			try {
				if(ls.getFitMoney()==null){
					FitMoney fitMoney = new FitMoney();
					fitMoney.setHasReceivables(Double.valueOf(0));
					fitMoney.setTaskAmount(Double.valueOf(0));
					ls.setFitMoney(fitMoney);
				}
				double totalMoney = ls.getFitOrder().getContractMoney();//合同总金额
				double haspay = ls.getFitOrder().getPayMoney() + ls.getFitMoney().getHasReceivables();//已付款金额
				if (Double.valueOf(totalMoney) != null && Double.valueOf(haspay) != null) {
					double nopay = totalMoney - haspay;
					NumberFormat formatter = new DecimalFormat("0.00");
					Double sc = new Double(haspay / totalMoney * 100);
					String scal = formatter.format(sc) + "%";
					ls.getFitMoney().setHasReceivables(haspay);
					ls.getFitMoney().setScale(scal);
					ls.getFitMoney().setNoReceivables(nopay);
					Map<String,Object> map1 = new HashMap<String,Object>();
					Map<String,Object> map2 = new HashMap<String,Object>();
					map1.put("name", "已付款");
					map1.put("value", haspay);
					map2.put("name", "待付款");
					map2.put("value", nopay);
					ls.getData().add(map1);
					ls.getData().add(map2);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return list;
	}

	@Override
	public List<OwnerInfo> getMakeCollections() {
		List<OwnerInfo> list = mapper.getMakeCollections();
		for (OwnerInfo ls:list){
			try {
				if(ls.getFitMoney()==null){
					FitMoney fitMoney = new FitMoney();
					fitMoney.setHasReceivables(Double.valueOf(0));
					fitMoney.setTaskAmount(Double.valueOf(0));
					ls.setFitMoney(fitMoney);
				}
				double totalMoney = ls.getFitOrder().getContractMoney();//合同总金额
				double haspay = ls.getFitOrder().getPayMoney() + ls.getFitMoney().getHasReceivables();//已付款金额
				if (Double.valueOf(totalMoney) != null && Double.valueOf(haspay) != null) {
					double nopay = totalMoney - haspay;
					NumberFormat formatter = new DecimalFormat("0.00");
					Double sc = new Double(haspay / totalMoney * 100);
					String scal = formatter.format(sc) + "%";
					ls.getFitMoney().setHasReceivables(haspay);
					ls.getFitMoney().setScale(scal);
					ls.getFitMoney().setNoReceivables(nopay);
					Map<String,Object> map1 = new HashMap<String,Object>();
					Map<String,Object> map2 = new HashMap<String,Object>();
					map1.put("name", "已付款");
					map1.put("value", haspay);
					map2.put("name", "待付款");
					map2.put("value", nopay);
					ls.getData().add(map1);
					ls.getData().add(map2);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return list;
	}

	@Override
	public void create(OwnerInfo ownerInfo) {
				mapper.create(ownerInfo);
	}
	@Override
	public FitManager getManager(Integer id) {
		return mapper.getManager(id);
	}

	@Override
	public OwnerInfo getByUserId(String id) {
		return mapper.getByUserId(id);
	}

	@Override
	public OwnerInfo login(String mobile, String password, Boolean isSafe) {
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("mobile", mobile);
		if (!isSafe) {
			param.put("password", Encrypt.e(password));

		} else {
			param.put("password", password);
		}
		List<OwnerInfo> list = mapper.login(param);
		if (list != null && list.size() != 0) {
			return list.get(0);
		}
		return null;
	}

	@Override
	public OwnerInfo save(OwnerInfo ownerInfo) {
		String mobile = ownerInfo.getMobile();
		String password = Encrypt.e(ownerInfo.getPassword());
		ownerInfo.setPassword(password);
		mapper.insertSelective(ownerInfo);
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("mobile", mobile);
		param.put("password", ownerInfo.getPassword());
		List<OwnerInfo> list = mapper.login(param);
		if (list != null && list.size() != 0) {
			return list.get(0);
		}
		return null;
	}

	@Override
	public OwnerInfo getByMobile(String mobile) {
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("mobile", mobile);
		List<OwnerInfo> list = mapper.login(param);
		if (list != null && list.size() != 0) {
			return list.get(0);
		}
		return null;
	}

	@Override
	public OwnerInfo getIdByMobile(OwnerInfo ownerInfo) {
		return mapper.getIdByMobile(ownerInfo);
	}
}
