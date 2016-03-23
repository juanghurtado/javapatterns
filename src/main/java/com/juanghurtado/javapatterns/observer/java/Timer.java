package com.juanghurtado.javapatterns.observer.java;

import java.util.Observable;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Timer extends Observable {

    public void notifyAfterMillis(long millis) {
        try {
            Logger.getGlobal().info("Waiting " + millis + "ms to notify the view!");
            Thread.sleep(millis);
            setChanged();
            notifyObservers();
        } catch (InterruptedException e) {
            Logger.getGlobal().log(Level.SEVERE, "Could not sleep thread", e);
            Thread.currentThread().interrupt();
        }
    }

}
