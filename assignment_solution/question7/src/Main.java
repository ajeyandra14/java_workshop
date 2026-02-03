

public class Main {
    public static void main(String[] args) {


        Payment payment1 = new CardPayment();
        Payment payment2 = new UpiPayment();

        process(payment1);
        process(payment2);
    }

    static void process(Payment p) {
        if (p instanceof CardPayment card) {
            System.out.println("Processing card payment");
        } else if (p instanceof UpiPayment upi) {
            System.out.println("Processing UPI payment");
        }
    }

}