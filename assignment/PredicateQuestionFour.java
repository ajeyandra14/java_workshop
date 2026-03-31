import java.util.function.Predicate;

class PredicateQuestionFour{


    public static void main(String[] args) {
        Predicate<Integer> evenPredicate= a->a%2==0;

        Predicate<Integer> positivePredicate=a->a>0;



        Boolean answer=evenPredicate.and(positivePredicate).test(5);

    }



}
