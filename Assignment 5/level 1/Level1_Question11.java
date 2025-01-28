import java.util.Scanner;

public class Level1_Question11 {

    public double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the temperature in Fahrenheit: ");
        double temperature = sc.nextDouble();

        System.out.print("Enter the wind speed in miles per hour: ");
        double windSpeed = sc.nextDouble();

        if (windSpeed < 3 || temperature > 50) {
            System.out.println("Wind chill calculation is valid only for wind speeds greater than 3 mph and temperature below 50°F.");
        } else {
            Level1_Question11 calculator = new Level1_Question11();
            double windChill = calculator.calculateWindChill(temperature, windSpeed);
            System.out.println("The wind chill temperature is: " + windChill);
        }

        sc.close();
    }
}
