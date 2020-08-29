package com.kissan.javadesign.behavioral.strategy;

public class OperationManager implements IOperation{
    private IOperation operation;

    public OperationManager(IOperation operation){
        this.operation = operation;
    }

    @Override
    public void operation(int num1, int num2) {
        this.operation.operation(num1, num2);
    }
}
