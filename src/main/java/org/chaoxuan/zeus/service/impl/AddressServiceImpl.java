package org.chaoxuan.zeus.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import org.chaoxuan.zeus.dao.AddressMapper;
import org.chaoxuan.zeus.model.Address;
import org.chaoxuan.zeus.model.CascaderOption;
import org.chaoxuan.zeus.model.OwnerHomeInfo;
import org.chaoxuan.zeus.service.AddressService;
import org.chaoxuan.zeus.service.RedisCacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Administrator on 2017/7/3 0003.
 */
@Service
public class AddressServiceImpl implements AddressService {
    AddressServiceImpl(@Autowired AddressMapper addressMapper, @Autowired RedisCacheService redisCacheService) {
        //通过构造函数注入，提前加载
        this.addressMapper = addressMapper;
        this.redisCacheService = redisCacheService;
        List<Address> list = addressMapper.list();
        //地址信息24小时过期，设置之前先清除
        redisCacheService.setCacheList("addressList", list, 24l);
    }

    AddressMapper addressMapper;
    RedisCacheService redisCacheService;

    @Override
    public void create(org.chaoxuan.zeus.model.Address address) {
        addressMapper.insertSelective(address);
    }

    @Override
    public List<Address> searchByPid(int id) {
        List<Address> list = new ArrayList<>();
        list = getFromCache(id);
        //先从缓存中取
        if (list.size() != 0)
            return list;
        else
            return addressMapper.searchByPid(id);
    }

    @Override
    public List<Address> list() {
        return addressMapper.list();
    }

    List<Address> getFromCache(int pid) {
        List<Address> list = redisCacheService.getCacheList("addressList");
        List<Address> result = new ArrayList<>();
        Iterator<Address> iterator = list.iterator();
        while (iterator.hasNext()) {
            Address address = iterator.next();
            if (address.getPid() == pid)
                result.add(address);
        }
        return result;
    }

    @Override
    public boolean hasChildren(Address address) {
        List list = searchByPid(address.getId());
        if (list.size() > 0)
            return true;
        else
            return false;
    }

    @Override
    public Address getById(int id) {
        return addressMapper.selectByPrimaryKey(id);
    }

    public void listAddress(List<CascaderOption> list,Address address){
        List<Address> addressList=searchByPid(address.getId());
        for(Address addr:addressList){
            CascaderOption cascaderOption=new CascaderOption();
            cascaderOption.setLabel(addr.getName());
            cascaderOption.setValue(Integer.toString(addr.getId()));
            if(hasChildren(addr))
            {
                List<CascaderOption> children=new ArrayList<>();
                listAddress(children,addr);
                cascaderOption.setChildren(children);
                list.add(cascaderOption);
            }
            else
            {
                list.add(cascaderOption);
            }
        }
    }

    @Override
    public void transAddress(OwnerHomeInfo ownerHomeInfo) {

        List<String> address=JSON.parseObject(ownerHomeInfo.getCity(),new TypeReference<List<String>>(){});

        for(int i=0;i<address.size();i++)
        {
            if(i==0) {
                String city = getById(Integer.parseInt(address.get(i))).getName();
                ownerHomeInfo.setCity(city);
                continue;
            }
            if(i==1)
            {
                String district = getById(Integer.parseInt(address.get(i))).getName();
                ownerHomeInfo.setDistrict(district);
                continue;
            }
            if(i==2)
            {
                String street = getById(Integer.parseInt(address.get(i))).getName();
                ownerHomeInfo.setStreet(street);
                continue;
            }
            if(i==3)
            {
                String community = getById(Integer.parseInt(address.get(i))).getName();
                ownerHomeInfo.setCommunity(community);
                continue;
            }
            if(i==4)
            {
                String houseNumber = getById(Integer.parseInt(address.get(i))).getName();
                ownerHomeInfo.setHouseNumber(houseNumber);
                continue;
            }
        }
    }
}
