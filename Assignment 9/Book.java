public class Book{
    static String libraryName = "The Library Of Congress";
    private String title;
    private String author;
    private final int isbn;

    public Book(String title, String author , int isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public static void displayLibraryName(){
        System.out.println("The name of Library is: "+ libraryName);
    }


    public void displayDetails(){
        if(this instanceof Book){
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        }
    }

    public static void main(String[] args) {
        Book book = new Book("Pride and Prejudice" , "Jane Austen" , 451537866);
        book.displayDetails();
        Book.displayLibraryName();
    }
}