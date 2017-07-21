package org.chaoxuan.zeus.service.impl;

import org.chaoxuan.zeus.dao.FitManagerMapper;
import org.chaoxuan.zeus.model.FitManager;
import org.chaoxuan.zeus.model.OwnerInfo;
import org.chaoxuan.zeus.service.FitManagerService;
import org.chaoxuan.zeus.util.Encrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/7/12.
 */
@Service
public class FitManagerServiceImpl implements FitManagerService {

    @Autowired
    private FitManagerMapper mapper;

    @Override
    public FitManager login(String mobile, String password, Boolean isSafe) {
        Map<String, Object> param = new HashMap<String, Object>();
        param.put("mobile", mobile);
        if (!isSafe) {
            param.put("password", Encrypt.e(password));

        } else {
            param.put("password", password);
        }
        List<FitManager> list = mapper.login(param);
        if (list != null && list.size() != 0) {
            return list.get(0);
        }
        return null;
    }

    @Override
    public FitManager save(FitManager fitManager) {
        String mobile = fitManager.getPhone();
        String password = Encrypt.e(fitManager.getPassword());
        fitManager.setPassword(password);
        mapper.insertSelective(fitManager);
        Map<String, Object> param = new HashMap<String, Object>();
        param.put("mobile", mobile);
        param.put("password", fitManager.getPassword());
        List<FitManager> list = mapper.login(param);
        if (list != null && list.size() != 0) {
            return list.get(0);
        }
        return null;
    }

    @Override
    public FitManager getByMobile(String mobile) {
        Map<String, Object> param = new HashMap<String, Object>();
        param.put("mobile", mobile);
        List<FitManager> list = mapper.login(param);
        if (list != null && list.size() != 0) {
            return list.get(0);
        }
        return null;
    }

    @Override
    public FitManager getIdByMobile(FitManager fitManager) {
        return mapper.getIdByMobile(fitManager);
    }

    @Override
    public List<FitManager> searchByArea(String area) {
        return mapper.searchByArea(area);
    }
}
