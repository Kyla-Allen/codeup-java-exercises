package shapes;

import java.util.Scanner;
import util.Input;

public class CircleApp {


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Input grab = new Input(sc);

        int circlesMade = 0;
        boolean keepGoing;

        do {
            circlesMade += 1;
            double radius = grab.getDouble("Enter the radius of the circle");

            Circle circle = new Circle(radius);
            double area = circle.getArea();
            double circumference = circle.getCircumference();
            String message = "The area is: " + area + " and the circumference is: " + circumference;
            System.out.println(message);

            keepGoing = grab.yesNo("Continue?");
        } while (keepGoing);

        String finalMessage = "You've made " +circlesMade+ " circle(s)";
        System.out.println(finalMessage);

    }

}
