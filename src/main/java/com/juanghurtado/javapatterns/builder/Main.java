package com.juanghurtado.javapatterns.builder;

public class Main {

    private Main() {
        // Prevent instantiation
    }

    public static void main(String[] args) {
        Person juan = new PersonBuilder("Juan").age(33).hairColor("Black").eyeColor("Brown").build();
        Person jose = new PersonBuilder("José").age(12).eyeColor("Brown").build();
        Person isabel = new PersonBuilder("Isabel").hairColor("Blonde").build();
    }

}