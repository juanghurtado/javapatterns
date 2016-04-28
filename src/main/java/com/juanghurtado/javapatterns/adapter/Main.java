package com.juanghurtado.javapatterns.adapter;

public class Main {

    private Main() {
        // Prevent instantiation
    }

    public static void main(String[] args) {
        FishingBoat fishingBoat = new FishingBoat();
        Captain jackSparrow = new Captain(new BattleFishingBoat(fishingBoat));

        jackSparrow.sail();
        jackSparrow.fire();
    }

}
