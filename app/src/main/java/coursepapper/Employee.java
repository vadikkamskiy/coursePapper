package main.java.coursepapper;

import java.util.Scanner;

public class Employee {
    static int id;
    static private String name;
    static private byte unit;
    static private int salary;
        public String toString(){
            return id + " - " + name +" " + unit + " " + salary;
        }
        public static void createEmployee(int i){
            System.out.println("enter name:\n");
            Scanner scan = new Scanner(System.in);
            String n = scan.nextLine();
            System.out.println("enter unit:\n");
            byte u = Byte.parseByte(scan.nextLine());
            System.out.println("enter salary: \n");
            int s = Integer.parseInt(scan.nextLine());
            id = i;
            name = n;
            unit = u;
            salary = s;
    }
}
