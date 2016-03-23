package com.juanghurtado.javapatterns.observer.custom;

public class Main {

    private Main() {
        // Prevent instantiation
    }

    public static void main(String[] args) {
        Timer timer = new Timer();
        TimerView timerView = new TimerView();

        // Tell our Timer that his observer is our TimerView
        timer.addObserver(timerView);

        // Notify the observer after X millis
        timer.notifyAfterMillis(2500);
    }

}
