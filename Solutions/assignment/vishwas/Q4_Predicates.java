package assignment.vishwas;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Q4_Predicates {
    static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(-5, -2, 0, 1, 2, 3, 4, 6, 9);

        Predicate<Integer> isPositive = n -> n > 0;
        Predicate<Integer> isEven = n -> n%2 == 0;

        Predicate<Integer> isPositiveAndEven = isPositive.and(isEven);

        numbers.stream()
                .filter(isPositiveAndEven)
                .forEach(System.out::println);
    }
}
