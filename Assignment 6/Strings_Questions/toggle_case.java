import java.util.Scanner;

public class toggle_case {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a string:");
        String input = sc.nextLine();
        
        StringBuilder toggledString = new StringBuilder();

        
        for (char ch : input.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                toggledString.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                toggledString.append(Character.toUpperCase(ch));
            } else {
                toggledString.append(ch); 
            }
        }

        System.out.println("Toggled case string: " + toggledString);
        sc.close();
    }    
}
