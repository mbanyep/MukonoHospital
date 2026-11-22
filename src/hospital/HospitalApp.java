package hospital;

public class HospitalApp {
    public static void main(String[] args) {
        MedicalStaff[] staffMembers = {
                new Doctor("D001", 40),
                new Nurse("N001", 36),
                new Pharmacist("P001", 40),
                new LaboratoryTechnician("L001", 38)
        };
    }
}
