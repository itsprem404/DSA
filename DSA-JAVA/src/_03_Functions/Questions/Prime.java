package _03_Functions.Questions;
import java.util.*;
//Q. Define a method to find out if a number is prime or not.

public class Prime {
    static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = in.nextInt();
        System.out.println("Your number is " + prime(num));
    }
    public static String prime(int num) {
        if (num <= 1) {
            return "not Prime";
        }
        if (num == 2) {
            return "is Prime";
        }

        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) {
                return "Not Prime";
            }else return "Prime";
        }
        return "";
    }
}

