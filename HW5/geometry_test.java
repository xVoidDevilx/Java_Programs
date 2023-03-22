package HW5;
import javax.swing.JOptionPane;
/**
 * @author: Silas Rodriguez
 * @date: 3/22/23
 * @course CS-2365
 * @assignment: HW5
 * @purpose: This class contains a main method to test the Geometry class.
 */
public class geometry_test {
    /* main method begins execution of Java application
    *  & tests Geometry class
    */
    public static void main(String[] args) {
        // create a new object of the class String to hold user response
        String response = new String();
        // launch a dialog box to prompt the user for input and store the response in the object response
        response = JOptionPane.showInputDialog("Geometry Calculator\n\n1. Calculate the Area of a Circle\n2. Calculate the Area of a Rectangle\n3. Calculate the Area of a Triangle\n4. Quit\n\nEnter your choice (1-4):");
        // convert the response from a String to an int
        int choice = Integer.parseInt(response);
        
        // switch statement to determine which method to call
        switch (choice){
            case 1:
                // prompt the user for input
                response = JOptionPane.showInputDialog("Enter the radius of the circle:");
                // convert the response from a String to a double
                double radius = Double.parseDouble(response);
                // call the method areaOfCircle and store the result in the object area
                double area = Geometry.areaOfCircle(radius);
                // display the result
                JOptionPane.showMessageDialog(null, "The area of the circle is " + area);
                break;
            case 2:
                // prompt the user for input
                response = JOptionPane.showInputDialog("Enter the length of the rectangle:");
                // convert the response from a String to a double
                double length = Double.parseDouble(response);
                // prompt the user for input
                response = JOptionPane.showInputDialog("Enter the width of the rectangle:");
                // convert the response from a String to a double
                double width = Double.parseDouble(response);
                // call the method areaOfRectangle and store the result in the object area
                area = Geometry.areaOfRectangle(length, width);
                // display the result
                JOptionPane.showMessageDialog(null, "The area of the rectangle is " + area);
                break;
            case 3:
                // prompt the user for input
                response = JOptionPane.showInputDialog("Enter the base of the triangle:");
                // convert the response from a String to a double
                double base = Double.parseDouble(response);
                // prompt the user for input
                response = JOptionPane.showInputDialog("Enter the height of the triangle:");
                // convert the response from a String to a double
                double height = Double.parseDouble(response);
                // call the method areaOfTriangle and store the result in the object area
                area = Geometry.areaOfTriangle(base, height);
                // display the result
                JOptionPane.showMessageDialog(null, "The area of the triangle is " + area);
                break;
            case 4:
                // display a message to the user
                JOptionPane.showMessageDialog(null, "Goodbye!");
                break;
            default:
                // display a message to the user
                throw new IllegalArgumentException("User input out of range (1-4)");
        }
    }       
}
