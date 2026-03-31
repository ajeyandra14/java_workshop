public class ValidationQuestionTwo {

        public static void validate(String value, StringValidator validator) {
            boolean isValid = validator.check(value);
            System.out.println(value + " " + isValid);
        }


    public static void main(String[] args) {
        String testInput = "Hello world";

        validate(testInput, s -> s != null && !s.isEmpty());
        validate(testInput, s -> s.length() > 5);
        validate(testInput, s -> Character.isUpperCase(s.charAt(0)));
    }

}
