package _000_TutorialQuestions.Tutorial3;

import java.util.Scanner;

// Class representing a Car registration
class Car {
    private String modelName;
    private double price;

    public Car() {
        this.modelName = "Unknown/Not Specified";
        this.price = 0.0;
    }

    public Car(String modelName) {
        this.modelName = modelName;
        this.price = 0.0;
    }

    public Car(String modelName, double price) {
        this.modelName = modelName;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("\n--- Registered Car Details ---");
        System.out.println("Model Name: " + this.modelName);
        System.out.println("Price: $" + this.price);
        System.out.println("-----------------------------");
    }
}

public class CarShowroom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car registeredCar = null;

        System.out.println("=== Car Showroom Registration System ===");
        System.out.println("Select a registration method:");
        System.out.println("1. Register without entering details");
        System.out.println("2. Register by entering only the model name");
        System.out.println("3. Register by entering both model name and price");
        System.out.print("Enter choice (1-3): ");

        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                registeredCar = new Car();
                break;

            case 2:
                System.out.print("Enter Car Model Name: ");
                String model = scanner.nextLine();
                registeredCar = new Car(model);
                break;

            case 3:
                System.out.print("Enter Car Model Name: ");
                String modelWithPrice = scanner.nextLine();
                System.out.print("Enter Car Price: ");
                double price = scanner.nextDouble();
                registeredCar = new Car(modelWithPrice, price);
                break;

            default:
                System.out.println("Invalid choice selection!");
                break;
        }

        if (registeredCar != null) {
            registeredCar.displayDetails();
        }
    }
}
