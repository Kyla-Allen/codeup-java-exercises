package shapes;

public class Circle {
    //properties
    private double radius;

    //constructor
    public Circle (double radius){
        this.radius = radius;
    }

    //methods
    public double getArea(){
        return Math.PI * Math.pow(this.radius, 2);
    }

    public double getCircumference(){
        return 2 * Math.PI * this.radius;
    }
}
