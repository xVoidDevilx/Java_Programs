import java.util.Scanner;
//import OOP.classes_constr.metric;

// This class is a subclass of metric and inherits all of its methods
public class static_methods extends metric{
    public static void main(String [] args){
        // variables available to main()
        double m, k;
        // Create a scanner object
        Scanner keyboard = new Scanner(System.in);

        // Get input from user
        System.out.print("Enter miles: ");
        m = keyboard.nextDouble();
        System.out.print("Enter kilometers: ");
        k = keyboard.nextDouble();
        
        // Print the results
        System.out.println("mi to km: " + getKilometers(m));
        System.out.println("km to mi: " + getKilometers(k));

        // Close the scanner object
        keyboard.close();
    }
}
