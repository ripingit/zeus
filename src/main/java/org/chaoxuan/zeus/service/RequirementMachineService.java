package org.chaoxuan.zeus.service;

import org.chaoxuan.zeus.model.RequirementMachine;

import java.util.List;

/**
 * Created by Administrator on 2017/5/16 0016.
 */
public interface RequirementMachineService {
 List<RequirementMachine> searchByTaskInstanceId(int id);

 /**
  * 更新机械需求
  * @param rm
  */
 void update(RequirementMachine rm);

 /**
  * 根据id获取一条记录
  * @param id
  * @return
  */
 RequirementMachine getById(int id);

 void upadateMachineStatus(int id);
}
