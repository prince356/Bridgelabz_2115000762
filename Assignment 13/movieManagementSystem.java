class Node{
    String movieTitle;
    String director;
    int yearOfRelease;  
    double rating;
    Node prev;
    Node next;

    public Node(String movieTitle , String director, int yearOfRelease , double rating){
        this.movieTitle = movieTitle;
        this.director = director;
        this.yearOfRelease = yearOfRelease;
        this.rating = rating;
    }
}

public class movieManagementSystem {
    Node head = null;
    Node tail = null;
    int length = 0;

    public void insertFromStarting(String movieTitle , String director , int yearOfRelease , double rating ){
        Node node = new Node(movieTitle, director, yearOfRelease, rating);
        if(head == null){
            tail = node;
            head = node;
        }
        
        node.next = head;
        head.prev = node;
        head = node;
        length++;
    }

    public void insertFromLast(String movieTitle , String director , int yearOfRelease , double rating ){
        Node node = new Node(movieTitle, director, yearOfRelease, rating);
        if(tail == null){
            tail = node;
            head = node;
        }
        tail.next = node;
        node.prev = tail;
        tail = node;
    }

    public void insertPostion(String movieTitle , String director , int yearOfRelease , double rating , int position ){

        Node node = new Node(movieTitle, director, yearOfRelease, rating);
        if (position == 1) {
            insertFromStarting(movieTitle, director, yearOfRelease, rating);
        }
        
        Node temp = head;
        int location = position-1;
        while (location-- > 0) {
            temp = temp.next;
            if(temp==null){
                insertFromLast(movieTitle, director, yearOfRelease, rating);
            }
        }
        node.next = temp;
        node.prev = temp.prev;
        temp.prev.next = node;
        temp.prev = node;
    }

    public void displayAllFront(){
        Node temp = head;
        while (temp!=null) {
            System.out.println("Movie Title :- " + temp.movieTitle);
            System.out.println("Movie Director :- " + temp.director);
            System.out.println("Year of Release :- " + temp.yearOfRelease);
            System.out.println("Rating :- " + temp.rating);
            System.out.println("--");
            temp = temp.next;
        }
    }

    public void displayAllReverse(){
        Node temp = tail;
        while (temp!=head) {
            System.out.println("Movie Title :- " + temp.movieTitle);
            System.out.println("Movie Director :- " + temp.director);
            System.out.println("Year of Release :- " + temp.yearOfRelease);
            System.out.println("Rating :- " + temp.rating);
            System.out.println("--");
            temp = temp.prev;
        }
    }

    public void updatemovieRating(double rating  , String title){
        Node temp = head;
        while (temp.movieTitle != title) {
            temp = temp.next;
        }
        temp.rating = rating;
    }

    
    public void deleteMovieTitle(String movieTitle){
        Node temp = head;
        while (temp.next.movieTitle != movieTitle && temp.next!=null) {            
            temp = temp.next;
        }
        temp.next = temp.next.next;
        temp.next.next.prev = temp;
    }

    public void searchMovie(String Director){
        Node temp = head;
        while(temp.director != Director){
            temp = temp.next;
        }
        System.out.println("Movie Title :- " + temp.movieTitle);
            System.out.println("Movie Director :- " + temp.director);
            System.out.println("Year of Release :- " + temp.yearOfRelease);
            System.out.println("Rating :- " + temp.rating);
            System.out.println("--");

    }
    public void searchMovieRating(double rating){
        Node temp = head;
        while(temp.rating != rating){
            temp = temp.next;
        }
        System.out.println("Movie Title :- " + temp.movieTitle);
            System.out.println("Movie Director :- " + temp.director);
            System.out.println("Year of Release :- " + temp.yearOfRelease);
            System.out.println("Rating :- " + temp.rating);
            System.out.println("--");
    }

    public static void main(String[] args) {
        movieManagementSystem movie = new movieManagementSystem();
        movie.insertFromLast("The Shawshank Redemption", "Frank", 1994, 9.3);
        movie.insertFromLast("The godfather", "Fransis ford", 1972, 9.2);
        movie.insertFromLast("Schindler's List", "Steven Spilberg", 1993, 9.0);
        movie.insertPostion("Fight Club", "Paul", 1995, 8.9, 3);
        movie.deleteMovieTitle("The godfather");  //delete a movie
        movie.searchMovie("Paul");      //search movie based on director or rating
        movie.displayAllFront();                     // display all movies from front
        movie.displayAllReverse();              // display all movies from back or reverse
    }
}
