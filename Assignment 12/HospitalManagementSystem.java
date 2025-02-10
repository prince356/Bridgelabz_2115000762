import java.util.ArrayList;
import java.util.List;

interface MedicalRecord {
    void addRecord(String record);
    String viewRecords();
}

abstract class Patient {
    int patientId;
    String name;
    int age;

    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    public abstract double calculateBill();

    public String getPatientDetails() {
        return "Patient ID: " + patientId + ", Name: " + name + ", Age: " + age;
    }
}

class InPatient extends Patient implements MedicalRecord {
    double roomCharges;
    int days;
    String diagnosis;
    private List<String> medicalHistory = new ArrayList<>();

    public InPatient(int patientId, String name, int age, double roomCharges, int days, String diagnosis) {
        super(patientId, name, age);
        this.roomCharges = roomCharges;
        this.days = days;
        this.diagnosis = diagnosis;
    }

    @Override
    public double calculateBill() {
        return roomCharges * days;
    }

    @Override
    public void addRecord(String record) {
        medicalHistory.add(record);
    }

    @Override
    public String viewRecords() {
        return String.join("\n", medicalHistory);
    }

    public String getDiagnosis() {
        return diagnosis;
    }
}

class OutPatient extends Patient implements MedicalRecord {
    double consultationFee;
    String diagnosis;
    private List<String> medicalHistory = new ArrayList<>();

    public OutPatient(int patientId, String name, int age, double consultationFee, String diagnosis) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
        this.diagnosis = diagnosis;
    }

    @Override
    public double calculateBill() {
        return consultationFee;
    }

    @Override
    public void addRecord(String record) {
        medicalHistory.add(record);
    }

    @Override
    public String viewRecords() {
        return String.join("\n", medicalHistory);
    }

    public String getDiagnosis() {
        return diagnosis;
    }
}

public class HospitalManagementSystem {
    public static void main(String[] args) {
        InPatient inPatient = new InPatient(1, "John Doe", 45, 500, 5, "Pneumonia");
        inPatient.addRecord("Blood test: Normal");
        inPatient.addRecord("X-ray: Clear");
        System.out.println(inPatient.getPatientDetails());
        System.out.println("Bill: " + inPatient.calculateBill());
        System.out.println("Medical Records:\n" + inPatient.viewRecords());
        System.out.println("Diagnosis: " + inPatient.getDiagnosis());

        OutPatient outPatient = new OutPatient(2, "Jane Smith", 30, 150, "Flu");
        outPatient.addRecord("Consultation: Fever");
        outPatient.addRecord("Prescription: Antiviral medication");
        System.out.println(outPatient.getPatientDetails());
        System.out.println("Bill: " + outPatient.calculateBill());
        System.out.println("Medical Records:\n" + outPatient.viewRecords());
        System.out.println("Diagnosis: " + outPatient.getDiagnosis());
    }
}
