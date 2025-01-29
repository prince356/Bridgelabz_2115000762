
import java.util.Scanner;

public class longest_word {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a Sentence");
    String sentence = sc.nextLine();

    String [] words = sentence.split("\\s+");
    String longestWord = "";

    for(String word:words){
        if(word.length()>longestWord.length()){
            longestWord=word;
        }
    }

    System.out.println("The longest word in sentence is : " + longestWord);
    sc.close();
    }
}
