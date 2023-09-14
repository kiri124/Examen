public class VisaPayment implements PaymentMethod{
    private String name;
    private String cardNumber;
    private int cvv;
    private String expirationDate;

    public VisaPayment(String name, String cardN, int cvv, String expirationDate) {
        this.name = name;
        this.cardNumber = cardN;
        this.cvv = cvv;
        this.expirationDate = expirationDate;
    }

    @Override
    public double processPayment(double amount) {
        double additionalCost = amount * 0.07;
        return amount + additionalCost;
    }

}
