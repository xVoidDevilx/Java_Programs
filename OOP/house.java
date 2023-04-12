package OOP;

public class house {
    /*
     * main class runs on execution
     * of the java file
     */
	public static void main(String[] args) {
        //create a rectangle object and call methods to init attributes
		rectangle bedroom = new rectangle(15, 10);
		rectangle kitchen = new rectangle(5,2);
		rectangle livingroom = new rectangle();	
		
		//print out the area of the bedroom
		System.out.println("The area of the bedroom is " + bedroom.getArea());
		//print out the area of the kitchen
		System.out.println("The area of the kitchen is " + kitchen.getArea());
		//print out the area of the livingroom
		System.out.println("The area of the livingroom is " + livingroom.getArea());

		//print total area
		System.out.println("The total area of the house is " + (bedroom.getArea() + kitchen.getArea() + livingroom.getArea()));
	}
}