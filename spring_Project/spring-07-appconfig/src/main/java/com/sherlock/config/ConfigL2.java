package com.sherlock.config;

import com.sherlock.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@Configuration注解本身就被@Component修饰
@Configuration //@Configuration修饰的类是一个修饰类
@ComponentScan("com.sherlock.pojo")
public class ConfigL2 {

    //相当于xml中的一个bean标签
    //方法名是bean tag 的 id
    @Bean
    public User getUser7(){
        System.out.println("getUser7");
        return new User(); //注入bean中的对象
    }
}
