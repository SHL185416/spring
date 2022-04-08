import com.sherlock.service.UserServiceImp;
import com.tryL.service.UserServiceFirstImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TryLTest {
    public static void main(String[] args) {
//        获取Spring容器
//        Set 注入
        ApplicationContext context = new ClassPathXmlApplicationContext("tryLbean.xml");
        UserServiceFirstImpl userServiceSet = context.getBean("userServiceSetImpL", UserServiceFirstImpl.class);
        userServiceSet.getService();

        ApplicationContext context1 = new ClassPathXmlApplicationContext("tryLbean.xml");
        UserServiceFirstImpl userServiceConstruct = context1.getBean("userServiceConstruct", UserServiceFirstImpl.class);
        userServiceConstruct.getService();
    }
}
