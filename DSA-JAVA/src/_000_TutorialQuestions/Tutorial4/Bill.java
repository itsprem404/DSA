package _000_TutorialQuestions.Tutorial4;

import java.util.Scanner;

class Product {
    int productId;
    String productName;
    double price;
    int quantity;

    public Product(int productId, String productName, double price, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }
    public void displayBillDetails() {
        double totalPrice = price * quantity;
        double discount = 0.0;
        if (totalPrice >= 5000) {
            discount = totalPrice * 0.10; // 10% discount
        } else {
            discount = totalPrice * 0.05; // 5% discount
        }

        double finalPrice = totalPrice - discount;

        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + productName);
        System.out.println("Total Price: " + (int)totalPrice);
        System.out.println("Discount: " + (int)discount);
        System.out.println("Final Price: " + (int)finalPrice);
        System.out.println("------------------------------------");
    }
}

public class Bill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Product[] products = new Product[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for Product " + (i + 1) + ":");

            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Price: ");
            double price = scanner.nextDouble();

            System.out.print("Quantity: ");
            int quantity = scanner.nextInt();
            System.out.println();

            products[i] = new Product(id, name, price, quantity);
        }
        System.out.println("============ BILL DETAILS ============");
        for (int i = 0; i < 5; i++) {
            products[i].displayBillDetails();
        }
    }
}
