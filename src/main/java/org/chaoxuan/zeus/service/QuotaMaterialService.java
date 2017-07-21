package org.chaoxuan.zeus.service;

import java.util.List;

import org.chaoxuan.zeus.model.QuotaMaterial;

public interface QuotaMaterialService {
	
	List<QuotaMaterial> list();

	List<QuotaMaterial> queryByCategoryId(Integer categoryId);

	List<QuotaMaterial> queryAll();

	
	QuotaMaterial getById(int id);

	
	//
	List<QuotaMaterial> queryByTaskMaterialIds(String arrayString);

}
