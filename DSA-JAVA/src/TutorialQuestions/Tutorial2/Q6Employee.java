package TutorialQuestions.Tutorial2;

class Employee {
    String name;
    int id;
    String department;

    public Employee(String name, int id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }

    public void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println();
    }
}

public class Q6Employee {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Prem Kumar", 101, "Artificial Engineering");
        Employee emp2 = new Employee("Harshit", 102, "Engineering");

        emp1.displayDetails();
        emp2.displayDetails();
    }
}
