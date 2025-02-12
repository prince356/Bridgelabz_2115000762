class bookNode {
    String bookTitle;
    String author;
    String genre;
    int bookId;
    boolean AvailabiltyStatus;
    bookNode next, prev;

    public bookNode(String bookTitle, String author, String genre, int bookId, boolean AvailabiltyStatus) {
        this.AvailabiltyStatus = AvailabiltyStatus;
        this.bookId = bookId;
        this.author = author;
        this.genre = genre;
        this.bookTitle = bookTitle;
        this.next = null;
        this.prev = null;
    }
}

public class LibraryManagementSystem {

    bookNode head = null;
    bookNode tail = null;
    int length = 0;

    // insert the value in the start
    public void insertFromStarting(String bookTitle, String author, String genre, int bookId,
            boolean AvailabiltyStatus) {
        bookNode node = new bookNode(bookTitle, author, genre, bookId, AvailabiltyStatus);
        if (head == null) {
            tail = node;
            head = node;
        }
        node.next = head;
        head.prev = node;
        head = node;
        length++;
    }

    // insert the value in the last
    public void insertLast(String bookTitle, String author, String genre, int bookId, boolean AvailabiltyStatus) {
        bookNode node = new bookNode(bookTitle, author, genre, bookId, AvailabiltyStatus);
        if (tail == null) {
            tail = node;
            head = node;
        }
        tail.next = node;
        node.prev = tail;
        tail = node;
    }

    public void insertPostion(String bookTitle, String author, String genre, int bookId, boolean AvailabiltyStatus,
            int position) {
        bookNode node = new bookNode(bookTitle, author, genre, bookId, AvailabiltyStatus);
        if (position == 1) {
            insertFromStarting(bookTitle, author, genre, bookId, AvailabiltyStatus);
        }
        bookNode temp = head;
        int location = position - 1;
        while (location-- > 0) {
            temp = temp.next;
            if (temp == null) {
                insertLast(bookTitle, author, genre, bookId, AvailabiltyStatus);
            }
            node.next = temp;
            node.prev = temp.prev;
            temp.prev.next = node;
            temp.prev = node;
        }
    }

    // remove a book by its id
    public void deleteBook(int bookId) {
        bookNode temp = head;
        while (temp.next.bookId != bookId & temp.next != null) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        temp.next.next.prev = temp;
    }

    // search a book by its book title or author
    public void searchBookTitle(String title) {
        bookNode temp = head;
        while (temp.bookTitle != title) {
            temp = temp.next;
        }
        System.out.println("Book Id" + temp.bookId);
        System.out.println("Book Title :- " + temp.bookTitle);
        System.out.println("Book Author :- " + temp.author);
        System.out.println("Book Genre :- " + temp.genre);
        System.out.println("Availabilty Status :- " + temp.AvailabiltyStatus);
        System.out.println("=================================");
    }

    // SEARCH BOOK AUTHOR
    public void searchBookAuthor(String author) {
        bookNode temp = head;
        while (temp.author != author) {
            temp = temp.next;
        }
        System.out.println("Book Id" + temp.bookId);
        System.out.println("Book Title :- " + temp.bookTitle);
        System.out.println("Book Author :- " + temp.author);
        System.out.println("Book Genre :- " + temp.genre);
        System.out.println("Availabilty Status :- " + temp.AvailabiltyStatus);
        System.out.println("=================================");
    }

    // update the book availability status
    public void updateAvailabiltyStatus(boolean AvailabiltyStatus, int bookId) {
        bookNode temp = head;
        while (temp.bookId != bookId) {
            temp = temp.next;
        }
        temp.AvailabiltyStatus = AvailabiltyStatus;
    }

    // display in forward manner
    public void displayForward() {
        bookNode temp = head;
        while (temp != null) {
            System.out.println("Book Id:-" + temp.bookId);
            System.out.println("Book Title :- " + temp.bookTitle);
            System.out.println("Book Author :- " + temp.author);
            System.out.println("Book Genre :- " + temp.genre);
            System.out.println("Availabilty Status :- " + temp.AvailabiltyStatus);
            System.out.println("=================================");
            temp = temp.next;
        }
    }

    // display from reverse
    public void displayReverse(){
        bookNode temp = tail;
        while(temp!=head){
            System.out.println("Book Id:-" + temp.bookId);
            System.out.println("Book Title :- " + temp.bookTitle);
            System.out.println("Book Author :- " + temp.author);
            System.out.println("Book Genre :- " + temp.genre);
            System.out.println("Availabilty Status :- " + temp.AvailabiltyStatus);
            System.out.println("=================================");
            temp = temp.prev;
        }
    }

    public void countBooks(){
        bookNode temp = head;
        int count = 0;
        while(temp!=null){
            if(temp.AvailabiltyStatus == true)
            count += 1;
            temp= temp.next;
        }
        System.out.println("No. of Books in Library" + count);
    }


    public static void main(String[] args) {
        LibraryManagementSystem bookSystem = new LibraryManagementSystem();
        bookSystem.insertLast("Oliver Twist", "Charles", "Novel", 1001, true);
        bookSystem.insertLast("Berserk", "Kentaro miura", "Manga", 1002, true);
        bookSystem.insertLast("Uzumaki", "Junji Ito", "Manga", 1003, true);
        bookSystem.insertLast("Alchemist", "pablo", "Novel", 1004, true);
        bookSystem.updateAvailabiltyStatus(false, 1001);
        bookSystem.displayForward();
        bookSystem.displayReverse();
        bookSystem.countBooks();
    }
}
