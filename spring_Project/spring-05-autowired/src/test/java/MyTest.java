
import com.sherlock.pojo.People;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test2(){
        //springAnnotationbeans
        ApplicationContext context = new ClassPathXmlApplicationContext("springAnnotationbeans.xml");
        People people = context.getBean("people", People.class);

        System.out.println(people.toString());
        people.getCat().Cry();
        people.getDog().Cry();

    }
}
