package com.juanghurtado.javapatterns.observer.custom;

import java.util.LinkedList;
import java.util.List;

public abstract class Notifier {

    private List<Observer> observers = new LinkedList<>();

    public synchronized void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

}
