package com.juanghurtado.javapatterns.observer.custom;

import java.util.logging.Logger;

public class TimerView implements Observer {

    @Override
    public void update() {
        Logger.getGlobal().info("[Custom] Timer view notified!");
    }

}
