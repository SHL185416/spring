import com.sherlock.mapper.UserMapperImpl;
import com.sherlock.mapper.UserMapperImpl2;
import com.sherlock.pojo.User12;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import java.util.List;

public class MyTest_two {
    @Test
    public void test(){
        //mybatis配置
//        String resource = "mybatis-config.xml";
//        InputStream resourceAsStream = Resources.getResourceAsStream(resource);
//
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);

        //spring配置代理
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapperImpl2 userMapperImpl2 = context.getBean("userMapperImpl2", UserMapperImpl2.class);

        List<User12> list = userMapperImpl2.selectUser();
        for (User12 user12 : list ) {
            System.out.println(user12.toString());
        }
    }
}
