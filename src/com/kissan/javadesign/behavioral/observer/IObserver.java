package com.kissan.javadesign.behavioral.observer;

public interface IObserver {
    void update(String name, int temperature, int pressure);
    void showdata();
}
