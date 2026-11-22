package hospital;

public class Doctor extends MedicalStaff {
    public Doctor(String employeeId, int workingHours) {
        super(employeeId, "Medical", workingHours);
    }

    @Override
    public void performDuty() {
        System.out.println("Doctor diagnoses and treats patients.");
    }
}
