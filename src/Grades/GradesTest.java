package Grades;

import java.util.ArrayList;

public class GradesTest {
    public static void main(String[] args) {
        Student student = new Student("jose",new ArrayList<>() );
        student.addGrade(90);
        student.addGrade(80);
        student.addGrade(95);
        student.addGrade(90);
        student.addGrade(70);
        System.out.println(student.getGradeAverage());
        System.out.println(student.getName());
        System.out.println(student.getGrade());
    }
}
