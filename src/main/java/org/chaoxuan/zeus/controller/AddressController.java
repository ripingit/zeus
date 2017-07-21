package org.chaoxuan.zeus.controller;

import org.chaoxuan.zeus.model.Address;
import org.chaoxuan.zeus.model.CascaderOption;
import org.chaoxuan.zeus.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/7/5 0005.
 */
@Controller
@RequestMapping(value = "address", method = RequestMethod.GET)
public class AddressController extends BaseController {
    @Autowired
    private AddressService addressService;

    @RequestMapping("/list")
    public void getAddressByPid(HttpServletResponse response) {
        List<CascaderOption> list = new ArrayList<>();
        Address address = addressService.getById(1);
        addressService.listAddress(list, address);
        super.json(response, list);
    }
}
