import edu.tongji.comm.spring.demo.aspect.LogAspect;
import edu.tongji.comm.spring.demo.domain.User;
import edu.tongji.comm.spring.demo.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by chen on 2017/7/4.
 */


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-context.xml"})
public class UserServiceTest {

    @Autowired
    private UserService userService;


    @Test
    public void testSelectUser() {
        User user = userService.selectUser(1);
        System.out.println(user.getUsername());
        System.out.println(user.getPassword());
    }



}
