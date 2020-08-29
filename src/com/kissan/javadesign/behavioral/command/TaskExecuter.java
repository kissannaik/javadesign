package com.kissan.javadesign.behavioral.command;

public class TaskExecuter implements ICommand{
    private ITask task;

    public TaskExecuter(ITask task){
        this.task = task;
    }

    @Override
    public void execute() {
        this.task.executeTask();
    }
}
