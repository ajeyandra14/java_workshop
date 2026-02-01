package Solutions;

//sealed interface that permits these two modes
sealed interface Payment permits CardPayment, UpiPayment{
    double amount();
}

record CardPayment(double amount, String cardNum) implements Payment{
}

record UpiPayment(double amount, String upiId) implements Payment{
}

public class Answer7 {

    //pattern matching
    public static void process(Payment p){
        if(p instanceof CardPayment cp) {
            System.out.println("Processing card payment of " + cp.amount());
        }else if(p instanceof UpiPayment upi){
            System.out.println("Processing upi payment of " + upi.amount());
        }
    }

    public static void main(String[] args) {
        Payment p1 = new CardPayment(45000, "2343-2322-1232");
        Payment p2 = new UpiPayment(30000, "karan@upi34342");

        process(p1);
        process(p2);
    }
}
