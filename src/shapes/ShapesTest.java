package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(6, 12);
        double area = r.getArea();
        double perimeter = r.getPerimeter();
        System.out.println("area: " + area);
        System.out.println("perimeter: " + perimeter);
        Rectangle r2 = new Square(5);
        double r2Area = r2.getArea();
        double r2Perimeter =  r2.getPerimeter();
        System.out.println("square area: "+ r2Area);
        System.out.println("square perimeter: "+ r2Perimeter);

    }
}
