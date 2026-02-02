package com.cloudsufi.assignment;

public class Q6_RecordEmployee {
    record Employee(int id, double salary) {
        public Employee {
            if (salary <= 0) {
                throw new IllegalArgumentException("Salary should be positive");
            }
        }

        public boolean isHighEarner() {
            return salary > 100000;
        }
    }

    public static void main(String[] args) {
        Employee e = new Employee(1, 50000);
        System.out.println(e.salary());
        // e.salary = 60000; // ERROR: Records are immutable (final)
    }
}
