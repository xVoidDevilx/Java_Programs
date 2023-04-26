
import java.util.Scanner;

public class lambdaclass {
    public static void main(String [] args) {
        int num;

        Scanner input = new Scanner(System.in);
        Intcalculator square = x->x*x;
        System.out.println("Enter a number: ");
        num = input.nextInt();
        System.out.println("The square of " + num + " is " + square.calculate(num));
        input.close();
        
    }
}