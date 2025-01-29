import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter temperature value:");
        double temp = sc.nextDouble();
        
        System.out.println("Choose conversion: 1. Fahrenheit to Celsius  2. Celsius to Fahrenheit");
        int choice = sc.nextInt();
        
        if (choice == 1) {
            double celsius = fahrenheitToCelsius(temp);
            System.out.println(temp + " Fahrenheit = " + celsius + " Celsius");
        } else if (choice == 2) {
            double fahrenheit = celsiusToFahrenheit(temp);
            System.out.println(temp + " Celsius = " + fahrenheit + " Fahrenheit");
        } else {
            System.out.println("Invalid choice");
        }
        
        sc.close();
    }
    
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
    
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }
}
