package TutorialQuestions.Tutorial2;
/* 3.A college is developing a Student Registration System to store basic information about
newly admitted students. For every student, the system should store the student&#39;s name and
roll number. The college also wants a feature to display the student&#39;s details whenever
required. */


public class Q3Student {

    private String name;
    private int rollNumber;


    public Q3Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public void display() {
        System.out.println("--- Student Details ---");
        System.out.println("Name:        " + this.name);
        System.out.println("Roll Number: " + this.rollNumber);
        System.out.println();
    }

    public static void main(String[] args) {

        Q3Student student1 = new Q3Student("Prem Kumar", 263);
        Q3Student student2 = new Q3Student("Aaditya Raj", 260);

        student1.display();
        student2.display();
    }
}
