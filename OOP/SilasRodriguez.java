//gotta import this stoopid shit, no standard scanf
import java.util.Scanner;

//The best class name
public class SilasRodriguez {
    //fuck the main method. all my homies hate it
    public static void main(String[] args){
        // If this goofy mother fucker asks me "Do you understand" one more time, I'm gonna respond
        Scanner Inputs = new Scanner(System.in);
        System.out.println("Enter age:");
        //He didn't use try catch, his code therefore sucks because it crashes if you don't type an integer
        try{
            int age = Inputs.nextInt();
            System.out.println(String.format("You are %d years old.", age));
        }
        catch (Exception e){
            System.out.println("You fucked something up.");
        }
        Inputs.close();
    }
}
