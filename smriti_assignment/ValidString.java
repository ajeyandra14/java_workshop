//ques 2

interface StringValidator{
    boolean isValid(String value);
}

public class ValidString {

    public static boolean validate(String value , StringValidator validator){
        if(value==null) return false;
        return validator.isValid(value);
    }
    public static void main(String[] args){

        String demo = "Smriti";

        boolean isNotNull = validate(demo,s->!s.isEmpty());
        boolean isLong = validate(demo,s->s.length()>5);
        boolean startsWithCaps = validate(demo,s->Character.isUpperCase(s.charAt(0)));

        System.out.println("The string is not empty :"+ isNotNull);
        System.out.println("the string is long enough :"+isLong);
        System.out.println("the string starts with capital letter :"+startsWithCaps);

    }

}

