import java.util.Scanner;

class TravelComputation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the traveler's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter the starting city (from city): ");
        String fromCity = scanner.nextLine();

        System.out.print("Enter the via city: ");
        String viaCity = scanner.nextLine();

        System.out.print("Enter the destination city (to city): ");
        String toCity = scanner.nextLine();

        System.out.print("Enter the distance from " + fromCity + " to " + viaCity + " in miles: ");
        double distanceFromToVia = scanner.nextDouble();

        System.out.print("Enter the distance from " + viaCity + " to " + toCity + " in miles: ");
        double distanceViaToFinalCity = scanner.nextDouble();

        System.out.print("Enter the time taken from " + fromCity + " to " + viaCity + " (hours minutes): ");
        int hoursFromToVia = scanner.nextInt();
        int minutesFromToVia = scanner.nextInt();
        
        System.out.print("Enter the time taken from " + viaCity + " to " + toCity + " (hours minutes): ");
        int hoursViaToFinalCity = scanner.nextInt();
        int minutesViaToFinalCity = scanner.nextInt();

        int timeFromToVia = (hoursFromToVia * 60) + minutesFromToVia;
        int timeViaToFinalCity = (hoursViaToFinalCity * 60) + minutesViaToFinalCity;

        double totalDistance = distanceFromToVia + distanceViaToFinalCity;
        int totalTime = timeFromToVia + timeViaToFinalCity;
        System.out.println("\nTravel details for " + name + ":");
        System.out.println("From: " + fromCity);
        System.out.println("Via: " + viaCity);
        System.out.println("To: " + toCity);
        System.out.println("Total Distance: " + totalDistance + " miles");
        System.out.println("Total Time: " + totalTime / 60 + " hours and " + totalTime % 60 + " minutes");
        
        scanner.close();
    }
}