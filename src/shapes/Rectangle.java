package shapes;

public class Rectangle {
    //Properties
    protected double length;
    protected double width;

    //Constructor(s)
    public Rectangle(){ //Default
        this.length = 2;
        this.width = 2;
    }
    public Rectangle(double width, double length){
        this.length = length;
        this.width = width;
    }

    //Methods
    public double getArea() {
        return this.width * this.length;
    }
    public double getPerimeter(){
        return (this.width * 2) + (this.length * 2);
    }

}
