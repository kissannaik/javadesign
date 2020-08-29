package com.kissan.javadesign.behavioral.nullobject;

import java.util.ArrayList;
import java.util.List;

public class Datastore {

    private List<String> customerNames;

    public Datastore(){
        this.customerNames = new ArrayList<>();
        this.customerNames.add("Daniel");
        this.customerNames.add("Adam");
        this.customerNames.add("Michael");
        this.customerNames.add("Joe");
    }

    public boolean existCustomer(String name) {
        if(customerNames.contains(name))
            return true;

        return false;
    }
}