package movie_rec_proj;
import java.util.*;

/**
 * @author      Silas Rodriguez
 * @date        04-12-2023
 * @assignment  Group Project
 * @description This class will be used to recommend movies to the user based on their previous movie ratings.
 */
public class recommendation {
    // private variables for the class
    private List<movie> movieList;  // list of movies to be recommended
    
    /*
     * Constructor for the class
     */
    public recommendation() {
        this.movieList = new ArrayList<movie>(); // initialize the movie list with an empty array list of movie type objects
    }

    /*
     * This method will be used to recommend movies to the user based on their filters
     * @param user - the user that the movies will be recommended to
     * @return movieList - list of movies that the user has not rated
     */
    public List<movie> recommendMovies(user user) {
        // loop through the static movies "database" and add the movies that match the user's filters to the movie list
        for (movie movie : movie.movies) {
            
            // check if the user has queried the movie title
            if (user.getSearchTitle() != "") {
                if (movie.getTitle().toLowerCase().contains(user.getSearchTitle().toLowerCase())) { // use contains method to check if the movie title contains the user's query (substring)
                    movieList.add(movie);   // use add method to add the movie to the movie list
                }
            }
            // check if the user has queried the movie genre
            if (user.getSearchGenre() != "") {
                if (movie.getGenre().toLowerCase().contains(user.getSearchGenre().toLowerCase())) {
                    movieList.add(movie);   // use add method to add the movie to the movie list
                }
            }
            // check if the user has queried the movie year
            if (movie.getYear() >= user.getSearchMinYear() && movie.getYear() <= user.getSearchMaxYear() && user.getSearchMinYear() >=0 && user.getSearchMaxYear() >= 0) {
                // both min and max year were set
                movieList.add(movie);   // use add method to add the movie to the movie list
            }
            else if (movie.getYear() >= user.getSearchMinYear() && user.getSearchMaxYear() == 0){
                // only min year was set
                movieList.add(movie);   // use add method to add the movie to the movie list
            }
            else if (movie.getYear() <= user.getSearchMaxYear() && user.getSearchMinYear() == 0) {
                // only max year was set
                movieList.add(movie);   // use add method to add the movie to the movie list
            }

            // check if the user has queried the movie rating
            if (user.getSearchRating() > 0) {
                if (movie.getRating() >= user.getSearchRating()) {
                    movieList.add(movie);   // use add method to add the movie to the movie list
                }
            }
        }
        
        //if the list is empty, return the full list of movies
        if (movieList.isEmpty()) {
            System.out.println("No movies match your filters, here are all the movies in our database:");
            return movie.movies;
        }

        // create a copy to not accumulate movies in the movie list
        List<movie> copy = movieList;

        // clear the movie list
        movieList.clear();

        // return the list of movies to be recommended to the user
        return copy;
    }
}