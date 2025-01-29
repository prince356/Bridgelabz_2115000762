import java.util.LinkedHashSet;
import java.util.Scanner;

public class remove_duplicates {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        String result = removeDuplicateCharacters(input);
        System.out.println("Modified string: " + result);
        
        scanner.close();
    }

    public static String removeDuplicateCharacters(String str) {
        LinkedHashSet<Character> uniqueChars = new LinkedHashSet<>();
        StringBuilder result = new StringBuilder();
        
        for (char ch : str.toCharArray()) {
            if (uniqueChars.add(ch)) {
                result.append(ch);
            }
        }
        
        return result.toString();
    }
    
}
