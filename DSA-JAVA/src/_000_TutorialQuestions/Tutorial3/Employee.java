package _000_TutorialQuestions.Tutorial3;

import java.util.Scanner;

public class Employee {
    int employeeID;
    String employeeName;
    double salary;

    public Employee(int employeeID, String employeeName, double salary) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("\n--- Employee Details ---");
        System.out.println("Employee ID : " + employeeID);
        System.out.println("Employee Name : " + employeeName);
        System.out.printf("Salary : %.2f%n", salary);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Salary: ");
        double sal = sc.nextDouble();

        Employee emp = new Employee(id, name, sal);
        emp.displayDetails();

        sc.close();
    }
}
