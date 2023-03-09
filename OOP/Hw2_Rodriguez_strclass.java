import java.util.Scanner;

public class Hw2_Rodriguez_strclass{
    public static void main(String[] args){
        //Create a scanner instance
        Scanner keyboard = new Scanner(System.in);

        //Ask for favorite city
        System.out.println("Please enter your favorite city:");
        String city = keyboard.nextLine();
        
        //Post Process the input to remove before and ending spaces
        city = city.strip();
        System.out.println(city.length() + " characters long");
        System.out.println(city.toUpperCase() + " is your string in uppercase.");
        System.out.println(city.toLowerCase() + " is your string in lowercase");
        System.out.println(city.charAt(0) + " is the first character in the name of the city");
        
        //close the keyboard object
        keyboard.close();
    }
}