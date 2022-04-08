import com.sherlock.mapper.UserMapper;
import com.sherlock.mapper.UserMapperImpl;
import com.sherlock.pojo.User12;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.List;

public class MyTest_class {
    @Test
    public void test() throws IOException {
        //mybatis配置
//        String resource = "mybatis-config.xml";
//        InputStream resourceAsStream = Resources.getResourceAsStream(resource);
//
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);

        //spring配置代理
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapperImpl userMapperImpl1 = context.getBean("userMapperImpl1", UserMapperImpl.class);

        List<User12> list = userMapperImpl1.selectUser();
        for (User12 user12 : list ) {
            System.out.println(user12.toString());
        }

    }
}
