package coursepapper;
import java.util.Random;

import main.java.coursepapper.Employee;
import main.java.coursepapper.EmployeeBook;

public class App {
    private final static Random RANDOM = new Random();
    private final static String[] NAMES = {"Виктор","Семён","Павел","Леонид","Максим","Генадий","Константин"};
    private final static String[] SURNAMES = {"Викторов","Семёнов","Павлов","Леонидов","Максимов","Константов"};
    private final static String[] FATHER_NAMES = {"Викторович","Семёнович","Павлович","Леонидович","Максимович","Генадьевич","Константинович"};

    private static Employee[] employees = new Employee[10];

    private static void initEmployees(){
        for(int i = 0; i< employees.length;i++){
            String fullName = SURNAMES[RANDOM.nextInt(SURNAMES.length)] + " " +
            NAMES[RANDOM.nextInt(NAMES.length)]+ " "+ 
            FATHER_NAMES[RANDOM.nextInt(FATHER_NAMES.length)]+ " ";
            employees[i] = new Employee(fullName, RANDOM.nextInt(6), RANDOM.nextInt(50000)+50000);
        }
    }
    public static void main(String[] args) {
        initEmployees();
        print();
        System.out.println("all salary - " + getAllEmployeesSalary());
        System.out.println("minimal salary - "+ findMinSalaryEmployee());
        System.out.println("maximum salary - "+ findMaxSalaryEmployee());
        System.out.println("Middle salary - "+ calculateMiddleSalary());
        System.out.println("Name of employees - ");
        printName();
        upSalary(10);
        int chekedUnit = 3;
        System.out.println("minimal salary of "+ chekedUnit + " unit - " + 
        findUnitWithMinimalSalary(chekedUnit));
        System.out.println("maximum salary of "+ chekedUnit + " unit - " + 
        findUnitWithMaximumSalary(chekedUnit));
        System.out.println("All salary of " +chekedUnit + " unit "+ unitAllSalary(chekedUnit));
        System.out.println("Middle Salary of " + chekedUnit + " unit - " + calculateUnitMiddleSalary(chekedUnit));
        upSalaryOfUnit(chekedUnit, 7);
        printUnitInfo(chekedUnit);
        int chekedSalary = 75000;
        System.out.println("Salary less " + chekedSalary);
        salaryLessValue(chekedSalary);
        System.out.println("Salary more " + chekedSalary);
        salaryMoreValue(chekedSalary);

    }

    private static void print(){
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    private static int getAllEmployeesSalary(){
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    private static Employee findMinSalaryEmployee(){
        Employee minSalaryEmployee = employees[0];
        for (Employee employee : employees) {
            if(minSalaryEmployee.equals(employees[0]) || employee.getSalary()<minSalaryEmployee.getSalary()){
                minSalaryEmployee = employee;
            }
        }
        return minSalaryEmployee;
    }
    private static Employee findMaxSalaryEmployee(){
        Employee maxSalaryEmployee = employees[0];
        for (Employee employee : employees) {
            if(maxSalaryEmployee.equals(employees[0]) || employee.getSalary()>maxSalaryEmployee.getSalary()){
                maxSalaryEmployee = employee;
            }
        }
        return maxSalaryEmployee;
    }

    private static double calculateMiddleSalary (){
        return (double) getAllEmployeesSalary()/employees.length;
    }

    private static void printName(){
        for (Employee employee : employees) {
            System.out.println(employee.getName());
        }
    }
    private static void upSalary(int p){
        for (Employee employee : employees) {
            int newSalary = (employee.getSalary()/100)*(100+p);
            employee.setSalary(newSalary);
        }
        print();
    }

    private static Employee findUnitWithMinimalSalary(int u){
        Employee unitMinimalSalary = employees[0];
        for (Employee employee : employees) {
            if(employee.getUnit() == u && (unitMinimalSalary.equals(employees[0]) || unitMinimalSalary.getSalary()>employee.getSalary())){
                unitMinimalSalary = employee;
            }
        }
        return unitMinimalSalary;
    }

    private static Employee findUnitWithMaximumSalary(int u){
        Employee unitMaximumSalary = employees[0];
        for (Employee employee : employees) {
            if(employee.getUnit() == u && (unitMaximumSalary.equals(employees[0]) || unitMaximumSalary.getSalary()<employee.getSalary())){
                unitMaximumSalary = employee;
            }
        }
        return unitMaximumSalary;
    }

    private static int unitAllSalary(int u){
        int result = 0;
        for (Employee employee : employees) {
            if(employee.getUnit()==u){
                result += employee.getSalary();
            }
        }
        return result;
    }

    private static double calculateUnitMiddleSalary(int u){
        int point = 0;
        int allSalaryUnit = 0;
        for (Employee employee : employees) {
            if(employee.getUnit() == u){
                point++;
                allSalaryUnit+=employee.getSalary();
            }
        }
        return (double) allSalaryUnit/point;
    }
    private static void upSalaryOfUnit(int u, int p){
        int newSalary;
        for (Employee employee : employees) {
            if(employee.getUnit() == u){
                newSalary = (employee.getSalary()/100)*(100+p);
                employee.setSalary(newSalary);
            }
        }
    }
    private static void printUnitInfo(int u){
        for (Employee employee : employees) {
            if(employee.getUnit() == u){
                System.out.println(employee.getId() + " " + employee.getName() + " " +
                employee.getSalary());
            }
        }
    }

    private static void salaryLessValue(int v){
        for (Employee employee : employees) {
            if(employee.getSalary()<v){
                System.out.println(employee);
            }
        }
    }
    private static void salaryMoreValue(int v){
        for (Employee employee : employees) {
            if(employee.getSalary()>v){
                System.out.println(employee);
            }
        }
    }
}
