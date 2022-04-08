package com.sherlock.service;

import com.sherlock.dao.UserDao;
import com.sherlock.dao.UserDaoImp;

public class UserServiceImp implements UserDao {
    private UserDao userdao ;

    public void setUserdao(UserDao userdao) {
        this.userdao = userdao;
    }

    @Override
    public void getUser() {
        userdao.getUser();
    }

    @Override
    public String toString() {
        return "UserServiceImp{" +
                "userdao=" + userdao +
                '}';
    }
}
