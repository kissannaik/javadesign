package com.kissan.javadesign.structural.decorator;

public class Milk extends BeverageDecorator{

    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public int getCost() {
        return super.getCost()+3;
    }

    @Override
    public String getDescription() {
        return super.getDescription()+" plus milk";
    }
}
