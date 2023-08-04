import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
//        System.out.println(addition(4, 2));
//        System.out.println(subtraction(4, 2));
//        System.out.println(multiplication(4, 2));
//        System.out.println(division(4, 2));
//        System.out.println(modulus(5, 2));
//        System.out.println(multipyWO(8, 2));
//        int userInput = getInteger(1, 10);
//        System.out.println(userInput);
//        factorial(userInput);
        diceRoll();
    }




//    public static int addition(int x, int y) {
//        return x + y;
//    }
//
//    public static int subtraction(int x, int y) {
//        return x - y;
//    }
//
//    public static int multiplication(int x, int y) {
//        return x * y;
//    }
//
//    public static int division(int x, int y) {
//        return x / y;
//    }
//
//    public static double modulus(double x, double y) {
//        return x % y;
//    }
//
//    public static int multipyWO(int x, int y) {
//        int sum = 0;
//        for (int i = 1; i <= x; i++) {
//            sum = sum + y;
//        }
//        return sum;
//    }
//



//    public static int getInteger(int min, int max) {
//        Scanner sc = new Scanner(System.in);
//        int userInput;
//        do {
//            System.out.print("Enter a number between 1 and 10: ");
//            userInput = sc.nextInt();
//
//        } while (userInput < min || userInput > max);
//        return userInput;
//    }
//
//
//
//
//    public static void factorial(int userInput) {
//        System.out.println("factorial user input = " + userInput);
//        long factorial = 1;
//        Scanner sc = new Scanner(System.in);
//        String cont = "y";
//
//        do {
//            for (int i = 1; i <= userInput; ++i) {
//                factorial *= i;
//            }
//            System.out.println("factorial of \"" + userInput + "\" is -> " + factorial);
//            System.out.println("Do you want to continue? [Y/N]");
//            cont = sc.nextLine();
//
//            if (cont.equalsIgnoreCase("n")) {
//                break;
//            }
//            userInput = getInteger(1, 10);
//        } while (true);
//        System.out.println("Thanks!");
//    }



    public static void diceRoll() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter how many number of sides you want");
        int numOfSides = sc.nextInt();
        if (numOfSides <= 2) {
            System.out.println("no such thing as a " + numOfSides + " sided dice \nEnter A number greater than or equal to 3");
            numOfSides = sc.nextInt();
        }
        int dice1 = (int) (Math.random() * numOfSides) + 1;
        int dice2 = (int) (Math.random() * numOfSides) + 1;

        String again = "y";
        do {
            if (again.equalsIgnoreCase("y")) {
                System.out.println("dice one " + dice1);
                System.out.println("dice two " + dice2);
                System.out.println("Roll again? [Y/N]");
                again = sc.nextLine();
            }
            else {
                break;
            }
        } while (true);
        System.out.println("thanks");
    }

}

