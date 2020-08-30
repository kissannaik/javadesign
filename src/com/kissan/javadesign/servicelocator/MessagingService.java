package com.kissan.javadesign.servicelocator;

public class MessagingService implements IService{
    @Override
    public String getName() {
        return ServiceEnum.MESSAGING_SERVICE.toString();
    }

    @Override
    public void execute() {
        System.out.println("Executing using Messaging Service...");
    }
}
