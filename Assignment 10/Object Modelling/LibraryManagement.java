import java.util.*;
//defining the book class
class Book{
    private String title;
    private String author;

    public Book(String title ,String author){
        this.title = title;
        this.author = author;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }
}

class Library {
    private String name;
    private List<Book> books;

    public Library(String name){
        this.name = name;
        books = new ArrayList<>();
    }

    public void addBooks(Book book){
        books.add(book);
    }

    public void displayBooks() {
        System.out.println("Books in " + name + " are: ");
        int serial_number =1;
        for (Book book : books) {
            System.out.print(serial_number+".");
            System.out.println("  Title: " + book.getTitle());
            System.out.println("    Author name: " + book.getAuthor());
            serial_number++;
        }
    }
}

public class LibraryManagement{
    public static void main(String[] args) {
        Book book1 = new Book("Oliver Twist", "James Dickens");
        Book book2 = new Book("Web Development", "Tim Berners-Lee");
        Book book3 = new Book("Nothing Last forever" , "Sydney Sheldon");
        Book book4 = new Book("Algorithms", "Robert Sedgewick");

        Library library1 = new Library("Main Library");
        Library library2 = new Library("council Library");
        library1.addBooks(book1);
        library1.addBooks(book2);
        library2.addBooks(book3);
        library2.addBooks(book4);

        library1.displayBooks();
        library2.displayBooks();
    }
}