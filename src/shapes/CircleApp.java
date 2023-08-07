package shapes;

import util.input;

public class CircleApp {
    public static void main(String[] args) {
        input sc = new input();
        do {
            System.out.println("enter your circle radius");
            double radius = sc.getDouble();
            Circle myCircle = new Circle(radius);
            System.out.printf("the area of your circle is %f, the circumference is %f.%n", myCircle.getArea(), myCircle.getCircumference());
        } while (sc.yesNo("do you want to try again? [Y/N]"));
    }
}
