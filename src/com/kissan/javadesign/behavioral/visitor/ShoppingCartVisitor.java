package com.kissan.javadesign.behavioral.visitor;

public interface ShoppingCartVisitor {
    public double visit(Table table);
    public double visit(Chair chair);
}
