package application;

import java.util.ArrayList; // used for a list of admin users 
import java.util.Optional;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.scene.control.Dialog;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.scene.image.Image;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
/**
 * @authors Silas Rodriguez, Katrina Hellmann, Michael Gibich
 * @assignment CS2365 OOP
 * @date 4/25/2023
 * @purpose This interface is used to enforce user objects to implement certain methods that are required for all users and subclasses to have
 */
interface Account {
    // every user has a name and an age that must be set and can be retrieved
    public abstract void setUserName(String userName);
    public abstract void setUserAge(int userAge);
    public abstract boolean getIsAdmin();
    public abstract int getUserAge();
    public abstract String getUserName();
    public abstract void callRecommendation();
}

/**
 * @authors Silas Rodriguez, Katrina Hellmann, Michael Gibich
 * @assignment CS2365 OOP
 * @date 4/25/2023
 * @children Admin, Child, Senior, Adult
 * @purpose This class is used to create user objects and appropriate subclasses that can interface with the recommendation object
 */
public class User implements Account {
    // private variables for user object
    private String userName;    // required user name
    private int userAge;    // required user age
    private boolean isAdmin;    // required admin status

    /*
     * Constructor for user object with all required parameters for the user object
     */
    public User(String userName, int userAge, boolean isAdmin){
        this.userName = userName;   // set the user name
        if (userAge < 0){
            this.userAge = 0;   // if the user enters a negative age, set the age to 0
        }
        this.userAge = userAge; // set the user age
        this.isAdmin = isAdmin; // set the admin status
    }
    /*
     * Constructor for user object with all required parameters for the user object except for admin status
     */
    public User(String userName, int userAge){
        this(userName, userAge, false); // call the other constructor with the admin status set to false
    }
    /*
     * Default constructor: throws an exception if the user tries to create a user object without all required parameters
     */    
    public User(){
        throw new IllegalArgumentException("User must have a name and an age");
    }

    /*
     * setter for user name
     */
    @Override
    public void setUserName(String userName){
        this.userName = userName;
    }
    /*
     * setter for user age
     */
    @Override
    public void setUserAge(int userAge){
        this.userAge = userAge;
    }

    /*
     * getter for user name
     */
    @Override
    public String getUserName(){
        return this.userName;
    }
    /*
     * getter for user age
     */
    @Override
    public int getUserAge(){
        return this.userAge;
    }
    /*
     * getter for admin status
     */
    @Override
    public boolean getIsAdmin(){
        return this.isAdmin;
    }

    /*
     * method for calling the recommendation object and getting a recommendation
     */
    @Override
    public void callRecommendation() {
        // create a new recommendation object
        Recommendation rec = new Recommendation(this); // pass the user object to the recommendation object

        // create labels and text fields for user input
        Label nameLabel = new Label("Movie Name:");
        TextField nameField = new TextField();

        Label genreLabel = new Label("Movie Genre:");
        TextField genreField = new TextField();

        Label ratingLabel = new Label("Movie Rating:");
        TextField ratingField = new TextField();

        Label minYearLabel = new Label("Movie Min Year:");
        TextField minYearField = new TextField();

        Label maxYearLabel = new Label("Movie Max Year:");
        TextField maxYearField = new TextField();

        // create a GridPane layout and add the labels and text fields to it
        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(20, 20, 20, 20));
        grid.add(nameLabel, 0, 0);
        grid.add(nameField, 1, 0);
        grid.add(genreLabel, 0, 1);
        grid.add(genreField, 1, 1);
        grid.add(ratingLabel, 0, 2);
        grid.add(ratingField, 1, 2);
        grid.add(minYearLabel, 0, 3);
        grid.add(minYearField, 1, 3);
        grid.add(maxYearLabel, 0, 4);
        grid.add(maxYearField, 1, 4);

        // create a dialog box for the user to enter a search query
        Dialog<String[]> dialog = new Dialog<>();
        dialog.setTitle("Enter a search query");

        // set the button types (OK and Cancel)
        ButtonType okButtonType = new ButtonType("OK", ButtonData.OK_DONE);
        dialog.getDialogPane().getButtonTypes().addAll(okButtonType, ButtonType.CANCEL);

        // set the GridPane layout as the content of the dialog box
        dialog.getDialogPane().setContent(grid);
        
        dialog.getDialogPane().getStylesheets().add("application.css");
        dialog.getDialogPane().getStyleClass().add("dialog-pane");

        // add CSS styling to the labels
        nameLabel.getStyleClass().add("label-style");
        genreLabel.getStyleClass().add("label-style");
        ratingLabel.getStyleClass().add("label-style");
        minYearLabel.getStyleClass().add("label-style");
        maxYearLabel.getStyleClass().add("label-style");

        // add CSS styling to the text fields
        nameField.getStyleClass().add("textfield-style");
        genreField.getStyleClass().add("textfield-style");
        ratingField.getStyleClass().add("textfield-style");
        minYearField.getStyleClass().add("textfield-style");
        maxYearField.getStyleClass().add("textfield-style");

        Stage stage = (Stage) dialog.getDialogPane().getScene().getWindow();
        stage.getIcons().add(new Image("movies.jpg"));
        
        // request focus on the first input field
        Platform.runLater(() -> nameField.requestFocus());

