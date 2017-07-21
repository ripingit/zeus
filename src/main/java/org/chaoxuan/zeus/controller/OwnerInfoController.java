package org.chaoxuan.zeus.controller;
import java.util.List;
import java.util.Date;
import java.text.SimpleDateFormat;

import javax.servlet.http.HttpServletResponse;

import org.chaoxuan.commons.pojo.PGResults;
import org.chaoxuan.zeus.model.OwnerInfo;
import org.chaoxuan.zeus.model.OwnerInfoExtend;
import org.chaoxuan.zeus.service.OwnerInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 刘圆圆 on 2017/5/11.
 */
@Controller
@RequestMapping("/ownerInfo")
public class OwnerInfoController extends BaseController {

	@Autowired
	private OwnerInfoService service;

	//显示所有业主信息
	@RequestMapping("/list")
	public void getOwnerInfo(HttpServletResponse response, Integer page, Integer rows, OwnerInfoExtend ownerInfo) {
		page = page == null ? 1 : page;
		rows = 5;

		PGResults ownerInfos = service.getOwnerInfo(page, rows, ownerInfo);
		super.json(response, ownerInfos);
	}

	//添加备注
	@RequestMapping("/updateRemarks")
	public void updateRemarks(HttpServletResponse response, OwnerInfo ownerInfo){
		service.updateRemarks(ownerInfo);
		super.json(response, true);

	}
	@RequestMapping("/getMoneySrc")
	public void getMoneySrc(HttpServletResponse response){
		List<OwnerInfo> list = service.getMoneySrc();

		super.json(response,list);
	}
	@RequestMapping("/getPullPayment")
	public void getPullPayment(HttpServletResponse response){
		List<OwnerInfo> list = service.getPullPayment();

		super.json(response,list);
	}
	@RequestMapping("/getMakeCollections")
	public void getMakeCollections(HttpServletResponse response){
		List<OwnerInfo> list = service.getMakeCollections();

		super.json(response,list);
	}
	@RequestMapping("/getMoneyDesc/{id}")
	public void getMoneyDesc(HttpServletResponse response,@PathVariable Integer id){
		OwnerInfo info = service.getMoneyDesc(id);
		super.json(response,info);
	}

	@RequestMapping(value="/updateMoney/{id}", method = RequestMethod.PUT)
	public void updateMoney(HttpServletResponse response,@PathVariable  Integer id){
		service.updateMoney(id);
		super.json(response, true);
	}

	@InitBinder
	public void initBinder(ServletRequestDataBinder binder) {
		binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true));
	}

}
