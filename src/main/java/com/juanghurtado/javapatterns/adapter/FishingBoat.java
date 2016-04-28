package com.juanghurtado.javapatterns.adapter;

import java.util.logging.Logger;

public class FishingBoat {

    public void sail() {
        Logger.getGlobal().info("Fishing boat sailing!");
    }

    public void fish() {
        Logger.getGlobal().info("Fishing boat fishing!");
    }

}
