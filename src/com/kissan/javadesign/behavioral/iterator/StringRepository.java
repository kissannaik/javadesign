package com.kissan.javadesign.behavioral.iterator;

public class StringRepository {

    String[] strings = {"Kissan", "Meghana", "Vinayak", "Sunita", "Shalini", "Trigger"};

    public IIterator getIterator(){
        return new StringIterator(strings);
    }
}
