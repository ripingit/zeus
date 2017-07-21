package ownerTest;

import org.chaoxuan.zeus.dao.OwnerInfoMapper;
import org.chaoxuan.zeus.model.*;
import org.chaoxuan.zeus.service.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by Administrator on 2017/5/16 0016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:config/spring-mybatis.xml", "classpath:config/spring-redis.xml"})
public class OwnerTest {
    @Autowired
    private AddressService addressService;
    @Autowired
    private OwnerInfoService ownerInfoService;
    @Autowired
    RedisCacheService redisCacheService;
    @Autowired
    FitOrderService fitOrderService;
    @Autowired
    OwnerInfoMapper ownerInfoMapper;
    @Autowired
    MeasureOrderService measureOrderService;
@Autowired
    OwnerHomeInfoService ownerHomeInfoService;
    @Test
    public void testOwner() {
        Address address = new Address();
        address.setName("北京");
        addressService.create(address);
        System.out.println(address);
    }

    @Test
    public void testFindAddress() {
        List list = addressService.searchByPid(1);
        Iterator<Address> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().getName());
        }
    }

    @Test
    public void testCache() {
        List<Address> list = addressService.list();
        redisCacheService.setCacheList("addressList", list, 24l);
    }

    @Test
    public void getCache() {
        List<Address> list = redisCacheService.getCacheList("addressList");
        Iterator<Address> iterator = list.iterator();
        Map<String, Object> addressMap = new HashMap<String, Object>();
        List<CascaderOption> cascaderOptions = new ArrayList<>();
        while (iterator.hasNext()) {
            Address address = iterator.next();
            CascaderOption cascaderOption = new CascaderOption();
            cascaderOption.setValue(Integer.toString(address.getId()));
            cascaderOption.setLabel(address.getName());
            //查询是否有子
            List<Address> addressList = addressService.searchByPid(address.getId());
            //有子则
        }

    }

    @Test
    public void testListAddress() {
        List<CascaderOption> cascaderOptions = new ArrayList<>();
        Address address = addressService.getById(1);
        addressService.listAddress(cascaderOptions, address);
        System.out.println(cascaderOptions);
    }

    @Test
    public void testString() {
        String[] a = new String[2];
        a[0] = "11";
        a[1] = "12";
        OwnerHomeInfo ownerHomeInfo = new OwnerHomeInfo();
        int size = a.length;
        for (int i = 0; i < size; i++) {
            if (i == 0) {
                String city = addressService.getById(Integer.parseInt(a[i])).getName();
                ownerHomeInfo.setCity(city);
                continue;
            }
            if (i == 1) {
                String district = addressService.getById(Integer.parseInt(a[i])).getName();
                ownerHomeInfo.setDistrict(district);
                continue;
            }
            if (i == 2) {
                String street = addressService.getById(Integer.parseInt(a[i])).getName();
                ownerHomeInfo.setStreet(street);
                continue;
            }
            if (i == 3) {
                String community = addressService.getById(Integer.parseInt(a[i])).getName();
                ownerHomeInfo.setCommunity(community);
                continue;
            }
            if (i == 4) {
                String houseNumber = addressService.getById(Integer.parseInt(a[i])).getName();
                ownerHomeInfo.setHouseNumber(houseNumber);
                continue;
            }
        }
        System.out.println(ownerHomeInfo);
    }

    @Test
    public void testGetByPhone() {
        OwnerInfo ownerInfo = ownerInfoService.getByUserId("13800138000");
        System.out.println(ownerInfo);
    }

    @Test
    public void testSendOrder() {
        SendOrder sendOrder = new SendOrder();
        sendOrder.setManagerId(1);
        sendOrder.setStart(0);
        sendOrder.setRowCount(5);
        DateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date start = null;
        Date end = null;
        try {
            start = dateFormat1.parse("2017-05-01 00:00:00");
            end = dateFormat1.parse("2017-05-13");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        sendOrder.setCreateTime(start);
        sendOrder.setCreateTimeEnd(end);
        // sendOrder.setState(7);
        List<SendOrder> sendOrders = fitOrderService.sendOrderSearch(sendOrder);
        Iterator<SendOrder> iterator = sendOrders.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
        System.out.println(fitOrderService.sendOrderSearchCount(sendOrder));
    }

    @Test
    public void TestTime() {
        String str = "2017-07-12T16:00:00.000Z";
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS Z");
        try {
            Date d = format.parse(str.replace("Z", " UTC"));//注意是空格+UTC
            System.out.println(d);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void TestOwner() {
        OwnerInfoExtend ownerInfoExtend = new OwnerInfoExtend();
        ownerInfoExtend.setId(1);
        List<OwnerInfo> ownerInfos = ownerInfoMapper.getOwnerInfo(ownerInfoExtend);
        System.out.println(ownerInfos.size());
    }
    @Test
    public void testCreate(){
        OwnerInfo ownerInfo=new OwnerInfo();
        ownerInfo.setUserId("12323123");
        ownerInfoService.create(ownerInfo);
    }
    @Test
    public void testCreateHome(){
        OwnerHomeInfo ownerHomeInfo=new OwnerHomeInfo();
        ownerHomeInfo.setUserId(111);
        ownerHomeInfoService.create(ownerHomeInfo);
    }
    @Test
    public void testMeasure(){
        MeasureOrder measureOrder=new MeasureOrder();
        measureOrder.setUserId(111);
        measureOrderService.create(measureOrder);
    }
}
