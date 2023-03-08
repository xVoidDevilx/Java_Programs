package HW4;

/**
 * @author: Silas Rodriguez
 * @date: 3/7/2023
 * @course: CS 2365
 * @assignment: HW4
 * @purpose: This class is used to convert temperatures from Fahrenheit to Celsius and Kelvin
 */
public class Temperature {
    //farhenheit is the only variable needed to convert to celsius and kelvin
    private double fahrenheit;

    /*
     * This is the constructor for the Temperature class, it takes in a double and sets it to the fahrenheit variable
     */
    public Temperature(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    /*
     * This is the getter for the fahrenheit variable
     */
    public double getFahrenheit() {
        return fahrenheit;
    }
    /*
     * This is the setter for the fahrenheit variable
     */
    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }
    /*
    * This method converts the fahrenheit variable to celsius
    */
    public double celsius() {
        return (fahrenheit - 32) * 5/9;
    }
    /*
    * This method converts the fahrenheit variable to kelvin
    */
    public double kelvin() {
        //return this.getCelsius() + 273.15;    -> this would be better
        return ((fahrenheit - 32) * 5/9)+273;
    }
}