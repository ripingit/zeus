package fitTest;

import org.chaoxuan.zeus.model.*;
import org.chaoxuan.zeus.service.RequirementMachineService;
import org.chaoxuan.zeus.service.RequirementProductService;
import org.chaoxuan.zeus.service.RequirementWorkerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.swing.text.html.HTMLDocument;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by Administrator on 2017/5/16 0016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:config/spring-mybatis.xml", "classpath:config/spring-redis.xml"})
public class RequirementTest {
    @Autowired
    private RequirementProductService requirementProductService;
    @Autowired
    private RequirementWorkerService requirementWorkerService;
@Autowired
private RequirementMachineService requirementMachineService;
    @Test
    public void testSearchProductByTaskId() {
        List<RequirementProduct> productList = requirementProductService.searchByTaskInstanceId(2);
        System.out.println(productList.size());
    }

    @Test
    public void testSearchWorkerByTaskId() {
        List<RequirementWorker> workerList = requirementWorkerService.searchByTaskInstanceId(1);
        System.out.println(workerList.size());
    }

    @Test
    public void testSearchMachineByTaskId() {
        List<RequirementMachine> machineList = requirementMachineService.searchByTaskInstanceId(1);
        System.out.println(machineList.size());
    }
    @Test
    public void testGetById(){
        RequirementProduct requirementProduct=requirementProductService.getById(1);
        System.out.println(requirementProduct);
    }
    @Test
    public void requirement(){
        int []a={1,2,3,4,5};
        SendOrder sendOrder=new SendOrder();
        DateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
        Date start = null;
        Date end=null;
        try {
            start = dateFormat1.parse("2017-05-10");
            end = dateFormat1.parse("2017-05-9");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        sendOrder.setArrivalTime(start);
//        sendOrder.setArrivalTimeEnd(end);
        Map map=new HashMap();
        map.put("ids",a);
        map.put("sendOrder",sendOrder);
      List<RequirementWorker> list=requirementWorkerService.searchByOrderIds(map);
        Iterator<RequirementWorker> iterator=list.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
    @Test
    public void testWithTask(){
       RequirementWorkerWithTask workerWithTask= requirementWorkerService.getWithTaskById(1);
        System.out.println(workerWithTask);
    }
}
