package com.sherlock.demo1;

public class Client {
    public static void main(String[] args) {
        Host host1 = new Host();;
        Proxy proxy = new Proxy(host1);
        proxy.rent();
    }
}
