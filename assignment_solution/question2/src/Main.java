import java.util.function.Predicate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String value = "shubhanshu";


        StringValidator nonEmptyValidator = v-> !v.isEmpty();

        StringValidator lengthValidator = v-> v.length()>5;

        StringValidator capitalLetterValidator = v->(!v.isEmpty() && Character.isUpperCase(v.charAt(0)));


        System.out.println(nonEmptyValidator.validate(value));
        System.out.println(lengthValidator.validate(value));
        System.out.println(capitalLetterValidator.validate(value));
    }
}