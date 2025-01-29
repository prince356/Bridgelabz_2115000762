import java.util.Scanner;

public class MaxOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = getInput(sc, "Enter first number: ");
        int b = getInput(sc, "Enter second number: ");
        int c = getInput(sc, "Enter third number: ");
        
        int max = findMax(a, b, c);
        
        System.out.println("Maximum number: " + max);
        sc.close();
    }
    
    public static int getInput(Scanner sc, String msg) {
        System.out.println(msg);
        return sc.nextInt();
    }
    
    public static int findMax(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }
}
