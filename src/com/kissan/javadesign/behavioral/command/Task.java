package com.kissan.javadesign.behavioral.command;

public class Task implements ITask{
    private int id;
    private String name;

    public Task(int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public void executeTask(){
        System.out.println(name + " with Id: "+id+" is executing task..");
    }
}
