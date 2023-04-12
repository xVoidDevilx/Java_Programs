package OOP;

import java.util.Scanner;
import java.text.MessageFormat;

public class Hw2_Rodriguez_WordGame {
    public static void main(String [] args){
        //Let the user know what the data collection is for.
        System.out.println("Let's play a word game!");

        //initialize a scanner obj
        Scanner keyboard = new Scanner(System.in);

        try {
        //Start collecting data
        System.out.println("Enter your name:");
        String name = keyboard.nextLine();
        name = name.strip();

        System.out.println("Enter your age:");
        String age = keyboard.nextLine();
        age = age.strip();
        
        System.out.println("Enter a city:");
        String city = keyboard.nextLine();
        city = city.strip();

        System.out.println("Enter a college:");
        String college = keyboard.nextLine();
        college = college.strip();

        System.out.println("Enter a profession:");
        String job = keyboard.nextLine();
        job = job.strip();

        System.out.println("Enter an animal:");
        String animal = keyboard.nextLine();
        animal = animal.strip();

        System.out.println("Enter a pet's name:");
        String pet_name = keyboard.nextLine();
        pet_name = pet_name.strip();
        
        //Display the story:
        String story = MessageFormat.format("There once was a person named {0} who lived in {1}. At the age of {2}, {0} went to college at {3}. {0} graduated and went to work as a {4}. Then, {0} adopted a(n) {5} named {6}. They both lived happily ever after!", name, city, age, college, job, animal, pet_name);
        System.out.println(story);    
        } 
        catch (Exception e) {
            System.out.println("An error has occurred.");
        }
        //close the keyboard object
        keyboard.close();
    }
}