        // convert the result of the dialog box to a string array when the user clicks OK
        dialog.setResultConverter(dialogButton -> {
            if (dialogButton == okButtonType) {
                return new String[]{
                        nameField.getText(),
                        genreField.getText(),
                        ratingField.getText(),
                        minYearField.getText(),
                        maxYearField.getText()
                };
            }
            return null;
        });

        // show the dialog box and get the result
        Optional<String[]> result = dialog.showAndWait();
        
        String name = null;
        String genre = null;
        String rating = null;
        String minYear = null;
        String maxYear = null;
        
        if (result.isPresent()) {
            name = result.get()[0];
            genre = result.get()[1];
            rating = result.get()[2];
            minYear = result.get()[3];
            maxYear = result.get()[4];
        }
        // if the user clicks cancel, return
        else{
        	
            return;
        }
        
        // update the recommendation object
        rec.setQueryName(name);
        rec.setQueryGenre(genre);
        // try to set the rating, if the user enters an invalid rating, set the rating to 0
     
        try {
            rec.setQueryRating(Character.toUpperCase(rating.trim().charAt(0))); // trim the string and get the first character for comparison
        } catch (NullPointerException | StringIndexOutOfBoundsException e) {
            rec.setQueryRating('0');
        }

        // try to set the min year, if the user enters an invalid year, set the year to 0
        try {
            rec.setQueryYearMin(Integer.parseInt(minYear));
        }
        catch (NumberFormatException e){
            rec.setQueryYearMin(0);
        }
        // try to set the max year, if the user enters an invalid year, set the year to 0
        try{
            rec.setQueryYearMax(Integer.parseInt(maxYear));
        }
        catch (NumberFormatException e){
            rec.setQueryYearMax(0);
        }
        // get the recommendation
        rec.getRecommendedMovies();
        // print the recommendation
        rec.printRecommendedMovies();
    }

    /*
     * method for automatically creating a user object of the appropriate subclass based on the user's age
     */
    public static User CreateAppropriateSubclass(String user_name, int user_age, boolean is_admin){
        // if the user is an admin, create an admin object and return it -> Returns an error without uname and age
        if (is_admin){
            return new Admin(user_name, user_age);
        }
        // not an admin, try to create a child object, if that fails, try to create an adult object, if that fails, create a senior object by default
        try{
            return new Child(user_name, user_age);
        }
        // IllegalArgumentException is thrown if the user is not a child -> by subclass hierarchy, this means the user might be an adult
        catch (IllegalArgumentException e){
            try{
                return new Adult(user_name, user_age);
            }
            // IllegalArgumentException is thrown if the user is not an adult -> by subclass hierarchy, this means the user must be a senior
            catch (IllegalArgumentException f){
                return new Senior(user_name, user_age);
            }
        }
    }
    /*
     * method for automatically creating a user object of the appropriate subclass based on the user's age (overloads the previous method)
     */
    public static User CreateAppropriateSubclass(String user_name, int user_age){
        return CreateAppropriateSubclass(user_name, user_age, false);   // default admin status is false, but can reuse previous code
    }
}

/**
 * @authors Silas Rodriguez, Katrina Hellmann, Michael Gibich
 * @assignment CS 2365 OOP Project
 * @created 4/25/2023
 * @parent User
 * @purpose Child class for User class hierarchy, inherits from User, verify that the user is a child
 */
class Child extends User{
    /*
     * constructor for child class that calls the super constructor and verifies that the user is a child
     */
    public Child(String user_name, int user_age){
        super(user_name, user_age);
        if (user_age >= 18){
            throw new IllegalArgumentException("Child user must be under 18 years old.");
        }
    }
}
/**
 * @authors Silas Rodriguez, Katrina Hellmann, Michael Gibich
 * @assignment CS 2365 OOP Project
 * @created 4/25/2023
 * @parent User
 * @purpose Child class for User class hierarchy, inherits from User, verify that the user is an adult
 */
class Adult extends User{
    /*
     * constructor for adult class that calls the super constructor and verifies that the user is an adult
     */
    public Adult(String user_name, int user_age){
        super(user_name, user_age);
        if (user_age < 18 || user_age >= 65){
            throw new IllegalArgumentException("Adult user must be between 18 and 64 years old.");
        }
    }
}
/**
 * @authors Silas Rodriguez, Katrina Hellmann, Michael Gibich
 * @assignment CS 2365 OOP Project
 * @created 4/25/2023
 * @parent User
 * @purpose Child class for User class hierarchy, inherits from User, verify that the user is a senior
 */
class Senior extends User{
    /*
     * constructor for senior class that calls the super constructor and verifies that the user is a senior
     */
    public Senior(String user_name, int user_age){
        super(user_name, user_age);
        if (user_age < 65){
            throw new IllegalArgumentException("Senior user must be 65 years old or older");
        }
    }
}
/**
 * @authors Silas Rodriguez, Katrina Hellmann, Michael Gibich
 * @assignment CS 2365 OOP Project
 * @created 4/25/2023
 * @parent User
 * @purpose Child class for User class hierarchy, inherits from User, elevates the user to admin status
 */
class Admin extends User{
    // private list of Admin users that can be accessed within the Admin class and dynamically grows
    private static ArrayList<Admin> Admin_list = new ArrayList<Admin>();
    /*
     * constructor for admin class that calls the super constructor and elevates the user to admin status
     */
    public Admin(String user_name, int user_age){
        super(user_name, user_age, true);
        Admin_list.add(this);
    }
}