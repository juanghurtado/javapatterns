package com.juanghurtado.javapatterns.observer.custom;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Timer extends Notifier {

    public void notifyAfterMillis(long millis) {
        try {
            Logger.getGlobal().info("[Custom] Waiting " + millis + "ms to notify the view!");
            Thread.sleep(millis);
            notifyObservers();
        } catch (InterruptedException e) {
            Logger.getGlobal().log(Level.SEVERE, "[Custom] Could not sleep thread", e);
            Thread.currentThread().interrupt();
        }
    }

}
