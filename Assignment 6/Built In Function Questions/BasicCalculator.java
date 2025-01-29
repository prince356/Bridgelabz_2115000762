import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter first number:");
        double num1 = sc.nextDouble();
        
        System.out.println("Enter second number:");
        double num2 = sc.nextDouble();
        
        System.out.println("Choose operation: 1. Add  2. Subtract  3. Multiply  4. Divide");
        int choice = sc.nextInt();
        
        if (choice == 1) {
            double result = add(num1, num2);
            System.out.println("Result: " + result);
        } else if (choice == 2) {
            double result = subtract(num1, num2);
            System.out.println("Result: " + result);
        } else if (choice == 3) {
            double result = multiply(num1, num2);
            System.out.println("Result: " + result);
        } else if (choice == 4) {
            if (num2 != 0) {
                double result = divide(num1, num2);
                System.out.println("Result: " + result);
            } else {
                System.out.println("Error: Division by zero");
            }
        } else {
            System.out.println("Invalid choice");
        }
        
        sc.close();
    }
    
    public static double add(double a, double b) {
        return a + b;
    }
    
    public static double subtract(double a, double b) {
        return a - b;
    }
    
    public static double multiply(double a, double b) {
        return a * b;
    }
    
    public static double divide(double a, double b) {
        return a / b;
    }
}
