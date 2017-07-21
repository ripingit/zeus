package fitTest;

import org.chaoxuan.zeus.model.FitOrderLog;
import org.chaoxuan.zeus.service.FitOrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by Administrator on 2017/5/16 0016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:config/spring-mybatis.xml")
public class FitOrderLogTest {
    @Autowired
    private FitOrderService fitOrderService;
    @Test
    public void testGetLastOrderLog(){
        FitOrderLog log=fitOrderService.getLastFitOrderLogByOrderCode("2016");
        System.out.println(log);
    }
    @Test
    public  void testListOrderLog(){
        List<FitOrderLog> list=fitOrderService.listFitOrderLogByOrderCode("2016");
        System.out.println(list.size());
    }
}
