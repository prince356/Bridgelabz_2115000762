//superclass is Device

class Device{
    protected int deviceId;
    protected String status;

    public Device(int deviceId , String status){
        this.deviceId = deviceId;
        this.status = status;
    }


    //display informaation about the device settings
    public void displayStatus(){
        System.out.println("The Status of Device with Id: " + deviceId + " is " + status );
    }
}

//subclass of Thermostat
class Thermostat extends Device{
    private int temperatureSetting;
    //constructor
    public Thermostat(int deviceId , String status , int temperatureSetting){
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    @Override
    public void displayStatus(){
        System.out.println("The Status of Device with Id: " + deviceId + " is " + status );
        System.out.println("temperature is Set at :- " + temperatureSetting);
    }
}


public class SmartHomeDevices {
    public static void main(String[] args) {
        Device device = new Thermostat(1011, "off", 29);
        device.displayStatus();
    }
}
