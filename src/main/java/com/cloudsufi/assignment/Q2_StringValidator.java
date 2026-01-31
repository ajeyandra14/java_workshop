package com.cloudsufi.assignment;

public class Q2_StringValidator {

    @FunctionalInterface
    interface StringValidator {
        boolean check(String str);
    }

    static boolean validate(String value, StringValidator validator) {
        return validator.check(value);
    }

    public static void main(String[] args) {

        String input = "Hello";

        boolean isNonEmpty = validate(input, s -> s != null && !s.isEmpty());
        System.out.println("Is input non-empty: " + isNonEmpty);

        boolean isLengthGreaterThanFive = validate(input, s -> s.length() > 5);
        System.out.println("Is input length greater than 5: " + isLengthGreaterThanFive);

        boolean isStartsWithCapitalLetter = validate(input, s -> !s.isEmpty() && Character.isUpperCase(s.charAt(0)));
        System.out.println("Is input start with capital letter: " + isStartsWithCapitalLetter);
    }
}
