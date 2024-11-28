package main.java.coursepapper;

public class Employee {
    private int id;
    private String name;
    private byte unit;
    private int salary;
    public void setEmployee(int i,String n, byte u,int s){
        id = i;
        name = n;
        unit = u;
        salary = s;
    }
    public void getEmpoloyeeInfo(){
        System.out.println(id + " - " + name +" " + unit + " " + salary);
    }
}
