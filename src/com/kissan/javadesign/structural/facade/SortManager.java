package com.kissan.javadesign.structural.facade;

public class SortManager {
    private MergeSort mergeSort;
    private BubbleSort bubbleSort;

    public SortManager(){
        this.bubbleSort = new BubbleSort();
        this.mergeSort = new MergeSort();
    }

    public void mergeSort(){
        this.mergeSort.sort();
    }

    public void  bubbleSort(){
        this.bubbleSort.sort();
    }
}
