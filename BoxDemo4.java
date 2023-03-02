//Create a Box with attributes that describe it
class Box {
	//box has 3 dimensions	
	double height;
	double width;
	double depth;
	
	//create a method that must be called via an object instance (public keyword)
	public double volume() {
		return height * width * depth;
	}
}

//Solution Object
public class BoxDemo4 {
	public static void main(String[] args) {
	
	//Create two box instances
	Box box1 = new Box();
	Box box2 = new Box();
	double vol1, vol2;
	
	//Set box1 dimensions
	box1.width=10;
	box1.height =20;
	box1.depth=15;

	//set box 2 dimensions
	box2.width=3;
	box2.height =6;
	box2.depth=9;
	
	//compute the volumes using the methods
	vol1 = box1.volume();
	vol2 = box2.volume();

	//format strings to include & display the volumes
	System.out.println(String.format("Volume of box1 is %f", vol1));	
	System.out.println(String.format("Volume of box2 is %f", vol2));

	//Use a private method in a loop
	System.out.println("This message is called from main.");
	for(int i=0; i<3; i++) {
		Display_MSG();
	}
}
	//I don't want this method accessible outside the class
	private static void Display_MSG() {
		System.out.println("Hello from Display_MSG.");
	}
}
