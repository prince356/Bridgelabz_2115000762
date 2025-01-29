import java.util.Scanner;

public class reverse_String {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String input = sc.nextLine();
        StringBuilder reversed = new StringBuilder();

        for(int i=input.length()-1;i>=0;i--){
            reversed.append(input.charAt(i));
        } 

        System.out.println(reversed);
        sc.close();
    }
    
}
