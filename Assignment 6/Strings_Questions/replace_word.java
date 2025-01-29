import java.util.Scanner;

public class replace_word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the sentence:");
        String sentence = sc.nextLine();

  
        System.out.println("Enter the word to replace:");
        String oldWord = sc.next();

    
        System.out.println("Enter the replacement word:");
        String newWord = sc.next();

        String modifiedSentence = replaceWord(sentence, oldWord, newWord);

        System.out.println("Modified Sentence: " + modifiedSentence);
        sc.close();
    }

    public static String replaceWord(String sentence, String oldWord, String newWord) {
        return sentence.replaceAll("\\b" + oldWord + "\\b", newWord);
    }
}
