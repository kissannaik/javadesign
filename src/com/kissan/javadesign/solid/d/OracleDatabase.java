package com.kissan.javadesign.solid.d;

public class OracleDatabase implements IDatabase{
    @Override
    public void connect() {
        System.out.println("Connecting to Oracle DB...");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting from Oracle DB...");
    }
}
