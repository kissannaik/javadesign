package com.kissan.javadesign.structural.adapter;

public class BicycleAdapter implements IVehicle {
    private Bicycle bicycle;

    public BicycleAdapter(Bicycle bicycle){
        this.bicycle = bicycle;
    }

    @Override
    public void accerlerate() {
        bicycle.paddle();
    }
}
