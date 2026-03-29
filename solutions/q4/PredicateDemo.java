import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(-2, 3, 4, 6, -8);

        Predicate<Integer> isPositive = n -> n > 0;
        Predicate<Integer> isEven = n -> n % 2 == 0;

        numbers.stream()
               .filter(isPositive.and(isEven))
               .forEach(System.out::println);
    }
}

