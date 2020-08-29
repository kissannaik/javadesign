package com.kissan.javadesign.solid.l;

public class ElectricCar implements ElectricVehicle{
    @Override
    public void speed() {
        System.out.println("Electric Car: increasing speed..");
    }

    @Override
    public void chargeBattery() {
        System.out.println("Electric Car: charging battery..");
    }
}
