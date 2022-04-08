
import com.sherlock.pojo.User;
import com.tryL.pojo.Human;
import com.tryL.pojo.Pets;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class tryL4MyTest {

    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("tryL4propertyTypebeans.xml");
        Human human = context.getBean("people1", Human.class);
        System.out.println(human.toString());

        Pets pet1 = context.getBean("pet1", Pets.class);
        System.out.println(pet1.toString());
        pet1.setPetName("hello puppy");
        System.out.println(pet1.toString());
    }

}
