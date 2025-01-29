import java.util.Scanner;

public class FactorialRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num = getInput(sc);
        
        long fact = findFactorial(num);
        
        System.out.println("Factorial: " + fact);
        
        sc.close();
    }
    
    public static int getInput(Scanner sc) {
        System.out.println("Enter a number:");
        return sc.nextInt();
    }
    
    public static long findFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * findFactorial(n - 1);
    }
}
