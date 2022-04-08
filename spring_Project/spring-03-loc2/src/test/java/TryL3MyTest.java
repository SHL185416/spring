
import com.sherlock.pojo.User;
import com.tryL3.pojo.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TryL3MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("tryL3applicationContext.xml");
        Student student = context.getBean("student", Student.class);
        System.out.println(student.toString());


    }
}
