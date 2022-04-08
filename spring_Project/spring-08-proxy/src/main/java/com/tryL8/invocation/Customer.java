package com.tryL8.invocation;


public class Customer {
    public static void main(String[] args) {
        BestCreateProxy bestCreateProxy = new BestCreateProxy();
        Landlord landlord = new Landlord();
        //接口的实现类型满足接口类型
        bestCreateProxy.setTogetherInterface(landlord);

        Rent Proxy= (Rent) bestCreateProxy.getProxy();
        Proxy.rentHouse();

//        SpecialCreateProxy specialCreateProxy = new SpecialCreateProxy();
//        Landlord landlord = new Landlord();
//        //接口的实现类型满足接口类型
//        specialCreateProxy.setRent(landlord);
//
//        Rent Proxy= (Rent) specialCreateProxy.getProxy();
//        Proxy.rentHouse();
    }

}
