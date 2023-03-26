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
            //add a fuel count every 48 miles (shows this method), only after one gallon though, and when fuel is available
            if (odometer.getMiles() % 48 == 0 && fuelGauge.getFuel() < 14 && fuelGauge.getFuel() != 0){
                fuelGauge.incrementFuel();
            }
        }
    }
}
