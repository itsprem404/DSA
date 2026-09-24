package _000_TutorialQuestions.Tutorial7.HospitalManagement.patient;


import _000_TutorialQuestions.Tutorial7.HospitalManagement.doctor.Doctor;

public class Patient {
    private int patientId;
    private String name;
    private String disease;
    private int age;
    private Doctor assignedDoctor;

    public Patient(int patientId, String name, String disease, int age, Doctor assignedDoctor) {
        this.patientId = patientId;
        this.name = name;
        this.disease = disease;
        this.age = age;
        this.assignedDoctor = assignedDoctor;
    }

    public Doctor getAssignedDoctor() {
        return assignedDoctor;
    }

    public void displayPatient() {
        System.out.println("Patient ID : " + patientId);
        System.out.println("Name       : " + name);
        System.out.println("Disease    : " + disease);
        System.out.println("Age        : " + age);

        System.out.println("\nTreating Doctor:");
        assignedDoctor.displayDoctor();
    }
}