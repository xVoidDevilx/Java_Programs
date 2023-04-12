package movie_rec_proj;
import java.util.*;
import javax.swing.*;

public class debug {
    public static void main (String[] args) {
        // create a new user object
        user user1 = new user("Silas Rodriguez", 20);
        // create a new recommendation object
        recommendation recommendation = new recommendation();
        // create some new movie objects
        movie movie1 = new movie("The Matrix", "Sci-Fi", 1999, 8.7);
        movie movie2 = new movie("The Matrix Reloaded", "Sci-Fi", 2003, 7.2);
        movie movie3 = new movie("The Matrix Revolutions", "Sci-Fi", 2003, 6.7);
        movie movie4 = new movie("Super Mario Movie", "Adventure", 2023, 9.6);
        movie movie5 = new movie("Sonic The Hedgehog", "Action", 2020, 7.5);
        movie movie6 = new movie("Sonic The Hedgehog 2", "Action", 2022, 6.5);
        movie movie7 = new movie("Matilda", "Comedy", 1996);
        movie movie8 = new movie("Charolette's Web");
        movie movie9 = new movie("Space Jam", "Family", 1996, 6.5);
        movie movie10 = new movie("The Lion King", "Family", 1994, 8.5);
        movie movie11 = new movie("Scream", "Horror");
        try {
            // create an illegal movie object
            movie movie12 = new movie();
        }
        catch (Exception e) {
            // print error message that results from the illegal movie object -> specified in class
            System.out.println("Error: " + e.getMessage()+ "... Movie object not created");
        }
        finally {
            JTextField titlefield = new JTextField();
            JTextField genrefield = new JTextField();
            JTextField ratingfield = new JTextField();
            JTextField yearfield1 = new JTextField();
            JTextField yearfield2 = new JTextField();
            Object[] message = {
                "Title:", titlefield,
                "Genre:", genrefield,
                "Rating:", ratingfield,
                "Min Year:", yearfield1,
                "Max Year:", yearfield2
            };
            
            int option = JOptionPane.showConfirmDialog(null, message, "Search Criteria", JOptionPane.OK_CANCEL_OPTION);
            
            if (option == JOptionPane.OK_OPTION) {
                String title = titlefield.getText();
                String genre = genrefield.getText();
                String rating = ratingfield.getText();
                String year1 = yearfield1.getText();
                String year2 = yearfield2.getText();
                try{
                    user1.setSearchTitle(title); // set the user's search criteria
                    user1.setSearchGenre(genre); // set the user's search criteria
                    user1.setSearchRating(Double.parseDouble(rating));   // convert string to double
                    user1.setSearchMinYear(Integer.parseInt(year1)); // convert string to int
                    user1.setSearchMaxYear(Integer.parseInt(year2)); // convert string to int
                }
                catch (java.lang.NumberFormatException e) {
                    // user entered a non-numeric value for rating or year -> proceed with default values
                    System.out.println("Error: " + e.getMessage()+ "... Default values for search rating and/or year will be used.");
                    System.out.println("Please use an integer for year and a double for rating in the future.");
                }
                finally {
                    System.out.println("\n"+ user1.getName() + "'s' search query:");
                    System.out.println("Title: " + user1.getSearchTitle());
                    System.out.println("Genre: " + user1.getSearchGenre());
                    System.out.println("Rating: " + user1.getSearchRating());
                    System.out.println("Min Year: " + user1.getSearchMinYear() + " Max Year: " + user1.getSearchMaxYear() + "\n");

                    // search for movies that match the user's criteria
                    List<movie> recommends = recommendation.recommendMovies(user1);
                    // print the list of movies that match the user's criteria
                    System.out.println("Movies that match your search criteria:");
                    for (movie movie : recommends) {
                        System.out.println(movie.toString());
                    }
                }
            }
            else {
                System.out.println("User canceled / closed the dialog, resulting in no search");
            }

        }
    }
}
