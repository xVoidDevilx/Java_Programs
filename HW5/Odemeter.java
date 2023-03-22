package HW5;

public class Odemeter {
    // Instance mileage variable
    private int miles;
    // Instance fuelGauge object
    private FuelGauge fuelGauge;

    /* Default Constructor */
    public Odemeter(){
        miles = 0;
        fuelGauge = new FuelGauge();
    }
    /*  Constructor with mileage and fuelGauge object */
    public Odemeter(int miles, FuelGauge fuelGauge){
        this.miles = miles;
        this.fuelGauge = fuelGauge;
    }
    /* Constructor with just mileage */
    public Odemeter(int miles){
        this.miles = miles;
        fuelGauge = new FuelGauge();
    }
    
    /* Report mileage */
    public int getMiles(){
        return miles;
    }

    /* Increment mileage by 1 */
    public void incrementMiles(){
        if (miles < 999999){
            miles++;
        }
        //rollover condition
        else{
            miles = 0;
        }
    }
    /* Decrement fuel level every 24 miles */
    public void decrementFuel(){
        if (miles % 24 == 0){
            fuelGauge.decrementFuel();
        }
    }
}
