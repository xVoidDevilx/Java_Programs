package application; 
import java.net.URL;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.DialogPane;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;

public class Test2 extends Application  {
    public static void main(String args[]){          
         launch(args);     
         
    } 
         
    private static void TestUserQuery(User obj) {
        while (true) {
        	obj.callRecommendation();
            Alert confirmDialog = new Alert(Alert.AlertType.CONFIRMATION, "Would you like to continue filtering?", ButtonType.YES, ButtonType.NO);
            confirmDialog.setHeaderText("Please Confirm Action");
            
            // Set the alert color
            DialogPane dialogPane = confirmDialog.getDialogPane();
            dialogPane.setStyle("-fx-background-color: #ADD8E6;");

            // Set the alert icon
            Stage stage = (Stage) confirmDialog.getDialogPane().getScene().getWindow();
            stage.getIcons().add(new Image("movies.jpg"));

            // Get the dialog pane and add the CSS stylesheet
            dialogPane.getStylesheets().add("application.css");
            confirmDialog.showAndWait();
            

            if (confirmDialog.getResult() == ButtonType.YES) {
                continue;
            } else {
                break;
            }
        }
    }
    
    @Override    
    public void start(Stage primaryStage) throws Exception { 
    	User[] users = new User[4];
        User user1 = User.CreateAppropriateSubclass("Silas", 20);
        User user2 = User.CreateAppropriateSubclass("Misha", 22);
        User user3 = User.CreateAppropriateSubclass("Katrina", 17);
        User user4 = User.CreateAppropriateSubclass("Derek", 37, true);
        
        // add users to array
        users[0] = user1;
        users[1] = user2;
        users[2] = user3;
        users[3] = user4;
        
        for (int i = 0; i < 4; i++) {
            if (users[i] instanceof Child) {
                System.out.println(users[i].getUserName() + " is a child.");
            } else if (users[i] instanceof Adult) {
                System.out.println(users[i].getUserName() + " is an adult.");
            } else if (users[i] instanceof Senior) {
                System.out.println(users[i].getUserName() + " is a senior.");
            } else if (users[i] instanceof Admin) {
                System.out.println(users[i].getUserName() + " is an admin.");
            }
        }
        System.out.println("\n");
        // try to create an illegal user
        try{
            User user5 = new Child("Suzy", 20);
        }
        catch (IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage()+ "\n");
        }
        finally{
            // create some movies
            Movie movie1 = new Movie("The Matrix", 1999, 'R', "Sci-Fi");
            Movie movie2 = new Movie("The Matrix Reloaded", 2003, 'R', "Sci-Fi");
            Movie movie3 = new Movie("The Matrix Revolutions", 2003, 'R', "Sci-Fi");
            Movie movie4 = new Movie("Sonic The HedgeHog", 2020, 'P', "Action");
            Movie movie5 = new Movie("The Dark Knight", 2008, 'R', "Action");
            Movie movie6 = new Movie("Sonic The Hedgehog 2", 2022, 'P', "Action");
            Movie movie7 = new Movie("Beyond the Valley of Dolls", 1970, 'X', "Comedy");
            Movie movie8 = new Movie("The Room", 2003, 'R', "Drama");
            Movie movie9 = new Movie("Spongebob Squarepants: The Movie", 2004, 'G', "Comedy");
            Movie movie10 = new Movie("Matilda", 1996, 'P', "Family");
            // try to create an illegal movie
            try{
                Movie movie11 = new Movie();
            }
            catch (IllegalArgumentException e){
                System.out.println("Error: " + e.getMessage() + "\n");
            }
            finally{
                // demo user1 (adult user) querying a recommendation
                System.out.println("Demoing user1 (adult user) querying a recommendation:");
                TestUserQuery(user1);
                // demo user3 (child user) querying a recommendation
                System.out.println("Demoing user3 (child user) querying a recommendation:");
                TestUserQuery(user3);
                
            }
        }
        StackPane layout = new StackPane();
        
        Scene scene = new Scene(layout, 300, 300);
        scene.getStylesheets().add("application.css");

        
     
 
    }
}