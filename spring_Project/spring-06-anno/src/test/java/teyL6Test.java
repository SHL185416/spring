
import com.tryL.pojo.People;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class teyL6Test {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("tryL6beans.xml");
        People people = context.getBean("people", People.class);
        System.out.println(people.toString());

    }
}
