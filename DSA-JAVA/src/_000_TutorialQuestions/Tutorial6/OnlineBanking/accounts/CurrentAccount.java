package _000_TutorialQuestions.Tutorial6.OnlineBanking.accounts;

public class CurrentAccount extends Account {

    public CurrentAccount(String name, double balance) {
        super(name, balance);
    }

    public void displayDetails() {
        System.out.println("Current Account");
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
    }
}