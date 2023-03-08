package HW4;

/**
 * @author: Silas Rodriguez
 * @date: 3/7/2023
 * @version: 1.0
 * @description: This class is used to create employee objects & test them.
 */
public class Employee_test {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Susan Meyers", 47899);   // Create employee1 object
        Employee employee2 = new Employee();   // Create employee2 object
        Employee employee3 = new Employee("Silas Rodriguez", 81774, "Facilities", "Engineer");  // Create employee3 object
        
        //print out the employee information in a pretty format
        System.out.println(String.format("%-15s", "Name") + String.format("%-15s", "ID Number") + String.format("%-15s", "Department") + String.format("%-15s", "Position"));
        System.out.println("------------------------------------------------------------");
        System.out.println(String.format("%-10.10s", employee1.getName()) +"."+ String.format("%-5s", " ") + String.format("%-14d", employee1.getIdNumber()) + String.format("%-15s",employee1.getDepartment()) + String.format("%-15s",employee1.getPosition()));
        System.out.println(String.format("%-10.10s", employee2.getName()) +"."+ String.format("%-5s", " ") + String.format("%-14d", employee2.getIdNumber()) + String.format("%-15s",employee2.getDepartment()) + String.format("%-15s",employee2.getPosition()));
        System.out.println(String.format("%-10.10s", employee3.getName()) +"."+ String.format("%-5s", " ") + String.format("%-14d", employee3.getIdNumber()) + String.format("%-15s",employee3.getDepartment()) + String.format("%-15s",employee3.getPosition()));
    }
}
