package com.myproject;
public class Student {
    private String name;
    private int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() { return name; }
    public int getGrade() { return grade; }

    @Override
    public String toString() {
        return name + " - Grade: " + grade;
    }
}
