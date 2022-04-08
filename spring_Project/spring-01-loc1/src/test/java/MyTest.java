import com.sherlock.dao.UserDao;
import com.sherlock.dao.UserDaoImp;
import com.sherlock.dao.UserMySQLImp;
import com.sherlock.service.UserServiceImp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        //获取Spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserServiceImp userServiceImp = (UserServiceImp)context.getBean("userServiceImp");

        userServiceImp.getUser();
    }
}
