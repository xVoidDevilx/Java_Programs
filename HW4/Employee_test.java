package HW4;

/**
 * @author: Silas Rodriguez
 * @date: 3/7/2023
 * @version: 1.0
 * @description: This class is used to create employee objects & test them.
 */
public class Employee_test {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Susan Meyers", 47899, "Accounting", "Vice President");   //create employee object 1
        Employee employee2 = new Employee("Mark Jones", 39119, "IT", "Programmer"); //create employee object 2
        Employee employee3 = new Employee("Joy Rogers", 81774, "Manufacturing", "Engineer");    //create employee object 3
        
        //print out the employee information in a pretty format
        System.out.println(String.format("%-20s", "Name") + String.format("%-15s", "ID Number") + String.format("%-15s", "Department") + String.format("%-15s", "Position"));
        System.out.println(String.format("%-65s", "-").replace(' ', '-'));
        System.out.println(String.format("%-15.15s", employee1.getName()) + String.format("%-5s", " ") + String.format("%-15d", employee1.getIdNumber()) + String.format("%-15s",employee1.getDepartment()) + String.format("%-15s",employee1.getPosition()));
        System.out.println(String.format("%-15.15s", employee2.getName()) + String.format("%-5s", " ") + String.format("%-15d", employee2.getIdNumber()) + String.format("%-15s",employee2.getDepartment()) + String.format("%-15s",employee2.getPosition()));
        System.out.println(String.format("%-15.15s", employee3.getName()) + String.format("%-5s", " ") + String.format("%-15d", employee3.getIdNumber()) + String.format("%-15s",employee3.getDepartment()) + String.format("%-15s",employee3.getPosition()));
    }
}
