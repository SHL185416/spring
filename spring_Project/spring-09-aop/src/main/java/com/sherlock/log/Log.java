package com.sherlock.log;

import org.springframework.aop.MethodBeforeAdvice;
import java.lang.reflect.Method;

public class Log implements MethodBeforeAdvice {

    //target：要代理一类对象
    @Override
    public void before(Method method, Object[] agrs, Object target) throws Throwable {
        System.out.println(method.getClass().getName() + " 的类 " + method.getName() + " 的方法被调用");

    }
}
