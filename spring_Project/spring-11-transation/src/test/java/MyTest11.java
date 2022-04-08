import com.sherlock.mapper.UserMapperImpl;
import com.sherlock.pojo.User111;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest11 {
    @Test
    public void test() {
        //mybatis配置
//        String resource = "mybatis-config.xml";
//        InputStream resourceAsStream = Resources.getResourceAsStream(resource);
//
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);

        //spring配置代理
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapperImpl userMapperImpl2 = context.getBean("userMapperImpl2", UserMapperImpl.class);

        List<User111> list = userMapperImpl2.selectUser();
        for (User111 user111 : list) {
            System.out.println(user111.toString());
        }

//        User111 user111 = new User111(4,"user4","123456");
//        userMapperImpl2.addUser(user111);


//        userMapperImpl2.delectUser(1);


    }
}
