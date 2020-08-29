package com.kissan.javadesign.behavioral.strategy;

public class Add implements IOperation{

    @Override
    public void operation(int num1, int num2) {
        System.out.println("Addition of " + num1 + " + num2 = " + num2 + " is "+(num1+num2));
    }
}
