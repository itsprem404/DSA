package _000_TutorialQuestions.Tutorial7.CollegeManagement;

import _000_TutorialQuestions.Tutorial7.CollegeManagement.student.Student;
import _000_TutorialQuestions.Tutorial7.CollegeManagement.course.Course;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(101, "Prem Kumar", "CSE", 2);
        Course course = new Course("CS101", "Advanced Programming Practice", 4);

        System.out.println("----- STUDENT DETAILS -----");
        student.displayStudent();

        System.out.println("\n----- COURSE DETAILS -----");
        course.displayCourse();
    }
}