import com.sherlock.mapper.UserMapperImpl2;
import com.tryL10.mapper.UserMapperSqlSessionDaoImpl;
import com.tryL10.pojo.User14;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import java.io.IOException;
import java.util.List;

public class tryL10DaoSupportTest2 {
    public static void main(String[] args) throws IOException {


        ApplicationContext context = new ClassPathXmlApplicationContext("trtL10aplicationContext.xml");
        UserMapperSqlSessionDaoImpl userMapperSqlSessionDao = context.getBean("userMapperSqlSessionDao", UserMapperSqlSessionDaoImpl.class);


        List<User14> user14List = userMapperSqlSessionDao.selectUser14();

        for (User14 user14 : user14List) {
            System.out.println(user14.toString());

        }
    }

}
