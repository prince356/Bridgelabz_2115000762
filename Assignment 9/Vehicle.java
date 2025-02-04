
public class Vehicle{

    static double registrationFee = 200.0;

    private String ownerName;
    private String vehicleType;
    private final int registrationNumber;


    public Vehicle(String ownerName, String vehicleType, int registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
        
    }

    public static void updateRegistrationFee(double newRegistrationFee) {
        registrationFee = newRegistrationFee;
        System.out.println("Updated Registratin fee: " + registrationFee);
    }

    public void displayDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Registration Fee: " + registrationFee);
        }
    }

    public static void main(String[] args) {
        Vehicle vh = new Vehicle("Krishna", "Bike", 2000345);
        vh.displayDetails();
        Vehicle.updateRegistrationFee(505.2);
        
    }
}
