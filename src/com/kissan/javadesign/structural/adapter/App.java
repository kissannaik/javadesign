package com.kissan.javadesign.structural.adapter;

/**
 * Adapter pattern converts an interface of a class into another interface
 * the client expects.
 * It enables classes working together that could not otherwise because of
 * incompatible interfaces
 * Composition is very important. Favor Composition over Inheritance
 */
public class App {

    public static void main(String[] args) {
        IVehicle car = new Car();
        IVehicle bus = new Bus();
        IVehicle bicycle = new BicycleAdapter(new Bicycle());

        car.accerlerate();
        bus.accerlerate();
        bicycle.accerlerate();
    }
}
