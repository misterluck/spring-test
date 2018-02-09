package example05;

import org.demo.example05.config.TestConfig;
import org.demo.example05.service.TestBean;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestConfig.class)
@ActiveProfiles(value = "dev")
public class TestExample05 {

    @Autowired
    private TestBean testBean;

    @Test
    public void testExample05() {
        System.out.println(testBean.getContent());
    }

}
