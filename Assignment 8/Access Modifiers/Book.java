class Book {
    public String ISBN;
    protected String title;
    private String author;

    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void displayBookDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

class EBook extends Book {
    private double fileSize;

    public EBook(String ISBN, String title, String author, double fileSize) {
        super(ISBN, title, author);
        this.fileSize = fileSize;
    }

    public void displayEBookDetails() {
        System.out.println("E-Book ISBN: " + ISBN);
        System.out.println("E-Book Title: " + title);
        System.out.println("File Size: " + fileSize + " MB");
    }

    public static void main(String[] args) {
        Book book1 = new Book("978-3-16-148410-0", "Java Programming", "John Doe");
        book1.displayBookDetails();

        System.out.println();

        EBook ebook1 = new EBook("978-1-23-456789-0", "Python Guide", "Jane Smith", 2.5);
        ebook1.displayEBookDetails();
    }
}
