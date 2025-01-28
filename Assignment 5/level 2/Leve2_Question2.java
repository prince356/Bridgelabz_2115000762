import java.util.Scanner;

public class Leve2_Question2 {

    public static int sumOfNaturalNumbersRecursive(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumOfNaturalNumbersRecursive(n - 1);
    }

    public static int sumOfNaturalNumbersFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive natural number.");
            return;
        }

        int sumRecursive = sumOfNaturalNumbersRecursive(n);
        int sumFormula = sumOfNaturalNumbersFormula(n);

        System.out.println("Sum using recursion: " + sumRecursive);
        System.out.println("Sum using formula: " + sumFormula);

        if (sumRecursive == sumFormula) {
            System.out.println("Both results are correct and match.");
        } else {
            System.out.println("There is a discrepancy between the results.");
        }

        scanner.close();
    }
}
