package org.chaoxuan.zeus.service.impl;

import org.chaoxuan.zeus.dao.OwnerFamilyMapper;
import org.chaoxuan.zeus.dao.OwnerHomeInfoMapper;
import org.chaoxuan.zeus.model.Option;
import org.chaoxuan.zeus.model.OwnerFamily;
import org.chaoxuan.zeus.model.OwnerHomeInfo;
import org.chaoxuan.zeus.service.OwnerFamilyService;
import org.chaoxuan.zeus.service.OwnerHomeInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static com.sun.tools.attach.VirtualMachine.list;

/**
 * Created by Administrator on 2017/7/4 0004.
 */
@Service
public class OwnerHomeInfoServiceImpl implements OwnerHomeInfoService {
    @Autowired
    private OwnerHomeInfoMapper ownerHomeInfoMapper;
    @Autowired
    private OwnerFamilyMapper ownerFamilyMapper;

    @Override
    public void create(OwnerHomeInfo ownerHomeInfo) {
        ownerHomeInfoMapper.insertSelective(ownerHomeInfo);
    }

    @Override
    public List<Option> getLoveList() {
        List<Option> options = new ArrayList<>();
        final String[] style = {"地中海", "中式","简欧"};
        for (int i = 0; i < style.length; i++) {
            Option option = new Option();
            option.setLabel(style[i]);
            option.setValue(Integer.toString(i));
            options.add(option);
        }
        return options;
    }

    @Override
    public List<Option> getPersonList(int limit) {
        List<Option> options = new ArrayList<>();
        for (int i = 0; i <= limit; i++) {
            Option option = new Option();
            option.setLabel(Integer.toString(i) + "口");
            option.setValue(Integer.toString(i));
            options.add(option);
        }
        return options;
    }

    @Override
    public List<Option> getRelativeList() {
        List<Option> options = new ArrayList<>();
        final String[] relatives = {"丈夫","妻子","父亲", "母亲","岳父","岳母","公公","婆婆","儿子","女儿","哥哥","姐姐","弟弟","妹妹","其他"};
        for (int i = 0; i < relatives.length; i++) {
            Option option = new Option();
            option.setLabel(relatives[i]);
            option.setValue(Integer.toString(i));
            options.add(option);
        }
        return options;
    }

    @Override
    public List<Option> getAgeList(int limit) {
        List<Option> options = new ArrayList<>();
        for (int i = 0; i <= limit; i++) {
            Option option = new Option();
            option.setLabel(Integer.toString(i) + "岁");
            option.setValue(Integer.toString(i));
            options.add(option);
        }
        return options;
    }

    @Override
    public OwnerHomeInfo getById(int id) {
        return ownerHomeInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<OwnerHomeInfo> searchByUserId(int id) {
        return ownerHomeInfoMapper.searchByUserId(id);
    }
}
