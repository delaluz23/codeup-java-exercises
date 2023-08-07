package util;

import java.util.Scanner;

public class input {
    //properties and fields
    private Scanner sc;

    //constructors
    public input() {
        this.sc = new Scanner(System.in);
    }

    //getters and setters
    public String getString() {
//        System.out.println("enter a string");
        return this.sc.nextLine();
    }

    public String getString(String prompt){
        System.out.println(prompt);
        return this.getString();
    }

    //    public boolean yesNo(String sc) {
//        return sc.equalsIgnoreCase("y");
//    }
    //walkthrough version
    public boolean yesNo() {
        return this.getString().toLowerCase().startsWith("y");
    }
    public boolean yesNo(String prompt) {
        System.out.println(prompt);
        return this.getString().toLowerCase().startsWith("y");
    }

    //    public int getInt(int min, int max) {
//        Scanner sc = new Scanner(System.in);
//        int userInput;
//        do {
//            System.out.println("enter a number between " + min + " and " + max);
//            userInput = sc.nextInt();
//
//        } while (userInput < min || userInput > max);
//        return userInput;
//    }
//
//    public int getInt() {
//        return sc.nextInt();
//    }
    //walkthrough
    public int getInt() {
        try {
            return Integer.parseInt(this.getString());
        } catch (NumberFormatException e) {
            System.out.println("You must enter a whole number.");
            return this.getInt();
        }
    }

    public int getInt(int min, int max) {
        int userint = this.getInt();
        if (userint >= min && userint <= max) {
            return userint;
        } else {
            System.out.println("must be between " + min + " and " + max + ".");
            return getInt(min, max);
        }
    }


//    public double getDouble(double min, double max) {
//        Scanner sc = new Scanner(System.in);
//        double userInput;
//        do {
//            System.out.println("enter a number between " + min + " and " + max);
//            userInput = sc.nextDouble();
//
//        } while (userInput < min || userInput > max);
//        return userInput;
//    }
//
//    public double getDouble() {
//        return sc.nextDouble();
//    }


    //walkthrough
    public double getDouble() {
        try {
            return Double.parseDouble(this.getString());
        } catch (NumberFormatException e) {
            System.out.println("You must enter a number.");
            return this.getDouble();
        }
    }

    public double getDouble(double min, double max) {
        double userDouble = this.getDouble();
        if (userDouble >= min && userDouble <= max) {
            return userDouble;
        } else {
            System.out.println("must be between " + min + " and " + max + ".");
            return getDouble(min, max);
        }
    }
}
