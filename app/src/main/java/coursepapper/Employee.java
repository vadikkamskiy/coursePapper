package main.java.coursepapper;

public class Employee{

    private static int idGenerator=1;

    private final int id;
    private final String name;
    private int unit;
    private int salary; 
    public Employee(String n, int u,int s){
        id = idGenerator++;
        name = n;
        unit = u;
        salary = s;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getUnit(){
        return unit;
    }
    public int getSalary(){
        return salary;
    }
    public void setSalary(int s){
        this.salary = s;
    }
    public void setUnit(int u){
        this.unit = u;
    }

    @Override
    public String toString(){
        return "id - "+id +  " "+ 
        "Name - " + name + " "+ 
        "unit - " + unit + " "+ 
        "salary - " + salary +" " ;
    }
}