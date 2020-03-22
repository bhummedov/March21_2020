package March21_2020;

public class ITDepartmentClass extends DepartmentClass {
    protected String skillSet;

    public ITDepartmentClass(String skillSet,String employeeName, int employeeId, String position, double salary) {
        super(employeeName, employeeId, position, salary);
        this.skillSet = skillSet;
    }

    public void addSkills(String newSkills){
        this.skillSet=newSkills;
    }
    @Override
    public String toString() {
        return "ITDepartmentClass{" +
                "skillSet='" + skillSet + '\'' +
                ", employeeName='" + employeeName + '\'' +
                ", employeeId=" + employeeId +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
