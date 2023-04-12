package movie_rec_proj;
/**
 * @author Silas Rodriguez
 * @date 04-12-2023
 * @assignment Group Project
 * @description This class is the user class that will be used to store the user's information -> name, age, and filters, users must have a name and age for our system
 */
public class user {

    private String name;    // name of the user
    private int age;        // age of the user
    private String search_title;    // title of the movie desired
    private String search_genre;    // genre of the movie desired
    private int min_year;        // year of the movie desired
    private int max_year;        // year of the movie desired
    private double search_rating;   // rating of the movie desired
   
    /*
     * Constructor for the user class when the filters are not given
     */
    public user(String name, int age) {
        this.name = name;
        this.age = age;
        this.search_genre = "";
        this.search_title = "";
        this.min_year = 0;
        this.search_rating = 0;
        this.max_year = 0;
    }

    /*
     * Constructor for the user class when no variables are given -> throws an exception
     */
    public user () {
        throw new IllegalArgumentException("User must have a name and age");
    }

    /*
     * Getter for the user's name
     */
    public String getName() {
        return name;
    }

    /*
     * Getter for the user's age
     */
    public int getAge() {
        return age;
    }

    /*
     * Setter for the user's name
     */
    public void setName(String name) {
        this.name = name;
    }

    /*
     * Setter for the user's age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /*
     * Setter for the user's search -> all filters
     */
    public void setSearch(String search_title, String search_genre, int min_year, int max_year, double search_rating) {
        this.search_title = search_title;
        this.search_genre = search_genre;
        this.min_year = min_year;
        this.search_rating = search_rating;
        this.max_year = max_year;
    }

    /*
     * Setter for user search, only title
     */
    public void setSearchTitle(String search_title) {
        this.search_title = search_title;
    }

    /*
     * Setter for user search, only genre
     */
    public void setSearchGenre(String search_genre) {
        this.search_genre = search_genre;
    }

    /*
     * Setter for user search, only year min
     */
    public void setSearchMinYear(int min_year) {
        this.min_year = min_year;
    }

    /*
     * Setter for user search, only year max
     */
    public void setSearchMaxYear(int max_year) {
        this.max_year = max_year;
    }

    /*
     * Setter for user search, only rating
     */
    public void setSearchRating(double search_rating) {
        this.search_rating = search_rating;
    }

    /*
     * Getter for the user's search title
     */
    public String getSearchTitle() {
        return search_title;
    }

    /*
     * Getter for the user's search genre
     */
    public String getSearchGenre() {
        return search_genre;
    }

    /*
     * Getter for the user's search year min
     */
    public int getSearchMinYear() {
        return min_year;
    }

    /*
     * Getter for the user's search year max
     */
    public int getSearchMaxYear() {
        return max_year;
    }
    /*
     * Getter for the user's search rating
     */
    public double getSearchRating() {
        return search_rating;
    }

    /*
     * This method will clear the user's search filters
     */
    public void clearSearch() {
        this.search_title = null;
        this.search_genre = null;
        this.min_year = 0;
        this.search_rating = 0.0;
        this.max_year = 0;
    }
}