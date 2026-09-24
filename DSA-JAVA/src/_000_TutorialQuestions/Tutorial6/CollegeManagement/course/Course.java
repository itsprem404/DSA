package _000_TutorialQuestions.Tutorial6.CollegeManagement.course;
public class Course {

    String name;
    String code;

    public Course(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public void display() {
        System.out.println("Course Name: " + name);
        System.out.println("Course Code: " + code);
    }
}
