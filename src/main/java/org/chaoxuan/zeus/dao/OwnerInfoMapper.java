package org.chaoxuan.zeus.dao;

import org.chaoxuan.zeus.model.FitManager;
import org.chaoxuan.zeus.model.OwnerHomeInfo;
import org.chaoxuan.zeus.model.OwnerInfo;
import org.chaoxuan.zeus.model.OwnerInfoExtend;
import org.chaoxuan.zeus.page.PageOwner;

import java.util.List;
import java.util.Map;

/**
 *
 */
public interface OwnerInfoMapper {
    List<OwnerInfo> getOwnerInfo(OwnerInfoExtend ownerinfo);

    void updateRemarks(OwnerInfo ownerInfo);

    /**
     * @param [param]
     * @author Yurnero
     * @date 2017/6/14
     * @description 用户装修任务
     */
    List<PageOwner> findFitOrder(Map<String, Object> param);

    /**
     * @param [param]
     * @author Yurnero
     * @date 2017/6/14
     * @description 用户测量任务
     */
    List<PageOwner> findMeasureOrder(Map<String, Object> param);

    List<OwnerHomeInfo> find(Map<String, Object> param);

    /*查看用户的资金缴费信息*/
    List<OwnerInfo> getMoneySrc();

    /*查看资金明细*/
    OwnerInfo getMoneyDesc(Integer id);

    /*收款*/
    void updateMoney(Integer id);

    /*全款收讫*/
    List<OwnerInfo> getPullPayment();

    /*收款中*/
    List<OwnerInfo> getMakeCollections();

    OwnerInfo getByUserId(String id);

    /*跟据业主登录id查询管家信息*/
    FitManager getManager(Integer id);

    List<OwnerInfo> login(Map<String, Object> param);

    int insertSelective(OwnerInfo ownerInfo);

    OwnerInfo getIdByMobile(OwnerInfo ownerInfo);

    void create(OwnerInfo ownerInfo);

    List<PageOwner>  findAllOrder(Map<String, Object> param);


    OwnerInfo getWithHomeInfoById(Integer id);
}
