import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String word = getInput(sc);
        
        if (isPalindrome(word)) {
            System.out.println("It's a palindrome.");
        } else {
            System.out.println("It's not a palindrome.");
        }
        
        sc.close();
    }
    
    public static String getInput(Scanner sc) {
        System.out.println("Enter a word or phrase:");
        return sc.nextLine().replaceAll("\\s+", "").toLowerCase();
    }
    
    public static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }
}
