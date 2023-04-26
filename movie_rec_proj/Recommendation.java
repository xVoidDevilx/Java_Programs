package movie_rec_proj;
import java.util.ArrayList;

public class Recommendation {
    //dynamic list of movies that will be recommended to the user
    private ArrayList<Movie> recommended_movies;
    // database of movies pulled from movies 
    private final ArrayList<Movie> MOVIE_DB = Movie.getMovieList();  // private & static so that it can be accessed across the class as a local constant

    private String query_name;  //name of movie to be searched for
    private int query_year_min; //min year of movie to be searched for
    private int query_year_max; //max year of movie to be searched for
    private char query_rating;  //rating of movie to be searched for
    private String query_genre; //genre of movie to be searched for
    private User caller;    //user that called the recommendation class

    //constructor for creating a recommendation object
    public Recommendation(User acct){
        this.recommended_movies = new ArrayList<Movie>();   // initialize the recommended movies list
        this.caller = acct; //set the caller to the user that called the recommendation class
    }

    //method for setting the query name
    public void setQueryName(String query_name){
        this.query_name = query_name.toUpperCase(); //convert to uppercase to make searching easier
    }
    //method for setting the query year min
    public void setQueryYearMin(int query_year_min){
        this.query_year_min = query_year_min;
    }
    //method for setting the query year max
    public void setQueryYearMax(int query_year_max){
        this.query_year_max = query_year_max;
    }
    //method for setting the query rating
    public void setQueryRating(char query_rating){
        this.query_rating = Character.toUpperCase(query_rating);    //convert to uppercase to make searching easier
    }
    //method for setting the query genre
    public void setQueryGenre(String query_genre){
        this.query_genre = query_genre.toUpperCase();   //convert to uppercase to make searching easier
    }
    //cannot set the caller -> This would be a security risk

    //method for getting the query name -> used for debugging
    public String getQueryName(){
        return this.query_name;
    }   
    //method for getting the query year min -> used for debugging
    public int getQueryYearMin(){
        return this.query_year_min;
    }
    //method for getting the query year max -> used for debugging
    public int getQueryYearMax(){
        return this.query_year_max;
    }
    //method for getting the query rating -> used for debugging
    public char getQueryRating(){
        return this.query_rating;
    }
    //method for getting the query genre -> used for debugging
    public String getQueryGenre(){
        return this.query_genre;
    }
    //method for getting the caller -> used for debugging
    public User getUser(){
        return this.caller;
    }

    //method for adding a movie to the recommended movies list
    private void add_recommendation(Movie movie){
        this.recommended_movies.add(movie);
    }
    //method for removing a movie from the recommended movies list
    private void remove_recommendation(Movie movie){
        this.recommended_movies.remove(movie);
    }

    //method for returning the recommended movies list
    public ArrayList<Movie> getRecommendedMovies(){
        this.update_recommendation();   // update the recommended movies list
        return this.recommended_movies;
    }

    // method for adding movies from the database into the recommended movies list
    private void update_recommendation(){
        // clear the recommended movies list
        this.recommended_movies.clear();
        // loop through the movie database
        for (Movie movie : this.MOVIE_DB){
            // check if the movie matches the query
            if (movie.getMovieName().contains(this.query_name) || (movie.getMovieYear() >= this.query_year_min && movie.getMovieYear() <= this.query_year_max) || movie.getMovieRating() == this.query_rating || movie.getMovieGenre().contains(this.query_genre)){
                // add the movie to the recommended movies list
                this.add_recommendation(movie);
            }
        }
        if (this.recommended_movies.size() == 0){
            System.out.println("No movies match the query. Recommending all movies.");
            this.recommended_movies = this.MOVIE_DB;  // if no movies match the query, recommend all movies
        }
        //check if the user class has permissions to view the recommended movies
        if (this.caller instanceof Child){
            for (Movie movie : this.recommended_movies){
                if (movie.getMovieRating() == 'R' || movie.getMovieRating() == 'M' || movie.getMovieRating() == 'X'){
                    this.remove_recommendation(movie); // remove the movie from the recommended movies list if the user is a child and the movie is rated R
                }
            }
        }
    }
    
    // method for returning the entire movie database -> used for debugging what movies are in the database that this class can see
    public ArrayList<Movie> getMovieDataBase(){
        return this.MOVIE_DB;
    }

    // method for printing the recommended movies list
    public void printRecommendedMovies(){
        System.out.println("Recommended Movies:");
        for (Movie movie : this.recommended_movies){
            System.out.println(movie.toString());
        }
    }
}