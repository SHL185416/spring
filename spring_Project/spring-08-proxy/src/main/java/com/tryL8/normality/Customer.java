package com.tryL8.normality;

public class Customer {
    public static void main(String[] args) {
        Landlord landlord = new Landlord();
        Proxy proxy = new Proxy();
        proxy.setLandlord(landlord);

        proxy.rentHouse();
        proxy.tipping();
        proxy.seeHouse();

    }

}
