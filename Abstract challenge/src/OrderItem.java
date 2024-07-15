public class OrderItem {
    private int quantity;
    private ProductsForSale product;

    public int getQuantity() {
        return quantity;
    }

    public ProductsForSale getProduct() {
        return product;
    }

    public OrderItem(ProductsForSale product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }


}
