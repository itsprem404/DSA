package _000_TutorialQuestions.Tutorial3;
import java.util.Scanner;

public class AttendanceCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] attendance = new int[7];
        int present = 0;

        for (int i = 0; i < attendance.length; i++) {
            attendance[i] = sc.nextInt();

            if (attendance[i] == 1) {
                present++;
            }
        }
        double attendancePercentage = ((double) present / attendance.length) * 100;
        if (attendancePercentage >= 75.0) {
            System.out.println("Eligible for Exam");
        } else {
            System.out.println("Not Eligible");
        }
    }
}
