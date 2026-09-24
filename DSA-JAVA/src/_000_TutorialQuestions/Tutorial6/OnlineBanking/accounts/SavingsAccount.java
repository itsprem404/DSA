package _000_TutorialQuestions.Tutorial6.OnlineBanking.accounts;

public class SavingsAccount extends Account {

    public SavingsAccount(String name, double balance) {
        super(name, balance);
    }

    public void displayDetails() {
        System.out.println("Savings Account");
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
    }
}