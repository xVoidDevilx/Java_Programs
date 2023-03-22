package Inheritance;

public class SubClass extends SuperClass{
    /* Constructor */
    public SubClass(){
        super(10);  //call a parent constructor, passing an arg
        System.out.println("This is a subclass with default constructor!");
    }
}
