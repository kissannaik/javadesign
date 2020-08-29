package com.kissan.javadesign.creational.singleton;

public enum SingletonClass {
    INSTANCE;
    private int counter;

    public void setCounter(int counter){
        this.counter = counter;
    }

    public void decrementCounter(){
        this.counter--;
    }

    public int getCounter(){
        return this.counter;
    }
}
