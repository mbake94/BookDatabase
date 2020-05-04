import java.util.ArrayList;
import java.util.Scanner;

public class LibraryApp {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Library database = new Library();

        ArrayList<Book> bookArray = new ArrayList<>();


        for (Book book: database.getBooks()){
            System.out.printf("Title: %s\nAuthor: %s\nDescription: %s\nPrice: $%.2f", book.getTitle(), book.getAuthor(), book.getDescription(), book.getPrice());
            System.out.println("\n");
        }
    }
}
