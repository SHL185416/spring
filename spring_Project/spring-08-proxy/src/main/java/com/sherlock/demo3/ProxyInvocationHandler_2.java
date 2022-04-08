package com.sherlock.demo3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//
public class ProxyInvocationHandler_2 implements InvocationHandler {
    private Object ProxyInterface;

    public void setRent(Object ProxyInterface) {
        this.ProxyInterface = ProxyInterface;
    }

    //生成代理对象
    public Object getProxy() {
        //返回代理类对象
        /*
         * parameter0:这个类的类加载器
         * parameter1:代理的接口的类加载器
         * parameter2:生成代理的方法
         * */
        Object res = Proxy.newProxyInstance(this.getClass().getClassLoader(), ProxyInterface.getClass().getInterfaces(), this);
        return res;
    }

    //调用 生成的代理对象 的方法
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        log(method.getName());
        Object result = method.invoke(ProxyInterface, args);

        return result;
    }

    public void log(String meseage){
        System.out.println(meseage + " method is used");
    }

}
