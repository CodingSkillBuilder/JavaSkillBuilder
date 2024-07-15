public class Pencil extends ProductsForSale{
    public Pencil() {
        super("Pencil", 3, "This is a super cool pencil");
    }

    @Override
    public String display() {
        return ("For writing (erasable)");
    }


    @Override
    public String toString() {
        return super.toString() + "\n" + display();
    }
}
