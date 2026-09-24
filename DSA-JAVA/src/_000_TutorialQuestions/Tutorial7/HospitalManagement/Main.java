package _000_TutorialQuestions.Tutorial7.HospitalManagement;



import _000_TutorialQuestions.Tutorial7.HospitalManagement.doctor.Doctor;
import _000_TutorialQuestions.Tutorial7.HospitalManagement.patient.Patient;

public class Main {
    public static void main(String[] args) {
        Doctor doctor1 = new Doctor(1, "Dr. Anitha", "Cardiologist", 800);
        Doctor doctor2 = new Doctor(2, "Dr. Ravi", "Dermatologist", 500);

        Patient patient1 = new Patient(101, "Arun", "Heart Problem", 45, doctor1);
        Patient patient2 = new Patient(102, "Meena", "Skin Allergy", 23, doctor2);
        Patient patient3 = new Patient(103, "Karthik", "Chest Pain", 50, doctor1);

        Patient[] patients = {patient1, patient2, patient3};
        Doctor[] doctors = {doctor1, doctor2};

        for (Patient patient : patients) {
            System.out.println("\n==============================");
            patient.displayPatient();
        }

        System.out.println("\n===== CONSULTATION FEE REPORT =====");

        for (Doctor doctor : doctors) {
            int patientCount = 0;

            for (Patient patient : patients) {
                if (patient.getAssignedDoctor().getDoctorId() == doctor.getDoctorId()) {
                    patientCount++;
                }
            }

            double totalFee = patientCount * doctor.getConsultationFee();

            System.out.println("\nDoctor: " + doctor.getName());
            System.out.println("Patients Assigned: " + patientCount);
            System.out.println("Total Fee Collected: Rs." + totalFee);
        }
    }
}