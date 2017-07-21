package fitTest;

import org.chaoxuan.zeus.model.FitOrder;
import org.chaoxuan.zeus.model.HouseType;
import org.chaoxuan.zeus.model.OwnerInfo;
import org.chaoxuan.zeus.model.Phase;
import org.chaoxuan.zeus.service.FitOrderService;
import org.chaoxuan.zeus.service.OwnerInfoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by Administrator on 2017/5/15 0015.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:config/spring-mybatis.xml", "classpath:config/spring-redis.xml"})
public class FitOrderTest {
    @Autowired
    private FitOrderService fitOrderService;
    @Autowired
    private OwnerInfoService ownerInfoService;

    @Test
    public void testGetFitOrder() {
        FitOrder fitOrder = fitOrderService.getFitOrder(1);

        System.out.println(fitOrder);
    }

    @Test
    public void testHouseType() {
        HouseType h = fitOrderService.getHouseTypeByOrderId(1);
        System.out.println(h);
    }

    @Test
    public void testGetOrderList() {
        List<Phase> list = fitOrderService.getPhaseListByOrderId(1);
        System.out.println(list);
    }

    @Test
    public void testCdays() {
        int tDays = fitOrderService.getTotalDaysByOrderId(1);
        int cDays = fitOrderService.getCompletedDaysByOrderId(1);
        System.out.println("总天数" + tDays + "，已完成天数" + cDays);
    }

    @Test
    public void testOwner() {
        OwnerInfo o = ownerInfoService.getById(1);
        System.out.println(o);
    }
}
