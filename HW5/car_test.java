package HW5;

public class car_test {
    public static void main(String [] args) {
        // Create a fuelGauge object
        FuelGauge fuelGauge = new FuelGauge();
        // Create an odometer object
        Odometer odometer = new Odometer(0, fuelGauge);
        // Fill the tank using i for an iterator
        int i = 0;
        while (i < 15){
            fuelGauge.incrementFuel();
            i++;
        }

        System.out.println("Initial Fuel: " + fuelGauge.getFuel());

        //simulate the car driving
        while (fuelGauge.getFuel() > 0){
            odometer.incrementMiles();
            odometer.driving();
            if (odometer.getMiles() % 24 == 0){
                System.out.println("Miles: " + odometer.getMiles() + " Fuel Level: " + fuelGauge.getFuel());
            }
        }
    }
}
