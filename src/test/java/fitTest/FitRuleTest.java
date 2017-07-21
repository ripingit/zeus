package fitTest;

import org.chaoxuan.zeus.model.FitRule;
import org.chaoxuan.zeus.model.FitTask;
import org.chaoxuan.zeus.service.FitRuleService;
import org.chaoxuan.zeus.service.FitTaskService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:config/spring-mybatis.xml", "classpath:config/spring-redis.xml"})
public class FitRuleTest {
    @Autowired
    private FitTaskService fitTaskService;
@Autowired
private FitRuleService fitRuleService;
    @Test
    public void testSearchByVersion() {
        List<FitTask> list = fitTaskService.searchByVersion("1.0");
        System.out.println(list.size());

    }
    @Test
    public void chedkVersion(){
        FitRule testRule = new FitRule();
        testRule.setVersion("1.3");
        List<FitRule> rules = fitRuleService.queryFitRule(testRule);
    }
}
