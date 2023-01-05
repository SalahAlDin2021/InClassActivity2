package com.example.classactivity2.model;

import java.util.ArrayList;

public class EmployeeData {
    static ArrayList<Employee> emplyees=new ArrayList<>();
    static public ArrayList getData(){
        emplyees.add(new Employee("salah",2000,true));
        emplyees.add(new Employee("salah",2000,true));
        emplyees.add(new Employee("salah",2000,true));
        emplyees.add(new Employee("salah",2000,true));
        return emplyees;
    }
    static public void addEmployee(Employee e){
        emplyees.add(e);
    }

}
