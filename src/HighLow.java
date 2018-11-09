import java.util.Scanner;
import java.lang.Math;
public class HighLow {
    public static int getInteger(int min, int max){
        Scanner scan = new Scanner(System.in);
        int userInput = scan.nextInt();
        if (userInput > max || userInput < min){
            System.out.println("INVALID. Try again...");
            userInput = getInteger(1,10);
        }
        return userInput;
    }
    //    Game Development 101
    public static String results (int guess, int numberToGuess){
        String output;
        if (guess < numberToGuess){
            output = "HIGHER";
        } else if (guess > numberToGuess){
            output = "LOWER";
        } else {
            output = "GOOD GUESS!";
        }
        return  output;
    }

    public static void letsPlay (int tries, int numberToGuess){
        for (int i= 1; i<=tries; i++) {
            int numberGuessed = getInteger(1, 100); //validating.... (I cheated and used a function i made earlier :3 )
            String message = results(numberGuessed, numberToGuess);
            if(message.equals("GOOD GUESS!")){
                break;
            }
            if (i == tries){
                System.out.println("YOU LOSE!");
                break;
            }
            System.out.println(message);
        } //end of guessing loop
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean gamesOn = true;
        int tries = 5;
        //main game loop
        do {
            int numberToGuess = (int) (Math.random() * 100) + 1; //generate random number
//            System.out.print(numberToGuess); //TODO: DELETE THIS LATER
            System.out.println("Guess the number! You get " + tries + " tries!");
            //guess number function (was a loop but has been refactored)
            letsPlay(tries, numberToGuess);
            //check if player wants to keep playing
            System.out.println("Play Again? (y/n)");
            String usersChoice = scan.nextLine();
            if (usersChoice.equals("n")){
                gamesOn = false;
            }
        } while (gamesOn);
    }
}
