package March21_2020;

public class DepartmentClass {
    protected String employeeName;
    protected int employeeId;
    protected String position;
    protected double salary;

    public DepartmentClass(String employeeName, int employeeId, String position, double salary) {
        this.employeeName = employeeName;
        this.employeeId = employeeId;
        this.position = position;
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "DepartmentClass{" +
                "employeeName='" + employeeName + '\'' +
                ", employeeId=" + employeeId +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
    public String changePosition(String newPostion){
        return this.position = newPostion;
    }
    public double riseSalary(double newSalary){
        return this.salary= newSalary;
    }
}

