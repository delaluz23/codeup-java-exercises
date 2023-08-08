package shapes;

public class Square extends Quadrilateral {
    private double side;
    public Square(double side) {
        super(side, side);
        this.side = side;
    }



    public double getPerimeter() {
        return this.side * 4;
    }

    @Override
    public double getArea() {
        return this.side * this.side;
    }

    @Override
    public void setLength(double length) {
        this.side = length;
    }

    @Override
    public void setWidth(double width) {
        this.side = width;
    }

//    protected double side;
//
//    public Square(double side) {
//        super(side, side);
//        this.side =side;
//    }
//
//
//
//    public double getPerimeter() {
//        return this.side * 4;
//    }
//
//
//    public double getArea() {
//        return (double) Math.pow(this.side, 2);
//    }
}
