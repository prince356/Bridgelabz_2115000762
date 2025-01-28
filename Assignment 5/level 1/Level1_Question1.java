import java.util.Scanner;

public class Level1_Question1 {
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Principal amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter the Rate of Interest: ");
        double rate = sc.nextDouble();

        System.out.print("Enter the Time (in years): ");
        double time = sc.nextDouble();

        double simpleInterest = calculateSimpleInterest(principal, rate, time);

        System.out.printf("The Simple Interest is %.2f for Principal %.2f, Rate of Interest %.2f, and Time %.2f.%n",
                simpleInterest, principal, rate, time);

        sc.close();
    }
}
