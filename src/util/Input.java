package util;
import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public Input (Scanner scanner){
        this.scanner = scanner;
    }

    public String getString (String prompt){
        System.out.println(prompt);
        return this.scanner.nextLine();
    }

    public boolean yesNo(String prompt){
        boolean output;
        System.out.print(prompt);
        String input = this.scanner.nextLine().toLowerCase();
        input = input.substring(0,1);
        if(input.equals("y")){
            output = true;
        } else {
            output = false;
        }
        return output;
    }

    public int getInt (int min, int max, String prompt){
        System.out.println(prompt);
        int input = Integer.parseInt(this.scanner.nextLine());
        if (input > max || input < min){
            String errorMsg = "INVALID. Try again";
            System.out.println(errorMsg);
            getInt(min, max, prompt);
        }
        return input;
    }
    public int getInt(String prompt){
        System.out.println(prompt);
        return this.scanner.nextInt();
    }

    public double getDouble (double min, double max, String prompt){
        System.out.println(prompt);
        double input = Double.parseDouble(this.scanner.nextLine());
        if (input > max || input < min){
            String errorMsg = "INVALID. Try again";
            System.out.println(errorMsg);
            getDouble(min, max, prompt);
        }
        return input;
    }

    public double getDouble (String prompt){
        System.out.println(prompt);
        return this.scanner.nextDouble();
    }
}
