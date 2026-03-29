@FunctionalInterface
interface StringValidator {
    boolean validate(String value);
}

public class StringValidatorDemo {

    static boolean validate(String value, StringValidator validator) {
        return validator.validate(value);
    }

    public static void main(String[] args) {
        System.out.println(validate("Hello", s -> !s.isEmpty()));
        System.out.println(validate("Welcome", s -> s.length() > 5));
        System.out.println(validate("Java", s -> Character.isUpperCase(s.charAt(0))));
    }
}