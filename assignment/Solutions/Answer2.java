package Solutions;

@FunctionalInterface
interface StringValidator{
    boolean validate(String value);
}

public class Answer2 {

    public static boolean validate(String value, StringValidator validator){
        return validator.validate(value);
    }

    public static void main(String[] args) {
        StringValidator nonEmpty = k -> (k != null) && (!k.isEmpty());

        StringValidator greaterThanFive = k -> (k != null) && k.length() > 5;

        StringValidator capitals = k -> (k != null) && (Character.isUpperCase(k.charAt(0)));

        String name = "Karan";
        System.out.println(validate(name, nonEmpty));
        System.out.println(validate(name, greaterThanFive));
        System.out.println(validate(name, capitals));
    }
}
