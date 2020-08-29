package com.kissan.javadesign.behavioral.nullobject;

public class RealCustomer extends AbstractCustomer {

    public RealCustomer(String name){
        this.customerName = name;
    }

    @Override
    public boolean isNull() {
        return false;
    }

    @Override
    public String getPerson() {
        return customerName;
    }
}
