package main.java.coursepapper;

import java.util.Scanner;

public class Employee{
    private int id;
    String name;
    int unit;
    int salary; 
    public Employee(String n, int u,int s){
        name = n;
        unit = u;
        salary = s;
    }
    @Override
    public String toString(){
        return id+" " + name+" " + unit+" " + salary;
    }

    public void setID(int i){
        id = i;
    }
}