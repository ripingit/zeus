package org.chaoxuan.zeus.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.chaoxuan.zeus.dao.QuotaWorkerVersionMapper;
import org.chaoxuan.zeus.model.QuotaWorkerVersion;
import org.chaoxuan.zeus.service.QuotaWorkerVersionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "quotaWorkerVersionService")
public class QuotaWorkerVersionServiceImpl implements QuotaWorkerVersionService {

    private QuotaWorkerVersionMapper quotaWorkerVersionMapper;

    @Autowired
    public void setQuotaWorkerVersionMapper(QuotaWorkerVersionMapper quotaWorkerVersionMapper) {
        this.quotaWorkerVersionMapper = quotaWorkerVersionMapper;
    }


    @Override
    public List<QuotaWorkerVersion> list(String ids) {
        Map<String, Object> param = new HashMap<String, Object>();
        List<Integer> list = new ArrayList<Integer>();
        if (ids != null) {
            String[] arr = ids.split(",");
            for (String str : arr) {
                list.add(Integer.parseInt(str));
            }
        }
        param.put("ids", list);
        return quotaWorkerVersionMapper.findByMap(param);
    }

}
