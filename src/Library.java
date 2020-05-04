import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public Library(String sku, String title, String author, String description, double price){

    }

    public Library(){
       Book book1 = new Book("Java1001", "Head First Java",
               "Kathy Sierra and Bert Bates", "Easy to read Java workbook", 47.50);

       Book book2 = new Book("Java1002", "Thinking in Java", "Bruce Eckel",
               "Details about Java under the hood", 20.00);

       Book book3 = new Book("Orcl1003", "OCP: Oracle Certified Professional Java SE", "Jeanne Boyarsky",
               "Everything you need to know in one place", 45.00);

       Book book4 = new Book("Python1004", "Automate the Boring Stuff with Python", "Al Sweigart",
               "Fun with Python", 10.50);

       Book book5 = new Book("Zombie1005", "The Maker's Guide to the Zombie Apocalypse", "Simon Monk",
        "Defend Your Base with Simple Circuits, Arduino, and Raspberry Pi", 16.50);

       Book book6 = new Book("Rasp1006", "Raspberry Pi Projects for the Evil Genius", "Donald Norris",
               "A dozen fiendishly fun projects for the Raspberry Pi!", 14.75);

       ArrayList<Book> tempArray = new ArrayList<Book>();
       tempArray.add(book1);
       tempArray.add(book2);
       tempArray.add(book3);
       tempArray.add(book4);
       tempArray.add(book5);
       tempArray.add(book6);
       this.books = tempArray;
    }


}
