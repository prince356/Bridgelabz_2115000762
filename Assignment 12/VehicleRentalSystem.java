abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(double rentalRate) {
        this.rentalRate = rentalRate;
    }

    public abstract double calculateRentalCost(int days);
}

class Car extends Vehicle implements Insurable {
    public Car(String vehicleNumber, String type, double rentalRate) {
        super(vehicleNumber, type, rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.05;
    }

    @Override
    public String getInsuranceDetails() {
        return "Car insurance: 5% of rental rate";
    }
}

class Bike extends Vehicle implements Insurable {
    public Bike(String vehicleNumber, String type, double rentalRate) {
        super(vehicleNumber, type, rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.03;
    }

    @Override
    public String getInsuranceDetails() {
        return "Bike insurance: 3% of rental rate";
    }
}

class Truck extends Vehicle implements Insurable {
    public Truck(String vehicleNumber, String type, double rentalRate) {
        super(vehicleNumber, type, rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.07;
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck insurance: 7% of rental rate";
    }
}

interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

public class VehicleRentalSystem {
    public static void calculateAndPrintCost(Vehicle[] vehicles, int days) {
        for (Vehicle vehicle : vehicles) {
            double rentalCost = vehicle.calculateRentalCost(days);
            double insuranceCost = 0;
            String insuranceDetails = "No insurance applicable";

            if (vehicle instanceof Insurable) {
                Insurable insurableVehicle = (Insurable) vehicle;
                insuranceCost = insurableVehicle.calculateInsurance();
                insuranceDetails = insurableVehicle.getInsuranceDetails();
            }

            double totalCost = rentalCost + insuranceCost;
            System.out.println("Vehicle: " + vehicle.getType());
            System.out.println("Rental Cost for " + days + " days: $" + rentalCost);
            System.out.println("Insurance: $" + insuranceCost);
            System.out.println(insuranceDetails);
            System.out.println("Total Cost: $" + totalCost);
            System.out.println("------------------------------");
        }
    }

    public static void main(String[] args) {
        Car car = new Car("CAR123", "Car", 50);
        Bike bike = new Bike("BIKE123", "Bike", 20);
        Truck truck = new Truck("TRUCK123", "Truck", 100);

        Vehicle[] vehicles = {car, bike, truck};
        calculateAndPrintCost(vehicles, 5);
    }
}
