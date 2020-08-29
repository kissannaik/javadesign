package com.kissan.javadesign.behavioral.template;

public abstract class SortingAlgorithm {

    public abstract void initialize();
    public abstract void sorting();
    public abstract void printResults();

    public void sort(){
        initialize();
        sorting();
        printResults();
    }
}
