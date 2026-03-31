public class PaymentQuestionSeven {
 public static String process(Payment p){
     if(p instanceof CardPayment c){
         return "Processing card payment of  " + c.getAmount() + " from card number " + c.getCardNumber();
     }
     else if(p instanceof UpiPayment u){
         return "Processing upi payment of " + u.getAmount() + " from UPI id " + u.getUpiId();
     }
     return "Not a Supported Payment Type";
 }


    public static void main(String[] args) {
        Payment payment1=new CardPayment("1234-6789-XXXX-XXXX",5000);
        Payment payment2=new UpiPayment("test@upi",5000);

        System.out.println(process(payment1));
        System.out.println(process(payment2));

    }




}
