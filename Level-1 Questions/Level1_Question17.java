import java.util.Scanner;

public class Level1_Question17 {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

        System.out.print("Enter the employee's salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter the years of service: ");
        int yearsOfService = sc.nextInt();

        double bonus = 0.0;

        if (yearsOfService > 5) {
            bonus = salary * 0.05; 
        }

        System.out.println("The bonus amount is: " + bonus);

        sc.close();
    }
    
}
