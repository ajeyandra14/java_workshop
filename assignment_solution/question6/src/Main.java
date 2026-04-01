//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Employee emp = new Employee("em22",199999);

        System.out.println((emp.id() +" "+ emp.salary()));

        Employee newEmp = new Employee(emp.id(),200000);

        System.out.println((newEmp.id() +" "+ newEmp.salary()));

    }
}