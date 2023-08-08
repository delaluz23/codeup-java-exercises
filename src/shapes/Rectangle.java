package shapes;

public class Rectangle extends Quadrilateral implements Measurable{
    private double length;
    private double width;
    public Rectangle(double length, double width) {
        super(length, width);
        this.width = width;
        this.length = length;
    }

    @Override
    public double getPerimeter() {
        return (this.length * 2) + (this.width * 2);
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }
//    protected double length;
//    protected double width;
//
//    public Rectangle(double length, double width){
//        this.length = length;
//        this.width = width;
//    }
//
//    public double getLength() {
//        return length;
//    }
//
//    public double getWidth() {
//        return width;
//    }
//
//    public double getArea(){
//        return length * width;
//    }
//    public double getPerimeter(){
//        return (length * 2)+(width *2);
//    }



}
