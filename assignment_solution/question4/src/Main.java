import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(List.of(558,228,112,13,199,-24));

        Predicate<Integer> positivePredicate = a -> a>0;
        Predicate<Integer> evenPredicate = b -> b%2==0;

        Predicate<Integer> combinedPredicate = positivePredicate.and(evenPredicate);

        numbers.stream()
                .filter(combinedPredicate)
                .forEach(System.out::println);


    }
}