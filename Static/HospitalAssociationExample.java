import java.util.ArrayList;
import java.util.List;

// Patient class
class Patient {
    private String name;
    public Patient(String name) { this.name = name; }
    public String getName() { return name; }
}

// Doctor class
class Doctor {
    private String name;
    private List<Patient> patients;

    public Doctor(String name) {
        this.name = name;
        this.patients = new ArrayList<>();
    }

    public void consult(Patient p) {
        patients.add(p);
        System.out.println("Doctor " + name + " consulted patient " + p.getName());
    }
}

// Hospital class
class Hospital {
    private String hospitalName;
    private List<Doctor> doctors;
    private List<Patient> patients;

    public Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    public void addDoctor(Doctor d) { doctors.add(d); }
    public void addPatient(Patient p) { patients.add(p); }
}

public class HospitalAssociationExample {
    public static void main(String[] args) {
        Hospital h = new Hospital("City Hospital");

        Doctor d1 = new Doctor("Dr. Arjun");
        Doctor d2 = new Doctor("Dr. Priya");

        Patient p1 = new Patient("Ravi");
        Patient p2 = new Patient("Sneha");

        h.addDoctor(d1);
        h.addDoctor(d2);
        h.addPatient(p1);
        h.addPatient(p2);

        d1.consult(p1);
        d2.consult(p1);
        d2.consult(p2);
    }
}