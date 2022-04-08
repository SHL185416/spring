
import com.sherlock.service.UserService;
import com.sherlock.service.UserServiceImp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest9 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //aop MethodBeforeAdvice AfterReturningAdvice 都要 target
        //动态代理的是接口
        UserService userService =context.getBean("userService", UserService.class);
        userService.add();

    }
}
