package hospital;

public class Pharmacist extends MedicalStaff {
    public Pharmacist(String employeeId, int workingHours) {
        super(employeeId, "Pharmacy", workingHours);
    }

    @Override
    public void performDuty() {
        System.out.println("Pharmacist prepares and dispenses medicine.");
    }
}
