package com.kissan.javadesign.structural.decorator;

public class Coffee extends BeverageDecorator{
    public Coffee(Beverage beverage) {
        super(beverage);
    }

    @Override
    public int getCost() {
        return super.getCost()+4;
    }

    @Override
    public String getDescription() {
        return super.getDescription()+" plus coffee";
    }
}
