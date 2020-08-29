package com.kissan.javadesign.behavioral.visitor;

public interface ShoppingItem {
    public double accept(ShoppingCartVisitor visitor);
}
