import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
//        double pi = 3.14159;
//        System.out.printf("The value of pi is approximately %.2f . \n", pi);
        Scanner sc = new Scanner(System.in);
//        System.out.println("enter a number");
//        int userInput = sc.nextInt();
//        System.out.println("you're number is: " + userInput);
//        System.out.println("enter three words, seperated by spaces");
//        String WordOne = sc.next();
//        String WordTwo = sc.next();
//        String WordThree = sc.next();
//        System.out.println("one :" + WordOne + " two : " + WordTwo + " three :" + WordThree);
//        System.out.println("Enter a sentence");
//        String sentence = sc.nextLine();
//        System.out.println("your sentence => " + sentence);
        System.out.println("enter the length first then the width");
        String length = sc.nextLine();
        String width = sc.nextLine();
        int numlength = Integer.parseInt(length);
        int numwidth = Integer.parseInt(width);
        System.out.println("your area is :" + (numlength * numwidth));
        System.out.println("your perimeter is :" + ((numlength * 2 ) + (numwidth * 2)));
    }
}
