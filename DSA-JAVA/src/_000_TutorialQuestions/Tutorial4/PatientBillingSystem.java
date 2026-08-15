package _000_TutorialQuestions.Tutorial4;

import java.util.Scanner;

class Patient {
    String patientName;
    double consultationFee;

    Patient(String patientName, double consultationFee) {
        this.patientName = patientName;
        this.consultationFee = consultationFee;
    }

    double calculateFinalAmount(double fee) {
        if (fee >= 2000) {
            return fee - (fee * 0.10);
        } else {
            return fee - (fee * 0.05);
        }
    }

    void display() {
        double discount;

        if (consultationFee >= 2000) {
            discount = consultationFee * 0.10;
        } else {
            discount = consultationFee * 0.05;
        }

        double finalAmount = calculateFinalAmount(consultationFee);

        System.out.println("Patient Name: " + patientName);
        System.out.println("Original Consultation Fee: Rs." + consultationFee);
        System.out.println("Discount: Rs." + discount);
        System.out.println("Final Amount: Rs." + finalAmount);
        System.out.println("----------------------------------");
    }
}

public class PatientBillingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Patient[] patients = new Patient[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("\nEnter details for Patient " + (i + 1));

            System.out.print("Enter Patient Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Consultation Fee: ");
            double fee = sc.nextDouble();
            sc.nextLine();

            patients[i] = new Patient(name, fee);
        }

        System.out.println("\n========== PATIENT BILLING DETAILS ==========");

        for (int i = 0; i < 5; i++) {
            patients[i].display();
        }

        sc.close();
    }
}