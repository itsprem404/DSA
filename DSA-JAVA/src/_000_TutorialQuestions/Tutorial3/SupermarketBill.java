package _000_TutorialQuestions.Tutorial3;

import java.util.Scanner;

public class SupermarketBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Define an array to store the prices of 5 products
        double[] prices = new double[5];
        double totalBill = 0;

        // Loop to read 5 product prices
        for (int i = 0; i < prices.length; i++) {
            prices[i] = sc.nextDouble();
            totalBill += prices[i];
        }

        System.out.println("Total Bill : " + (int)totalBill);

        if (totalBill > 5000) {
            System.out.println("Discount Applicable");
        } else {
            System.out.println("No Discount");
        }
    }
}
