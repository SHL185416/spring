package com.sherlock.dao;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//equal to <bean id="user" class="com.sherlock.dao.User"/>
//可以不需要set get 方法
@Component
public class User {
    public String name = "Username";
    //equal to set 注入值到 String age
    //porperty
    @Value("17")
    public String age;

}
