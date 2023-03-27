package interfaces;

public class testface2 {
    // This is a test program for the interface
    public static void main(String[] args) {
        // Create an object of the class that implements the interface
        Callback c = new Client();
        // Call the interface method
        c.callback(42);
        
        // Create an object of the class that implements the interface
        Client ca = new Client();
        // Call the interface method
        ca.callback(45);
        // Call the non-interface method
        ca.nonIfaceMeth();
    }
}
