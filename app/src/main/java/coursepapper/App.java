package coursepapper;
import java.util.Random;

import main.java.coursepapper.Employee;
import main.java.coursepapper.EmployeeBook;

public class App {
    private final static Random RANDOM = new Random();
    private final static String[] NAMES = {"Виктор","Семён","Павел","Леонид","Максим","Генадий","Константин"};
    private final static String[] SURNAMES = {"Викторов","Семёнов","Павлов","Леонидов","Максимов","Константов"};
    private final static String[] FATHER_NAMES = {"Викторович","Семёнович","Павлович","Леонидович","Максимович","Генадьевич","Константинович"};

    private static Employee[] EMPLOYEES = new Employee[10];

    private static void initEmployees(){
        for(int i = 0; i< EMPLOYEES.length;i++){
            String fullName = SURNAMES[RANDOM.nextInt(SURNAMES.length)] + " " +
            NAMES[RANDOM.nextInt(NAMES.length)]+ " "+ 
            FATHER_NAMES[RANDOM.nextInt(FATHER_NAMES.length)]+ " ";
            EMPLOYEES[i] = new Employee(fullName, RANDOM.nextInt(6), RANDOM.nextInt(50000)+50000);
        }
    }
    public static void main(String[] args) {
        initEmployees();
        print();
        System.out.println("all salary - " + allSalary());
        System.out.println("minimal salary - "+ findMinSalaryEmployee());
        System.out.println("maximum salary - "+ findMaxSalaryEmployee());
        System.out.println("Middle salary - "+ calculateMiddleSalary());
        System.out.println("Name of employees - ");
        printName();

    }

    private static void print(){
        for (Employee employee : EMPLOYEES) {
            System.out.println(employee);
        }
    }

    private static int allSalary(){
        int sum = 0;
        for (Employee employee : EMPLOYEES) {
            sum += employee.getSalary();
        }
        return sum;
    }

    private static Employee findMinSalaryEmployee(){
        Employee minSalaryEmployee = null;
        for (Employee employee : EMPLOYEES) {
            if(minSalaryEmployee == null || employee.getSalary()<minSalaryEmployee.getSalary()){
                minSalaryEmployee = employee;
            }
        }
        return minSalaryEmployee;
    }
    private static Employee findMaxSalaryEmployee(){
        Employee maxSalaryEmployee = null;
        for (Employee employee : EMPLOYEES) {
            if(maxSalaryEmployee == null || employee.getSalary()>maxSalaryEmployee.getSalary()){
                maxSalaryEmployee = employee;
            }
        }
        return maxSalaryEmployee;
    }

    private static double calculateMiddleSalary (){
        return (double) allSalary()/EMPLOYEES.length;
    }

    private static void printName(){
        for (Employee employee : EMPLOYEES) {
            System.out.println(employee.getName());
        }
    }
}
