package org.chaoxuan.zeus.service;

import java.util.List;

import org.chaoxuan.zeus.model.QuotaMachine;

public interface QuotaMachineService {

	/**
	 * @author Yurnero
	 * @date 2017年5月17日
	 * @return List<QuotaMachine>
	 * @description 列表
	 */
	List<QuotaMachine> list();

	/**
	  * @author Yurnero
	  * @date 2017/5/25
	  * @param [categoryId, area]
	  * @description 根据条件查找
	  */
	List<QuotaMachine> listByCon(Integer categoryId, String area);

	/**
	 * @author Yurnero
	 * @date 2017年5月17日
	 * @param id
	 * @return QuotaMachine
	 * @description 根据 ID 获取
	 */
	QuotaMachine get(Integer id);

	/**
	 * @author Yurnero
	 * @date 2017年5月17日
	 * @param quotaMachine
	 * @description 添加
	 */
	void add(QuotaMachine quotaMachine);

	/**
	 * @author Yurnero
	 * @date 2017年5月17日
	 * @param quotaMachine
	 * @description 编辑
	 */
	void edit(QuotaMachine quotaMachine);

	/**
	 * @author Yurnero
	 * @date 2017年5月17日
	 * @param id
	 * @description 删除
	 */
	void delete(Integer id);

	List<QuotaMachine> queryAll();

	List<QuotaMachine> queryByCategoryId(Integer categoryId);

	QuotaMachine getById(int id);

	List<QuotaMachine> queryByTaskMachine(String arrayString);
}
