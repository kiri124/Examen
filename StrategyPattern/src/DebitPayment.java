class DebitPayment implements PaymentMethod {
    @Override
    public double processPayment(double amount) {
        return amount;
    }
}