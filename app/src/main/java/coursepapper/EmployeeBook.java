package main.java.coursepapper;

import java.util.Scanner;

public class EmployeeBook {
    private Employee[] listEmployees;
    private int AllSalary = 0;
    private static int i = 0;
    public EmployeeBook(Employee[] LE){
        listEmployees = LE;
        for (Employee employee : listEmployees) {
            employee.setID(i);
            i++;
        }
    }
    
    public void getList(){
        for(int i = 0;i<listEmployees.length;i++){
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
        int numOfEmployee = 0;
        int employeeSalary = listEmployees[0].salary;
        for(int i = 0;i<listEmployees.length;i++){
            if(employeeSalary>listEmployees[i].salary){
                employeeSalary = listEmployees[i].salary;
                numOfEmployee = i;
            }
        }
        System.out.println(listEmployees[numOfEmployee].toString());
    }
    public void maximumSalary(){
        int numOfEmployee = 0;
        int employeeSalary = listEmployees[0].salary;
        for (int i= 0;i<listEmployees.length;i++){
            if(employeeSalary<listEmployees[i].salary){
                employeeSalary = listEmployees[i].salary;
                numOfEmployee = i;
            }
        }
        System.out.println(listEmployees[numOfEmployee].toString());
    }
    public void middleValueOfSalary(){
        int result = getAllSalary()/listEmployees.length;
        System.out.println(result);
    }
    public void test(){
        System.out.println(listEmployees[5]);
    }
}
