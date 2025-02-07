class Vehicle {
    private String model;
    private int maxSpeed;

    public Vehicle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    public String getModel() {
        return model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
}

interface Refuelable {
    void refuel();
}

class ElectricVehicle extends Vehicle {
    private int batteryCapacity;

    public ElectricVehicle(String model, int maxSpeed, int batteryCapacity) {
        super(model, maxSpeed);
        this.batteryCapacity = batteryCapacity;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void charge() {
        System.out.println("Charging the electric vehicle with battery capacity of " + batteryCapacity + " kWh.");
    }
}

class PetrolVehicle extends Vehicle implements Refuelable {
    private int fuelTankCapacity;

    public PetrolVehicle(String model, int maxSpeed, int fuelTankCapacity) {
        super(model, maxSpeed);
        this.fuelTankCapacity = fuelTankCapacity;
    }

    public int getFuelTankCapacity() {
        return fuelTankCapacity;
    }

    @Override
    public void refuel() {
        System.out.println("Refueling the petrol vehicle with tank capacity of " + fuelTankCapacity + " liters.");
    }
}

public class VehicleManagementSystem {
    public static void main(String[] args) {
        ElectricVehicle tesla = new ElectricVehicle("Tesla Model S", 200, 100);
        System.out.println("Vehicle Type: Electric Vehicle");
        System.out.println("Model: " + tesla.getModel());
        System.out.println("Max Speed: " + tesla.getMaxSpeed() + " km/h");
        System.out.println("Battery Capacity: " + tesla.getBatteryCapacity() + " kWh");
        tesla.charge();

        PetrolVehicle toyota = new PetrolVehicle("Toyota Corolla", 180, 50);
        System.out.println("\nVehicle Type: Petrol Vehicle");
        System.out.println("Model: " + toyota.getModel());
        System.out.println("Max Speed: " + toyota.getMaxSpeed() + " km/h");
        System.out.println("Fuel Tank Capacity: " + toyota.getFuelTankCapacity() + " liters");
        toyota.refuel();
    }
}
