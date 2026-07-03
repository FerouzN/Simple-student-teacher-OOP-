package com.example.simplestudentteacheroopapp;


public class Teacher extends Person {

    public Teacher(String name) {
        super(name);
    }

    @Override
    public String showRole() {
        return "Role: Teacher";
    }
}
