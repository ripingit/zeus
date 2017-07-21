package org.chaoxuan.zeus.service;

import org.chaoxuan.commons.pojo.PGResults;
import org.chaoxuan.zeus.model.FitManager;
import org.chaoxuan.zeus.model.OwnerInfo;
import org.chaoxuan.zeus.model.OwnerInfoExtend;

import java.util.Date;
import java.util.List;
/**
 * Created by Administrator on 2017/5/11.
 */
public interface OwnerInfoService {
  

PGResults getOwnerInfo(Integer page, Integer rows, OwnerInfoExtend extend);
void updateRemarks(OwnerInfo ownerInfo);

/*
根据主键获取ownerInfo
 */
OwnerInfo getById(int id);

    /*查看用户的资金缴费信息*/
    List<OwnerInfo> getMoneySrc();

    OwnerInfo getMoneyDesc(Integer id);

    void updateMoney(Integer id);

    /*全款收讫*/
    List<OwnerInfo> getPullPayment();
    /*收款中*/
    List<OwnerInfo> getMakeCollections();

    OwnerInfo getByUserId(String id);

    void create(OwnerInfo ownerInfo);

    /*跟据业主登录id查询管家信息*/
    FitManager getManager(Integer id);

    OwnerInfo login(String mobile, String password, Boolean isSafe);


   OwnerInfo save(OwnerInfo ownerInfo);

    OwnerInfo getByMobile(String mobile);

    OwnerInfo getIdByMobile(OwnerInfo ownerInfo);
}
