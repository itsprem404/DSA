package _000_TutorialQuestions.Tutorial7;
class TrafficJunction extends Thread {
    private String trafficStatus;
    private int delay;

    public TrafficJunction(String trafficStatus, int delay) {
        this.trafficStatus = trafficStatus;
        this.delay = delay;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(getName()
                    + " - Traffic Status: " + trafficStatus
                    + " - Report " + i);

            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                System.out.println(getName() + " interrupted.");
            }
        }
    }
}

public class SmartTrafficManagement {
    public static void main(String[] args) {
        TrafficJunction junction1 =
                new TrafficJunction("Heavy Traffic", 1000);

        TrafficJunction junction2 =
                new TrafficJunction("Moderate Traffic", 1500);

        TrafficJunction junction3 =
                new TrafficJunction("Low Traffic", 2000);

        junction1.setName("Junction 1 Thread");
        junction2.setName("Junction 2 Thread");
        junction3.setName("Junction 3 Thread");

        junction1.start();
        junction2.start();
        junction3.start();
    }
}