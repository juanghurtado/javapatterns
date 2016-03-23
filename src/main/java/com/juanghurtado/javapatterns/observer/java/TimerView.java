package com.juanghurtado.javapatterns.observer.java;

import java.util.Observable;
import java.util.Observer;
import java.util.logging.Logger;

public class TimerView implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        Logger.getGlobal().info("Timer view notified!");
    }

}
