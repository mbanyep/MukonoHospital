package hospital;

public class Nurse extends MedicalStaff {
    public Nurse(String employeeId, int workingHours) {
        super(employeeId, "Nursing", workingHours);
    }

    @Override
    public void performDuty() {
        System.out.println("Nurse cares for patients and monitors their health.");
    }
}
