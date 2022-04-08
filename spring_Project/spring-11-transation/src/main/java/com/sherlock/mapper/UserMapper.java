package com.sherlock.mapper;

import com.sherlock.pojo.User111;

import java.util.List;

public interface UserMapper {
    //错误的引用了另一个包
    List<User111> selectUser();

    public int addUser(User111 user111);

    public int deleteUser(int id);
}
