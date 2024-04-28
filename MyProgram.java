import Employees.Employee;
import Employees.EmployeeUtility;

public class MyProgram {
    public static void main(String[] args) {
        EmployeeUtility eUtility = new EmployeeUtility();
        Employee e1 = new Employee("Luke", "12212312291", "RSM");
        System.out.println(eUtility.isEmployeeValid(e1));
      }
}
