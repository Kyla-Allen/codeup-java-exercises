package shapes;

public class Rectangle extends  Quadrilateral implements Measurable{

    //ABSTRACT METHODS
    public void setWidth(double width){
        this.width = width;
    }
    public void setLength(double length){
        this.length = length;
    }

    public Rectangle(double length,double width){
        super(length,width);
    }
//    INTERFACE
    public double getPerimeter(){
        return (this.length * 2) + (this.width * 2);
    }
    public double getArea(){
        return this.length * this.width;
    }

}
