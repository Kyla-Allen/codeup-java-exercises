package grades;
import java.util.ArrayList;

public class Student {

    //    VARIABLES===============================
    private String name;
    private ArrayList<Integer> grades;


//    CONSTRUCTORS================================

    public void setName (String name){
        this.name = name;
    }

    public void startGrades(){
        this.grades = new ArrayList<>();
    }


//    METHODS====================================

//    returns the student's name
    public String getName(){
        return this.name;
    }

//    adds a grade to the student's list of grades
    public void addGrade(int grade){
        this.grades.add(grade);
    }

//    returns the average of the students grades
    public double getGradeAverage(){
        int total = 0;
        for(int i = 0; i < this.grades.size(); i += 1){
            total += this.grades.get(i);
        }
        return (double) total / this.grades.size();
    }


//    public static void main(String[] args) {
//        Student bob = new Student();
//        bob.setName("bob");
//        bob.startGrades();
//
//        bob.addGrade(96);
//        bob.addGrade(78);
//        bob.addGrade(100);
//
//        double average = bob.getGradeAverage();
//        System.out.println(average);
//
//    }

}
