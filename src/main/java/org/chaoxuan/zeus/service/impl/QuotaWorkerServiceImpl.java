package org.chaoxuan.zeus.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.chaoxuan.zeus.dao.FitTaskWorkerMapper;
import org.chaoxuan.zeus.dao.QuotaWorkerMapper;
import org.chaoxuan.zeus.dao.QuotaWorkerVersionMapper;
import org.chaoxuan.zeus.model.QuotaWorker;
import org.chaoxuan.zeus.model.QuotaWorkerVersion;
import org.chaoxuan.zeus.service.QuotaWorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;

/**
 * @author Yurnero
 * @data 2017年4月26日
 * @description 工人定额实现类
 */
@Service(value = "quotaWorkerService")
public class QuotaWorkerServiceImpl implements QuotaWorkerService {

	private QuotaWorkerMapper quotaWorkerMapper;

	private QuotaWorkerVersionMapper quotaWorkerVersionMapper;

	private FitTaskWorkerMapper fitTaskWorkerMapper;

	/**
	 * @author Yurnero
	 * @date 2017年5月17日
	 * @return List<QuotaWorker>
	 * @description 列表
	 */
	@Override
	public List<QuotaWorker> list() {
		Map<String, Object> param = new HashMap<String, Object>();
		return quotaWorkerMapper.findByMap(param);
	}

	/**
	 * @author Yurnero
	 * @date 2017/5/25
	 * @param [categoryId, version, area]
	 * @description 条件查询
	 */
	public List<QuotaWorker> listByCon(Integer categoryId, String version, String area) {
		Map<String, Object> param = new HashMap<String, Object>();
		if (categoryId != -1) {
			param.put("categoryId", categoryId);
		}
		if (!"-1".equals(version)) {
			param.put("version", version);
		}
		if (!"-1".equals(area)) {
			param.put("area", "%" + area + "%");
		}
		return quotaWorkerMapper.findByMap(param);
	}

	/**
	 * @author Yurnero
	 * @date 2017年5月17日
	 * @param quotaWorker
	 *            void
	 * @description 添加
	 */
	@Override
	public void add(QuotaWorker quotaWorker) {
		// 保存工人定额
		quotaWorkerMapper.insertSelective(quotaWorker);
		Integer id = quotaWorker.getId();

		// 保存机械定额详细
		String versions = quotaWorker.getVersions();
		List<QuotaWorkerVersion> list = JSON.parseObject(versions, new TypeReference<List<QuotaWorkerVersion>>() {
		});
		for (QuotaWorkerVersion quotaWorkerVersion : list) {
			quotaWorkerVersion.setQuotaWorkerId(id);
		}
		quotaWorkerVersionMapper.insertBatch(list);

	}

	/**
	 * @author Yurnero
	 * @date 2017年5月17日
	 * @param id
	 * @return QuotaWorker
	 * @description 根据 ID 获取
	 */
	@Override
	public QuotaWorker get(Integer id) {
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("id", id);
		List<QuotaWorker> list = quotaWorkerMapper.findByMap(param);
		if (list != null && list.size() > 0) {
			return list.get(0);
		}
		return null;
	}

	/**
	 * @author Yurnero
	 * @date 2017年5月17日
	 * @param quotaWorker
	 * @description TODO
	 */
	@Override
	public void edit(QuotaWorker quotaWorker) {
		// 更新工人定额
		quotaWorkerMapper.updateByPrimaryKeySelective(quotaWorker);
		Integer id = quotaWorker.getId();

		// 删除工人定额详细
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("quotaWorkerId", id);
		quotaWorkerVersionMapper.deleteByMap(param);

		// 保存机械定额详细
		String versions = quotaWorker.getVersions();
		List<QuotaWorkerVersion> list = JSON.parseObject(versions, new TypeReference<List<QuotaWorkerVersion>>() {
		});
		for (QuotaWorkerVersion quotaWorkerVersion : list) {
			quotaWorkerVersion.setQuotaWorkerId(id);
		}
		quotaWorkerVersionMapper.insertBatch(list);
	}

	/**
	 * @author Yurnero
	 * @date 2017年5月17日
	 * @param id
	 * @description TODO
	 */
	public void delete(Integer id) {
		// 删除工人定额
		quotaWorkerMapper.deleteByPrimaryKey(id);

		// 根据工人定额 ID 获取 工人定额详细的 ID 集合
		List<Integer> list = quotaWorkerVersionMapper.findIdsByQuotaWorkerId(id);

		// 删除工人定额详细
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("quotaWorkerId", id);
		quotaWorkerVersionMapper.deleteByMap(param);

		// 删除施工任务工人配置信息
		param.clear();
		param.put("quotaWorkerVersionIds", list);
		fitTaskWorkerMapper.deleteByMap(param);
	}

	@Override
	public List<QuotaWorker> queryByCategoryId(Integer categoryId) {
		return quotaWorkerMapper.selectByCategoryId(categoryId);
	}

	@Override
	public List<QuotaWorker> queryAll() {
		return quotaWorkerMapper.selectAll();
	}

	@Override
	public QuotaWorker getById(int id) {
		return quotaWorkerMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<QuotaWorker> queryByTaskQuotaWorkers(String arrayString) {
		String[] arrayStr = arrayString.split(",");
		Integer[] array = new Integer[arrayStr.length];
		for (int i = 0; i < arrayStr.length; i++) {
			array[i] = Integer.valueOf(arrayStr[i]);
		}
		return quotaWorkerMapper.selectByArrayId(array);
	}

	@Autowired
	public void setQuotaWorkerMapper(QuotaWorkerMapper quotaWorkerMapper) {
		this.quotaWorkerMapper = quotaWorkerMapper;
	}

	@Autowired
	public void setQuotaWorkerVersionMapper(QuotaWorkerVersionMapper quotaWorkerVersionMapper) {
		this.quotaWorkerVersionMapper = quotaWorkerVersionMapper;
	}

	@Autowired
	public void setFitTaskWorkerMapper(FitTaskWorkerMapper fitTaskWorkerMapper) {
		this.fitTaskWorkerMapper = fitTaskWorkerMapper;
	}

}
