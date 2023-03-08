package OOP.classes_constr;

public class metric {
    private double m, k;
    
    // Constructor
    public metric(double m, double k) {
        this.m = m;
        this.k = k;
    }
    // Default constructor
    public metric(){
        this.m = 0;
        this.k = 0;
    }
    // Getters and setters
    public double getM() {
        return m;
    }
    public double getK() {
        return k;
    }
    public void setM(double m) {
        this.m = m;
    }
    public void setK(double k) {
        this.k = k;
    }
    // Methods accesible from outside the class
    public static double getMiles(double m) {
        return m * 0.621371;
    }
    public static double getKilometers(double k) {
        return k * 1.60934;
    }
}