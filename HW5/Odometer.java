package HW5;
/**
 * @author: Silas Rodriguez
 * @date: 03/22/23
 * @assignment: HW 5
 * @course: CS-2365
 * @description: This class contains the Odemeter class which is used to track the mileage of a vehicle.
 */
public class Odometer {
    // Instance mileage variable
    private int miles;
    // Instance fuelGauge object
    private FuelGauge fuelGauge;

    /* Default Constructor */
    public Odometer(){
        miles = 0;
        fuelGauge = new FuelGauge();
    }
    /*  Constructor with mileage and fuelGauge object */
    public Odometer(int miles, FuelGauge fuelGauge){
        this.miles = miles;
        this.fuelGauge = fuelGauge;
    }
    /* Constructor with just mileage */
    public Odometer(int miles){
        this.miles = miles;
        fuelGauge = new FuelGauge();
    }
    /* Report mileage */
    public int getMiles(){
        return miles;
    }
    /* Increment mileage by 1 */
    public void incrementMiles(){
        //normal condition
        if (miles < 999999 && fuelGauge.getFuel() > 0){
            miles++;
        }
        //rollover condition
        else if (miles == 999999 && fuelGauge.getFuel() > 0){
            miles = 0;
        }
        //out of fuel condition
        else{
            System.out.println("Out of fuel");
        }
    }
    /* Decrement fuel level every 24 miles */
    public void driving(){
        if (miles % 24 == 0){
            fuelGauge.decrementFuel();
        }
    }
}