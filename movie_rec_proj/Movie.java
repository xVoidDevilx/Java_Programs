package movie_rec_proj;
import java.util.ArrayList;

public class Movie{
    //create an array list that acts as a database for all movies can be accessed by all users in the package using get_movie_list() method below -> Could be modified by a future object like "movie_database"
    protected static ArrayList<Movie> movie_list = new ArrayList<Movie>();
    // movie name and year
    private String movie_name;  // required
    private int movie_year;     // required
    private char movie_rating;  // required
    private String movie_genre; // required
    
    // constructor for required fields
    public Movie(String movie_name, int movie_year, char movie_rating, String movie_genre){
        this.movie_name = movie_name;
        this.movie_year = movie_year;
        this.movie_rating = movie_rating;
        this.movie_genre = movie_genre;
        movie_list.add(this);
    }

    // constructor for all fields
    public Movie(String movie_name, int movie_year, char movie_rating, String movie_genre, String movie_description, String movie_director){
        this.movie_name = movie_name.toUpperCase();                 // convert to uppercase to make searching easier
        this.movie_year = movie_year;
        this.movie_rating = Character.toUpperCase(movie_rating);    // convert to uppercase to make searching easier
        this.movie_genre = movie_genre.toUpperCase();               // convert to uppercase to make searching easier
        movie_list.add(this);
    }

    // set movie name
    public void setMovieName(String movie_name){
        this.movie_name = movie_name;
    }
    // set movie year
    public void setMovieYear(int movie_year){
        this.movie_year = movie_year;
    }
    // set movie rating
    public void setMovieRating(char movie_rating){
        this.movie_rating = movie_rating;
    }
    // set movie genre
    public void setMovieGenre(String movie_genre){
        this.movie_genre = movie_genre;
    }
    // get movie name
    public String getMovieName(){
        return this.movie_name;
    }
    // get movie year
    public int getMovieYear(){
        return this.movie_year;
    }
    // get movie rating
    public char getMovieRating(){
        return this.movie_rating;
    }
    // get movie genre
    public String getMovieGenre(){
        return this.movie_genre;
    }
    // get movie list
    public static ArrayList<Movie> getMovieList(){
        return movie_list;
    }
    
    // get movie list size
    public static int getMovieListSize(){
        return movie_list.size();
    }

    @Override
    public String toString(){
        return "Movie Name: " + this.movie_name + "\nMovie Year: " + this.movie_year + "\nMovie Rating: " + this.movie_rating + "\nMovie Genre: " + this.movie_genre;
    }
}