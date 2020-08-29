package com.kissan.javadesign.behavioral.command;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class TaskQueue {
    private BlockingQueue<ICommand> tasks;
    private int capacity;

    public TaskQueue(int capacity){
        this.capacity = capacity;
        this.tasks = new ArrayBlockingQueue<>(capacity);
    }

    public void produce(){
        try{
            for(int i =0; i<capacity; i++)
                tasks.put(new TaskExecuter(new Task((i+1), "Task")));
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public void consume(){
        try {
            for (int i = 0; i < capacity; i++) {
                //Thread.sleep(100);
                tasks.take().execute();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
