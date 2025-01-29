import java.util.Scanner;

public class compare_Lexiographical {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter first string:");
        String str1 = sc.nextLine();
        
        System.out.println("Enter second string:");
        String str2 = sc.nextLine();

        int minLength = Math.min(str1.length(), str2.length());
        boolean areEqual = true;

        for (int i = 0; i < minLength; i++) {
            if (str1.charAt(i) < str2.charAt(i)) {
                System.out.println("\"" + str1 + "\" comes before \"" + str2 + "\" in lexicographical order.");
                areEqual = false;
                break;
            } else if (str1.charAt(i) > str2.charAt(i)) {
                System.out.println("\"" + str1 + "\" comes after \"" + str2 + "\" in lexicographical order.");
                areEqual = false;
                break;
            }
        }

        if (areEqual) {
            if (str1.length() < str2.length()) {
                System.out.println("\"" + str1 + "\" comes before \"" + str2 + "\" in lexicographical order.");
            } else if (str1.length() > str2.length()) {
                System.out.println("\"" + str1 + "\" comes after \"" + str2 + "\" in lexicographical order.");
            } else {
                System.out.println("Both strings are equal.");
            }
        }

        sc.close();
    }
}
