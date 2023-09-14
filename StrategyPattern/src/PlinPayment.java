public class PlinPayment implements PaymentMethod{
    @Override
    public double processPayment(double amount) {
        double discount = amount * 0.05;
        return amount - discount;
    }
}
