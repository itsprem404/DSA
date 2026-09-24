package _000_TutorialQuestions.Tutorial6.OnlineBanking;

import java.util.Scanner;

import _000_TutorialQuestions.Tutorial6.OnlineBanking.accounts.Account;
import _000_TutorialQuestions.Tutorial6.OnlineBanking.accounts.SavingsAccount;
import _000_TutorialQuestions.Tutorial6.OnlineBanking.accounts.CurrentAccount;

import _000_TutorialQuestions.Tutorial6.OnlineBanking.payments.Payment;
import _000_TutorialQuestions.Tutorial6.OnlineBanking.payments.UPIPayment;
import _000_TutorialQuestions.Tutorial6.OnlineBanking.payments.CardPayment;
import _000_TutorialQuestions.Tutorial6.OnlineBanking.payments.SecurePayment;
import _000_TutorialQuestions.Tutorial6.OnlineBanking.payments.OnlineTransaction;

public class OnlineBanking {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter balance: ");
        double balance = sc.nextDouble();

        System.out.println("1. Savings Account");
        System.out.println("2. Current Account");

        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        Account account;

        if (choice == 1)
            account = new SavingsAccount(name, balance);
        else
            account = new CurrentAccount(name, balance);

        account.displayDetails();

        System.out.print("Enter payment amount: ");
        double amount = sc.nextDouble();

        System.out.println("1. UPI");
        System.out.println("2. Card");

        System.out.print("Enter choice: ");
        choice = sc.nextInt();

        Payment payment;

        if (choice == 1)
            payment = new UPIPayment();
        else
            payment = new CardPayment();

        payment.pay(amount);

        if (payment instanceof SecurePayment) {
            SecurePayment secure = (SecurePayment) payment;
            secure.verifyPayment();
        }

        if (payment instanceof OnlineTransaction)
            System.out.println("Online Transaction");

        sc.close();
    }
}