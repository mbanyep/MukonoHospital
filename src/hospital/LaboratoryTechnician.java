package hospital;

public class LaboratoryTechnician extends MedicalStaff {
    public LaboratoryTechnician(String employeeId, int workingHours) {
        super(employeeId, "Laboratory", workingHours);
    }

    @Override
    public void performDuty() {
        System.out.println("Laboratory technician performs medical tests.");
    }
}
