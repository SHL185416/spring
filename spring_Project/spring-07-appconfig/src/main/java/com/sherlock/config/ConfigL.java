package com.sherlock.config;

import com.sherlock.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

//@Configuration注解本身就被@Component修饰
@Configuration //@Configuration修饰的类是一个修饰类
@ComponentScan("com.sherlock.pojo")
@Import(ConfigL2.class) //把ConfigL2.class这个配置类引入到ConfigL2.class
public class ConfigL {

}
