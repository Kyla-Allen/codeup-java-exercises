import java.util.Scanner;
import java.lang.Math;
public class MethodsExercises {

    //Basic Math
    public static float findSum (float input1, float input2) {
        float sum = input1 + input2;
        return sum;
    }

    public static float findDifference (float input1, float input2){
        float difference = input1 - input2;
        return difference;
    }

    public static float findProduct (float input1, float input2){
        int product = 0;
        for (int i=1; i <= input2; i++){
            product += input1;
        }
        return product;
    }

    public static float findQuotient (float input1, float input2){
        float quotient = input1 / input2;
        return quotient;
    }


    public static float findModulus (float input1, float input2){
        float modulus = input1 % input2;
        return modulus;
    }


//    Create a method that validates that user input is in a certain range
    public static int getInteger(int min, int max){
        Scanner scan = new Scanner(System.in);
        int userInput = scan.nextInt();
        if (userInput > max || userInput < min){
            System.out.println("INVALID. Try again...");
            userInput = getInteger(1,10);
        }
        return userInput;
    }

//
//    Calculate the factorial of a number.
    public static String findFactorial(int input){
        long factorial = 1; //to keep the product
        String factorialString = input + "! ="; //to keep the string that displays the numbers multiplied
        for (int i = 1; i <= input; i++){
            factorial *= i;
            factorialString += "x" + i + " ";
        }
        factorialString += "= " + factorial; //add the product to the end of the string
        return factorialString;
    }


//    Create an application that simulates dice rolling.
    public static String rollDice (int sides){
        int die1 = (int) (Math.random() * sides) + 1;
        int die2 = (int) (Math.random() * sides) + 1;
        return  "The numbers you got are " + die1 + " and " + die2;
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



    //MAIN
    public static void main(String[] args){
        //Exercise 1
//        System.out.println(findSum(1,2));
//        System.out.println(findDifference(5,2));
//        System.out.println(findProduct(2,3));
//        System.out.println(findQuotient(6,2));
//        System.out.println(findModulus(7,2));

        //Exercises 2 and 3
        Scanner scan = new Scanner(System.in);
//        int keepGoing;
//        System.out.print("Enter a number between 1 and 10: ");
//        do {
//            int userInput = getInteger(1, 10);
//            System.out.println(findFactorial(userInput));
//            System.out.println("Keep going? 1.Yes 2.No");
//            keepGoing = scan.nextInt();
//        } while (keepGoing == 1);

        //Exercise 4
//        int keepGoing;
//        do {
//            System.out.println("How many sides are on your dice?");
//            int diceSides = scan.nextInt();
//            System.out.println(rollDice(diceSides));
//            System.out.println("Keep going? 1.Yes 2.No");
//            keepGoing = scan.nextInt();
//        } while (keepGoing == 1);

        //Exercise 5
//        boolean gamesOn = true;
//        int tries = 5;
//        //main game loop
//        do {
//            int numberToGuess = (int) (Math.random() * 100) + 1; //generate random number
//            System.out.print(numberToGuess); //TODO: DELETE THIS LATER
//            System.out.println("Guess the number! You get " + tries + " tries!");
//            //guess number function (was a loop but has been refactored)
//            letsPlay(tries, numberToGuess);
//            //check if player wants to keep playing
//            System.out.println("Play Again? (y/n)");
//            String usersChoice = scan.nextLine();
//            if (usersChoice.equals("n")){
//                gamesOn = false;
//            }
//        } while (gamesOn == true);

    }
} //end of main

