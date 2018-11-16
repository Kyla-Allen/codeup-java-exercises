package shapes;

public class Square extends Quadrilateral {

//    CONSTRUCTOR

    public Square (double side){
        this.width = side;
        this.length = side;
    }



//    ABSTRACT STUFF
    public void setWidth(double width) {
        this.width = width;
        this.length = width;
    }

    public void setLength(double length) {
        this.length = length;
        this.width = length;
    }

    public double getPerimeter() {
        return this.width * 4;
    }

    public double getArea() {
        return Math.pow(this.width, 2);
    }




}
