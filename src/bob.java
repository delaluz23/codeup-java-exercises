import java.util.Scanner;

public class bob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("talk to lackadaisical Bob, make sure to use punctuation!");
        String userInput = sc.nextLine();
        if (userInput.contains("?")){
            System.out.println("Bob says: \"Sure\"");
        } else if (userInput.contains("!")){
            System.out.println("Bob says: \"Whoa, chill out!\"");
        } else if (userInput.length()==0) {
            System.out.println("Fine. Be that way!");
        } else {
            System.out.println("Whatever");
        }
    }
}
