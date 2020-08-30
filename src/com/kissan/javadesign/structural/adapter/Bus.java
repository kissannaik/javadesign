package com.kissan.javadesign.structural.adapter;

public class Bus implements IVehicle {
    @Override
    public void accerlerate() {
        System.out.println("Bus is accerlerating...");
    }
}
