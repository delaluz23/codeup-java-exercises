package util;

public class InputTest {
    public static void main(String[] args) {
        input sc = new input();


        //get string input getter
        System.out.println("enter a string");
        String word = sc.getString();
        System.out.println(word);

        //boolean yesNo instance
        do {
            System.out.println("hi");
            System.out.println("continue? [Y/N]");
        } while (sc.yesNo());

        //get int w get min and max
        System.out.println("enter a int number between one and ten");
        System.out.println(sc.getInt(1,10));

//        //get int min and max
//        System.out.println("enter a number");
//        int num = sc.getInt();
//        System.out.println("yout int is : " + num);


        System.out.println("enter a double number between one and ten");
        System.out.println(sc.getDouble(1,10));

//        //get double min and max
//        double dblnum = sc.getDouble(1,20);
//
//        //get int
//        System.out.println("enter a number");
//        double dblnum2 = sc.getDouble();
//        System.out.println();
        System.out.println(sc.getString("bananas"));

    }

}
