package accessModifiers;
import com.ep.practice.AccessModiferTestPackage.Employee;
public class AccessModifierExample extends Employee {
    public static void main(String args[]){
        Employee e1 = new Employee();
        //e1.displayEmployeeName("Danny"); Private
        //e1.displayEmployeeId(313); Default (Can't run, not in same package)
        AccessModifierExample e2 = new AccessModifierExample();
        e2.displayEmployeeSalary(55000);//Protected (Able to run because this is a child class)
        e1.displayEmployeebenefits(24);//Public (Able to run regardless if class is from another package)
    }
}
