package _000_TutorialQuestions.Tutorial4;

import java.util.Scanner;

class Ride {
    int rideNumber;
    String rideName;

    Ride(int rideNumber, String rideName) {
        this.rideNumber = rideNumber;
        this.rideName = rideName;
    }

    void displayPattern() {
        System.out.print(rideName + " : ");

        for (int j = 1; j <= rideNumber; j++) {
            System.out.print("*");
        }

        System.out.println();
    }
}

public class AmusementPark {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Ride[] rides = new Ride[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for Ride " + (i + 1));

            System.out.print("Enter Ride Number: ");
            int number = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Ride Name: ");
            String name = sc.nextLine();

            rides[i] = new Ride(number, name);
        }

        System.out.println("\n========== RIDE ACTIVITY LEVEL ==========");

        for (int i = 0; i < 5; i++) {
            rides[i].displayPattern();
        }

        sc.close();
    }
}