package com.cloudsufi.assignment;

public class Q7_PaymentSystem {

    sealed interface Payment permits CardPayment, UpiPayment {}

    static final class CardPayment implements Payment {}
    static final class UpiPayment implements Payment {}

    static void process(Payment p) {
        switch (p) {
            case CardPayment c -> System.out.println("Processing Card...");
            case UpiPayment u  -> System.out.println("Processing UPI...");
        }
    }

    public static void main() {
        CardPayment cardPayment = new CardPayment();
        process(cardPayment);

        UpiPayment upiPayment = new UpiPayment();
        process(upiPayment);
    }
}
