package com.sherlock.demo2;

public class UserServiceImpProxy implements UserService {

    private UserServiceImp userServiceImp;

    public UserServiceImpProxy(UserServiceImp userServiceImp) {
        this.userServiceImp = userServiceImp;
    }

    @Override
    public void add() {
        log("add");
        userServiceImp.add();
    }

    @Override
    public void delete() {
        log("delete");
        userServiceImp.delete();
    }

    @Override
    public void modify() {
        log("modify");
        userServiceImp.modify();
    }

    @Override
    public void query() {
        log("query");
        userServiceImp.query();
    }

    public void log(String message){
        System.out.println("[DEBUG]: this "+ message +" method is used");
    }
}

