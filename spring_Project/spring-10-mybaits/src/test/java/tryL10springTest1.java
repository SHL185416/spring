
import com.tryL10.mapper.UserMapper;
import com.tryL10.mapper.UserMapperImpl;
import com.tryL10.pojo.User14;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class tryL10springTest1 {
    public static void main(String[] args) throws IOException {
        //mybatis配置
        //配置数据库信息 与 Mapper.xml的位置

        //在spring xml中管理了
//        String resource = "tryL10mybatisConfig.xml";
//        InputStream resourceAsStream = Resources.getResourceAsStream(resource);
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //sqlSessionFactory to sqlSessionTemplate
//        SqlSession sqlSession = sqlSessionFactory.openSession();
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        ApplicationContext context = new ClassPathXmlApplicationContext("trtL10aplicationContext.xml");
        UserMapperImpl userMapperImpl = context.getBean("userMapperImpl", UserMapperImpl.class);

        List<User14> user14List = userMapperImpl.selectUser14();
        for (User14 user14 : user14List) {
            System.out.println(user14.toString());

        }

    }

}
