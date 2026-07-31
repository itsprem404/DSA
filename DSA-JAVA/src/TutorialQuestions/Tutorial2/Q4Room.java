package TutorialQuestions.Tutorial2;
/* 4. An interior designer wants to estimate the floor area of a rectangular room before placing
furniture. The application should store the length and breadth of the room and calculate its
area. */
import java.util.Scanner;

class Rectangle {
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void calculateAndDisplay() {
        double area = this.length * this.breadth;
        System.out.println("Room Dimensions: " + this.length + " x " + this.breadth);
        System.out.println("Calculated Floor Area: " + area + " square units");
    }
}

// Main class name matches the required file name
public class Q4Room {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter room length: ");
        double inputLength = input.nextDouble();

        System.out.print("Enter room breadth: ");
        double inputBreadth = input.nextDouble();

        // Create the room object with the designer's inputs
        Rectangle room = new Rectangle(inputLength, inputBreadth);

        System.out.println("\n--- Estimation Result ---");
        room.calculateAndDisplay();
    }
}
