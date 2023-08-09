package Grades;

import util.input;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class GradesApplication {
    private static void execute() {

        input sc = new input();
        HashMap<String, Student> gitnames = new HashMap<>();

        gitnames.put("joshiscool", new Student("josh", new ArrayList<Integer>(Arrays.asList(80, 70, 60))));
        gitnames.put("johniscool", new Student("john", new ArrayList<Integer>(Arrays.asList(90, 80, 75))));
        gitnames.put("joseiscool", new Student("jose", new ArrayList<Integer>(Arrays.asList(70, 65, 60))));
        gitnames.put("joeiscool", new Student("joe", new ArrayList<Integer>(Arrays.asList(85, 75, 50))));
        System.out.println(gitnames.toString());
        System.out.println("Welcome!");
        System.out.println("Here are the GitHub usernames of our students:\n");

        String response;
        boolean cont;
        do {
            for (String keys : gitnames.keySet()) {
                String key = ("|" + keys + "| ");
                System.out.print(key);
            }
            System.out.println("\n \nWhat student would you like to see more information on?");
            response = sc.getString();
            if (!gitnames.containsKey(response)) {
                System.out.println("Sorry, no student found with the GitHub username of \"" + response + "\"");
                System.out.println("Do you want to continue?[Y/N]");
            } else {
                String key = response;
                Student student = gitnames.get(key);
                String studentname = student.getName();
                Double average = student.getGradeAverage();
                System.out.println("Name: " + studentname + " - GitHub username: " + response + " Current average: " + average);
                System.out.println("Do you want to continue?[Y/N]");
            }
        } while (sc.yesNo());
        {
            System.out.println("Goodbye, and have a wonderful day!");
        }
//            System.out.println("\n \nusername,   name,   average \n");
//        for (Map.Entry<String, Student> entry : gitnames.entrySet()) {
//            String key = entry.getKey();
//            Student value = entry.getValue();
//            String name = value.getName();
//            Double avg = value.getGradeAverage();
//            System.out.println( key +", " + name+", " + avg);
//        }
//        System.out.println("-------------------------------\n");


    }

    public static void main(String[] args) {
        execute();
    }
}
