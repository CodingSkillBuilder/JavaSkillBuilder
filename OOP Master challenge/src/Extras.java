public class Extras extends Products{
    private String type;

    public String getType() {
        return type;
    }

    public static Object extraFactory (String type, int size){
        return switch (type){
            case "R" -> new Extras("Ring onions", size, (size * 4));
            case "S" -> new Extras("Straw onions", size, (size * 3));
            case "P" -> new Extras("Potato fries", size, (size * 5));
            case "M" -> new Extras("Mushroom fries", size, (size * 6));
            case "V" -> new Extras("Veggie sticks", size, (size * 5));
            case "O" -> new Extras("Olives", size, (size * 6));
            default -> "Error creating the extra";
        };
    }
    private Extras(String type, int size, double price) {
        super(price, size);
        this.type = type;
    }
}
