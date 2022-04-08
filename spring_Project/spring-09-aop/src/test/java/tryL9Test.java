import com.tryL9.service.UserService;
import com.tryL9.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class tryL9Test {
    public static void main(String[] args) {
        //使用Spring原生API  配置aop
/*        ApplicationContext context = new ClassPathXmlApplicationContext("tryL9spring.xml");
        // userServiceImpl12 是 类的对象
        UserService userServiceImpl = context.getBean("userServiceImpl12", UserService.class);
        userServiceImpl.add();*/
        //DIY aop
/*        ApplicationContext context = new ClassPathXmlApplicationContext("tryL9diy.xml");
        UserService userServiceImpl12 = context.getBean("userServiceImpl12", UserService.class);
        userServiceImpl12.divide();*/

        ApplicationContext context = new ClassPathXmlApplicationContext("tryL9annotation.xml");
        UserService userServiceImpl12 = context.getBean("userServiceImpl12", UserService.class);
        userServiceImpl12.multiply();

    }
}
