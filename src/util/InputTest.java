package util;

public class InputTest {
    public static void main(String[] args) {
        input sc = new input();


        //get string input getter
        String word = sc.getString();
        System.out.println(word);

        //boolean yesNo instance
        String cont;
        do {
            System.out.println("hi");
            System.out.println("conintue? [Y/N]");
            cont = sc.getString();
        } while (sc.yesNo(cont));


        //get int min and max
        int num = sc.getInt(1,20);

        //get int
        System.out.println("enter a number");
        int num2 = sc.getInt();
        System.out.println(num2);


        //get double min and max
        double dblnum = sc.getDouble(1,20);

        //get int
        System.out.println("enter a number");
        double dblnum2 = sc.getDouble();
        System.out.println(num2);

    }

}
