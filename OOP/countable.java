public class countable {
    // Static variable to keep track of the number of objects created
    private static int count = 0;

    // Constructor increments the number of objects created
    public countable() {
        count++;
    }

    // Get the number of objects created
    public static int getCount() {
        return count;
    }

}
