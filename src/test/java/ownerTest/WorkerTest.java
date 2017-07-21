package ownerTest;

import org.chaoxuan.zeus.model.FitManager;
import org.chaoxuan.zeus.service.FitManagerService;
import org.chaoxuan.zeus.service.WorkerService;
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
 * Created by Administrator on 2017/7/12 0012.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:config/spring-mybatis.xml", "classpath:config/spring-redis.xml"})
public class WorkerTest {
    @Autowired
    private WorkerService workerService;
    @Autowired
    private FitManagerService fitManagerService;
    @Test
    public void testWorker(){
        Map map=new HashMap();
        DateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
        Date start = null;
        Date end=null;
        try {
            start = dateFormat1.parse("2017-05-9");
            end = dateFormat1.parse("2017-05-13");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        map.put("type","1");
        map.put("start",start);
        map.put("end",end);
        workerService.searchByMap(map);
    }
    @Test
    public void TestAddress(){
        Map map=new HashMap();
        map.put("1","2");
        List<FitManager> list=new ArrayList<>();
        list.add(new FitManager());
       list =fitManagerService.searchByArea("北京");
        System.out.println(list.size());
    }
}
