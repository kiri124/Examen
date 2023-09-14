import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Producto CelularSamsung = new Producto("SMG001", 10, 999.00);
        Producto CelularHuawei = new Producto("HW001", 5, 700.00);
        Producto TabletSamsung = new Producto("TSMG001", 7, 1200.00);
        Producto IpadApple = new Producto("APP001", 15, 3999.00);

        // Crear métodos de pago
        PaymentMethod visaPayment = new VisaPayment("Tarjeta de Crédito VISA", "4321-0987-7456-3456", 113, "12/25");
        PaymentMethod yapePayment = new YapePayment();
        PaymentMethod plinPayment = new PlinPayment();
        PaymentMethod debitCardPayment = new DebitPayment();

        // Realizar compras
        realizarCompra("Nami", CelularSamsung, visaPayment);
        realizarCompra("Ussop", CelularHuawei, yapePayment);
        realizarCompra("Zoro", TabletSamsung, plinPayment);
        realizarCompra("Sanji", IpadApple, debitCardPayment);
    }
    public static void realizarCompra(String customerName, Producto product, PaymentMethod paymentMethod) {
        double totalAmount = product.getPrice();

        if (paymentMethod instanceof VisaPayment) {
            totalAmount = paymentMethod.processPayment(totalAmount);
        }

        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("Cliente: " + customerName);
        System.out.println("Método de pago: " + paymentMethod.getClass().getSimpleName());
        System.out.println("Total a pagar: S/ " + df.format(totalAmount));
        System.out.println();
    }
}