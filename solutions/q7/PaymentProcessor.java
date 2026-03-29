sealed interface Payment permits CardPayment, UpiPayment {}

record CardPayment(String cardNumber) implements Payment {}
record UpiPayment(String upiId) implements Payment {}

public class PaymentProcessor {

    static void process(Payment p) {
        if (p instanceof CardPayment cp) {
            System.out.println("Processing card: " + cp.cardNumber());
        } else if (p instanceof UpiPayment up) {
            System.out.println("Processing UPI: " + up.upiId());
        }
    }

    public static void main(String[] args) {
        process(new CardPayment("1234-5678"));
        process(new UpiPayment("user@upi"));
    }
}
