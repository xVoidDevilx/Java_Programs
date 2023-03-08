import javax.swing.JOptionPane;

public class NamesDialog {
    public static void main(String [] args) {
        //Define some vars
        String firstName, lastName;
        //take first name
        JOptionPane.showMessageDialog(null, "What is your first name?");
        firstName = JOptionPane.showInputDialog("My first name is ");
        //take last name
        JOptionPane.showMessageDialog(null, "What is your last name?");
        lastName = JOptionPane.showInputDialog("My last name is ");
        //print the full name
        JOptionPane.showMessageDialog(null, String.format("My name is %s %s", firstName, lastName));
        //Exit the JVM
        System.exit(0);
    }
}