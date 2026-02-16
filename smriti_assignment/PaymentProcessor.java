//ques 7

sealed  interface  Payment permits cardPayment , upiPayment{}

record cardPayment(String cardNumber) implements Payment{}
record upiPayment(String upiId) implements Payment{}

public class PaymentProcessor {

    public void process(Payment p){
        String result = switch (p){
            case cardPayment cp-> "Processing card payment :" + cp.cardNumber();
            case upiPayment up->"processing the upi payment :"+ up.upiId();
        };

        System.out.println(result);
    }
    public static void main(String[] args){
        PaymentProcessor p1 = new PaymentProcessor();

        Payment mycard = new cardPayment("1233 456 789");
        Payment upimode = new upiPayment("230404@ibl");

        p1.process(mycard);
        p1.process(upimode);
    }
}
