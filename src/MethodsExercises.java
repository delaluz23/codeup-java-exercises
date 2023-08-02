import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {


//        int probOne = 5;
//        while (probOne <= 15) {
//            System.out.println(probOne);
//            probOne++;
//        }
//
//
//        int probTwo = 2;
//        do {
//            System.out.println(probTwo);
//            probTwo = (int) Math.pow(probTwo, 2);
//        }
//        while (probTwo <= 1000000);


//        for (int total = 1000000; probTwo <= total; probTwo = (int) Math.pow(probTwo, 2)){
//            System.out.println(probTwo);
//        }
//
//        for (int i =0; i<=100; i++){
//            if (i % 3 == 0 && i % 5 == 0 ){
//                System.out.println("FizzBuzz");
//            } else if (i % 5 == 0){
//                System.out.println("Buzz");
//            } else if ( i % 3 == 0 ) {
//                System.out.println("Fizz");
//            } else {
//                System.out.println(i);
//            }
//        }
        Scanner sc = new Scanner(System.in);
//        System.out.println("what number would you like to go up to?");
//        int userInt = sc.nextInt();
//        System.out.println(" Number | Squared | Cubed");
//        for (int i = 0; i <= userInt; i++) {
//            System.out.println("   " + i + "  |  " + "   " + Math.pow(i, 2) + "  |  " + "   " + Math.pow(i, 3) + "\n");
//        }
        System.out.println("Enter A grade");
        int userGrade = sc.nextInt();
        System.out.println("you entered: " + userGrade);
        System.out.println("do you want to continue> [Y/N]");
        String userContinue = sc.next();
        boolean yes = userContinue.equalsIgnoreCase("y");
        if (yes) {
            if (userGrade >= 99) {
                System.out.println("The grade: " + userGrade + " is an A+");
            } else if (userGrade >= 92) {
                System.out.println("The grade: " + userGrade + " is an A");
            } else if (userGrade >= 88) {
                System.out.println("The grade: " + userGrade + " is an A-");
            }else if (userGrade >= 86) {
                System.out.println("The grade: " + userGrade + " is an B+");
            } else if (userGrade >= 84) {
                System.out.println("The grade: " + userGrade + " is an B");
            }else if (userGrade >= 80) {
                System.out.println("The grade: " + userGrade + " is an B-");
            }else if (userGrade >= 78) {
                System.out.println("The grade: " + userGrade + " is an C+");
            } else if (userGrade >= 74) {
                System.out.println("The grade: " + userGrade + " is an C");
            }else if (userGrade >= 67) {
                System.out.println("The grade: " + userGrade + " is an C-");
            }else if (userGrade >= 65) {
                System.out.println("The grade: " + userGrade + " is an D+");
            }else if (userGrade >= 63) {
                System.out.println("The grade: " + userGrade + " is an D");
            } else if (userGrade >= 60) {
                System.out.println("The grade: " + userGrade + " is an D-");
            } else if (userGrade >= 0) {
                System.out.println("The grade: " + userGrade + " is an F");
            }
        } else {
            System.out.println("okay i wont continue");
        }

    }
}
