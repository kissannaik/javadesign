package com.kissan.javadesign.behavioral.nullobject;

public class CustomerFactory {

    private Datastore datastore;

    public CustomerFactory(){
        this.datastore = new Datastore();
    }

    public AbstractCustomer getCustomer(String name){

        if( checkName(name) ){
            return new RealCustomer(name);
        }

        return new NullCustomer();
    }

    private boolean checkName(String name) {
        if( datastore.existCustomer(name) ){
            return true;
        }

        return false;
    }
}
