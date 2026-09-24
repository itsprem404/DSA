package _000_TutorialQuestions.Tutorial6.OnlineBanking.accounts;

public class Account {

    String name;
    double balance;

    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
    }
}