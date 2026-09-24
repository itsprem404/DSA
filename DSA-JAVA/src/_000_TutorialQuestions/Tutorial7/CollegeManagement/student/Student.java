package _000_TutorialQuestions.Tutorial7.CollegeManagement.student;

public class Student {
    private int studentId;
    private String name;
    private String department;
    private int year;

    public Student(int studentId, String name, String department, int year) {
        this.studentId = studentId;
        this.name = name;
        this.department = department;
        this.year = year;
    }

    public void displayStudent() {
        System.out.println("Student ID   : " + studentId);
        System.out.println("Student Name : " + name);
        System.out.println("Department   : " + department);
        System.out.println("Year         : " + year);
    }
}