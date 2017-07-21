package org.chaoxuan.zeus.service;

import org.chaoxuan.zeus.model.FitStandard;

public interface FitStandardService {
	
	/**
	 * @author Yurnero
	 * @date 2017年5月15日
	 * @param id
	 * @return FitStandard
	 * @description 编辑
	 */
	FitStandard getById(Integer id);

	/**
	 * @author Yurnero
	 * @date 2017年5月15日
	 * @param fitStandard void
	 * @description 添加
	 */
	void add(FitStandard fitStandard);

	/**
	 * @author Yurnero
	 * @date 2017年5月15日
	 * @param fitStandard void
	 * @description 根据 ID 获取
	 */
	void edit(FitStandard fitStandard);
}
