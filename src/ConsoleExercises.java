import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String[] args){
//        double pi = 3.14159;
//        System.out.printf("The value of pi is approximately %.2f", pi);
//
//

        Scanner read = new Scanner(System.in);

//        System.out.println("Enter an integer: ");
//        int myInt = read.nextInt();
//        System.out.printf("You entered %d", myInt); // if the input is NOT an int, it throws a runtime error as your face

//        System.out.println("Enter three words: ");
//        String string1 = read.next();
//        String string2 = read.next();
//        String string3 = read.next();
//        System.out.printf("You have entered the words \n%s, \n%s, \nand %s", string1,string2,string3);

//        System.out.println("Enter a string: ");
////        String myString = read.next();
//        String myString = read.nextLine();
//        System.out.println(myString);

//        Calculate the perimeter and area of Codeup's classrooms

        System.out.println("Please enter the length of the classroom: ");
        String length = read.nextLine();
        float lengthNum = Float.parseFloat(length);


        System.out.println("Please enter the width of the classroom: ");
        String width = read.nextLine();
        float widthNum = Float.parseFloat(width);


        System.out.println("Please enter the height of the classroom: ");
        String height = read.nextLine();
        float heightNum = Float.parseFloat(height);

        float area = lengthNum * widthNum;
        float perimeter= (lengthNum * 2) + (widthNum * 2);
        float volume = lengthNum * widthNum * heightNum;

        System.out.printf("The area is %.2f , the volume is %.2f and the perimeter is %.2f", area, volume, perimeter);


    }
}
