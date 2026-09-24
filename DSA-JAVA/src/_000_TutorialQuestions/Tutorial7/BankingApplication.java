package _000_TutorialQuestions.Tutorial7;

class BankingTask implements Runnable {
    private String activity;
    private int delay;

    public BankingTask(String activity, int delay) {
        this.activity = activity;
        this.delay = delay;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(Thread.currentThread().getName()
                    + " - " + activity
                    + " - Execution Count: " + i);

            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }
    }
}

public class BankingApplication {
    public static void main(String[] args) {
        Thread transactionThread =
                new Thread(new BankingTask("Processing transaction", 1000));

        Thread balanceThread =
                new Thread(new BankingTask("Updating account balance", 1500));

        Thread smsThread =
                new Thread(new BankingTask("Sending SMS notification", 2000));

        transactionThread.setName("Transaction Thread");
        balanceThread.setName("Balance Thread");
        smsThread.setName("SMS Thread");

        transactionThread.start();
        balanceThread.start();
        smsThread.start();
    }
}