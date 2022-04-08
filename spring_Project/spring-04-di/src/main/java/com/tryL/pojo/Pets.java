package com.tryL.pojo;

public class Pets {
    String petName;

    public Pets(String petName) {
        this.petName = petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    @Override
    public String toString() {
        return "Pets{" +
                "petName='" + petName + '\'' +
                '}';
    }
}
