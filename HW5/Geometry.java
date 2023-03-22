package HW5;
import java.lang.Math;

/**
 * @author: Silas Rodriguez
 * @date: 03-Mar-2023
 * @course CS-2365
 * @assignment: HW5
 * @purpose: This class contains methods to calculate the area of a circle, rectangle, and triangle.
 */
public class Geometry{
    /*
     * This method calculates the area of a circle
     */
    public static double areaOfCircle(double radius){
        try{
            if(radius < 0){
                throw new IllegalArgumentException("Radius cannot be negative");
            }
        }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
            System.exit(0);
        }
        return Math.PI * Math.pow(radius, 2);
    }
    /* 
     * This method calculates the area of a rectangle
     */
    public static double areaOfRectangle(double length, double width){
        try{
            if(length < 0 || width < 0){
                throw new IllegalArgumentException("Length and width cannot be negative");
            }
        }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
            System.exit(0);
        }
        return length * width;
    }

    /* 
     * This method calculates the area of a triangle
     */
    public static double areaOfTriangle(double base, double height){
        try {
            if(base < 0 || height < 0){
                throw new IllegalArgumentException("Base and height cannot be negative");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            System.exit(0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }
        return base * height * 0.5;
    }


}