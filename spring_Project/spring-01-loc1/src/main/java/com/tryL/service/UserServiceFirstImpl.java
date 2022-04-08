package com.tryL.service;
import com.tryL.dao.UserDao;

public class UserServiceFirstImpl implements UserService {
    private UserDao dao;

    public UserServiceFirstImpl(UserDao dao) {
        this.dao = dao;
    }

    public UserServiceFirstImpl() {
    }

    public void setDao(UserDao dao) {
        this.dao = dao;
    }

    public void getService() {
        dao.getDAO();
    }
}
