package com.kissan.javadesign.creational.singleton;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {

    public static void main(String[] args) throws InterruptedException {
        SingletonClass singletonClass = SingletonClass.INSTANCE;

        singletonClass.setCounter(10);
        /*
        List<Thread> threads = new ArrayList();
        for (int i = 1; i<=4; i++){
            final int j = i;
            Thread t = new Thread(new Runnable() {
                @Override
                public void run() {
                    singletonClass.decrementCounter();
                    System.out.println("Thread Run Counter = " + singletonClass.getCounter());

                }
            });
            threads.add(t);
        }
        for (Thread t: threads) {
            t.start();
            t.join();
        }

        for (Thread t: threads) {
            System.out.println("Thread Counter = " + singletonClass.getCounter());
        }
        */
        System.out.println("Final Counter = " + singletonClass.getCounter());
    }
}
