package com.kissan.javadesign.behavioral.observer;

public interface ISubject {
    void addObserver(IObserver observer);
    void removeObserver(IObserver observer);
    void notifyAllObserver();
}
