package com.sherlock.demo3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInvocationHandler implements InvocationHandler {

    private Rent rent;

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    //生成代理对象
    public Object getProxy() {
        //返回代理类对象
        /*
         * parameter0:这个类的类加载器
         * parameter1:代理的接口的类加载器
         * parameter2:生成代理的方法
         * */
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), rent.getClass().getInterfaces(), this);
    }

    //调用 生成的代理对象 的方法
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        seeHouse();
        Object result = method.invoke(rent, args);
        flare();
        return result;
    }

    public void seeHouse(){
        System.out.println("seehosue");
    }

    public void flare(){
        System.out.println("flare");
    }
}
