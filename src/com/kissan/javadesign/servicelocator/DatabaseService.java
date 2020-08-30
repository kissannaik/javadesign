package com.kissan.javadesign.servicelocator;

public class DatabaseService implements IService{
    @Override
    public String getName() {
        return ServiceEnum.DATABASE_SERVICE.toString();
    }

    @Override
    public void execute() {
        System.out.println("Executing using Database Service...");
    }
}
