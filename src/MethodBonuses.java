import java.util.Scanner;
public class MethodBonuses {

//    ================================= METHOD BONUSES
//------ 1 ------
//    Create a vowel counting method for each vowel in the alphabet (not including y). Each method, when passed a string, should return how many of that vowel is in the string. Given a string, use all of the these vowel counting methods to output the count of each vowel in a word.
//    EXAMPLE...
//    INPUT: countVowels("cat")
//    OUTPUT:
//            |======== VOWEL COUNT ========|
//            | A's | E's | I's | O's | U's |
//            | 1   | 0   | 0   | 0   | 0   |
//            |=============================|
//    countVowels() will use...
//    countAs(),
//    countEs(),
//    countIs(),
//    countOs(),
//    and countUs()

    public static void countVowels(String word){
        int As = 0, Es = 0, Is = 0, Os = 0, Us = 0;
        for(int i = 0; i < word.length(); i++){
            char currentChar = word.charAt(i);
            As += countAs(currentChar);
            Es += countEs(currentChar);
            Is += countIs(currentChar);
            Os += countOs(currentChar);
            Us += countUs(currentChar);
        }
        printOutput(As, Es, Is, Os, Us);
    }
    public static void printOutput (int A, int E, int I, int O, int U){
        System.out.println("|==== VOWEL COUNT ====|");
        System.out.println("| A's | E's | I's | O's | U's");
        System.out.printf("|  %d  |  %d  |  %d  |  %d  |  %d  |", A, E, I, O, U);
        System.out.println("");
        System.out.println("|=====================|");
    }

    public static int countAs (char character){
        int number = 0;
        if (character == 'a'){
            number = 1;
        }
        return number;
    }
    public static int countEs (char character){
        int number = 0;
        if (character == 'e'){
            number = 1;
        }
        return number;
    }
    public static int countIs (char character){
        int number = 0;
        if (character == 'i'){
            number = 1;
        }
        return number;
    }
    public static int countOs (char character){
        int number = 0;
        if (character == 'o'){
            number = 1;
        }
        return number;
    }
    public static int countUs (char character){
        int number = 0;
        if (character == 'u'){
            number = 1;
        }
        return number;
    }





//------ 2 ------
//    Create a method that will return how many capital letters are in a string.


    public static int getCapitals (String word){
        int numOfCaps = 0;
        for(int i= 0; i < word.length(); i++){
            String currentChar = word.substring(i, i+1);
            if (currentChar == currentChar.toUpperCase()){
                numOfCaps += 1;
            }
        }
        return numOfCaps;
    }


//            ------ 3 ------
//    Create a method, getType() that will take in an input and return a string describing the type of the value.
// Account for int, boolean, String, char, and double. Use method overloading.

    public static String getType(int input){ return "Type: Integer"; }
    public static String getType(boolean input){
        return "Type: Boolean";
    }
    public static String getType(String input){
        return "Type: String";
    }
    public static String getType(char input){
        return "Type: Character";
    }
    public static String getType(double input){
        return "Type: Double";
    }


//------ 4 ------
//    Create a method to print out every letter in a string using recursion.


    public static int printWord (String word, int start){
        if(start < word.length()){
            System.out.print(word.charAt(start));
            start += 1;
            printWord(word, start);
        }
        return start;
    }



//------ 5 ------
//    Create a method to determine if a string is a palindrome.

    public static String isPalindrome (String word){
        String backWords = ""; //A fabulous pun, truly
        word = word.toLowerCase(); // so i don't have to care about case
        for(int i = 0; i < word.length(); i++){
            int currentPosition = (word.length() - 1) - i;
            backWords += word.charAt(currentPosition);
        }
        if (word.equals(backWords)){
            return word + " is a palindrome";
        } else {
            return word + " is not a palindrome";
        }
    }



//------ 6 ------
//    Create a method that will convert a written out whole number from
// "zero" to "ninety-nine" and return the actual number.

//    public static int findNumeric (String writtenNum){
//        int num;
//
//        return num;
//    }



//------ 7 ------
//    Create a command line calculator
//- the user may enter a number
//- the user may enter an operator
//- the user may enter a second number
//- the program should output a result, then prompt the user for another calculation
//------ 8 ------
//    Build a time conversion application:
//    The user should be prompted which time to enter (12 hour or 24 hour time), then the user should be able to enter a given time. The user should then see the converted time (12 hour to 24 hour or 24 hour to 12 hour)
//------ 9 ------
//    Create a command line Hangman game:
//            - prompt player 1 for a word
//  - player 2 (p2) has 9 guesses to correctly identify the word
//  - each round, display to the user...
//            1. the current visible letters of the word
//    2. the letters already incorrectly guessed
//    3. the number of guesses remaining
//  - at any round, they may guess a letter or multiple letters to complete the word
//    - if p2 guesses correctly, they WIN! and ask if they want to play again
//    - if p2 guesses wrong, they LOSE!
//            - if p2 runs out of guesses, they LOSE!
//            ------ 10 ------
//    Create date format converter application.
//    Take in the following format:
//    MM/DD/YYYY
//    Output the following:
//    MonthName DD, YYYY
//    Example:
//    input - 12/01/1999
//    output - December 12, 1999
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Bonus 1
//        System.out.println("Enter a word");
//        String userInput = scan.next();
//        countVowels(userInput);

        //Bonus 2
//        System.out.println("Enter a word");
//        String userInput = scan.next();
//        int numOfCaps = getCapitals(userInput);
//        System.out.println("There are " + numOfCaps + " capital letters in " + userInput);

        //Bonus 3
//        System.out.print(getType(true));

        //Bonus 4
//        printWord("Superb", 0);

        //Bonus 5
//        String message = isPalindrome("tacmooocat");
//        System.out.println(message);

        //Bonus 6



    }
}
