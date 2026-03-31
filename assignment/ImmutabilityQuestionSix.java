public class ImmutabilityQuestionSix {
    public static void main(String[] args) {

        Employee original = new Employee(101, 90000);
        System.out.println("Original: " + original);

        // 2. Demonstration of Immutability
        // We want to give them a raise. We CANNOT do: original.setSalary(110000);

        // Instead, we create a NEW instance
        Employee updated = new Employee(original.id(), 110000);

        System.out.println("After Update");
        System.out.println("Original still exists: " + original + " (High Earner: " + original.isHighEarner(original.salary()) + ")");
        System.out.println("Updated version: " + updated + " (High Earner: " + updated.isHighEarner(updated.salary()) + ")");

        // 3. Verification
        if (original != updated) {
            System.out.println("\nProof: The objects are distinct in memory. The original was never modified.");
        }
    }
}
