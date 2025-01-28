import java.util.Scanner;

public class Level1_Question4 {
    public static double calculatePerimeter(double side1, double side2, double side3) {
        return side1 + side2 + side3;
    }

    public static int calculateRounds(double perimeter, double totalDistance) {
        return (int) Math.ceil(totalDistance / perimeter);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of side 1 (in meters): ");
        double side1 = sc.nextDouble();

        System.out.print("Enter the length of side 2 (in meters): ");
        double side2 = sc.nextDouble();

        System.out.print("Enter the length of side 3 (in meters): ");
        double side3 = sc.nextDouble();

        double perimeter = calculatePerimeter(side1, side2, side3);
        double totalDistance = 5000; 

        int rounds = calculateRounds(perimeter, totalDistance);

        System.out.println("The athlete needs to complete " + rounds + " rounds to cover 5 km.");

        sc.close();
    }
}
