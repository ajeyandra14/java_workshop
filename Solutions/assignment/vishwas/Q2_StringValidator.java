package assignment.vishwas;

public class Q2_StringValidator {
    @FunctionalInterface
    public interface stringValidator {
        boolean isValid(String str);
    }
    public static boolean validate(String str, stringValidator validator) {  // Utility Method
        return validator.isValid(str);
    }

    public static void main(String[] args) {
        String test = "Hello Cloudsufi!";

        boolean isNonEmpty = validate(test,s->s!=null && !s.isEmpty());
        System.out.println("Is String Non-Empty?: " + isNonEmpty);

        boolean isLengthGreaterThan5 = validate(test,s->s!=null && s.length()>5);
        System.out.println("Is String Length Greater than 5?: " + isLengthGreaterThan5);

        boolean isStartingWithCapitalLetter = validate(test,s->s!=null && !s.isEmpty() && Character.isUpperCase(s.charAt(0)));
        System.out.println("Is String starting with a Capital Letter?: " + isStartingWithCapitalLetter);


    }
}
