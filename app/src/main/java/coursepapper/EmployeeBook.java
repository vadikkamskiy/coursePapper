package main.java.coursepapper;


public class EmployeeBook {
    private static Employee[] listEmployees = new Employee[10];
        public static void getAllEmployees(){
            for (Employee employee : listEmployees) {
            System.out.println(employee.toString());
        }
    }

    public void addEmployee(){
        
    }
}
