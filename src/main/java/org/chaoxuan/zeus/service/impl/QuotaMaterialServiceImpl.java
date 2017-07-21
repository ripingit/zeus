package org.chaoxuan.zeus.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.chaoxuan.zeus.dao.QuotaMaterialMapper;
import org.chaoxuan.zeus.model.QuotaMaterial;
import org.chaoxuan.zeus.service.QuotaMaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "quotaMaterialService")
public class QuotaMaterialServiceImpl implements QuotaMaterialService {

    private QuotaMaterialMapper quotaMaterialMapper;

    @Autowired
    public void setQuotaMaterialMapper(QuotaMaterialMapper quotaMaterialMapper) {
        this.quotaMaterialMapper = quotaMaterialMapper;
    }


    @Override
    public List<QuotaMaterial> queryByCategoryId(Integer categoryId) {

        return quotaMaterialMapper.selectByCategoryId(categoryId);
    }

    @Override
    public List<QuotaMaterial> queryAll() {

        return quotaMaterialMapper.selectAll();
    }


    @Override
    public QuotaMaterial getById(int id) {
        // TODO Auto-generated method stub
        return quotaMaterialMapper.selectByPrimaryKey(id);
    }


    @Override
    public List<QuotaMaterial> queryByTaskMaterialIds(String arrayString) {
        String[] arrayStr = arrayString.split(",");
        Integer[] array = new Integer[arrayStr.length];
        for (int i = 0; i < arrayStr.length; i++) {
            array[i] = Integer.valueOf(arrayStr[i]);
        }
        return quotaMaterialMapper.selectByArrayId(array);
    }


    @Override
    public List<QuotaMaterial> list() {
        Map<String, Object> param = new HashMap<String, Object>();
        List<QuotaMaterial> list = quotaMaterialMapper.findByMap(param);
        return list;
    }
}
