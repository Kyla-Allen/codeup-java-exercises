package util;

import java.util.Scanner;

public class InputTest {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        Input input = new Input(sc);

//        System.out.println(input.getDouble("Enter a double"));
        input.getDouble(1, 12, "Enter a number between 1 and 12");

//        System.out.println(input.getInt("Enter a whole number"));
//        input.getInt(4, 9, "Enter a number between 4 and 9");

//        System.out.println(input.getString("Enter a String"));
//        System.out.println("You entered yes: " + input.yesNo("Enter yes or no"));
    }
}
