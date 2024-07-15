public class Pen extends ProductsForSale{
    public Pen() {
        super("Pen", 5, "This is a very cool pen");
    }

    @Override
    public String display() {
        return ("For writing (permanent)");
    }

    public String toString() {
        return super.toString() + "\n" + display();
    }
}
