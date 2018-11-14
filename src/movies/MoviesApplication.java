package movies;

import util.Input;
import java.util.Scanner;

public class MoviesApplication {
    public static void main(String[] args) {

        //Initializing scanner and bringing in the input class
        Scanner sc = new Scanner(System.in);
        Input input = new Input(sc);

        //making categories an array because I'm lazy and like arrays
        String[] categories = {"animated", "drama", "horror", "scifi", "comedy", "musical"};

        //Messages
        String startMsg = "What would you like to do? \n";

        String options = "0 - exit \n";
        options += "1 - View all movies \n";
        options += "2 - view animated movies \n";
        options += "3 - view drama movies \n";
        options += "4 - view horror movies \n";
        options += "5 - view scifi movies \n";
        options += "6 - view comedy movies \n";
        options += "7 - view musical movies \n";

        String choice = "Enter your choice: ";

        do {
            System.out.println(startMsg + options);


            //getting user input
            int userInput = input.getInt(0,7, choice);

            //converting input to category....
            String category2search = categories[userInput-2]; //gotta add the -2 because the array doesn't line up perfectly

            //displaying the movies that fit the category
            for (Movie movie : MoviesArray.findAll()){
                if(movie.getCategory().equals(category2search)){
                    System.out.println(movie.getName() + " --- " + movie.getCategory());
                }
            }
        } while (input.yesNo("Contintue?"));


    }
}
