package fitTest;

import org.chaoxuan.zeus.model.FitTask;
import org.chaoxuan.zeus.service.FitTaskService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by Administrator on 2017/5/26 0026.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:config/spring-mybatis.xml")
public class FitTaskTest {
    @Autowired
    private FitTaskService fitTaskService;
    @Test
    public void testSearchByIds(){
        String ids="1,2,3";
       List<FitTask> list= fitTaskService.searchByIds(ids);
        System.out.println(list);
    }
    @Test
    public  void testList(){
        List<FitTask> list=fitTaskService.list();
        System.out.println(list.size());
    }
    @Test
    public void testBatchInsert(){
        List<FitTask> list=fitTaskService.searchByIds("1,2,3,4");
        for (FitTask fitTask:list
             ) {
            fitTask.setVersion("3.0");
        }
        fitTaskService.batchInsert(list);
    }

}
