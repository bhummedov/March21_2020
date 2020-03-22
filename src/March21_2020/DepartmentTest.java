package March21_2020;

public class DepartmentTest {
    public static void main(String[] args) {
        DepartmentClass myObj = new DepartmentClass("Mustafa", 123, "QA", 120);
        System.out.println(myObj.toString());
        ITDepartmentClass myIT = new ITDepartmentClass("124", "Mahmet", 123, "QA", 120000);
        System.out.println(myIT.toString());
        myIT.addSkills(("SQL"));
        System.out.println(myIT.employeeId);
        AccountingDepartment myObj3 =new AccountingDepartment(123, "Inci",12, "QA", 120000);
        System.out.println(myObj3.toString());
    }
}
