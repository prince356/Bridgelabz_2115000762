class Vehicle{
    protected int maxSpeed;
    protected String feulType;

    public Vehicle(int maxSpeed , String feulType){
        this.feulType = feulType;
        this.maxSpeed = maxSpeed;
    }

    public void displayInfo(){
        System.out.println("Max Speed :- " + maxSpeed);
        System.out.println("Fuel Type:- " + feulType);
    }
}

//subclasses fir car
class car extends Vehicle{
    private int seatCapacity;
    public car(int maxSpeed , String feulType , int seatCapacity){
        super(maxSpeed, feulType);
        this.seatCapacity = seatCapacity;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Seat Capacity:- " + seatCapacity);
    }
}

//subclass for Truck
class Truck extends Vehicle{
    private int loadCapacity;

    public Truck(int maxSpeed , String feulType , int loadCapacity){
        super(maxSpeed, feulType);
        this.loadCapacity = loadCapacity;
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Load Capacity:- " +loadCapacity);
    }
}

//subclass for MotorCycle
class Motorcycle extends Vehicle{
    private boolean sidecar;

    public Motorcycle(int maxSpeed , String feulType , boolean sidecar){
        super(maxSpeed, feulType);
        this.sidecar = sidecar;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();;
        System.out.println("Sidecar: " + sidecar);
    }
}

public class Vehicle_transport_System {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
            new car(120, "Diesel", 4),
            new Truck(150, "Petrol", 12),
            new Motorcycle(180, "Petrol", false)
        };

        for (Vehicle vehicle : vehicles) {
            
            vehicle.displayInfo();
            System.out.println();
        }
    }   
}
