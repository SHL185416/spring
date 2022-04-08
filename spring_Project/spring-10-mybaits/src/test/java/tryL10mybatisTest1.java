import com.tryL10.mapper.UserMapper;
import com.tryL10.pojo.User14;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

//不需要实现UserMapper interface
public class tryL10mybatisTest1 {
    public static void main(String[] args) throws IOException {
        //mybatis配置
        //配置数据库信息 与 Mapper.xml的位置
        String resource = "tryL10mybatisConfig.xml";
        InputStream resourceAsStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User14> user14List = mapper.selectUser14();
        for (User14 user14 : user14List) {
            System.out.println(user14.toString());

        }
    }
}
