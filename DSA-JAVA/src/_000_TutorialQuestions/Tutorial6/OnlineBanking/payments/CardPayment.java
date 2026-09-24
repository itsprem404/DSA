package _000_TutorialQuestions.Tutorial6.OnlineBanking.payments;

public class CardPayment implements Payment, OnlineTransaction {

    public void pay(double amount) {
        System.out.println("Paid using Card: " + amount);
    }
}