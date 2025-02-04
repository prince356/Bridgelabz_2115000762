public class Patient {

    static String hospitalName = "City Hospital";

    private String name;
    private int age;
    private String ailment;
    private final int patientID;

    static int total = 0;

    public Patient(int patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        total++;
    }

    public static void getTotalPatients() {
        System.out.println("Total patients: " + total);
    }

    public void displayDetails() {
        if (this instanceof Patient) {
            System.out.println("Hospital Name: " + hospitalName);
            System.out.println("Patient Name: " + this.name);
            System.out.println("Age: " + this.age);
            System.out.println("Ailment: " + this.ailment);
        }
    }

    public static void main(String[] args) {
        Patient vh = new Patient(101 , "Akash" , 23 , "Fever");
        Patient vh1 = new Patient(102 , "Shivam" , 20 , "Cold");
        vh.displayDetails();
        vh1.displayDetails();
        Patient.getTotalPatients();
    }
}
