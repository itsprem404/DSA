package _03_Functions.Questions;
import java.util.*;

//Q. Define a method that returns the product of two numbers entered by user.
public class Product {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int num1 = in.nextInt();
        System.out.print("Enter 2st number: ");
        int num2 = in.nextInt();

        System.out.println("Product: " + product(num1, num2));
    }

    private static int product(int num1, int num2) {
        int product = num1 * num2;
        return product;
    }
}
