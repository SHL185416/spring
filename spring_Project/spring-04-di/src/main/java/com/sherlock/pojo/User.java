package com.sherlock.pojo;

public class User {
    private String name;
    private int num;

    public User(String name, int num) {
        this.name = name;
        this.num = num;
    }


    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public User() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println( "User{" +
                "name='" + name + '\'' +" "+
                "num='" + num + '\'' +
                '}');
    }
}

