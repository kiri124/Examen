class Producto {
    private String productCode;
    private int stock;
    private double price;

    public Producto(String productCode, int stock, double price) {
        this.productCode = productCode;
        this.stock = stock;
        this.price = price;
    }

    public String getProductCode() {
        return productCode;
    }

    public int getStock() {
        return stock;
    }

    public double getPrice() {
        return price;
    }
}
