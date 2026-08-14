package _000_TutorialQuestions.Tutorial4;

import java.util.Scanner;

class Student {
    int rollNumber;
    String studentName;
    int[] marks = new int[3];
    double attendancePercentage;

    public Student(int rollNumber, String studentName, int[] marks, double attendancePercentage) {
        this.rollNumber = rollNumber;
        this.studentName = studentName;
        this.marks = marks;
        this.attendancePercentage = attendancePercentage;
    }

    public void processAndDisplay() {
        int totalMarks = 0;

        for (int mark : marks) {
            totalMarks += mark;
        }
        double averageMarks = totalMarks / 3.0;

        String status = (averageMarks >= 50) ? "Pass" : "Fail";
        String scholarship = (averageMarks >= 75 && attendancePercentage >= 80) ? "Eligible" : "Not Eligible";
        String performance = (averageMarks >= 85) ? "Excellent" : "Good";

        System.out.println("Roll No: " + rollNumber);
        System.out.println("Name: " + studentName);
        System.out.println("Total Marks: " + totalMarks + " | Average: " + String.format("%.2f", averageMarks));
        System.out.println("Status: " + status);
        System.out.println("Scholarship: " + scholarship);
        System.out.println("Performance: " + performance);
        System.out.println("------------------------------------");
    }

    public double getAverage() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total / 3.0;
    }
}

public class StudentDetails {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Student[] students = new Student[5];

        // Loop to take dynamic user inputs for 5 students
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for Student " + (i + 1) + ":");

            System.out.print("Enter Roll Number: ");
            int roll = in.nextInt();
            in.nextLine(); // Consume newline character left behind by nextInt()

            System.out.print("Enter Student Name: ");
            String name = in.nextLine();

            int[] studentMarks = new int[3];
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter marks for Subject " + (j + 1) + ": ");
                studentMarks[j] = in.nextInt();
            }

            System.out.print("Enter Attendance Percentage: ");
            double attendance = in.nextDouble();
            System.out.println(); // Space between entries

            students[i] = new Student(roll, name, studentMarks, attendance);
        }

        System.out.println("\n=== Student Performance Reports ===\n");

        for (Student s : students) {
            s.processAndDisplay();
        }

        Student topStudent = students[0];
        for (int i = 1; i < students.length; i++) {
            if (students[i].getAverage() > topStudent.getAverage()) {
                topStudent = students[i];
            }
        }

        System.out.println("=== Top Performer ===");
        System.out.println("Name: " + topStudent.studentName + " (Roll No: " + topStudent.rollNumber + ")");
        System.out.println("Highest Average: " + String.format("%.2f", topStudent.getAverage()));
    }
}
