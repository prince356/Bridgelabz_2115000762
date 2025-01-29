import java.util.Scanner;

public class GCD_LCMCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter two numbers:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        
        int gcd = findGCD(num1, num2);
        int lcm = findLCM(num1, num2, gcd);
        
        System.out.println("GCD: " + gcd);
        System.out.println("LCM: " + lcm);
        
        sc.close();
    }
    
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    public static int findLCM(int a, int b, int gcd) {
        return (a * b) / gcd;
    }
}
