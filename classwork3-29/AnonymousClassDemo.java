import java.util.Scanner;

public class AnonymousClassDemo {
    public static void main(String [] args) {
        int num;
        Scanner input = new Scanner(System.in);
        Intcalculator square = new Intcalculator() {
            public int calculate(int x) {
                return x*x;
            }
        };
        System.out.println("Enter a number: ");
        num = input.nextInt();
        System.out.println("The square of " + num + " is " + square.calculate(num));
        input.close();
    }    
}
