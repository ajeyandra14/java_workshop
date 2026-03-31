public final class UpiPayment implements Payment {
    private final String upiId;
    private final double amount;

    public String getUpiId() {
        return upiId;
    }

    public double getAmount() {
        return amount;
    }

    public UpiPayment(String upiId, double amount) {
        this.upiId = upiId;
        this.amount = amount;
    }


}
