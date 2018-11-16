package shapes;

public abstract class Quadrilateral extends Shape implements Measurable{

    //PROPERTIES
    protected double length;
    protected double width;

//    CONSTRUCTOR
    public Quadrilateral (double width, double length){
        this.width = width;
        this.length = length;
    }
    public Quadrilateral (){
        this.width = 2;
        this.length = 2;
    }

//    GETTERS
    public double getWidth() {
        return this.width;
    }
    public double getLength(){
        return this.length;
    }

//    ABSTRACT SETTERS
    public abstract void setWidth(double width);
    public abstract void setLength(double length);


}
