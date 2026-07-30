package _01_First_Java_Program.Questions;

// Q. Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

import java.util.Scanner;

public class calculate {
    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first number: ");
        num1 = in.nextInt();
        System.out.print("Enter second number: ");
        num2 = in.nextInt();

        System.out.print("Enter the operator(+, -, *, /: ");
        String operator = in.next();
        if (operator.equals("+")) {
            System.out.println(num1 + num2);
        }else if (operator.equals("-")) {
            System.out.println(num1 - num2);
        }else if (operator.equals("*")) {
            System.out.println(num1 * num2);
        }else if (operator.equals("/")) {
            System.out.println(num1 / num2);
        }else{
            System.out.println("Invalid operator");
        }
    }
}
