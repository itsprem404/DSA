package _000_TutorialQuestions.Tutorial6;

import java.util.Scanner;

class Vehicle {
    String vehicleNumber;
    String brand;
    int speed;

    void displayDetails() {
        System.out.println(vehicleNumber);
        System.out.println(brand);
        System.out.println(speed);
    }
}

class Car extends Vehicle {
    int numberOfDoors;

    void displayDetails() {
        System.out.println("Car");
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}

class Bike extends Vehicle {
    boolean hasGear;

    void displayDetails() {
        System.out.println("Bike");
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
        System.out.println("Has Gear: " + hasGear);
    }
}

public class VehicleRental {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Car car = new Car();

        System.out.print("Enter car number: ");
        car.vehicleNumber = sc.nextLine();

        System.out.print("Enter car brand: ");
        car.brand = sc.nextLine();

        System.out.print("Enter car speed: ");
        car.speed = sc.nextInt();

        System.out.print("Enter number of doors: ");
        car.numberOfDoors = sc.nextInt();

        Bike bike = new Bike();

        sc.nextLine();

        System.out.print("Enter bike number: ");
        bike.vehicleNumber = sc.nextLine();

        System.out.print("Enter bike brand: ");
        bike.brand = sc.nextLine();

        System.out.print("Enter bike speed: ");
        bike.speed = sc.nextInt();

        System.out.print("Does bike have gear? (true/false): ");
        bike.hasGear = sc.nextBoolean();

        Vehicle v;

        v = car;
        v.displayDetails();

        v = bike;
        v.displayDetails();

        sc.close();
    }
}