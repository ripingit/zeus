package org.chaoxuan.zeus.service;

import org.chaoxuan.zeus.page.PageOwner;

import java.util.List;
import java.util.Map;


/**
 * @author Yurnero
 * @data 2017/6/12
 * @description TODO
 */
public interface PageOwnerService {

    Map<String, List<PageOwner>> list(Integer managerId,Integer status);

    List<PageOwner> findAllOrder(Integer managerId,Integer status);
}
