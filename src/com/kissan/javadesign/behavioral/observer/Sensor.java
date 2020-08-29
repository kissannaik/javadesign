package com.kissan.javadesign.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Sensor implements ISubject{
    private int temperature;
    private int pressure;
    private String name;
    private List<IObserver> observers;

    public Sensor(String name) {
        this.name = name;
        this.observers = new ArrayList<>();
    }

    @Override
    public void addObserver(IObserver observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyAllObserver() {
        for(IObserver observer : observers)
            observer.update(name, temperature, pressure);
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyAllObserver();
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
        notifyAllObserver();
    }
}
