//import com.sherlock.dao.User;
import com.sherlock.config.ConfigL;
import com.sherlock.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MyTest7 {
    @Test
    public void test(){

        //ApplicationContext context = new AnnotationConfigApplicationContext(ConfigL.class);
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //getUse2是bean的id
        User getUser1 = context.getBean("user",User.class);
        User getUser2 = context.getBean("getUser7",User.class);

        System.out.println(getUser1.getName());
        System.out.println(getUser1.equals(getUser2));


    }
}
