package org.chaoxuan.zeus.service;

import org.chaoxuan.zeus.model.QuotaWorker;

import java.util.List;

public interface QuotaWorkerService {

	/**
	 * @author Yurnero
	 * @date 2017年5月17日
	 * @return List<QuotaWorker>
	 * @description 列表
	 */
	List<QuotaWorker> list();

	/**
	  * @author Yurnero
	  * @date 2017/5/25
	  * @param [categoryId, version, area]
	  * @description 条件查询
	  */
	List<QuotaWorker> listByCon(Integer categoryId, String version, String area);

	/**
	 * @author Yurnero
	 * @date 2017年5月17日
	 * @param quotaWorker
	 *            void
	 * @description 添加
	 */
	void add(QuotaWorker quotaWorker);

	/**
	 * @author Yurnero
	 * @date 2017年5月17日
	 * @param id
	 * @return QuotaWorker
	 * @description 根据 ID 获取
	 */
	QuotaWorker get(Integer id);

	/**
	 * @author Yurnero
	 * @date 2017年5月17日
	 * @param quotaWorker
	 * @description 编辑
	 */
	void edit(QuotaWorker quotaWorker);

	/**
	 * @author Yurnero
	 * @date 2017年5月17日
	 * @param id
	 * @description TODO
	 */
	void delete(Integer id);

	// 根据CategoryId查询
	List<QuotaWorker> queryByCategoryId(Integer categoryId);

	// 查询所有工人类别
	List<QuotaWorker> queryAll();

	QuotaWorker getById(int id);

	// 通过任务的quotaWorker查询
	List<QuotaWorker> queryByTaskQuotaWorkers(String arrayString);


}
