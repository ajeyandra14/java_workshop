package assignment.vishwas;

public class Q6_Records {
    record Employee(Integer id, Integer salary){
        public Employee{
            if(salary<0){
                throw new IllegalArgumentException("Salary must be greater than zero");
            }
        }
        public boolean isHigherEarner(){
            return salary>100000;
        }
    }

    static void main(String[] args) {
        Employee emp = new Employee(1035, 50000);
        System.out.println(emp.salary());
    }
}
