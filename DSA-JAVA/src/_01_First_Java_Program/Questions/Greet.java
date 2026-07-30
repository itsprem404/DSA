package _01_First_Java_Program.Questions;

//Q. Take name as input and print a greeting message for that particular name
import java.util.Scanner;

public class Greet {
    public static void main(String[] args) {
        System.out.println("Welcome to the Greeting System");
        System.out.print("Enter your name: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("Hello " + name);
    }
}
