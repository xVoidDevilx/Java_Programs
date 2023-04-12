package OOP;

//create a class object
public class Cls_wrk{
    //this is the top method that runs when compiled
    public static void main(String [] args) {
        //set an initial value
        int number = 99;

        //display this value
        System.out.println("The number is "+ number);

        //call change me and pass the arg
        changeme(number);

        //redisplay the number
        System.out.println("The number is "+ number);
    }
    //this method changes a number to 0
    public static void changeme(int myvalue) {
        //display the original value
        System.out.println("I am changing the value" + myvalue);

        //change the value to 0
        myvalue = 0;

        //display the new value
        System.out.println("The new value is " + myvalue);
    }
}