package HW5;

public class Prod_Work_demo {
    public static void main(String [] args){
        // Create a ProductionWorker object
        ProductionWorker worker = new ProductionWorker("John Smith", "123-A", "01/01/2022", 1, 15.50);
        
        System.out.println("Name: " + worker.getName());
        System.out.println("Employee Number: " + worker.getIdNumber());
        System.out.println("Hire Date: " + worker.getHiredate());
        System.out.println("Shift: " + worker.getShift());
        System.out.println("Hourly Pay Rate: " + worker.getPayRate());
    }
}