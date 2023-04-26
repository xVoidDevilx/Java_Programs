package application;
import java.util.ArrayList; // import the ArrayList class for dynamic arrays -> lists that grow and shrink in size as needed -> used to create a database of movies that can be accessed by all users

/**
 * @authors Silas Rodriguez, Katrina Hellmann, Michael Gibich
 * @assignment CS2365 OOP
 * @date 4/25/2023
 * @purpose This class is used to create movie objects that can be added to a database and accessed by users
 */
public class Movie{
    //create an array list that acts as a database for all movies can be accessed by all users in the package using get_movie_list() method below -> Could be modified by a future object like "movie_database"
    protected static ArrayList<Movie> movie_list = new ArrayList<Movie>();
    //private variables for movie object
    private String movie_name;  // required movie name
    private int movie_year;     // required movie year
    private char movie_rating;  // required movie rating
    private String movie_genre; // required movie genre
    
    /*
     * Constructor for movie object with all required parameters for the movie object
     */
    public Movie(String movie_name, int movie_year, char movie_rating, String movie_genre){
        this.movie_name = movie_name.toUpperCase(); // convert to uppercase to make searching easier
        this.movie_year = movie_year;   //set the movie year as an integer, because years aren't decimals
        this.movie_rating = Character.toUpperCase(movie_rating);    // convert to uppercase to make searching easier
        this.movie_genre = movie_genre.toUpperCase();   // convert to uppercase to make searching easier
        movie_list.add(this);
    }
    /*
     * Default constructor: throws an exception if the user tries to create a movie object without all required parameters
     */
    public Movie (){
        throw new IllegalArgumentException("Movie must have a name, year, rating, and genre");
    }
    /*
     * setter for the movie name
     */
    public void setMovieName(String movie_name){
        this.movie_name = movie_name;
    }
    /*
     * setter for the movie year
     */
    public void setMovieYear(int movie_year){
        this.movie_year = movie_year;
    }
    /*
     * setter for the movie rating
     */
    public void setMovieRating(char movie_rating){
        this.movie_rating = movie_rating;
    }
    /*
     * setter for the movie genre
     */
    public void setMovieGenre(String movie_genre){
        this.movie_genre = movie_genre;
    }
    /*
     * getter for the movie name
     */
    public String getMovieName(){
        return this.movie_name;
    }
    /*
     * getter for the movie year
     */
    public int getMovieYear(){
        return this.movie_year;
    }
    /*
     * getter for the movie rating
     */
    public char getMovieRating(){
        return this.movie_rating;
    }
    /*
     * getter for the movie genre
     */
    public String getMovieGenre(){
        return this.movie_genre;
    }
    /*
     * getter for the movie list
     */
    public static ArrayList<Movie> getMovieList(){
        return movie_list;
    }
    /*
     * getter for the movie list size
     */
    public static int getMovieListSize(){
        return movie_list.size();
    }

    /*
     * toString method for the movie object -> prints out all the information about the movie in a pretty format
     */
    @Override
    public String toString(){
        return "Movie Name: " + this.movie_name + "\nMovie Year: " + this.movie_year + "\nMovie Rating: " + this.movie_rating + "\nMovie Genre: " + this.movie_genre + "\n";
    }
}