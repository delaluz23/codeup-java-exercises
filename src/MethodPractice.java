public class MethodPractice {
    //    public static void main(String[] args) {
//        // TODO: Write a method, returnName, that returns the string of your name.
//        // TODO: Write a method, returnLongerString, that takes in two strings and returns the longer of the two strings.
//        // TODO: Write a method, canBeHalved, that takes in an integer and returns true if the input integer is evenly divisible by two.
//        System.out.println("returning my name " + returnName());
//        System.out.println("this isn't returned instead \"" + returnlongerString("this","something") + "\" is returned");
//        System.out.println("else isn't returned instead \""+returnlongerString("something", "else") + "\" is returned");
//        System.out.println("can 8 be halved " +canBeHalved(8));
//        System.out.println("can 9 be halved " +canBeHalved(9));
//
//    }
//
//    public static String returnName(){
//        return "Jose De La Luz";
//    }
//    public static String returnlongerString (String one, String two){
//        if (one.length() > two.length()){
//            return one;
//        } else {
//            return two;
//        }
//    }
//    public static Boolean canBeHalved(int x){
//        return x % 2 == 0;
//    }
    public static void main(String[] args) {
        String first = "jose";
        String last = "De La Luz";
        System.out.println(sayName(first));
        System.out.println(sayName(first, last));
        int four = 4;
        int eight = 8;
        double five = 5;
        double sixPointFive = 6.5;
        System.out.println("ints " +addition(eight, four));
        System.out.println("doubles " + addition(five, sixPointFive));
        System.out.println("ints " +subtraction(eight, four));
        System.out.println("doubles " + subtraction(five, sixPointFive));
        System.out.println("ints " +multiplication(eight, four));
        System.out.println("doubles " + multiplication(five, sixPointFive));
        System.out.println("ints " +division(eight, four));
        System.out.println("doubles " + division(five, sixPointFive));
        System.out.println("ints " +multipyWO(eight, four));
        System.out.println("doubles " + multipyWO(five, sixPointFive));
    }

    /**
     * OVERLOAD MINI-EXERCISES
     */

    // TODO: create a method, sayName, that can take in a single name String input or two name String inputs and will return
    //  a greeting message to the user by either their first or first and last name.
    public static String sayName(String firstname) {
        return "hello, " + firstname;
    }

    public static String sayName(String firstname, String lastname) {
        return  "hello, " + firstname + " " + lastname;
    }

    // example: sayName("Justin") - "Hi Justin"
    // example: sayName("Justin", "Reich") - "Hi Justin Reich"
    // TODO: overload the math exercises from the curriculum exercise to work with both integers and doubles
    public static int addition(int x, int y) {
        return x + y;
    }
    public static double addition(double x, double y) {
        return x + y;
    }

    public static int subtraction(int x, int y) {
        return x - y;
    }
    public static double subtraction(double x, double y) {
        return x - y;
    }

    public static double multiplication(double x, double y) {
        return x * y;
    }

    public static double division(double x, double y) {
        return x / y;
    }


    public static int modulus(int x, int y) {
        return x % y;
    }
    public static double modulus(double x, double y) {
        return x % y;
    }

    public static int multipyWO(int x, int y) {
        int sum = 0;
        for (int i = 1; i <= x; i++) {
            sum = sum + y;
        }
        return sum;
    }
    public static double multipyWO(double x, double y) {
        double sum = 0;
        for (double i = 1; i <= x; i++) {
            sum = sum + y;
        }
        return sum;
    }

}
