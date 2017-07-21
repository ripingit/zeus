package fitTest;

import org.chaoxuan.zeus.model.TotalRequirementMachine;
import org.chaoxuan.zeus.model.TotalRequirementProduct;
import org.chaoxuan.zeus.model.TotalRequirementWorker;
import org.chaoxuan.zeus.service.TotalRequirementMachineService;
import org.chaoxuan.zeus.service.TotalRequirementProductService;
import org.chaoxuan.zeus.service.TotalRequirementWorkerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by Administrator on 2017/5/19 0019.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:config/spring-mybatis.xml")
public class TotalRequirementTest {
    @Autowired
    TotalRequirementMachineService totalRequirementMachineService;
    @Autowired
    TotalRequirementProductService totalRequirementProductService;
    @Autowired
    TotalRequirementWorkerService totalRequirementWorkerService;
    @Test
    public  void test1(){
        List<TotalRequirementMachine> list1=totalRequirementMachineService.getByOrderId(1);
        List<TotalRequirementProduct> list2=totalRequirementProductService.getByOrderId(1);
        List<TotalRequirementWorker> list3=totalRequirementWorkerService.getByOrderId(1);
        System.out.println(111);
    }
}
