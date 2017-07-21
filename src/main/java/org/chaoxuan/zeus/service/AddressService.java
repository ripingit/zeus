package org.chaoxuan.zeus.service;

import org.chaoxuan.zeus.model.Address;
import org.chaoxuan.zeus.model.CascaderOption;
import org.chaoxuan.zeus.model.OwnerHomeInfo;

import java.util.List;

/**
 * Created by Administrator on 2017/7/3 0003.
 */
public interface AddressService {
   void create(Address address);
   List<Address> searchByPid(int id);
   List<Address> list();
   boolean hasChildren(Address address);
   Address getById(int id);
   void listAddress(List<CascaderOption> list, Address address);
   void transAddress(OwnerHomeInfo ownerHomeInfo);
}
