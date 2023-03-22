package HW5;

/**
 * @author  Silas Rodriguez
 * @date    3/22/23
 * @assignment  HW 5
 * @course  CS-2365
 * @description This class contains the Employee class which is used to store employee information.
 */
public class Employee {
    // Instance employee name
    private String name;
    // Instance employee ID number
    private String idNumber;
    // Instance employee hire date
    private String hiredate;

    /* Default Constructor */
    public Employee(){
        name = "";
        idNumber = "";
        hiredate = "";
    }
    /* Constructor with name, idNumber, and hiredate */
    public Employee(String name, String idNumber, String hiredate){
        this.name = name;
        this.idNumber = idNumber;
        this.hiredate = hiredate;
    }
    /* Constructor with name and idNumber */
    public Employee(String name, String idNumber){
        this.name = name;
        this.idNumber = idNumber;
        hiredate = "";
    }
    /* Constructor with name */
    public Employee(String name){
        this.name = name;
        idNumber = "";
        hiredate = "";
    }
    
    /* Set employee name */
    public void setName(String name){
        this.name = name;
    }
    /* Set employee ID number */
    public void setIdNumber(String idNumber){
        this.idNumber = idNumber;
    }
    /* Set employee hire date */
    public void setHiredate(String hiredate){
        this.hiredate = hiredate;
    }
    /* Get employee name */
    public String getName(){
        return name;
    }
    /* Get employee ID number */
    public String getIdNumber(){
        return idNumber;
    }
    /* Get employee hire date */
    public String getHiredate(){
        return hiredate;
    }
}

/**
 * @author  Silas Rodriguez
 * @date    3/22/23
 * @assignment  HW 5
 * @course  CS-2365
 * @description This class contains the ProductionWorker class which is used to store production worker information.
 */
class ProductionWorker extends Employee {
    // Instance shift number
    private int shift;
    // Instance hourly pay rate
    private double payRate;

    /* Default Constructor */
    public ProductionWorker(){
        super();
        shift = 0;
        payRate = 0.0;
    }
    /* Constructor with shift and payRate */
    public ProductionWorker(int shift, double payRate){
        super();
        this.shift = shift;
        this.payRate = payRate;
    }
    /* Constructor with name, idNumber, hiredate, shift, and payRate */
    public ProductionWorker(String name, String idNumber, String hiredate, int shift, double payRate){
        super(name, idNumber, hiredate);
        this.shift = shift;
        this.payRate = payRate;
    }
    /* Constructor with name, idNumber, shift, and payRate */
    public ProductionWorker(String name, String idNumber, int shift, double payRate){
        super(name, idNumber);
        this.shift = shift;
        this.payRate = payRate;
    }
    /* Constructor with name, shift, and payRate */
    public ProductionWorker(String name, int shift, double payRate){
        super(name);
        this.shift = shift;
        this.payRate = payRate;
    }
    
    /* Set shift number */
    public void setShift(int shift){
        this.shift = shift;
    }
    /* Set hourly pay rate */
    public void setPayRate(double payRate){
        this.payRate = payRate;
    }
    /* Get shift number */
    public int getShift(){
        return shift;
    }
    /* Get hourly pay rate */
    public double getPayRate(){
        return payRate;
    }
}