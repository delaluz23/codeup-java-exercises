package shapes;

abstract class Quadrilateral extends shape implements Measurable {

    //fields/properties
    protected double length;
    protected double width;


    //constructor
    public Quadrilateral (double length, double width){
        this.length = length;
        this.width = width;
    }
    //setters and getters
    public Double getLength(){
        return this.length;
    }
    public Double getWidth(){
        return this.width;
    }

    public abstract void setLength(double length);

    public abstract void setWidth(double width);
}
