package _000_TutorialQuestions.Tutorial5;

import java.util.Scanner;

class Employee {
    protected String name;
    protected int employeeId;
    protected double basicSalary;

    Employee(String name, int employeeId, double basicSalary) {
        this.name = name;
        this.employeeId = employeeId;
        this.basicSalary = basicSalary;
    }

    double calculateSalary() {
        return basicSalary;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: " + calculateSalary());
    }
}

class Professor extends Employee {
    Professor(String name, int employeeId, double basicSalary) {
        super(name, employeeId, basicSalary);
    }

    @Override
    double calculateSalary() {
        return basicSalary + 0.30 * basicSalary;
    }
}

class LabAssistant extends Employee {
    LabAssistant(String name, int employeeId, double basicSalary) {
        super(name, employeeId, basicSalary);
    }

    @Override
    double calculateSalary() {
        return basicSalary + 0.20 * basicSalary;
    }
}

class AdministrativeStaff extends Employee {
    AdministrativeStaff(String name, int employeeId, double basicSalary) {
        super(name, employeeId, basicSalary);
    }

    @Override
    double calculateSalary() {
        return basicSalary + 0.10 * basicSalary;
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Professor name: ");
        String name = sc.nextLine();
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        System.out.print("Enter Basic Salary: ");
        double salary = sc.nextDouble();

        Employee professor = new Professor(name, id, salary);

        sc.nextLine();
        System.out.print("\nEnter Lab Assistant name: ");
        name = sc.nextLine();
        System.out.print("Enter Employee ID: ");
        id = sc.nextInt();
        System.out.print("Enter Basic Salary: ");
        salary = sc.nextDouble();

        Employee labAssistant = new LabAssistant(name, id, salary);

        sc.nextLine();
        System.out.print("\nEnter Administrative Staff name: ");
        name = sc.nextLine();
        System.out.print("Enter Employee ID: ");
        id = sc.nextInt();
        System.out.print("Enter Basic Salary: ");
        salary = sc.nextDouble();

        Employee administrativeStaff = new AdministrativeStaff(name, id, salary);

        System.out.println("\nProfessor Details:");
        professor.display();

        System.out.println("\nLab Assistant Details:");
        labAssistant.display();

        System.out.println("\nAdministrative Staff Details:");
        administrativeStaff.display();

        sc.close();
    }
}