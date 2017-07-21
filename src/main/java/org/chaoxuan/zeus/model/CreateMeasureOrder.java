package org.chaoxuan.zeus.model;

import java.util.List;

/**
 * Created by Administrator on 2017/7/3 0003.
 */
public class CreateMeasureOrder {
    List<OwnerFamily> ownerFamilyList;
    OwnerHomeInfo ownerHomeInfo;
    OwnerInfo ownerInfo;
    MeasureOrder measureOrder;


    public List<OwnerFamily> getOwnerFamilyList() {
        return ownerFamilyList;
    }

    public void setOwnerFamilyList(List<OwnerFamily> ownerFamilyList) {
        this.ownerFamilyList = ownerFamilyList;
    }

    public OwnerHomeInfo getOwnerHomeInfo() {
        return ownerHomeInfo;
    }

    public void setOwnerHomeInfo(OwnerHomeInfo ownerHomeInfo) {
        this.ownerHomeInfo = ownerHomeInfo;
    }

    public OwnerInfo getOwnerInfo() {
        return ownerInfo;
    }

    public void setOwnerInfo(OwnerInfo ownerInfo) {
        this.ownerInfo = ownerInfo;
    }

    public MeasureOrder getMeasureOrder() {
        return measureOrder;
    }

    public void setMeasureOrder(MeasureOrder measureOrder) {
        this.measureOrder = measureOrder;
    }
}
