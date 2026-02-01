package Solutions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Answer4 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(-20, -10, 5, 0, 1, 2, 4, 5,  6, 12, 13, 17, 18);

        Predicate<Integer> isPos = k -> k > 0;
        Predicate<Integer> isEven = k -> k % 2 == 0;

        Predicate<Integer> isPosAndEven = isPos.and(isEven);

        numbers.stream()
                .filter(isPosAndEven)
                .forEach(System.out::println);
    }
}
