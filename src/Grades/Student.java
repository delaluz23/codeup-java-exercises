package Grades;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Student {
    //properties
    private String name;
    private ArrayList<Integer> grade;

    private HashMap<String, String> attendance;

    //constructors
    public Student(String name, ArrayList<Integer> grade) {
        this.name = name;
        this.grade = grade;
    }

    public Student(String name, HashMap<String, String> attendance) {
        this.name = name;
        this.attendance = attendance;
    }

    // returns the student's name
    public String toString() {
        return "Name: " + name + ", Grades: " + grade;
    }

    //getters and setters

    public void recordAttendance(String date, String value) {

        if (value.toLowerCase() == "a" || value.toLowerCase() == "p") {
            attendance.put(date, value);
        } else {
            System.out.println(value + " isn't a valid entry");
        }
    }
    public double attendancePercentage(){
        double sum =0;
        for (Map.Entry<String, String> entry : attendance.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();

        }
        return sum;
    }

    public String getName() {
        return this.name;
    }

    public String setName(String name) {
        this.name = name;
        return name;
    }

    public ArrayList<Integer> getGrade() {
        return grade;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade) {
        this.grade.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage() {
        int sum = 0;
        for (int grade : this.grade) {
            sum += grade;
        }
        double total = (double) sum / this.grade.size();
        DecimalFormat df = new DecimalFormat("#.00");
        return Double.parseDouble(df.format(total));
    }

}
