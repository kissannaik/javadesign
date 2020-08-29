package com.kissan.javadesign.solid.l;

public class NormalCar implements NormalVehicle{
    @Override
    public void speed() {
        System.out.println("Normal Car: increasing speed..");
    }

    @Override
    public void addFuel() {
        System.out.println("Normal Car: adding fuel..");
    }
}
