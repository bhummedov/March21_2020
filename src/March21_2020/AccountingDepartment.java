package March21_2020;

public class AccountingDepartment extends DepartmentClass {
    protected int yearsExperience;

    public AccountingDepartment(int yearsExperience, String employeeName, int employeeId, String position, double salary) {
        super(employeeName, employeeId, position, salary);
        this.yearsExperience = yearsExperience;

    }

    public int addYears(int year) {
        return this.yearsExperience += year;
    }
}