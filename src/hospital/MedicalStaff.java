package hospital;

public abstract class MedicalStaff {
    private String employeeId;
    private String department;
    private int workingHours;

    public MedicalStaff(String employeeId, String department, int workingHours) {
        this.employeeId = employeeId;
        this.department = department;
        this.workingHours = workingHours;
    }

}
