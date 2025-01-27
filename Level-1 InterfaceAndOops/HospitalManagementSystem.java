import java.util.*;

abstract class Patient {
    private int patientId;
    private String name;
    private int age;

    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    public int getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId + ", Name: " + name + ", Age: " + age);
    }

    public abstract double calculateBill();
}

interface MedicalRecord {
    void addRecord(String record);
    List<String> viewRecords();
}

class InPatient extends Patient implements MedicalRecord {
    private static final double DAILY_RATE = 2000.0;
    private int daysAdmitted;
    private List<String> medicalRecords = new ArrayList<>();

    public InPatient(int patientId, String name, int age, int daysAdmitted) {
        super(patientId, name, age);
        this.daysAdmitted = daysAdmitted;
    }

    @Override
    public double calculateBill() {
        return daysAdmitted * DAILY_RATE;
    }

    @Override
    public void addRecord(String record) {
        medicalRecords.add(record);
    }

    @Override
    public List<String> viewRecords() {
        return medicalRecords;
    }
}

class OutPatient extends Patient implements MedicalRecord {
    private static final double CONSULTATION_FEE = 500.0;
    private List<String> medicalRecords = new ArrayList<>();

    public OutPatient(int patientId, String name, int age) {
        super(patientId, name, age);
    }

    @Override
    public double calculateBill() {
        return CONSULTATION_FEE;
    }

    @Override
    public void addRecord(String record) {
        medicalRecords.add(record);
    }

    @Override
    public List<String> viewRecords() {
        return medicalRecords;
    }
}

public class HospitalManagementSystem {
    public static void main(String[] args) {
        List<Patient> patients = new ArrayList<>();

        // Add InPatient and OutPatient
        InPatient inPatient = new InPatient(101, "John Doe", 45, 5);
        inPatient.addRecord("Admitted for surgery.");
        inPatient.addRecord("Discharged with medication.");

        OutPatient outPatient = new OutPatient(102, "Jane Smith", 30);
        outPatient.addRecord("Consultation for flu symptoms.");

        patients.add(inPatient);
        patients.add(outPatient);

        // Process and display patient details
        for (Patient patient : patients) {
            patient.getPatientDetails();
            System.out.println("Bill Amount: $" + patient.calculateBill());

            if (patient instanceof MedicalRecord) {
                MedicalRecord record = (MedicalRecord) patient;
                System.out.println("Medical Records: " + record.viewRecords());
            }
         }
    }
}
