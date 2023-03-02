import java.util.Scanner;

/**
 * @author Silas Rodriguez
 * @since 2/21/2023
 * @version 1.0
 */
public class Solution {
    /*
     * This is the main method that will run
     * on project runtime and call other methods to solve the hw.
     */
    public static void main(String [] args){
        //create a single scanner class used for the whole program
        Scanner keyboard = new Scanner(System.in);
        //create a string variable that will hold the output of the function and print in main
        String roman = num_to_roman(keyboard);
        System.out.println("Your number in Roman Numerals: "+ roman);

        //The rest of the program will not run if an error occurs above, but the HW designs it this way
        names_sorted(keyboard);
        troubleshoot(keyboard);

        //free resources
        keyboard.close();
    }

    /* 
    This method will prompt the user for a number between 1 and 10
    and will raise an error message if outside this range
    */
    private static String num_to_roman(Scanner keyboard){
        System.out.println("Enter an integer between 1 & 10");
        
        //create the double input that the user gives us
        int input = keyboard.nextInt();

        //check the input from user
        if (input < 1 || input >10){
            throw new ArithmeticException("Number was outside of range");
        }
        else{
            //create a string output to return the roman numeral
            String output = new String();

            //switch statement maps roman numeral to return
            switch (input) {
                case 1:
                    output = "I";
                    break;
                case 2:
                    output = "II";
                    break;
                case 3:
                    output = "III";
                    break;
                    case 4:
                    output = "IV";
                    break;
                case 5:
                    output = "V";
                    break;
                case 6:
                    output = "VI";
                    break;
                case 7:
                    output = "VII";
                    break;
                case 8:
                    output = "VIII";
                    break;
                case 9:
                    output = "IX";
                    break;
                case 10:
                    output = "X";
                    break;
                }
            
            return output;
        }
    }

    /*
    This method will prompt the user for 3 names (strings) and display
    the names in ascending order but return nothing to main
     */
    private static void names_sorted(Scanner keyboard){
        // Holds name 1 from Scanner
        String name1 = new String();
        // Holds name 2 from scanner
        String name2 = new String();
        //holds name 3 from scanner
        String name3 = new String();
        //swap string variable for sorting:
        String x = new String();

        //move the cursor from any previous "next functions"
        keyboard.nextLine();
        System.out.println("Enter name 1/3: ");
        name1 = keyboard.nextLine();
        System.out.println("Enter name 2/3: ");
        name2 = keyboard.nextLine();
        System.out.println("Enter name 3/3: ");
        name3 = keyboard.nextLine();

        if (name1.compareTo(name2) > 0){
            x = name1;
            name1 = name2;
            name2 = x;
        }
        if (name1.compareTo(name3) > 0){
            x = name1;
            name1 = name3;
            name3 = x;
        }
        if (name2.compareTo(name3) > 0) {
            x = name2;
            name2 = name3;
            name3 = x;
        }
        
        System.out.println("Names in order:");
        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);
    }

    /*
    This method uses a control statement to guide a user to troubleshoot
    a wifi router with a bad connection
     */
    private static void troubleshoot(Scanner keyboard){
        //create a string to hold the value of keyboard
        String input = new String();
        //inline string array decorator for looping over steps
        String [] stringarr = new String[] {
            "Reboot the computer and try to reconnect",
            "Reboot the router and try to connect",
            "Make sure the cables between router and modem are plugged in firmly",
            "Move the router to a new location and try to connect",
            "Get a new router"
        };
        //loop variable
        int i;

        //this loop itterates over the string array and prompts user
        for(i=0; i<stringarr.length; i++){
            System.out.println(stringarr[i]);
            System.out.println("Did that fix the problem?");
            input = keyboard.nextLine();
            if(input.toLowerCase().compareTo("yes") == 0){
                return; //exit the method
            }
        System.out.println(stringarr[i]);
        }
    }
}
