/*
*Hospital Management System
Create a Patient class with the following features:
Static:
A static variable hospitalName shared among all patients.
A static method getTotalPatients() to count the total patients admitted.
This:
Use this to initialize name, age, and ailment in the constructor.
Final:
Use a final variable patientID to uniquely identify each patient.
Instanceof:
Check if an object is an instance of the Patient class before displaying its details.
*/

class Patient {
    // Static variable shared among all patients
    private static String hospitalName = "City General Hospital";
    private static int totalPatients = 0; // Counter for total patients admitted

    // Final variable to ensure unique patient ID
    private final int patientID;

    private String name;
    private int age;
    private String ailment;

    // Constructor
    public Patient(String name, int age, String ailment, int patientID) {
        this.name = name;         
        this.age = age;           
        this.ailment = ailment;   
        this.patientID = patientID;

        totalPatients++;          // Increment total patient count
    }

    // Static method to get total patients admitted
    public static int getTotalPatients() {
        return totalPatients;
    }

    // Static method to display the hospital name
    public static String getHospitalName() {
        return hospitalName;
    }

    // Method to display patient details
    public void displayPatientDetails() {
        if (this instanceof Patient) { // Check if the object is an instance of Patient
            System.out.println("Hospital Name: " + Patient.getHospitalName());
            System.out.println("Patient ID: " + patientID);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
        } else {
            System.out.println("Invalid patient object!");
        }
    }
}

public class HospitalManagementSystem{
    public static void main(String[] args) {
        // Display hospital name (static method)
        System.out.println("Welcome to " + Patient.getHospitalName());

        // Create patient objects
        Patient patient1 = new Patient("Alice", 30, "Fever", 101);
        Patient patient2 = new Patient("Bob", 45, "Diabetes", 102);

        // Display patient details
        System.out.println("\nPatient 1 Details:");
        patient1.displayPatientDetails();

        System.out.println("\nPatient 2 Details:");
        patient2.displayPatientDetails();

        // Display total patients admitted
        System.out.println("\nTotal Patients Admitted: " + Patient.getTotalPatients());
    }
}

