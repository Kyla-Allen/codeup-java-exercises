package grades;

import java.util.HashMap;
import java.util.Scanner;
import util.Input;

public class GradesApplication {
    public static void main(String[] args){

        //Snagging this because I am lazy
        Scanner sc = new Scanner(System.in);
        Input in = new Input(sc);

//        defining the hashbrown- i mean hashmap
        HashMap<String, Student> students = new HashMap<>();

//        let us add some data...
//        FIRST! The objects....
        Student alex = new Student();
        alex.setName("Alex");
        alex.startGrades();
        alex.addGrade(84);
        alex.addGrade(79);
        alex.addGrade(86);
        //---
        Student gracia = new Student();
        gracia.setName("Gracia");
        gracia.startGrades();
        gracia.addGrade(87);
        gracia.addGrade(88);
        gracia.addGrade(87);
        //---
        Student oscar = new Student();
        oscar.setName("Oscar");
        oscar.startGrades();
        oscar.addGrade(99);
        oscar.addGrade(98);
        oscar.addGrade(100);
        //---
        Student candy = new Student();
        candy.setName("Candy");
        candy.startGrades();
        candy.addGrade(63);
        candy.addGrade(99);
        candy.addGrade(85);

//        Now we shall add the objects to the hashbrown.
        students.put("alexandria_24", alex);
        students.put("gracidia_blossom", gracia);
        students.put("oscar123", oscar);
        students.put("CandyCaneTheMainFrame", candy);

//        THE APPLICATION =========================================

//        Messages
        String startMsg = "Welcome!";
        String displayNamesMsg = "Here are the usernames of our students: ";
        String usernamesMsg = "";

        String promptMsg = "What student would you like to see more information of?";
        String no_Msg = "No student was found with that username";
        String continueMsg = "Would you like to see another student?";

        String farewellMsg = "Okie doke! Bye!";


//        The actual doing of stuff
        do {
            System.out.println(startMsg);
            System.out.println(displayNamesMsg);
            for (String key : students.keySet()){
                usernamesMsg += key + " | ";
            }
            System.out.println(usernamesMsg);
            System.out.println(promptMsg);
            String userInput = sc.nextLine();
            if (students.containsKey(userInput)){
                Student student = students.get(userInput);
                System.out.println("Name: " + student.getName());
                System.out.println("Github Username: " + userInput);
                System.out.println("Average Grade: " + student.getGradeAverage());
            } else {
                System.out.println(no_Msg);
            }
        } while(in.yesNo(continueMsg));
        System.out.println(farewellMsg);
    }
}
