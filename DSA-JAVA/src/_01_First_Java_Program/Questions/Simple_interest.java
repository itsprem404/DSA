package _01_First_Java_Program.Questions;

//Q. Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
import java.util.Scanner;

public class Simple_interest {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter principal: ");
        float principal = input.nextFloat();
        System.out.print("Enter time(years): ");
        float time = input.nextFloat();
        System.out.print("Enter rate(percentage): ");
        float rate = input.nextFloat();

        float simple_interest = (principal * time * rate) / 100;
        System.out.println("The simple interest is: " + simple_interest);
    }
}
