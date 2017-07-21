package org.chaoxuan.zeus.service.impl;

import org.chaoxuan.zeus.dao.OwnerFamilyMapper;
import org.chaoxuan.zeus.model.OwnerFamily;
import org.chaoxuan.zeus.service.OwnerFamilyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.acl.Owner;

/**
 * Created by Administrator on 2017/7/3 0003.
 */
@Service
public class OwnerFamilyServiceImpl implements OwnerFamilyService {
    @Autowired
    private OwnerFamilyMapper ownerFamilyMapper;
    @Override
    public void create(OwnerFamily ownerFamily) {
        ownerFamilyMapper.insertSelective(ownerFamily);
    }
}
