import java.util.Scanner;

public class Level1_Question12 {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number (n): ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive natural number.");
            sc.close();
            return;
        }

        int sumUsingFormula = n * (n + 1) / 2;

        int sumUsingLoop = 0;
        int i = 1;
        while (i <= n) {
            sumUsingLoop += i;
            i++;
        }
        System.out.println("Sum using formula: " + sumUsingFormula);
        System.out.println("Sum using while loop: " + sumUsingLoop);

        sc.close();
    }
    
}
