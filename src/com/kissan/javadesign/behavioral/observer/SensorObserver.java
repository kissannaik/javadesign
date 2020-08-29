package com.kissan.javadesign.behavioral.observer;

public class SensorObserver implements IObserver {
    private int temperature;
    private int pressure;
    private String name;

    @Override
    public void update(String name, int temperature, int pressure) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.name = name;
        showdata();
    }

    @Override
    public void showdata() {
        System.out.println("Sensor: " + name +" Temperature = " + this.temperature +
                "; Pressure = " + this.pressure);
    }
}
