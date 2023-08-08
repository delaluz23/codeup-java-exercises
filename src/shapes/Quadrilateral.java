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

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
