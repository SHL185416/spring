package com.sherlock.demo2;



public class Client {
    public static void main(String[] args) {
        UserServiceImp userServiceImp = new UserServiceImp();
//        userServiceImp.add();

        UserServiceImpProxy userServiceImpProxy = new UserServiceImpProxy(userServiceImp);
        userServiceImpProxy.query();

    }
}
