package com.example.classactivity2.model;

public class Employee {
    String name;
    double salary;
    boolean isFullTime;

    public Employee(String name, double salary, boolean isFullTime) {
        this.name = name;
        this.salary = salary;
        this.isFullTime = isFullTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean isFullTime() {
        return isFullTime;
    }

    public void setFullTime(boolean fullTime) {
        isFullTime = fullTime;
    }

    @Override
    public String toString() {
        return name + ", "+salary;
    }
}
