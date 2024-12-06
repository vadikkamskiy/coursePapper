/*
 * This source file was generated by the Gradle 'init' task
 */

package coursepapper;
import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;

import main.java.coursepapper.Employee;
import main.java.coursepapper.EmployeeBook;

public class App {

    public static void main(String[] args) {

        Employee[] listEmployee ={
            new Employee("Иванов Иван Иванович",1, 150000),
            new Employee("Петров Петр Петрович",2, 140000),
            new Employee("Шишкин Михаил Валентинович",3, 100000),
            new Employee("Травинова Ирина Семеновна",3, 104000),
            new Employee("Сидорова Кристина Дмитриевна",4, 110000),
            new Employee("Тушкевич Максим Николаевич",1, 142000),
            new Employee("Крутов Дмитрий Григорьевич",5, 180000),
            new Employee("Харитонов Илья Владимирович",5, 155000),
            new Employee("Кругляшова Ирина Борисовна",2, 145210),
            new Employee("Карапетян Марина Давидовна",4, 98520),
        };
        EmployeeBook EB = new EmployeeBook(listEmployee);
        System.out.println(
            "what do you want??!\n"+
            "1 - Получить список всех сотрудников\n"+
            "2 - Посчитать сумму затрат на ЗП\n"+
            "3 - Найти сотрудника с минимальной ЗП\n"+
            "4 - Найти сотрудника с максимальной ЗП\n"+
            "5 - Подсчитать среднее значение зарплат\n"+
            "6 - Добавить сотрудника\n"+
            "7 - Удалить сотрудника\n"
        );
        Scanner scan = new Scanner(System.in);
        int choose = Integer.parseInt(scan.nextLine());
        switch (choose) {
            case 1:
            EB.getList();
            case 2:
            System.out.println(Integer.toString(EB.getAllSalary()));
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                 
            default:
                break;
        }
        scan.close();
    
    }
}
