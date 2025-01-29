import java.util.Scanner;

public class remove_Character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string:");
        String input = sc.nextLine();

        System.out.println("Enter the character to remove:");
        char charToRemove = sc.next().charAt(0);

        StringBuilder modifiedString = new StringBuilder();

        for (char ch : input.toCharArray()) {
            if (ch != charToRemove) {
                modifiedString.append(ch);
            }
        }

        System.out.println("Modified String: " + modifiedString);
        sc.close();
    }
}
