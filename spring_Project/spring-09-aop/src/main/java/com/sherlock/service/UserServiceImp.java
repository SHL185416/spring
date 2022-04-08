package com.sherlock.service;

public class UserServiceImp implements UserService {


    //Quickly add log function in each method
    //Add a proxy role
    @Override
    public void add() {
        System.out.println("add");
    }

    @Override
    public void delete() {
        System.out.println("delete");
    }

    @Override
    public void modify() {
        System.out.println("modify");
    }

    @Override
    public void query() {
        System.out.println("query");
    }
}

