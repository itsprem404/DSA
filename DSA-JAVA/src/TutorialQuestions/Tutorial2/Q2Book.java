package TutorialQuestions.Tutorial2;

public class Q2Book {
    // Fields to store the title, author, and price
    private String title;
    private String author;
    private double price;

    // Constructor to initialize fields and display details
    public Q2Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;

        displayDetails();
    }

    // Method to display the book details
    public void displayDetails() {
        System.out.println("--- New Book Added ---");
        System.out.println("Title:  " + this.title);
        System.out.println("Author: " + this.author);
        System.out.printf("Price:  $%.2f%n%n", this.price);
    }

    public static void main(String[] args) {
        Q2Book book1 = new Q2Book("The Great Gatsby", "F. Scott Fitzgerald", 10.99);
        Q2Book book2 = new Q2Book("To Kill a Mockingbird", "Harper Lee", 14.50);
    }
}
