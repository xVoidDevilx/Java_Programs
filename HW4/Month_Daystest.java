package HW4;
import java.util.Scanner;

/**
 * @author: Silas Rodriguez
 * @date: 3/7/2023
 * @course: CS 2365
 * @assignment: HW4
 * @purpose: This class is used to determine the number of days in a month
 */
public class Month_Daystest {

    public static void main(String[] args) {
        //create a scanner object
        Scanner keyboard = new Scanner(System.in);

        int month;  //1-12 month integer value
        int year;   //any year

        //ask the user for a month and year
        System.out.println("Enter a month (1-12):");
        month = keyboard.nextInt();
        System.out.println("Enter a year:");
        year = keyboard.nextInt();

        //create a MonthDays object
        MonthDays monthDays = new MonthDays(month, year);
        monthDays.numberOfDays();
        System.out.println("The number of days in " + month + "/" + year + " is " + monthDays.numberOfDays());

        //close the scanner object
        keyboard.close();
    }
}
