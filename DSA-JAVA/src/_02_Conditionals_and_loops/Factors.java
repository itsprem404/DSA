package _02_Conditionals_and_loops;
import java.util.Scanner;
// Input a number and print all the factors of that number (use loops).
public class Factors {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number to take factor: ");
        int count = in.nextInt();
        factor(count);
    }

    static void factor(int number) {
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

    }
}
