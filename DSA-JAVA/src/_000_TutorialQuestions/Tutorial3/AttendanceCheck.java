package _000_TutorialQuestions.Tutorial3;

import java.util.Scanner;

public class AttendanceCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalDays = 7;

        int[] attendance = new int[totalDays];

        System.out.println("Enter attendance for 7 days (1 for Present, 0 for Absent):");
        for (int i = 0; i < totalDays; i++) {
            System.out.print("Day " + (i + 1) + ": ");
            attendance[i] = scanner.nextInt();
        }

        int presentDays = 0;
        for (int i = 0; i < totalDays; i++) {
            if (attendance[i] == 1) {
                presentDays++;
            }
        }

        int absentDays = totalDays - presentDays;

        double attendancePercentage = ((double) presentDays / totalDays) * 100;

        System.out.println("\n--- Attendance Summary ---");
        System.out.println("Number of days present: " + presentDays);
        System.out.println("Number of days absent: " + absentDays);
        System.out.printf("Attendance Percentage: %.2f%%\n", attendancePercentage);

        // Check eligibility using if statement (75% threshold)
        if (attendancePercentage >= 75.0) {
            System.out.println("Status: Eligible for Exam");
        } else {
            System.out.println("Status: Not Eligible");
        }

    }
}
