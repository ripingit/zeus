package org.chaoxuan.zeus.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.chaoxuan.zeus.dao.QuotaAreaMapper;
import org.chaoxuan.zeus.model.QuotaArea;
import org.chaoxuan.zeus.service.QuotaAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "quotaAreaService")
public class QuotaAreaServiceImpl implements QuotaAreaService {

	private QuotaAreaMapper quotaAreaMapper;

	@Autowired
	public void setQuotaAreaMapper(QuotaAreaMapper quotaAreaMapper) {
		this.quotaAreaMapper = quotaAreaMapper;
	}

	/**
	 * @author Yurnero
	 * @date 2017年5月15日
	 * @return List<QuotaArea>
	 * @description 查询工程定额列表
	 */
	@Override
	public List<QuotaArea> list() {
		Map<String, Object> param = new HashMap<String, Object>();
		return quotaAreaMapper.findByMap(param);
	}

}
