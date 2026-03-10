package Solutions;

record Employee(int id, double salary){

    //i have used a constructor which is called when we create an object of this record and validates salary
    public Employee {
        if(salary <= 0) {
            throw new IllegalArgumentException("Salary must be greater than 0");
        }
    }

    public boolean isHigher(){
        return salary > 100000;
    }
}

public class Answer6 {

    public static void main(String[] args) {
        Employee e1 = new Employee(1, 200000);
        Employee e2 = new Employee(2, 50000);
//      Employee e3 = new Employee(3, -45000);

        System.out.println("Employee ID : " + e1.id());
        System.out.println("Salary : " + e1.salary() + " | " + "A high earner : " + e1.isHigher());

        System.out.println("Employee ID : " + e2.id());
        System.out.println("Salary : " + e2.salary() + " | " + "A high earner : " + e2.isHigher());

//        System.out.println("Employee ID : " + e3.id());
//        System.out.println("Salary : " + e3.salary() + " | " + "A high earner : " + e3.isHigher());
    }
}
