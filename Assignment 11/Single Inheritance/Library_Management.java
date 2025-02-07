//superclass Book
class Book{
    protected String title;
    protected int publicationYear;


    public Book(String title , int publicationYear){
        this.publicationYear = publicationYear;
        this.title = title;
    }

    public void displayInfo(){
        System.out.println("Title:- " + title);
        System.out.println("Publication Year:- " + publicationYear);
    }
}

class Author extends Book{
    private String name;
    private String Bio;


    public Author(String name , String  Bio , String title , int publicationYear){
        super(title, publicationYear);
        this.name = name;
        this.Bio  = Bio;
    }

    @Override
    public void displayInfo(){
        System.out.println("Name:- " + name);
        System.out.println("Bio:- " + Bio);
        super.displayInfo();
    }
    
}

public class Library_Management {
    public static void main(String[] args) {
        Book book = new Author("Sydney Sheldon", "Hello I like to Write Books", "Nothing Last forever", 2016);
        book.displayInfo();
    }
}
