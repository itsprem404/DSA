package TutorialQuestions.Tutorial2;

class Student {

    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Student Name: " + this.name);
        System.out.println("Student Age: " + this.age);
        System.out.println("-------------------------");
    }
}

public class Q5School {
    public static void main(String[] args) {
        Student student1 = new Student("Aaditya Raj", 20);
        Student student2 = new Student("Ryaan Chacko", 19);

        System.out.println("--- School Student Records ---\n");

        System.out.println("Details of Student 1:");
        student1.displayDetails();

        System.out.println("Details of Student 2:");
        student2.displayDetails();
    }
}
