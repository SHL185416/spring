package com.tryL8.normality;

public class Proxy implements Rent {
    private Landlord landlord;

    public Proxy() {
    }

    public void setLandlord(Landlord landlord) {
        this.landlord = landlord;
    }

    @Override
    public void rentHouse() {
        landlord.rentHouse();
    }

    public void seeHouse() {
        System.out.println("see house");
    }

    public void tipping() {
        System.out.println("tipping");
    }
}
