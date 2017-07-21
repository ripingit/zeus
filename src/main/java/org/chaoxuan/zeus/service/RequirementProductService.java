package org.chaoxuan.zeus.service;

import org.chaoxuan.zeus.model.RequirementProduct;

import java.util.List;

/**
 * Created by Administrator on 2017/5/16 0016.
 */
public interface RequirementProductService {
   List<RequirementProduct> searchByTaskInstanceId(int id);

   /**
    * 更新预约产品需求
    * @param rp
    */
 void  update(RequirementProduct rp);

    /**
     * 根据id获取一条记录
     * @param id
     * @return
     */
 RequirementProduct getById(int id);
 void upadateProducrStatus(int id);
}
