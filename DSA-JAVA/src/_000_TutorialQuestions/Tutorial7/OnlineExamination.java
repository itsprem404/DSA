package _000_TutorialQuestions.Tutorial7;

class ExamTask implements Runnable {
    private String activity;
    private int delay;

    public ExamTask(String activity, int delay) {
        this.activity = activity;
        this.delay = delay;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(Thread.currentThread().getName()
                    + " is performing: " + activity);

            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }
    }
}

public class OnlineExamination {
    public static void main(String[] args) {
        Thread timerThread = new Thread(new ExamTask("Displaying remaining time", 1000));
        Thread saveThread = new Thread(new ExamTask("Auto-saving answers", 1500));
        Thread networkThread = new Thread(new ExamTask("Checking network connection", 2000));

        timerThread.setName("Timer Thread");
        saveThread.setName("AutoSave Thread");
        networkThread.setName("Network Thread");

        timerThread.start();
        saveThread.start();
        networkThread.start();
    }
}