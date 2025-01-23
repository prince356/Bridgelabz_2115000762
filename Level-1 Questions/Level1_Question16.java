import java.util.Scanner;

public class Level1_Question16 {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        if (number < 1) {
            System.out.println("Please enter a positive integer.");
            sc.close();
            return;
        }

        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is an even number.");
            } else {
                System.out.println(i + " is an odd number.");
            }
        }

        sc.close();
    }
    
}
