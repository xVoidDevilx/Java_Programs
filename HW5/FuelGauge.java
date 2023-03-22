package HW5;

/**
 * @author: Silas Rodriguez
 * @date: 03/22/2023
 * @description: This class is used to create a fuel gauge object that can be used to keep track of the fuel in a car.
 * @course: CS2365
 * @assignment: HW5 
 */
public class FuelGauge {
    // Instance fuel variable
    private int fuel;

    /* Default Constructor */
    public FuelGauge(){
        fuel = 0;
    }
    /*  Constructor with fuel level */
    public FuelGauge(int fuel){
        this.fuel = fuel;
    }
    /* Report Fuel level of car */
    public int getFuel(){
        return fuel;
    }
    /* Increment fuel level by 1 */
    public void incrementFuel(){
        if (fuel < 15){
            fuel++;
        }
    }
    /* Decrement fuel level by 1 */
    public void decrementFuel(){
        if (fuel > 0){
            fuel--;
        }
    }
}
