import java.util.Scanner;

public class Level1_Question12 {

    public double[] calculateTrigonometricFunctions(double angle) {
        
        double radians = Math.toRadians(angle);
        

        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);

        return new double[] { sine, cosine, tangent };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an angle in degrees: ");
        double angle = sc.nextDouble();

        Level1_Question12 calculator = new Level1_Question12();
        double[] results = calculator.calculateTrigonometricFunctions(angle);

        System.out.println("Sine of the angle: " + results[0]);
        System.out.println("Cosine of the angle: " + results[1]);
        System.out.println("Tangent of the angle: " + results[2]);

        sc.close();
    }
}
