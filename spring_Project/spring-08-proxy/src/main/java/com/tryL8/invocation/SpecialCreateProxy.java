package com.tryL8.invocation;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class SpecialCreateProxy implements InvocationHandler {

    private Rent rent;

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    public Object getProxy(){
        System.out.println("SpecialCreateProxy getProxy");
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), rent.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        seeHouse();
        tipping();
        Object res = method.invoke(rent,args);
        return null;
    }

    public void seeHouse() {
        System.out.println("see house");
    }

    public void tipping() {
        System.out.println("tipping");
    }
}
