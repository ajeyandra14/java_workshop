package com.cloudsufi.assignment;

import java.util.List;
import java.util.function.Predicate;

public class Q4_Predicate {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(-10, 2, 5, 8, -4);

        Predicate<Integer> isPositive = n -> n > 0;
        Predicate<Integer> isEven = n -> n % 2 == 0;

        numbers.stream()
                .filter(isPositive.and(isEven))
                .forEach(System.out::println);
    }
}
