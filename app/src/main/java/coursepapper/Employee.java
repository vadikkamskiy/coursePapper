package main.java.coursepapper;

import java.util.Scanner;

public class Employee{
    private int id;
    private String name;
    private int unit;
    private int salary; 
    public Employee(String n, int u,int s){
        name = n;
        unit = u;
        salary = s;
    }
    @Override
    public String toString(){
        return id+" " + name+" " + unit+" " + salary;
    }
    // сетеры + гетеры
    public void setID(int i){
        id = i;
    }
    public int getID(){
        return id;
    }
    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
    public void setSalary(int s){
        salary = s;
    }
    public int getSalary(){
        return salary;
    }
    public void setUnit(int u){
        unit = u;
    }
    public int getUnit(){
        return unit;
    }

    //метод для удаления сотрудника

    public void emptyEmployee(){
        name = "empty";
        unit = 0;
        salary = 0;
    }
    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Employee e = (Employee) other;
        return name.equals(e.name) && id == e.id;    
    }
    @Override
    public int hashCode(){
        return java.util.Objects.hash(id + name + salary);
    }
}