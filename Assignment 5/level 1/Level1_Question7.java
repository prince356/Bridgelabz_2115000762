import java.util.Scanner;

public class Level1_Question7 {

    public static int calculateSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();

        if (n < 1) {
            System.out.println("Please enter a positive integer greater than or equal to 1.");
        } else {
            int result = calculateSum(n);
            System.out.println("The sum of the first " + n + " natural numbers is: " + result);
        }

        sc.close();
    }
}
