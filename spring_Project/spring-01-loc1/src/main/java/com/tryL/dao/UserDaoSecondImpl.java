package com.tryL.dao;

public class UserDaoSecondImpl implements UserDao{
    public static void main(String[] args) {
        new UserDaoSecondImpl().getDAO();

    }

    @Override
    public void getDAO() {
        System.out.println("getDAO: UserDaoSecondImpl");
    }
}
