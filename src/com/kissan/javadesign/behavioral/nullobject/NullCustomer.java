package com.kissan.javadesign.behavioral.nullobject;

public class NullCustomer extends AbstractCustomer{

    @Override
    public boolean isNull() {
        return true;
    }

    @Override
    public String getPerson() {
        return ""; // Prevents null being returned
    }
}
