package movie_rec_proj;

import java.util.ArrayList;
import java.util.Scanner;

// Rules accounts must follow: settable and gettable user name and age
interface Account {
    // every user has a name and an age that must be set and can be retrieved
    public abstract void setUserName(String userName);
    public abstract void setUserAge(int userAge);
    public abstract boolean getIsAdmin();
    public abstract int getUserAge();
    public abstract String getUserName();
    public abstract void callRecommendation();
}

public class User implements Account {
    // users have a name and an age and Admin status
    private String userName;
    private int userAge;
    private boolean isAdmin;

    // constructor with all fields
    public User(String userName, int userAge, boolean isAdmin){
        CreateAppropriateSubclass(userName, userAge, isAdmin);
    }
    // constructor with only name and age
    public User(String userName, int userAge){
        this(userName, userAge, false);
    }
    // default constructor    
    public User(){
        throw new IllegalArgumentException("User must have a name and an age");
    }

    // set user name
    @Override
    public void setUserName(String userName){
        this.userName = userName;
    }
    // set user age
    @Override
    public void setUserAge(int userAge){
        this.userAge = userAge;
    }

    // get user name
    @Override
    public String getUserName(){
        return this.userName;
    }
    // get user age
    @Override
    public int getUserAge(){
        return this.userAge;
    }
    // get admin status
    @Override
    public boolean getIsAdmin(){
        return this.isAdmin;
    }

    @Override
    public void callRecommendation() {
        // JAVA FX CODE HERE
        // create a new recommendation object
        Recommendation rec = new Recommendation(this);
        //create a scanner
        Scanner input = new Scanner(System.in);
        // ask the user for a movie
        System.out.println("Enter a movie: ");
        // get the movie
        String name = input.nextLine();
        // ask the user for a genre
        System.out.println("Enter a genre: ");
        // get the genre
        String genre = input.nextLine();
        // ask the user for a rating
        System.out.println("Enter a rating: ");
        // get the rating -> type char
        char rating = input.next().charAt(0);
        // ask the user for a min year
        System.out.println("Enter the earliest title year of interest: ");
        // get the min year
        int minYear = input.nextInt();
        //clear the buffer
        input.nextLine();
        // ask the user for a max year
        System.out.println("Enter the latest title year of interest: ");
        // get the max year
        int maxYear = input.nextInt();
        //clear the buffer
        input.nextLine();
        // close the scanner
        input.close();
        // update the recommendation object
        rec.setQueryName(name);
        rec.setQueryGenre(genre);
        rec.setQueryRating(rating);
        rec.setQueryYearMin(minYear);
        rec.setQueryYearMax(maxYear);
        // get the recommendation
        rec.getRecommendedMovies();
        // print the recommendation
        rec.printRecommendedMovies();
    }

    // method for automatically creating a user object of the appropriate subclass
    private User CreateAppropriateSubclass(String user_name, int user_age, boolean is_admin){
        // if the user is an admin, create an admin object and return it -> Returns an error without uname and age
        if (is_admin){
            return new Admin(user_name, user_age);
        }
        try{
            return new Child(user_name, user_age);
        }
        catch (IllegalArgumentException e){
            try{
                return new Adult(user_name, user_age);
            }
            catch (IllegalArgumentException f){
                return new Senior(user_name, user_age);
            }
        }
    }
}

class Child extends User{
    // constructor
    public Child(String user_name, int user_age){
        super(user_name, user_age);
        if (user_age >= 18){
            throw new IllegalArgumentException("Child user must be under 18 years old.");
        }
    }
}

class Adult extends User{
    // constructor
    public Adult(String user_name, int user_age){
        super(user_name, user_age);
        if (user_age < 18){
            throw new IllegalArgumentException("Adult user must be between 18 and 64 years old.");
        }
    }
}

class Senior extends User{
    // constructor
    public Senior(String user_name, int user_age){
        super(user_name, user_age);
        if (user_age < 65){
            throw new IllegalArgumentException("Senior user must be 65 years old or older");
        }
    }
}

class Admin extends User{
    // private list of Admin users that can be accessed within the Admin class and dynamically grows
    private static ArrayList<Admin> Admin_list = new ArrayList<Admin>();
    // constructor
    public Admin(String user_name, int user_age){
        super(user_name, user_age, true);
        Admin_list.add(this);
    }
}