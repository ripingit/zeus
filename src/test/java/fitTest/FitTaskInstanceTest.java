package fitTest;

import org.chaoxuan.zeus.model.FitTaskInstance;
import org.chaoxuan.zeus.model.State;
import org.chaoxuan.zeus.service.FitTaskInstanceService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/5/16 0016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:config/spring-mybatis.xml", "classpath:config/spring-redis.xml"})
public class FitTaskInstanceTest {
    @Autowired
    private FitTaskInstanceService fitTaskInstanceService;
    @Test
    public void testGetByOrderId(){
        List<FitTaskInstance> fitTaskInstance=fitTaskInstanceService.searchByOrderId(1);
        System.out.println(fitTaskInstance.size());
    }
    @Test
    public void testGetByOrderAndPhase(){
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("phase",1);
        map.put("order",1);
        List<FitTaskInstance> fitTaskInstance=fitTaskInstanceService.searchByOrderAndPhase(map);
        System.out.println(fitTaskInstance.size());
    }
@Test
    public void testCreate(){
    List<FitTaskInstance> fitTaskInstances=fitTaskInstanceService.searchByOrderId(1);
    FitTaskInstance fitTaskInstance=fitTaskInstances.get(0);
    fitTaskInstance.setState(State.COMPLETED.getTitle());
    fitTaskInstanceService.create(fitTaskInstance);

}

}
