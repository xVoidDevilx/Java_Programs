package HW4;
import java.util.Scanner;

/**
 * @author: Silas Rodriguez
 * @date: 3/7/2023
 * @course: CS 2365
 * @assignment: HW4
 * @purpose: This class is used to convert temperatures from Fahrenheit to Celsius and Kelvin
 */
public class Temp_Test {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        //ask the user for a temperature in farenheit
        System.out.println("Enter a temperature in farenheit: ");
        //create a new temperature object with the value the user entered
        Temperature temp = new Temperature(keyboard.nextDouble());
        //print out the farenheit, celsius, and kelvin values
        System.out.println("Fahrenheit: " + temp.getFahrenheit());
        System.out.println("Celsius: " + temp.celsius());
        System.out.println("Kelvin: " + temp.kelvin());

        //free up the memory used by the scanner
        keyboard.close();
    }
}
