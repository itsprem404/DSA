package _03_Functions.Questions;
import java.util.*;

/*Q. Define two methods to print the maximum and the minimum number respectively
among three numbers entered by the user.*/

public class Max_Min {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        System.out.println("Minimum number: " + Min(num1, num2, num3));
        System.out.println("Maximum number: " + Max(num1, num2, num3));
    }

    static int Min(int num1, int num2, int num3) {
        if (num1 <= num2 && num1 <= num3) {
            return num1;
        } else if (num2 <= num1 && num2<=num3) {
            return num2;
        }else return num3;
    }

        static int Max ( int num1, int num2, int num3){
            if (num1 >= num2 && num1 >= num3) {
                return num1;
            } else if (num2 >= num1 && num2 >= num3) {
                return num2;
            } else return num3;
        }
}