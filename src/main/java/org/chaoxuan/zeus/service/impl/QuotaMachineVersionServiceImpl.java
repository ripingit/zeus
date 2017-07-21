package org.chaoxuan.zeus.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.chaoxuan.zeus.dao.QuotaMachineVersionMapper;
import org.chaoxuan.zeus.model.QuotaMachineVersion;
import org.chaoxuan.zeus.service.QuotaMachineVersionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "quotaMachineVersionService")
public class QuotaMachineVersionServiceImpl implements QuotaMachineVersionService {

    private QuotaMachineVersionMapper quotaMachineVersionMapper;


    @Autowired
    public void setQuotaMachineVersionMapper(QuotaMachineVersionMapper quotaMachineVersionMapper) {
        this.quotaMachineVersionMapper = quotaMachineVersionMapper;
    }


    @Override
    public List<QuotaMachineVersion> list(String ids) {
        Map<String, Object> param = new HashMap<String, Object>();
        List<Integer> list = new ArrayList<Integer>();
        if (ids != null) {
            String[] arr = ids.split(",");
            for (String str : arr) {
                list.add(Integer.parseInt(str));
            }
        }
        param.put("ids", list);
        return quotaMachineVersionMapper.findByMap(param);
    }

}
