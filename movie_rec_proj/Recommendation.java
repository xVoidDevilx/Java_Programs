package movie_rec_proj;
import java.util.ArrayList; // import the ArrayList class for dynamic lists of movies to be recommended to the user
/**
 * @authors Silas Rodriguez, Katrina Hellmann, Michael Gibich
 * @assignment CS 2365 OOP
 * @description Recommendation class for the movie recommendation project - should only be called by user objects, or created seperately with a user object as a parameter
 * @date 4/25/2023
 */
public class Recommendation {
    //dynamic list of movies that will be recommended to the user
    private ArrayList<Movie> recommended_movies;
    // database of movies pulled from movies - FINAL so that it cannot be rewritten
    private final ArrayList<Movie> MOVIE_DB = Movie.getMovieList();  // private & static so that it can be accessed across the class as a local constant
    // private variables for the query that will be used to search the database
    private String query_name;  //name of movie to be searched for
    private int query_year_min; //min year of movie to be searched for
    private int query_year_max; //max year of movie to be searched for
    private char query_rating;  //rating of movie to be searched for
    private String query_genre; //genre of movie to be searched for
    private User caller;    //user that called the recommendation class

    /*
     * Constructor for the recommendation class that takes in a user object, can only be called by a user object
     */
    public Recommendation(User acct){
        this.recommended_movies = new ArrayList<Movie>();   // initialize the recommended movies list
        this.caller = acct; //set the caller to the user that called the recommendation class
    }

    /*
     * default constructor for the recommendation class
     */
    public Recommendation(){
        throw new UnsupportedOperationException("Cannot create a recommendation without a user object. (Need a user object to recommend to)");
    }
    /*
     * setter for the query movie name
     */
    public void setQueryName(String query_name){
        this.query_name = query_name.toUpperCase(); //convert to uppercase to make searching easier
    }
    /*
     * setter for the query year min
     */
    public void setQueryYearMin(int query_year_min){
        this.query_year_min = query_year_min;
    }
    /*
     * setter for the query year max
     */
    public void setQueryYearMax(int query_year_max){
        this.query_year_max = query_year_max;
    }
    /*
     * setter for the query rating
     */
    public void setQueryRating(char query_rating){
        this.query_rating = Character.toUpperCase(query_rating);    //convert to uppercase to make searching easier
    }
    /*
     * setter for the query genre
     */
    public void setQueryGenre(String query_genre){
        this.query_genre = query_genre.toUpperCase();   //convert to uppercase to make searching easier
    }
    //cannot set the caller -> This would be a security risk
    
    /*
     * method for getting the query name -> used for debugging
     */
    public String getQueryName(){
        return this.query_name;
    }   
    /*
     * method for getting the query year min -> used for debugging
     */
    public int getQueryYearMin(){
        return this.query_year_min;
    }
    /*
     * method for getting the query year max -> used for debugging
     */
    public int getQueryYearMax(){
        return this.query_year_max;
    }
    /*
     * method for getting the query rating -> used for debugging
     */
    public char getQueryRating(){
        return this.query_rating;
    }
    /*
     * method for getting the query genre -> used for debugging
     */
    public String getQueryGenre(){
        return this.query_genre;
    }
    /*
     * method for getting the caller -> used for debugging
     */
    public User getUser(){
        return this.caller;
    }

    /*
     * method for adding a movie to the recommended movies list
     */
    private void add_recommendation(Movie movie){
        this.recommended_movies.add(movie);
    }
    /*
     * method for removing a movie from the recommended movies list
     */
    private void remove_recommendation(Movie movie){
        this.recommended_movies.remove(movie);
    }

    /*
     * method for getting the recommended movies list
     */
    public ArrayList<Movie> getRecommendedMovies(){
        this.update_recommendation();   // update the recommended movies list
        return this.recommended_movies;
    }

    /*
     * method for updating the recommended movies list
     */
    private void update_recommendation(){
        // clear the recommended movies list
        this.recommended_movies.clear();
        // loop through the movie database
        for (Movie movie : this.MOVIE_DB){
            // check if the movie matches the query if a full query is submitted
            if ((movie.getMovieName().contains(this.query_name) && this.query_name.length()>0) || (this.query_genre.length()>0 && movie.getMovieGenre().contains(this.query_genre)) || (movie.getMovieRating() == this.query_rating)){
                // add the movie to the recommended movies list
                System.out.println("Movie matches query | " + movie.getMovieName());
                this.add_recommendation(movie);
            }
            // check for variation in year submission only max submitted
            else if (this.query_year_min == 0 && movie.getMovieYear() <= this.query_year_max){
                // add the movie to the recommended movies list
                this.add_recommendation(movie);
            }
            // check for variation in year submission only min submitted
            else if (this.query_year_max == 0 && movie.getMovieYear() >= this.query_year_min){
                // add the movie to the recommended movies list
                this.add_recommendation(movie);
            }
        }
        // if no movies were added, recommend all movies as an alternative while logging the event
        if (this.recommended_movies.size() == 0){
            System.out.println("No movies match the query. Recommending all movies.");
            this.recommended_movies = this.MOVIE_DB;  // if no movies match the query, recommend all movies
        }
        //check if the user class has permissions to view the recommended movies    -- create a copy to prevent concurrent modification
        ArrayList<Movie> copy = new ArrayList<Movie>(this.recommended_movies); // create a copy of the recommended movies list
        if (this.caller instanceof Child){
            //used an enhanced for loop to prevent concurrent modification exception and remove the movie from the recommended movies list if the user is a child and the movie rating is keyed
            for (Movie movie : copy){
                if (movie.getMovieRating() == 'R' || movie.getMovieRating() == 'M' || movie.getMovieRating() == 'X'){
                    this.remove_recommendation(movie); // remove the movie from the recommended movies list if the user is a child and the movie is rated R
                }
            }
        }
    }
    
    /*
     * method for getting the movie database
     */
    public ArrayList<Movie> getMovieDataBase(){
        return this.MOVIE_DB;
    }

    /*
     * method for printing the recommended movies list
     */
    public void printRecommendedMovies(){
        // first line print
        System.out.println("Recommended Movies:");
        // loop through the recommended movies list and print each movie using the toString method
        for (Movie movie : this.recommended_movies){
            System.out.println(movie.toString());
        }
    }
}