package movies;

import util.Input;
import java.util.Arrays;
import java.util.Scanner;

public class MoviesApplication {

    //METHODS
    public static Movie[] addMovie (Movie[] movies, Movie movieObj){
        Movie[] movieCopy = Arrays.copyOf(movies, movies.length + 1 );
        movieCopy[movies.length] = movieObj;
        return movieCopy;
    }

    //MAIN
    public static void main(String[] args) {

        //Initializing scanner and bringing in the input class
        Scanner sc = new Scanner(System.in);
        Input input = new Input(sc);


        //making categories an array because I'm lazy and like arrays
        String[] categories = {"animated", "drama", "horror", "scifi", "comedy", "musical"};

        //getting the full movies array from, er, MoviesArray
        Movie[] movies = MoviesArray.findAll();

        //Messages
        String startMsg = "What would you like to do? \n";

        String addNameMsg = "What is the title of your movie?\n";
        String addCatMsg = "What category is your movie?\n";

        String options = "0 - exit \n";
        options += "1 - View all movies \n";
        options += "2 - Add a movie\n";
        options += "3 - view animated movies \n";
        options += "4 - view drama movies \n";
        options += "5 - view horror movies \n";
        options += "6 - view scifi movies \n";
        options += "7 - view comedy movies \n";
        options += "8 - view musical movies \n";

        String choice = "Enter your choice: ";

        do {
            System.out.println(startMsg + options);
            //getting user input
            int userInput = input.getInt(0,7, choice);

            //The Choice.....

            // add movie
            if (userInput == 2){
                //gathering info
                System.out.println(addNameMsg);
                String title = sc.nextLine();
                System.out.println(addCatMsg);
                String cat = sc.nextLine();
                //adding
                Movie movieObj = new Movie(title, cat);
                movies = addMovie(MoviesArray.findAll(), movieObj);

            } else if(userInput == 1){
                for(Movie movie: movies){
                    System.out.println(movie.getName() + "---" + movie.getCategory());
                }
            } else if (userInput == 0){
                break;
            } else{ // search movies

            //converting input to category....
            String category2search = categories[userInput - 3]; //gotta add the -3 because the array doesn't line up perfectly
            //displaying the movies that fit the category
                for (Movie movie : movies){
                                if(movie.getCategory().equals(category2search)){
                                    System.out.println(movie.getName() + " --- " + movie.getCategory());
                                }
                            }
            } //end of THE CHOICE....

        } while (input.yesNo("Contintue?"));


    }
}
