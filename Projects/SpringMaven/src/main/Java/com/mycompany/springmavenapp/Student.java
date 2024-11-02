package com.mycompany.springmavenapp;

public class Student {
    private String name;
    private double rate;
    public Student() {
    }
    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", rate=" + rate + '}';
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getRate() {
        return rate;
    }
    public void setRate(double rate) {
        this.rate = rate;
    }
}
