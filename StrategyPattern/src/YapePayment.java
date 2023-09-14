public class YapePayment implements PaymentMethod{
    @Override
    public double processPayment(double amount) {
        if (amount > 1000.00) {
            double discount = amount * 0.07;
            return amount - discount;
        } else {
            return amount;
        }
    }
}
