package _03_Functions.Questions;
import java.util.*;

//Q. A person is eligible to vote if his/her age is greater than or equal to 18.
// Define a method to find out if he/she is eligible to vote.

public class VotingSystem {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int Age = in.nextInt();
        System.out.println(vote(Age));
    }

    static String vote(int age){
        if(age>=18){
            return "Eligible to vote";
        }else return "Not eligible to vote";
    }

}
