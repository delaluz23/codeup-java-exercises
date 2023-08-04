package util;

import java.util.Scanner;

public class input {
    //properties and fields
    private final Scanner sc = new Scanner(System.in);

    //constructors
    public Scanner sc(){
        return this.sc;
    }

    //getters and setters
    public String getString (){
        System.out.println("enter a string");
        return this.sc.nextLine();
    }
    public boolean yesNo (String sc){
       return sc.equals("y");
    }
    public int getInt(int min, int max){
        Scanner sc = new Scanner(System.in);
        int userInput;
        do {
        System.out.println("enter a number between " + min +" and " + max);
        userInput = sc.nextInt();

        } while(userInput < min || userInput > max);
        return userInput;
    }
    public int getInt(){
        return sc.nextInt();
    }
    public double getDouble(double min, double max){
        Scanner sc = new Scanner(System.in);
        double userInput;
        do {
            System.out.println("enter a number between " + min +" and " + max);
            userInput = sc.nextDouble();

        } while(userInput < min || userInput > max);
        return userInput;
    }
    public double getDouble(){
        return sc.nextDouble();
    }

}
