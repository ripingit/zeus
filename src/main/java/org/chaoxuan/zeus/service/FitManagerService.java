package org.chaoxuan.zeus.service;

import org.chaoxuan.zeus.model.FitManager;
import org.chaoxuan.zeus.model.OwnerInfo;

import java.util.List;

/**
 * Created by Administrator on 2017/7/12.
 */
public interface FitManagerService {
    FitManager login(String mobile, String password, Boolean isSafe);


    FitManager save(FitManager fitManager);

    FitManager getByMobile(String mobile);

    FitManager getIdByMobile(FitManager fitManager);

    List<FitManager> searchByArea(String area);
}
