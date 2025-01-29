import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class most_Frequent_Character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = sc.nextLine();

        Map<Character, Integer> charCountMap = new HashMap<>();
        char mostFrequentChar = '\0'; 
        int maxCount = 0; 

        for (char ch : input.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);

            if (charCountMap.get(ch) > maxCount) {
                maxCount = charCountMap.get(ch);
                mostFrequentChar = ch;
            }
        }

        System.out.println("Most Frequent Character: '" + mostFrequentChar + "'");
        sc.close();
    }
}
