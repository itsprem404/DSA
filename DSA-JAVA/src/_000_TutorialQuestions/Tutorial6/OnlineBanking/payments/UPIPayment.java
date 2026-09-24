package _000_TutorialQuestions.Tutorial6.OnlineBanking.payments;

public class UPIPayment implements SecurePayment, OnlineTransaction {

    public void pay(double amount) {
        System.out.println("Paid using UPI: " + amount);
    }

    public void verifyPayment() {
        System.out.println("UPI payment verified");
    }
}