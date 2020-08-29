package com.kissan.javadesign.behavioral.iterator;

public class StringIterator implements IIterator {

    private String[] strings;
    private int index;

    public StringIterator(String[] strings){
        this.strings = strings;
    }

    @Override
    public boolean hasNext() {
        return index < this.strings.length;
    }

    @Override
    public Object getNext() {
        if(hasNext())
            return this.strings[index++];
        return null;
    }
}
