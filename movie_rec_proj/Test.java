package movie_rec_proj;
import java.util.*;

public class Test {
    private static void TestUserQuery(User obj, Scanner input) {
        while(true){
            obj.callRecommendation();
            System.out.println("Would you like to search again? y/n default: n");
            String response = input.nextLine();
            if (response.equals("y")){
                continue;
            }
            else{
                break;
            }
        }
    }
    
    public static void main(String [] args) {
        // create new users
        User [] users = new User[4];
        User user1 = User.CreateAppropriateSubclass("Silas", 20);
        User user2 = User.CreateAppropriateSubclass("Misha", 22);
        User user3 = User.CreateAppropriateSubclass("Katrina", 17);
        User user4 = User.CreateAppropriateSubclass("Derek", 37, true);
        
        // create scanner
        Scanner input = new Scanner(System.in);

        // add users to array
        users[0] = user1;
        users[1] = user2;
        users[2] = user3;
        users[3] = user4;
        
        for (int i =0; i<4; i++){
            if (users[i] instanceof Child){
                System.out.println(users[i].getUserName() + " is a child.");
            }
            else if (users[i] instanceof Adult){
                System.out.println(users[i].getUserName() + " is an adult.");
            }
            else if (users[i] instanceof Senior){
                System.out.println(users[i].getUserName() + " is a senior.");
            }
            else if (users[i] instanceof Admin){
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
                TestUserQuery(user1, input);
                // demo user3 (child user) querying a recommendation
                System.out.println("Demoing user3 (child user) querying a recommendation:");
                TestUserQuery(user3, input);
                input.close();
            }
        }
    }
}