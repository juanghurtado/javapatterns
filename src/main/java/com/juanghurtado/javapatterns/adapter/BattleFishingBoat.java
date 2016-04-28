package com.juanghurtado.javapatterns.adapter;

import java.util.logging.Logger;

public class BattleFishingBoat implements Battleship {

    private FishingBoat fishingBoat;

    public BattleFishingBoat(FishingBoat fishingBoat) {
        this.fishingBoat = fishingBoat;
    }

    @Override
    public void sail() {
        fishingBoat.sail();
    }

    @Override
    public void fire() {
        Logger.getGlobal().info("Fishing boat firing!!!!");
    }

}
