/**
 * @author Silas Rodriguez
 * @since 2/24/2023
 * @version 1.0
 */

 public class rectangle {
	//create private attributes for len and wid
	private double length;
	private double width; 
	
	//create a default constructor for the rectangle class
	public rectangle() {
		length = 0;
		width = 0;
	}

	//create a constructor for the rectangle class
	public rectangle(double len, double wid) {
		length = len;
		width = wid;
	}

	/*
	 * sets the len of the rectangle
	 */
	public void setLength(double len) {
		length = len;
	}
	/*
	 * gets the len of the rectangle
	 */
	public double getLength() {
		return length;
	}
	/*
	 * set width of rectangle
	 */
	public void setWidth(double wid) {
		width = wid;
	}
	/*
	 * gets width of the rectangle
	 */
	public double getWidth() {
		return width;
	}
	/*
	 * compute and return area of the rectangle
	 */
	public double getArea() {
		return length*width;
	}
}
