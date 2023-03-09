public class countable_test extends countable {
    public static void main(String [] args){
        // Create 3 objects
        countable_test c1 = new countable_test();
        countable_test c2 = new countable_test();
        countable_test c3 = new countable_test();
        
        // Print the number of objects created
        System.out.println("Number of objects created: " + getCount());
    }
}
