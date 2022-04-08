package com.tryL8.invocation;



import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class BestCreateProxy implements InvocationHandler {

    private Object togetherInterface;

    public void setTogetherInterface(Rent togetherInterfact) {
        this.togetherInterface = togetherInterfact;
    }

    public Object getProxy(){
        System.out.println("BestCreateProxy getProxy");

        return Proxy.newProxyInstance(this.getClass().getClassLoader(), togetherInterface.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        seeHouse();
        tipping();
        Object res = method.invoke(togetherInterface,args);
        return null;
    }

    public void seeHouse() {
        System.out.println("see house");
    }

    public void tipping() {
        System.out.println("tipping");
    }
}
