package org.chaoxuan.zeus.service;

import org.chaoxuan.zeus.model.Option;
import org.chaoxuan.zeus.model.OwnerHomeInfo;

import java.util.List;

/**
 * Created by Administrator on 2017/7/4 0004.
 */
public interface OwnerHomeInfoService {
    void create(OwnerHomeInfo ownerHomeInfo);

    List<Option> getLoveList();

    List<Option> getPersonList(int limit);

    List<Option> getRelativeList();

    List<Option> getAgeList(int limit);

    OwnerHomeInfo getById(int id);

    List<OwnerHomeInfo> searchByUserId(int id);
}
