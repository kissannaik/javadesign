package com.kissan.javadesign.solid.d;

public class MySQLDatabase implements IDatabase{
    @Override
    public void connect() {
        System.out.println("Connecting to MySQL DB...");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting from MySQL DB...");
    }
}
