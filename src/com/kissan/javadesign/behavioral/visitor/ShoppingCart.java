package com.kissan.javadesign.behavioral.visitor;

public class ShoppingCart implements ShoppingCartVisitor {

    @Override
    public double visit(Table table) {
        return table.getPrice();
    }

    @Override
    public double visit(Chair chair) {
        return chair.getPrice();
    }

}
