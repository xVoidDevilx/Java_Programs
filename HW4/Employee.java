package HW4;
/** 
@author: Silas Rodriguez
@date: 3/7/2023
@version: 1.0
@description: This class is used to create an employee object. 
*/
public class Employee {
    private String name;    // Employee name
    private int idNumber;   // Employee ID number
    private String department;  // Employee department
    private String position;    // Employee position

    /*
     * This is the constructor for the Employee class. It takes in 4 parameters
     */
    public Employee(String name, int idNumber, String department, String position) {
        this.name = name;
        this.idNumber = idNumber;
        this.department = department;
        this.position = position;
    }
    /*
     * This is the constructor for the Employee class. It takes in 2 parameters
     */
    public Employee(String name, int idNumber) {
        this.name = name;
        this.idNumber = idNumber;
        this.department = "";
        this.position = "";
    }
    /*
     * This is the constructor for the Employee class. It takes in 0 parameters (Default)
     */
    public Employee(){
        this.name = "";
        this.idNumber = 0;
        this.department = "";
        this.position = "";
    }

    /*
     * This method is used to get the name of the employee
     */
    public String getName() {
        return name;
    }

    /*
     * This method is used to set the name of the employee
     */
    public void setName(String name) {
        this.name = name;
    }

    /*
     * This method is used to get the ID number of the employee
     */
    public int getIdNumber() {
        return idNumber;
    }

    /*
     * This method is used to set the ID number of the employee
     */
    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    /*
    * This method is used to get the department of the employee
    */
    public String getDepartment() {
        return department;
    }

    /*
    * This method is used to set the department of the employee
    */
    public void setDepartment(String department) {
        this.department = department;
    }

    /*
    * This method is used to get the position of the employee
    */
    public String getPosition() {
        return position;
    }

    /*
    * This method is used to set the position of the employee
    */
    public void setPosition(String position) {
        this.position = position;
    }


}