package org.chaoxuan.zeus.service;

import org.chaoxuan.zeus.model.TotalRequirementWorker;

import java.util.List;

/**
 * Created by Administrator on 2017/5/19 0019.
 */
public interface TotalRequirementWorkerService {
  List<TotalRequirementWorker> getByOrderId(int orderId);
}
