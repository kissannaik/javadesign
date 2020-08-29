package com.kissan.solid.d;

public class DatabaseHandler {
    private IDatabase database;

    DatabaseHandler(IDatabase database){
        this.database = database;
    }

    public void connect(){
        this.database.connect();
    }

    public void disconnect(){
        this.database.disconnect();
    }
}
