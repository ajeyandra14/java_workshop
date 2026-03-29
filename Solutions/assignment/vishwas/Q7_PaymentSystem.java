package assignment.vishwas;

public class Q7_PaymentSystem {
    sealed interface Payment permits CardPayment, UpiPayment{
    }

    static final class CardPayment implements Payment{
        private final String cardNumber;

        CardPayment(String cardNumber){
            this.cardNumber=cardNumber;
        }

        String getCardNumber(){
            return cardNumber;
        }
    }
    static final class UpiPayment implements Payment{
        private final String upiId;

        UpiPayment(String upiId){
            this.upiId=upiId;
        }

        String getUpiId(){
            return upiId;
        }
    }

    static void process(Payment pmt){
        if(pmt instanceof CardPayment card){
            System.out.println("Processing Card Payment for card no.: "+card.getCardNumber());
        }
        else if(pmt instanceof UpiPayment upi){
            System.out.println("Processing UPI Payment for UPI ID: "+upi.getUpiId());
        }
        else{
            throw new IllegalStateException("Invalid Payment Type");
        }
    }

    static void main(String[] args) {
        process(new CardPayment("1234-5678-9101-3476"));
        process(new UpiPayment("9876776541@upi"));
    }
}
