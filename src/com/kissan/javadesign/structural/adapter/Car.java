package com.kissan.javadesign.structural.adapter;

public class Car implements IVehicle{

    @Override
    public void accerlerate() {
        System.out.println("Car is accerlerating...");
    }
}
