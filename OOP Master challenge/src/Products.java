public class Products {
    private double price;
    private int size;

    public void setPrice(double price) {
        this.price = price;
    }

    public int getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    public Products(double price,int size) {
        this.price = price;
        this.size = size;
    }
}
