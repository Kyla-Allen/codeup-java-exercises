import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] args) {

        //While
//        int i = 5;
//        while(i <= 15){
//            System.out.print(i++);
//            System.out.print(" ");
//        }

        //Do While
//        int start = 100;
//        do {
//            System.out.println(start);
//            start -= 5;
//        } while (start >= -10);
//


//
//        long number = 2;
//        do {
//            System.out.println(number);
//            number = number * number;
//
//        } while (number <= 1000000);


        //For

//        for(int i = 5; i <=15; i++){
//            System.out.print(i);
//            System.out.print(" ");
//        }
//
//        for (int i = 100; i >= -10; i-=5){
//            System.out.println(i);
//        }
//
//        for (long num = 2; num <= 1000000; num *= num){
//            System.out.println(num);
//        }

//        Fizzbuzz
//

//    for(int i = 1; i <= 100; i++){
//        if(i % 3 ==0 & i % 5 ==0){
//            System.out.println("FizzBuzz");
//        }
//        else if(i % 5 == 0){
//            System.out.println("Buzz");
//        }
//        else if (i% 3 ==0){
//            System.out.println("Fizz");
//        } else {
//            System.out.println(i);
//        }
//    }


      //Display a table of powers
        Scanner read = new Scanner(System.in);
//        char keepGoing = 'y';
//
//        do {
//            //snagging input
//            System.out.println("Please enter a whole number: ");
//            int input = Integer.parseInt(read.next());
//
//            System.out.println("Here's your table!");
//
//            //table
//            System.out.println("number | squared | cubed");
//            System.out.println("------ | ------- | ------");
//            for (int i = 1; i <= input; i++){
//                System.out.println(i + " | " + (i * i) + " | " + (i * i * i) );
//            }
//
//
//            //seeing if user wants to continue....
//            System.out.println("Go again? (y/n)");
//            keepGoing = read.next().charAt(0);
//        } while (keepGoing == 'y');


        //Convert number grade to letter grade
//        char again = 'y';
//        System.out.println("Please enter a grade from 0 to 100");
//        int grade = Integer.parseInt(read.next());
//        do{
////
//            //processing grade....
//            char letterGrade;
//           if(grade <= 100 & grade >= 88){
//               letterGrade= 'A';
//           } else if (grade <= 87 & grade >= 80){
//               letterGrade = 'B';
//           } else if (grade <= 79 & grade >= 67){
//               letterGrade = 'C';
//           } else if (grade <= 66 & grade >= 60){
//               letterGrade = 'D';
//           } else {
//               letterGrade = 'F';
//           }
//
//            //displaying output
//            System.out.println("Your grade is " + letterGrade);
//
//            //asking user if they want to continue
//            System.out.println("Go again? (y/n)");
//            again = read.next().charAt(0);
//
//        }while (again == 'y');


    }
}
