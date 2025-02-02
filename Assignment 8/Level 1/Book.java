public class Book {
    String title;
    String author;
    double price;

    public Book() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
}