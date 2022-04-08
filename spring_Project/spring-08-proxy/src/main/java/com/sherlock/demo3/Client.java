package com.sherlock.demo3;

public class Client {
    public static void main(String[] args) {
        Host host = new Host();
        //通过plh调用生成代理实例的方法
        ProxyInvocationHandler_2 plh = new ProxyInvocationHandler_2();


        plh.setRent(host);
        //动态生成的代理类
        Rent proxy = (Rent) plh.getProxy();

        System.out.println("this");
        System.out.println("out 1");
        //通过invoke实现
        proxy.rent();
        System.out.println("out 2");


    }
}
