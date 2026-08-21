package _000_TutorialQuestions.Assesment;
import java.util.Scanner;

class Book {
    int bookId;
    String bookName;
    String studentName;
    int daysLate;

    public Book(int bookId, String bookName, String studentName, int daysLate) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.studentName = studentName;
        this.daysLate = daysLate;
    }

    public double calculateFine() {
        int fine = 0;
        if (daysLate <= 5) {
            fine = 0;
        } else if (daysLate <= 10) {
            fine = (daysLate - 5) * 2;
        } else if (daysLate <= 20) {
            fine = (5 * 2) + (daysLate - 10) * 5;
        } else {
            fine = (5 * 2) + (10 * 5) + (daysLate - 20) * 10;
        }
        return fine;
    }
    
public class LibraryManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bookId = sc.nextInt();
        String bookName = sc.next();
        String studentName = sc.next();
        int daysLate = sc.nextInt();

        Book book = new Book(bookId, bookName, studentName, daysLate);
        System.out.println("Fine: " + book.calculateFine() + " Rs");
    }
}



