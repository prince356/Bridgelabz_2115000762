
import java.util.*;

//patient class
class Patient {
    private String name;
    private List<Doctor> doctors;

    public Patient(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
    }

    public String getName() {
        return name;
    }


    public void consult(Doctor doctor) {
        doctors.add(doctor);
        doctor.consult(this); 
    }

    @Override
    public String toString() {
        return name;
    }
}

//hospital Class
class Hospital {
    private List<Doctor> doctors;
    private List<Patient> patients;

    public Hospital() {
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    
    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    
    public void displayDetails() {
        System.out.println("Doctors in the hospital:");
        for (Doctor doctor : doctors) {
            System.out.println(doctor.getName());
        }

        System.out.println("\nPatients in the hospital:");
        for (Patient patient : patients) {
            System.out.println(patient.getName());
        }
    }
}
// doctor class
class Doctor {
    private String name;
    private List<Patient> patients;

    public Doctor(String name) {
        this.name = name;
        this.patients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    
    public void consult(Patient patient) {
        patients.add(patient);
        System.out.println("Doctor " + name + " is consulting Patient " + patient.getName() + ".");
    }

    public List<Patient> getPatients() {
        return patients;
    }

    @Override
    public String toString() {
        return name;
    }
}


public class HospitalSystem {
    public static void main(String[] args) {
        
        Doctor doctor1 = new Doctor("Dr.Rupert");
        Doctor doctor2 = new Doctor("Dr.charlson");


        Patient patient1 = new Patient("John Doe");
        Patient patient2 = new Patient("Jane Doe");


        Hospital hospital = new Hospital();
        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);
        hospital.addPatient(patient1);
        hospital.addPatient(patient2);

        
        hospital.displayDetails();

        patient1.consult(doctor1);
        patient1.consult(doctor2);
        patient2.consult(doctor1);

        System.out.println("\nPatients consulted by " + doctor1.getName() + ":");
        for (Patient p : doctor1.getPatients()) {
            System.out.println(p.getName());
        }
    }
}