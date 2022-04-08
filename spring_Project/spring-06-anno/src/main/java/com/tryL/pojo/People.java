package com.tryL.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class People {
    @Resource
    private Cat cat2;
    @Resource
    private Dog dog;
    @Value("peopleName")
    private String name;


    @Override
    public String toString() {
        return "People{" +
                "cat=" + cat2 +
                ", dog=" + dog +
                ", name='" + name + '\'' +
                '}';
    }
}
