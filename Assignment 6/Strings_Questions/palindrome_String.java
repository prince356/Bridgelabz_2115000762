import java.util.Scanner;

public class palindrome_String {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String input = sc.nextLine().toLowerCase();

        int length = input.length();
        boolean isPalindrome = true;  

        for (int i = 0; i < length / 2; i++) {
            if (input.charAt(i) != input.charAt(length - i - 1)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(input + " is a palindrome");
        } else {
            System.out.println(input + " is not a palindrome");
        }

        sc.close();
    }
}
