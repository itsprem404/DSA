package TutorialQuestions.Tutorial2;
/*1. College is developing a student information system. Write a Java program
to display a student&#39;s name, register number, department, year of study,
and college name in a neatly formatted manner. */

import java.util.Scanner;

public class Q1Student_Information {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Student ID: ");
        int id = input.nextInt();
        System.out.print("Enter Student Name: ");
        String name = input.next();
        System.out.print("Enter Student department: ");
        String department = input.next();
        System.out.print("Year of study: ");
        int year = input.nextInt();
        System.out.print("College Name: ");
        String collegeName = input.next();

        System.out.println("Student ID is: " + id);
        System.out.println("Student Name is: " + name);
        System.out.println("Student Department is: " + department);
        System.out.println("Student Year is: " + year);
        System.out.println("Student College Name is: " + collegeName);
    }
}
