package com.example.simplestudentteacheroopapp;


public abstract class Person {

    protected String name;

    public Person(String name) {
        this.name = name;
    }


    public abstract String showRole();

    public String getName() {
        return name;
    }
}
