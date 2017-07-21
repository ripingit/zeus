package org.chaoxuan.zeus.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.chaoxuan.zeus.dao.FitTaskMachineMapper;
import org.chaoxuan.zeus.dao.QuotaMachineMapper;
import org.chaoxuan.zeus.dao.QuotaMachineVersionMapper;
import org.chaoxuan.zeus.model.QuotaMachine;
import org.chaoxuan.zeus.model.QuotaMachineVersion;
import org.chaoxuan.zeus.service.QuotaMachineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;

@Service(value = "quotaMachineService")
public class QuotaMachineServiceImpl implements QuotaMachineService {

	/** 机械定额 Mapper */
	private QuotaMachineMapper quotaMachineMapper;

	/** 机械定额详细 Mapper */
	private QuotaMachineVersionMapper quotaMachineVersionMapper;

	private FitTaskMachineMapper fitTaskMachineMapper;

	/**
	 * @author Yurnero
	 * @date 2017年5月17日
	 * @return List<QuotaMachine>
	 * @description TODO
	 */
	@Override
	public List<QuotaMachine> list() {
		Map<String, Object> param = new HashMap<String, Object>();
		return quotaMachineMapper.findByMap(param);
	}

	/**
	 * @author Yurnero
	 * @date 2017年5月17日
	 * @param id
	 * @return QuotaMachine
	 * @description 根据 ID 获取
	 */
	@Override
	public QuotaMachine get(Integer id) {
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("id", id);
		List<QuotaMachine> list = quotaMachineMapper.findByMap(param);
		if (list != null && list.size() > 0) {
			return list.get(0);
		}
		return null;
	}

	/**
	  * @author Yurnero
	  * @date 2017/5/25
	  * @param [categoryId, area]
	  * @description 根据条件查找
	  */
	@Override
	public List<QuotaMachine> listByCon(Integer categoryId, String area) {
		Map<String, Object> param = new HashMap<String, Object>();
		if (categoryId != -1) {
			param.put("categoryId", categoryId);
		}
		if (!"-1".equals(area)) {
			param.put("area", "%" + area + "%");
		}
		return quotaMachineMapper.findByMap(param);
	}

	/**
	 * @author Yurnero
	 * @date 2017年5月17日
	 * @param quotaMachine
	 * @description 添加
	 */
	@Override
	public void add(QuotaMachine quotaMachine) {
		// 保存机械定额
		quotaMachineMapper.insertSelective(quotaMachine);
		Integer id = quotaMachine.getId();

		// 保存机械定额详细
		String versions = quotaMachine.getVersions();
		List<QuotaMachineVersion> list = JSON.parseObject(versions, new TypeReference<List<QuotaMachineVersion>>() {
		});
		for (QuotaMachineVersion quotaMachineVersion : list) {
			quotaMachineVersion.setQuotaMachineId(id);
		}
		quotaMachineVersionMapper.insertBatch(list);

	}

	/**
	 * @author Yurnero
	 * @date 2017年5月17日
	 * @param quotaMachine
	 * @description 编辑
	 */
	@Override
	public void edit(QuotaMachine quotaMachine) {
		// 更新机械定额
		quotaMachineMapper.updateByPrimaryKeySelective(quotaMachine);
		Integer id = quotaMachine.getId();

		// 删除机械定额详细
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("quotaMachineId", id);
		quotaMachineVersionMapper.deleteByMap(param);

		// 保存机械定额详细
		String versions = quotaMachine.getVersions();
		List<QuotaMachineVersion> list = JSON.parseObject(versions, new TypeReference<List<QuotaMachineVersion>>() {
		});
		for (QuotaMachineVersion quotaMachineVersion : list) {
			quotaMachineVersion.setQuotaMachineId(id);
		}
		quotaMachineVersionMapper.insertBatch(list);
	}

	/**
	 * @author Yurnero
	 * @date 2017年5月17日
	 * @param id
	 * @description 删除
	 */
	@Override
	public void delete(Integer id) {
		// 删除机械定额
		quotaMachineMapper.deleteByPrimaryKey(id);

		// 根据机械定额 ID 获取 机械定额详细的 ID 集合
		List<Integer> list = quotaMachineVersionMapper.findIdsByQuotaMachineId(id);

		// 删除机械定额详细
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("quotaMachineId", id);
		quotaMachineVersionMapper.deleteByMap(param);

		// 删除施工任务机械配置信息
		param.clear();
		param.put("quotaMachineVersionIds", list);
		fitTaskMachineMapper.deleteByMap(param);
	}

	@Override
	public List<QuotaMachine> queryAll() {
		return quotaMachineMapper.selectAll();
	}

	@Override
	public List<QuotaMachine> queryByCategoryId(Integer categoryId) {
		return quotaMachineMapper.selectByCategoryId(categoryId);
	}

	@Override
	public QuotaMachine getById(int id) {
		return quotaMachineMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<QuotaMachine> queryByTaskMachine(String arrayString) {
		String[] arrayStr = arrayString.split(",");
		Integer[] array = new Integer[arrayStr.length];
		for (int i = 0; i < arrayStr.length; i++) {
			array[i] = Integer.valueOf(arrayStr[i]);
		}
		return quotaMachineMapper.selectByArrayId(array);
	}

	@Autowired
	public void setQuotaMachineMapper(QuotaMachineMapper quotaMachineMapper) {
		this.quotaMachineMapper = quotaMachineMapper;
	}

	@Autowired
	public void setQuotaMachineVersionMapper(QuotaMachineVersionMapper quotaMachineVersionMapper) {
		this.quotaMachineVersionMapper = quotaMachineVersionMapper;
	}

	@Autowired
	public void setFitTaskMachineMapper(FitTaskMachineMapper fitTaskMachineMapper) {
		this.fitTaskMachineMapper = fitTaskMachineMapper;
	}

}
