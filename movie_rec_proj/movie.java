package movie_rec_proj;
import java.util.*; //for lists -> dynamic arrays for variable sizes so that the movie "database" can be updated

/**
 * @author Silas Rodriguez
 * @date 04-12-2023
 * @assignment Group Project
 * @description This class is used to create movie objects and manage them.
 */
public class movie {
    
    // static list that will hold all the movies, this is the "database"
    public static List<movie> movies = new ArrayList<movie>();    // dynamic list of movies

    // private variables for the movie class
    private String title;   // title of the movie
    private String genre;   // genre of the movie   -> default is ""
    private int year;       // year the movie was released  -> default is 0
    private double rating;  // rating of the movie -> default is 0

    /*
     * Constructor for the movie class when all the variables are given
     */
    public movie(String title, String genre, int year, double rating) {
        this.title = title;
        this.genre = genre;
        this.year = year;
        this.rating = rating;
        movies.add(this);   // add the movie to the "database"
    }

    /*
     * Constructor for the movie class when the rating is not given
     */
    public movie(String title, String genre, int year) {
        this.title = title;
        this.genre = genre;
        this.year = year;
        this.rating = 0;
        movies.add(this);   // add the movie to the "database"
    }

    /*
     * Constructor for the movie class when the year is not given
     */
    public movie(String title, String genre) {
        this.title = title;
        this.genre = genre;
        this.year = 0;
        this.rating = 0;
        movies.add(this);   // add the movie to the "database"
    }

    /*
     * Constructor for the movie class when the genre is not given
     */
    public movie(String title) {
        this.title = title;
        this.genre = "";
        this.year = 0;
        this.rating = 0;
        movies.add(this);   // add the movie to the "database"
    }

    /*
     * Constructor for the movie class when no variables are given -> throws an exception
     */
    public movie() {
        throw new IllegalArgumentException("Movie must have a title | genre, year, rating are optional.");
    }

    /*
     * Method for getting the title of the movie
     */
    public String getTitle() {
        return title;
    }

    /*
     * Method for getting the genre of the movie
     */
    public String getGenre() {
        return genre;
    }

    /*
     * Method for getting the year the movie was released
     */
    public int getYear() {
        return year;
    }

    /*
     * Method for getting the rating of the movie
     */
    public double getRating() {
        return rating;
    }

    /*
     * Method for setting the title of the movie
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /*
     * Method for setting the genre of the movie
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    /*
     * Method for setting the year the movie was released
     */
    public void setYear(int year) {
        this.year = year;
    }

    /*
     * Method for setting the rating of the movie
     */
    public void setRating(double rating) {
        this.rating = rating;
    }

    /*
     * Method that prints out the movie object in a readable format -> overrides the toString() method
     */
    @Override
    public String toString() {
        return "{Movie: " + title+ "\nGenre: " + genre + "\nYear: " + year + "\nRating: " + rating + "\n}";
    }

}
