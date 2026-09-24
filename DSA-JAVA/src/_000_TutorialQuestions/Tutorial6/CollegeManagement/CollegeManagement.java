package _000_TutorialQuestions.Tutorial6.CollegeManagement;

import java.util.Scanner;
import _000_TutorialQuestions.Tutorial6.CollegeManagement.course.Course;
import _000_TutorialQuestions.Tutorial6.CollegeManagement.student.Student;

public class CollegeManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter roll number: ");
        int roll = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter course name: ");
        String courseName = sc.nextLine();

        System.out.print("Enter course code: ");
        String courseCode = sc.nextLine();

        Student s = new Student(name, roll);
        Course c = new Course(courseName, courseCode);

        System.out.println("\nStudent Details:");
        s.display();

        System.out.println("\nCourse Details:");
        c.display();

        sc.close();
    }
}