package org.chaoxuan.zeus.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.chaoxuan.zeus.dao.QuotaMaterialVersionMapper;
import org.chaoxuan.zeus.model.QuotaMaterialVersion;
import org.chaoxuan.zeus.service.QuotaMaterialVersionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "quotaMaterialVersionService")
public class QuotaMaterialVersionServiceImpl implements QuotaMaterialVersionService {

    private QuotaMaterialVersionMapper quotaMaterialVersionMapper;


    @Autowired
    public void setQuotaMaterialVersionMapper(QuotaMaterialVersionMapper quotaMaterialVersionMapper) {
        this.quotaMaterialVersionMapper = quotaMaterialVersionMapper;
    }


    @Override
    public List<QuotaMaterialVersion> list(String ids) {
        Map<String, Object> param = new HashMap<String, Object>();
        List<Integer> list = new ArrayList<Integer>();
        if (ids != null) {
            String[] arr = ids.split(",");
            for (String str : arr) {
                list.add(Integer.parseInt(str));
            }
        }
        param.put("ids", list);
        return quotaMaterialVersionMapper.findByMap(param);
    }

}
