public record Employee(int id, double salary) {

    public Employee {
        if (salary <= 0) {
            throw new IllegalArgumentException("Salary must be positive");
        }
    }

    public boolean isHighEarner() {
        return salary > 100000;
    }

    public static void main(String[] args) {
        Employee e = new Employee(1, 150000);
        System.out.println(e.isHighEarner());
    }
}
