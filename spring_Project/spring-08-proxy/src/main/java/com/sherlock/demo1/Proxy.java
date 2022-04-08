package com.sherlock.demo1;

public class Proxy implements Rent{
    private Host host;

    public Proxy() {
    }

    public Proxy(Host host) {
        this.host = host;
    }

    @Override
    public void rent() {
        host.rent();
        seeHouse();
        tip();
        contract();
    }

    public void seeHouse() {
        System.out.println("seeHouse");
    }

    public void tip() {
        System.out.println("tip");
    }

    public void contract(){
        System.out.println("contract");
    }

}
