public abstract class ProductsForSale {
    private String type;
    private double price;
    private String description;

    public double priceCalc(int quantity){
        return (price * quantity);
    }

    public void addIno(int quantity){
        StringBuilder toPrint = new StringBuilder();
        toPrint.append(padRight("type " ,10) + padLeft(type, 10) + "\n");
        toPrint.append(padRight("   description " ,10) + padLeft(description, 10) + "\n");
        toPrint.append(padRight("   Quantity " ,10) + padLeft(quantity + "", 10) + "\n");
        toPrint.append(padRight("   price " ,10) + padLeft(priceCalc(quantity) + "", 10) + "\n");
        System.out.println(toPrint);
    }

    public static String padLeft(String original, int length){
        int remain = length - original.length();
        String toExport = "";
        if (remain >= 0){
            toExport = String.format("%1$" + length + "s",original);
            return toExport;
        } else {
            toExport = original.substring(0, length);
            return toExport;
        }

    }
    public static String padRight(String original, int length){
        int remain = length - original.length();
        String toExport = "";
        if (remain >= 0){
            toExport = String.format("%1$-" + length + "s",original) + ":";
            return toExport;
        } else {
            toExport = original.substring(0, length)+ ":";
            return toExport;
        }

    }

    public abstract String display();

    public ProductsForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    @Override
    public String toString() {
        return "ProductsForSale{" +
                "type='" + type + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}
