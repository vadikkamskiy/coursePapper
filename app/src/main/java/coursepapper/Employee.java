package main.java.coursepapper;

import java.util.Scanner;

public class Employee{
    int id = 0;
    String name;
    int unit;
    int salary; 
    public Employee(String n, int u,int s){
        name = n;
        unit = u;
        salary = s;
        ++id;
    }
    @Override
    public String toString(){
        return id+" " + name+" " + unit+" " + salary;
    }
}