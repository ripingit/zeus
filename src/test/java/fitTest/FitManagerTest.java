package fitTest;

import org.chaoxuan.zeus.model.FitManager;
import org.chaoxuan.zeus.service.FitOrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Administrator on 2017/5/16 0016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:config/spring-mybatis.xml")
public class FitManagerTest {
    @Autowired
    private FitOrderService fitOrderService;
    @Test
    public void testGetManager(){
      FitManager manager= fitOrderService.getFitManagerByOrderId(1);
        System.out.println(manager);
    }
}
