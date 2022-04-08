package com.tryL3.pojo;

public class Student {
    private int age;
    private String school;
    private String name;

    public Student() {
    }

    public Student(int age, String school, String name) {
        this.age = age;
        this.school = school;
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", school='" + school + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
