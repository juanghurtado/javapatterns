package com.juanghurtado.javapatterns.adapter;

public class Captain {

    private Battleship ship;

    public Captain(Battleship ship) {
        this.ship = ship;
    }

    public void sail() {
        ship.sail();
    }

    public void fire() {
        ship.fire();
    }

}
