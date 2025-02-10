abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;

    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public abstract int getLoanDuration();

    public void getItemDetails() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

class Book extends LibraryItem {
    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 14;
    }
}

class Magazine extends LibraryItem {
    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7;
    }
}

class DVD extends LibraryItem {
    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 5;
    }
}

interface Reservable {
    void reserveItem();
    boolean checkAvailability();
}

class ReservableBook extends Book implements Reservable {
    private boolean available;

    public ReservableBook(String itemId, String title, String author, boolean available) {
        super(itemId, title, author);
        this.available = available;
    }

    @Override
    public void reserveItem() {
        if (available) {
            available = false;
            System.out.println("Book reserved.");
        } else {
            System.out.println("Book is not available for reservation.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return available;
    }
}

public class LibraryManagementSystem {
    public static void manageLibraryItems(LibraryItem[] items) {
        for (LibraryItem item : items) {
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");
            System.out.println("------------------------------");
        }
    }

    public static void main(String[] args) {
        Book book = new Book("B001", "Java Programming", "John Doe");
        Magazine magazine = new Magazine("M001", "Tech World", "Jane Smith");
        DVD dvd = new DVD("D001", "The Matrix", "Wachowski Brothers");

        ReservableBook reservableBook = new ReservableBook("B002", "Design Patterns", "Erich Gamma", true);

        LibraryItem[] items = {book, magazine, dvd, reservableBook};
        manageLibraryItems(items);

        reservableBook.reserveItem();
        reservableBook.reserveItem();
    }
}
