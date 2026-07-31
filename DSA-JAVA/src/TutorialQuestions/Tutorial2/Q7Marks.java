package TutorialQuestions.Tutorial2;

class Marks {
    int subject1;
    int subject2;
    int subject3;

    public Marks(int s1, int s2, int s3) {
        this.subject1 = s1;
        this.subject2 = s2;
        this.subject3 = s3;
    }

    public void calculateAndDisplay() {
        int total = subject1 + subject2 + subject3;
        double average = total / 3.0;

        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
    }
}

public class Q7Marks {
    public static void main(String[] args) {
        Marks studentMarks = new Marks(85, 90, 78);
        studentMarks.calculateAndDisplay();
    }
}
