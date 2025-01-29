import java.util.Scanner;

public class substring_Occuence {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the main string:");
        String mainString = sc.nextLine();
        
        System.out.println("Enter the substring to find:");
        String subString = sc.nextLine();
        
        int count = 0;
        int index = 0;

        while ((index = mainString.indexOf(subString, index)) != -1) {
            count++;
            index += subString.length();
        }

        System.out.println("Occurrences of \"" + subString + "\": " + count);
        sc.close();
    }
}
