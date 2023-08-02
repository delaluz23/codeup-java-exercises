public class MethodsExercises {
    public static void main(String[] args) {
        System.out.println(addition(4, 2));
        System.out.println(subtraction(4, 2));
        System.out.println(multiplication(4, 2));
        System.out.println(division(4, 2));
        System.out.println(modulus(5, 2));
        System.out.println(multipyWO(8, 2));
        System.out.print("Enter a number between 1 and 10: ");
//        System.out.println(getInteger(1, 10));

    }

    public static int addition(int x, int y) {
        return x + y;
    }

    public static int subtraction(int x, int y) {
        return x - y;
    }

    public static int multiplication(int x, int y) {
        return x * y;
    }

    public static int division(int x, int y) {
        return x / y;
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
//    public static String getInteger(int min, int max) {
//        Scanner sc = new Scanner(System.in);
//        boolean ok = true;
//        String answer;
//        int userInput = sc.nextInt();
//        while (ok) {
//            if (userInput <= max && userInput >= min) {
//                answer =  "your number " + userInput + "is withing the range";
//                break;
//            }
//        return answer;
//        }
}

