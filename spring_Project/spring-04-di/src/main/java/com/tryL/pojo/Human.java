package com.tryL.pojo;

import com.sherlock.pojo.Address;

import java.util.*;

public class Human {
    private String name;
    private String girlfriend;
    private Properties resume;
    private Pets pet;
    private String[] books;
    private List<String> hobby;
    private Map<String, String> car;
    private Set<String> game;

    public void setName(String name) {
        this.name = name;
    }

    public void setGirlfriend(String girlfriend) {
        this.girlfriend = girlfriend;
    }

    public void setResume(Properties resume) {
        this.resume = resume;
    }

    public void setPet(Pets pet) {
        this.pet = pet;
    }

    public void setBooks(String[] books) {
        this.books = books;
    }

    public void setHobby(List<String> hobby) {
        this.hobby = hobby;
    }

    public void setCar(Map<String, String> car) {
        this.car = car;
    }

    public void setGame(Set<String> game) {
        this.game = game;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", girlfriend='" + girlfriend + '\'' +
                ", resume=" + resume +
                ", pet=" + pet +
                ", books=" + Arrays.toString(books) +
                ", hobby=" + hobby +
                ", car=" + car +
                ", game=" + game +
                '}';
    }
}
