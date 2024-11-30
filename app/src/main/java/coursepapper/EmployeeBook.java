package main.java.coursepapper;

import java.util.Scanner;

public class EmployeeBook {
    private static Employee[] listEmployees;
    private int AllSalary = 0;
    public EmployeeBook(Employee[] LE){
        listEmployees = LE;
    }
    
    public void getList(){
        for(int i = 0;i<listEmployees.length;i++){
            listEmployees[i].id=i+1;
            System.out.println(listEmployees[i].toString());
        }
    }
    public int getAllSalary(){
        
        for (Employee employee : listEmployees) {
            AllSalary += employee.salary;
        }
        return AllSalary;
    }

    public void minimalSalary(){
        
    }
}
