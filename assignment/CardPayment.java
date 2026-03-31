import javax.smartcardio.Card;

public final class CardPayment implements Payment {
 private final String cardNumber;
 private final double amount;


 public CardPayment(String cardNumber,double amount){
     this.cardNumber=cardNumber;
     this.amount=amount;
 }

    public String getCardNumber() {
        return cardNumber;
    }

    public double getAmount() {
        return amount;
    }
}
