package com.juanghurtado.javapatterns.builder;

public class PersonBuilder {

    private final String name;

    private int age = 0;
    private String hairColor = "";
    private String eyeColor = "";

    public PersonBuilder(String name) {
        this.name = name;
    }

    public PersonBuilder age(int age) {
        this.age = age;

        return this;
    }

    public PersonBuilder hairColor(String color) {
        this.hairColor = color;

        return this;
    }

    public PersonBuilder eyeColor(String color) {
        this.eyeColor = color;

        return this;
    }

    public Person build() {
        Person person = new Person(name);

        person.setAge(age);
        person.setHairColor(hairColor);
        person.setEyeColor(eyeColor);

        return person;
    }

}
