package org.chaoxuan.zeus.service.impl;

import org.chaoxuan.zeus.dao.FitTaskInstanceMapper;
import org.chaoxuan.zeus.dao.OwnerInfoMapper;
import org.chaoxuan.zeus.page.PageOwner;
import org.chaoxuan.zeus.service.PageOwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * @author Yurnero
 * @data 2017/6/12
 * @description TODO
 */
@Service(value = "pageOwnerService")
public class PageOwnerServiceImpl implements PageOwnerService {

  private OwnerInfoMapper ownerInfoMapper;

  private FitTaskInstanceMapper fitTaskInstanceMapper;

  @Override
  public Map<String, List<PageOwner>> list(Integer managerId,Integer status) {
    Map<String, Object> param = new HashMap<String, Object>();

    // 装修订单
    param.put("status",status);

    List<PageOwner> listFit = ownerInfoMapper.findFitOrder(param);
    List<Integer> ids = new ArrayList<Integer>();
    for (PageOwner po : listFit) {
      // ids
      ids.add(po.getId());
      // 总天数和完成的天数
      Integer fitOrderId = po.getFitOrderId();
      Integer totalDays = fitTaskInstanceMapper.getTotalDaysByOrderId(fitOrderId);
      Integer completedDays = fitTaskInstanceMapper.getCompletedDaysByOrderId(fitOrderId);
      po.setTotalDays(totalDays);
      po.setCompletedDays(completedDays);

      // 设置百分比
      DecimalFormat df = new DecimalFormat("######0.00");
      if (totalDays != null && completedDays != null) {
        double scale = completedDays * 100 / totalDays.doubleValue();
        double surplusScale = 100 - (completedDays * 100 / totalDays.doubleValue());
        if (scale > surplusScale) {
          po.setFlag(true);
        } else {
          po.setFlag(false);
        }
        po.setScale(df.format(scale) + "%");
        po.setSurplusScale(df.format(surplusScale) + "%");
      } else {
        po.setScale("0.00%");
      }

      // 设置待完成个数
      param.clear();
      param.put("fitOrderId", fitOrderId);
      param.put("completeFlag", 0);
      po.setTodo(fitTaskInstanceMapper.count(param));

      // 设置最小时间
      po.setMinDate(fitTaskInstanceMapper.getMinDate(param));
    }

    // 测量订单
    param.clear();
    param.put("ids", ids);
    param.put("status",status);

    List<PageOwner> listMeasure = ownerInfoMapper.findMeasureOrder(param);
    Map<String, List<PageOwner>> map = new HashMap<String, List<PageOwner>>();
    map.put("listFit", listFit);
    map.put("listMeasure", listMeasure);
    return map;
  }

  @Autowired
  public void setOwnerInfoMapper(OwnerInfoMapper ownerInfoMapper) {
    this.ownerInfoMapper = ownerInfoMapper;
  }

  @Autowired
  public void setFitTaskInstanceMapper(FitTaskInstanceMapper fitTaskInstanceMapper) {
    this.fitTaskInstanceMapper = fitTaskInstanceMapper;
  }

  @Override
  public List<PageOwner> findAllOrder(Integer managerId,Integer status) {
    Map<String, Object> param = new HashMap<String, Object>();

    param.put("status",status);
    param.put("managerId",managerId);
    List<PageOwner> listFit = ownerInfoMapper.findAllOrder(param);
    List<Integer> ids = new ArrayList<Integer>();
    for (PageOwner po : listFit) {
      // ids
      ids.add(po.getId());
      // 总天数和完成的天数
      if (po.getFitOrderId() != 0) {
        Integer fitOrderId = po.getFitOrderId();
        //总天数
        Integer totalDays = fitTaskInstanceMapper.getTotalDaysByOrderId(fitOrderId);
        //完成的天数
        Integer completedDays = fitTaskInstanceMapper.getCompletedDaysByOrderId(fitOrderId);
        po.setTotalDays(totalDays);
        po.setCompletedDays(completedDays);

        // 设置百分比
        DecimalFormat df = new DecimalFormat("######0.00");
        if (totalDays != null && completedDays != null) {
          double scale = completedDays * 100 / totalDays.doubleValue();
          double surplusScale = 100 - (completedDays * 100 / totalDays.doubleValue());
          if (scale > surplusScale) {
            po.setFlag(true);
          } else {
            po.setFlag(false);
          }
          po.setScale(df.format(scale) + "%");
          po.setSurplusScale(df.format(surplusScale) + "%");
        } else {
          po.setScale("0.00%");
        }

        // 设置待完成个数
        param.clear();
        param.put("fitOrderId", fitOrderId);
        param.put("completeFlag", 0);
        po.setTodo(fitTaskInstanceMapper.count(param));

        // 设置最小时间
        po.setMinDate(fitTaskInstanceMapper.getMinDate(param));
      }
    }
    return listFit;
  }

}
