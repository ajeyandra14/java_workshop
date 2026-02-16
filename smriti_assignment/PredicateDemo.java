//ques 4
import java.util.*;
import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args){
        List<Integer> numbers = List.of(1,2,3,-4,8,6,-6,10,-12);

        Predicate<Integer> isPositive = n->n>0;
        Predicate<Integer> isEven = n->n%2==0;

        Predicate<Integer> isPositiveAndEven = isPositive.and(isEven);

        System.out.println("the positive even numbers are :");

        numbers.stream().filter(isPositiveAndEven).forEach(n->System.out.println(n));




    }
}
