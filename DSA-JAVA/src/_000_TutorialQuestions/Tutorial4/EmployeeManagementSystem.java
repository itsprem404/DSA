package _000_TutorialQuestions.Tutorial4;

import java.util.Scanner;

class Employee {
    int employeeId;
    String name;
    double monthlySalary;

    Employee(int employeeId, String name, double monthlySalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.monthlySalary = monthlySalary;
    }

    void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Monthly Salary: Rs." + monthlySalary);
    }

    double calculateAnnualSalary() {
        return monthlySalary * 12;
    }

    double calculateBonus() {
        if (monthlySalary >= 30000) {
            return calculateAnnualSalary() * 0.10;
        }
        return 0;
    }

    boolean isEligibleForBonus() {
        return monthlySalary >= 30000;
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee[] employees = new Employee[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1));

            System.out.print("Enter Employee ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Monthly Salary: ");
            double salary = sc.nextDouble();

            employees[i] = new Employee(id, name, salary);
        }

        System.out.println("\n========== EMPLOYEE DETAILS ==========");

        for (Employee employee : employees) {
            employee.displayDetails();

            double annualSalary = employee.calculateAnnualSalary();
            double bonus = employee.calculateBonus();

            System.out.println("Annual Salary: Rs." + annualSalary);
            System.out.println("Bonus: Rs." + bonus);
            System.out.println("Bonus Eligible: " +
                    (employee.isEligibleForBonus() ? "Yes" : "No"));

            System.out.println("--------------------------------------");
        }

        sc.close();
    }
}