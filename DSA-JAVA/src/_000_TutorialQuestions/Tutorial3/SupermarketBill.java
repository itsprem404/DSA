package _000_TutorialQuestions.Tutorial3;

import java.util.Scanner;

public class SupermarketBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] prices = new double[5];
        double totalBill = 0;

        System.out.println("Enter the prices of 5 items:");
        for (int i = 0; i < prices.length; i++) {
            System.out.print("Item " + (i + 1) + ": ");
            prices[i] = sc.nextDouble();
            totalBill += prices[i];
        }

        System.out.printf("Total Bill : %.2f%n", totalBill);

        if (totalBill > 5000) {
            System.out.println("Discount Applicable");
        } else {
            System.out.println("No Discount");
        }

        sc.close();
    }
}
