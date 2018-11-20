package util;
import java.util.Scanner;

public class Input {

    //Property
    private Scanner scanner;

    //Constructor
    public Input (Scanner scanner){
        this.scanner = scanner;
    }

    //Gets the string
    public String getString (String prompt){
        System.out.println(prompt);
        return this.scanner.nextLine();
    }

    //Gets user input and returns true if user enter y or yes
    public boolean yesNo(String prompt){
        boolean output;
        System.out.println(prompt);
        String input = this.scanner.nextLine();
        if(input.equals("y") || input.equals("yes")){
            output = true;
        } else {
            output = false;
        }
        return output;
    }

    //Integer Methods
    public int getInt (int min, int max, String prompt){
        System.out.println(prompt);
        int input = 0;
        try{
            input = Integer.valueOf(this.scanner.nextLine());
            if (input > max || input < min){
                String errorMsg = "INVALID. Try again";
                System.out.println(errorMsg);
                getInt(min, max, prompt);
            }
        } catch (NumberFormatException e){
            System.out.println("Exception :(");
        }
        return input;
    }

    public int getInt(String prompt){
        System.out.println(prompt);
        int input = 0;
        try{
            input = Integer.valueOf(this.scanner.nextLine());
        } catch (NumberFormatException e){
                System.out.println("Exception :(");
            }
        return this.scanner.nextInt();
    }

    //Double Methods
    public double getDouble (double min, double max, String prompt){
        System.out.println(prompt);
        double input = 0;
        try {
            input = Double.valueOf(this.scanner.nextLine());
            if (input > max || input < min){
                String errorMsg = "INVALID. Try again";
                System.out.println(errorMsg);
                getDouble(min, max, prompt);
            }
        } catch (NumberFormatException e) {
            System.out.println("Exception :(");
        }
        return input;
    }

    public double getDouble (String prompt){
        System.out.println(prompt);
        double input = 0;
        try {
            input = Double.valueOf(this.scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Exception :(");
        }
        return this.scanner.nextDouble();
    }
}
