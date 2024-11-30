package main.java.coursepapper;

import java.util.Scanner;

public class EmployeeBook {

    private Employee[] listEmployees;
    private int AllSalary = 0;
    private static int id = 0;
    private static Employee[] unitListEmployee;
    public EmployeeBook(Employee[] LE){
        listEmployees = LE;
        for (Employee employee : listEmployees) {
            employee.setID(id+1);
            id++;
        }
        
    }
    //создание листа по отделу (недоделан)
    public void createUnitList(int[] i,int l){
        Employee[] unitListEmployee = new Employee[l];
        int t = 0;
        for (int j : i) {
            unitListEmployee[t] = listEmployees[j-1];
            System.out.println(unitListEmployee[t]);
            t++;
        } 
        
    }
    
    public void getList(){
        for(int i = 0;i<listEmployees.length;i++){
            System.out.println(listEmployees[i].toString());
        }
    }
    public int getAllSalary(){
        
        for (Employee employee : listEmployees) {
            AllSalary += employee.getSalary();
        }
        return AllSalary;
    }
     public void minimalSalary(){
        int numOfEmployee = 0;
        int employeeSalary = listEmployees[0].getSalary();
        for(int i = 0;i<listEmployees.length;i++){
            if(employeeSalary>listEmployees[i].getSalary()){
                employeeSalary = listEmployees[i].getSalary();
                numOfEmployee = i;
            }
        }
        System.out.println(listEmployees[numOfEmployee].toString());
    }
    public void maximumSalary(){
        int numOfEmployee = 0;
        int employeeSalary = listEmployees[0].getSalary();
        for (int i= 0;i<listEmployees.length;i++){
            if(employeeSalary<listEmployees[i].getSalary()){
                employeeSalary = listEmployees[i].getSalary();
                numOfEmployee = i;
            }
        }
        System.out.println(listEmployees[numOfEmployee].toString());
    }
    public void middleValueOfSalary(){
        int result = getAllSalary()/listEmployees.length;
        System.out.println(result);
    }
    public void removeEmployee(){
        Scanner S = new Scanner(System.in);
        getList();
        System.out.println("enter num of employee");
        int num = Integer.parseInt(S.nextLine());
        listEmployees[num-1].emptyEmployee();
        getList();
        S.close();
    }
    public void onlyName(){
        for (Employee employee : listEmployees) {
            System.out.println(employee.getName()+'\n');
        }
    }
    //
    public void upSalary(int p){
        for (Employee employee : listEmployees) {
            int newSalary = (employee.getSalary()/100)*(100+p);
            employee.setSalary(newSalary);
        }
    }
    public void findUnit(int u){
        int length = 0;
        for (Employee employee : listEmployees) {
            if(u==employee.getUnit()){
                length++;
            }
        }
        int[] idList = new int[length];
        int r = 0;
        for (Employee employee : listEmployees) {
            if(u==employee.getUnit()){
                idList[r]=employee.getID();
                r++;
            }
        }
        createUnitList(idList, length);
    }        
}
