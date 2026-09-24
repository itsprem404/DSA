package _000_TutorialQuestions.Tutorial6.OnlineBanking.payments;

public interface SecurePayment extends Payment {
    void verifyPayment();
}