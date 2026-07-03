package com.example.simplestudentteacheroopapp;


public class Student extends Person {


    private int marks;

    public Student(String name) {
        super(name);
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {

        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        }
    }


    @Override
    public String showRole() {
        return "Role: Student";
    }
}
