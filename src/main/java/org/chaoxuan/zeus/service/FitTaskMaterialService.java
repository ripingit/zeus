package org.chaoxuan.zeus.service;

import java.util.List;

import org.chaoxuan.zeus.model.FitTaskMaterial;

public interface FitTaskMaterialService {
	
	/**
	 * @author Yurnero
	 * @date 2017年5月12日
	 * @param fitTaskId
	 * @return List<FitTaskMaterial>
	 * @description 根据 施工任务 ID 获取材料配置
	 */
	List<FitTaskMaterial> findByFitTaskId(Integer fitTaskId);
	
}
