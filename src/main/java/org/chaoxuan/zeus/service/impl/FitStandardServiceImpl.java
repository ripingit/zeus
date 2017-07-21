package org.chaoxuan.zeus.service.impl;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.chaoxuan.zeus.dao.FitStandardMapper;
import org.chaoxuan.zeus.dao.FitTaskAreaMapper;
import org.chaoxuan.zeus.dao.FitTaskMachineMapper;
import org.chaoxuan.zeus.dao.FitTaskMapper;
import org.chaoxuan.zeus.dao.FitTaskMaterialMapper;
import org.chaoxuan.zeus.dao.FitTaskMeasureMapper;
import org.chaoxuan.zeus.dao.FitTaskWorkerMapper;
import org.chaoxuan.zeus.model.FitStandard;
import org.chaoxuan.zeus.model.FitTask;
import org.chaoxuan.zeus.model.FitTaskArea;
import org.chaoxuan.zeus.model.FitTaskMachine;
import org.chaoxuan.zeus.model.FitTaskMaterial;
import org.chaoxuan.zeus.model.FitTaskMeasure;
import org.chaoxuan.zeus.model.FitTaskWorker;
import org.chaoxuan.zeus.service.FitRuleService;
import org.chaoxuan.zeus.service.FitStandardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;

@Service(value = "fitStandardService")
public class FitStandardServiceImpl implements FitStandardService {

	/** 施工规范 Mapper */
	private FitStandardMapper fitStandardMapper;

	/** 施工任务 Mapper */
	private FitTaskMapper fitTaskMapper;

	/** 施工任务工人配置 Mapper */
	private FitTaskWorkerMapper fitTaskWorkerMapper;

	/** 施工任务材料配置 Mapper */
	private FitTaskMaterialMapper fitTaskMaterialMapper;

	/** 施工任务机械配置 Mapper */
	private FitTaskMachineMapper fitTaskMachineMapper;

	/** 施工任务时间与面积配置 Mapper */
	private FitTaskAreaMapper fitTaskAreaMapper;

	/** 施工任务测量维度配置 Mapper */
	private FitTaskMeasureMapper FitTaskMeasureMapper;

	/** 装修模板 Service */
	private FitRuleService fitRuleService;

	/**
	 * @author Yurnero
	 * @date 2017年5月15日
	 * @param fitStandard
	 * @description 添加
	 */
	@Override
	public void add(FitStandard fitStandard) {
		// 保存施工规范
		fitStandardMapper.insertSelective(fitStandard);

		// 保存施工任务
		Map<String, Object> param = new HashMap<String, Object>();
		FitTask fitTask = fitStandard.getFitTask();
		fitTask.setFitStandardId(fitStandard.getId());// 设置返回的主键为外键
		param.put("version", fitTask.getVersion());
		param.put("phase", fitTask.getPhase());
		param.put("sequence", fitTask.getSequence());
		param.put("num", 1);
		fitTaskMapper.updateSequenceByVersionAndPhaseAndSequence(param);// 更新次序, 保证次序的正确性
		fitTaskMapper.insertSelective(fitTask);
		
		// 保存施工任务相关配置信息
		this.addFitTaskConfigure(fitTask);
		
		// 在施工模板中保存任务
		fitRuleService.newTaskAdd2Rule(fitTask.getVersion(), fitTask.getId());
	}

	/**
	 * @author Yurnero
	 * @date 2017年5月15日
	 * @param fitStandard
	 * @return FitStandard
	 * @description 编辑
	 */
	@Override
	public void edit(FitStandard fitStandard) {
		// 修改施工规范
		fitStandardMapper.updateByPrimaryKeySelective(fitStandard);

		// 保存施工任务
		Map<String, Object> param = new HashMap<String, Object>();
		FitTask fitTask = fitStandard.getFitTask();
		String version = fitTask.getVersion();
		Integer oldPhase = fitTask.getOldPhase();
		Integer newPhase = fitTask.getPhase();
		Integer newSequence = fitTask.getSequence();
		Integer oldSequence = fitTask.getOldSequence();
		if (!oldPhase.equals(newPhase)) {
			param.put("version", version);
			param.put("phase", oldPhase);

			int count = fitTaskMapper.getCountSequenceByVersionAndPhase(param);
			if (count == 1) {
				// 阶段号改变, 且原阶段下只有 1 个次序, 则更新大于原阶段的元素, -1
				param.put("num", -1);
				fitTaskMapper.updatePhaseByVersionAndPhase(param);
			} else {
				// 阶段号改变, 更新原阶段的次序号
				param.clear();
				param.put("version", version);
				param.put("phase", oldPhase);
				param.put("sequence", oldSequence);
				param.put("num", -1);
				fitTaskMapper.updateSequenceByVersionAndPhaseAndSequence(param);
			}
			// 阶段号改变, 更新新阶段的次序号
			param.clear();
			param.put("version", version);
			param.put("phase", newPhase);
			param.put("sequence", newSequence);
			param.put("num", 1);
			fitTaskMapper.updateSequenceByVersionAndPhaseAndSequence(param);
		} else {
			if (oldSequence.intValue() > newSequence.intValue()) {
				// 阶段号未改变, 次序变小, 新次序和旧次序之间的次序 +1
				param.clear();
				param.put("version", version);
				param.put("phase", newPhase);
				param.put("smllNewSequence", newSequence);
				param.put("smllOldSequence", oldSequence);
				param.put("num", 1);
				fitTaskMapper.updateSequenceByVersionAndPhaseAndSequence(param);
			} else if (oldSequence.intValue() < newSequence.intValue()) {
				// 阶段号未改变, 次序变大, 新次序和旧次序之间的次序 -1
				param.clear();
				param.put("version", version);
				param.put("phase", newPhase);
				param.put("bigNewSequence", newSequence);
				param.put("bigOldSequence", oldSequence);
				param.put("num", -1);
				fitTaskMapper.updateSequenceByVersionAndPhaseAndSequence(param);
			}
		}
		// 最后执行更新
		fitTaskMapper.updateByPrimaryKeySelective(fitTask);

		// 删除施工任务工人, 材料, 机械配置信息
		param.clear();
		param.put("fitTaskId", fitTask.getId());
		fitTaskWorkerMapper.deleteByMap(param);
		fitTaskMaterialMapper.deleteByMap(param);
		fitTaskMachineMapper.deleteByMap(param);
		fitTaskAreaMapper.deleteByMap(param);
		FitTaskMeasureMapper.deleteByMap(param);
		
		// 保存施工任务相关配置信息
		this.addFitTaskConfigure(fitTask);
	}

