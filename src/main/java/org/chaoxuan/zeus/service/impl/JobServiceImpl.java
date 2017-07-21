package org.chaoxuan.zeus.service.impl;

import org.chaoxuan.zeus.model.Address;
import org.chaoxuan.zeus.service.AddressService;
import org.chaoxuan.zeus.service.JobService;
import org.chaoxuan.zeus.service.RedisCacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/7/6 0006.
 */
@Service("jobServiceImpl")
public class JobServiceImpl implements JobService{
    @Autowired
    RedisCacheService redisCacheService;
    @Autowired
    AddressService addressService;
    public void execute(){
        List<Address> list=addressService.list();
        redisCacheService.setCacheList("addressList",list,24l);
    }

}