	/**
	 * @author Yurnero
	 * @date 2017年5月15日
	 * @param id
	 * @description 根据 ID 获取
	 */
	@Override
	public FitStandard getById(Integer id) {
		return fitStandardMapper.selectByPrimaryKey(id);
	}
	
	/**
	 * @author Yurnero
	 * @date 2017年5月15日
	 * @param fitTask void
	 * @description 保存施工任务相关配置信息
	 */
	private void addFitTaskConfigure(FitTask fitTask) {
		// 保存施工任务工人配置信息
		String worker = fitTask.getWorker();
		List<FitTaskWorker> listFitTaskWorker = JSON.parseObject(worker, new TypeReference<List<FitTaskWorker>>() {
		});
		for (FitTaskWorker fitTaskWorker : listFitTaskWorker) {
			fitTaskWorker.setFitTaskId(fitTask.getId());
		}
		if(listFitTaskWorker.size()!=0)
		fitTaskWorkerMapper.insertBatch(listFitTaskWorker);

		// 保存施工任务材料配置信息
		String material = fitTask.getMaterial();
		List<FitTaskMaterial> listFitTaskMaterial = JSON.parseObject(material, new TypeReference<List<FitTaskMaterial>>() {
		});
		for (FitTaskMaterial fitTaskMaterial : listFitTaskMaterial) {
			fitTaskMaterial.setFitTaskId(fitTask.getId());
		}
		if(listFitTaskMaterial.size()!=0)
		fitTaskMaterialMapper.insertBatch(listFitTaskMaterial);

		// 保存施工任务机械配置信息
		String machine = fitTask.getMachine();
		List<FitTaskMachine> listFitTaskMachine = JSON.parseObject(machine, new TypeReference<List<FitTaskMachine>>() {
		});
		for (FitTaskMachine fitTaskMachine : listFitTaskMachine) {
			fitTaskMachine.setFitTaskId(fitTask.getId());
		}
		if(listFitTaskMachine.size()!=0)
		fitTaskMachineMapper.insertBatch(listFitTaskMachine);

		// 保存面积与时间配置
		String area = fitTask.getArea();
		List<FitTaskArea> listFitTaskArea = JSON.parseObject(area, new TypeReference<List<FitTaskArea>>() {
		});
		for (FitTaskArea fitTaskArea : listFitTaskArea) {
			fitTaskArea.setFitTaskId(fitTask.getId());
		}
		if(listFitTaskArea.size()!=0)
		fitTaskAreaMapper.insertBatch(listFitTaskArea);

		// 保存测量维度
		String measure = fitTask.getMeasure();
		List<FitTaskMeasure> listFitTaskMeasure = JSON.parseObject(measure, new TypeReference<List<FitTaskMeasure>>() {
		});

		for (FitTaskMeasure fitTaskMeasure : listFitTaskMeasure) {
			fitTaskMeasure.setFitTaskId(fitTask.getId());
		}
		if(listFitTaskArea.size()!=0)
		FitTaskMeasureMapper.insertBatch(listFitTaskMeasure);
	}

	@Autowired
	public void setFitTaskMeasureMapper(FitTaskMeasureMapper fitTaskMeasureMapper) {
		FitTaskMeasureMapper = fitTaskMeasureMapper;
	}

	@Autowired
	public void setFitTaskAreaMapper(FitTaskAreaMapper fitTaskAreaMapper) {
		this.fitTaskAreaMapper = fitTaskAreaMapper;
	}

	@Autowired
	public void setFitStandardMapper(FitStandardMapper fitStandardMapper) {
		this.fitStandardMapper = fitStandardMapper;
	}

	@Autowired
	public void setFitTaskMapper(FitTaskMapper fitTaskMapper) {
		this.fitTaskMapper = fitTaskMapper;
	}

	@Autowired
	public void setFitTaskWorkerMapper(FitTaskWorkerMapper fitTaskWorkerMapper) {
		this.fitTaskWorkerMapper = fitTaskWorkerMapper;
	}

	@Autowired
	public void setFitTaskMaterialMapper(FitTaskMaterialMapper fitTaskMaterialMapper) {
		this.fitTaskMaterialMapper = fitTaskMaterialMapper;
	}

	@Autowired
	public void setFitTaskMachineMapper(FitTaskMachineMapper fitTaskMachineMapper) {
		this.fitTaskMachineMapper = fitTaskMachineMapper;
	}

	@Autowired
	public void setFitRuleService(FitRuleService fitRuleService) {
		this.fitRuleService = fitRuleService;
	}

}
